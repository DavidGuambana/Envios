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
public class M_canton {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    public List<Canton> listar(String codigo) {
        
        List<Canton> canton1 = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, nombre";
            } else {
                sql = "SELECT codigo, nombre FROM canton WHERE codigo='"+codigo+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Canton cami = new Canton(rs.getInt(1),rs.getString(2));
                   canton1.add(cami);
                }
            }
            con.close();
            return canton1;
        } catch (SQLException ex) {
            return null;
        }
    }
}
