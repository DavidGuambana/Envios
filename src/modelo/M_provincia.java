package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class M_provincia {
   public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Provincia> listar(String codigo) {
        
        List<Provincia> provincias = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, nombre";
            } else {
                sql = "SELECT codigo, nombre FROM PROVINCIA WHERE codigo="+codigo;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Provincia provincia = new Provincia(rs.getInt(1),rs.getString(2));
                   provincias.add(provincia);
                }
            }
            con.close();
            return provincias;
        } catch (SQLException ex) {
            return null;
        } 
}
}
