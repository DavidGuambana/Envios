
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mEnvio extends Envio{
   public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Envio> listar(int codigo) {
        List<Envio> envios = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, fecha, codigo_via FROM envio";
            } else {
                sql = "SELECT codigo, fecha, codigo_via FROM envio WHERE cedula=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Envio envio = new Envio(rs.getInt(1), rs.getDate(2), rs.getInt(3));
                    envios.add(envio);
                }
            }
            con.close();
            return envios;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO envio(fecha, codigo_via)"
                + " VALUES (TO_DATE('" + getFecha()
                + "','YYYY-MM-DD')"
                + "," + getCodigo_via()+")";
          System.out.println(sql);
        return con.accion(sql);
    }
 

    public boolean eliminar(int codigo) {
        sql = "DELETE FROM envio WHERE codigo=" + codigo + "";
        return con.accion(sql);
    }
    
    public int ultimoCodigo() {
        int id = 0;
        try {
            sql = "SELECT * FROM (SELECT CODIGO FROM ENVIO ORDER BY CODIGO DESC) WHERE ROWNUM <= 1";
            rs = con.consulta(sql);
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return id;
    }
}
