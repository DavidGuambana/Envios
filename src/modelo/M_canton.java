package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class M_canton {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    public List<Canton> listar(String codigo) {
        
        List<Canton> cantones = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, nombre";
            } else {
                sql = "SELECT codigo, nombre FROM canton WHERE codigo="+codigo;
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Canton canton = new Canton(rs.getInt(1),rs.getString(2));
                   cantones.add(canton);
                }
            }
            con.close();
            return cantones;
        } catch (SQLException ex) {
            return null;
        }
    }
}
