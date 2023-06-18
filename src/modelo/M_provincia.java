/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class M_provincia {
   public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Provincia> listar(String codigo) {
        
        List<Provincia> provi1 = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, nombre";
            } else {
                sql = "SELECT codigo, nombre FROM PROVINCIA WHERE codigo='"+codigo+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Provincia provi = new Provincia(rs.getInt(1),rs.getString(2));
                   provi1.add(provi);
                }
            }
            con.close();
            return provi1;
        } catch (SQLException ex) {
            return null;
        } 
}
}
