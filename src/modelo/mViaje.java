
package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mViaje extends Viaje{
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;

    public List<Viaje> listar(int codigo) {
        List<Viaje> viajes = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, matricula, fecha, codigo_can,id_con  FROM viaje";
            } else {
                sql = "SELECT codigo, matricula, fecha, codigo_can,id_con  FROM viaje  WHERE codigo=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {

                    Viaje viaje = new Viaje(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5));
                    viajes.add(viaje);
                }
            }
            con.close();
            return viajes;
        } catch (SQLException ex) {
            return null;
        }
    }
     public boolean crear() {
        sql = "INSERT INTO viaje(matricula, fecha, codigo_can, id_con)"
                + " VALUES ('" + getMatricula()
                + "', TO_DATE('" + getFecha()
                + "','YYYY-MM-DD')," + getCodigo_can()
                + "," + getId_con()+")";
         System.out.println(sql);
        return con.accion(sql);
    }
     public boolean eliminar(int codigo) {
        sql = "DELETE FROM viaje WHERE codigo=" + codigo + "";
        return con.accion(sql);
    }

    public int ultimoCodigo() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT CODIGO FROM VIAJE ORDER BY CODIGO DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }

}
