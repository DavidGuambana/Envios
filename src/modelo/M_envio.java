
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class M_envio extends Envio{
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
                + " VALUES ('" + getFecha()
                + "," + getCodigo_vista()+")";
        return con.accion(sql);
    }
 

    public boolean eliminar(int codigo) {
        sql = "DELETE FROM envio WHERE codigo=" + codigo + "";
        return con.accion(sql);
    }

    
}
