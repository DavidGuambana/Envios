
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class M_ubicacion extends Envio{
   public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    String[] columnas = {"Código de cantón", "Nombre de Cantón", "Código de Provincia", "Nombre de Provincia"};
    
    public void listar_ubicaciones(JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        try {
            sql = "SELECT codigo, fecha, codigo_via FROM envio";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
                    tabla.setModel(dtm);
                }
            }
            con.close();
        } catch (SQLException ex) {
        }
    }
}
