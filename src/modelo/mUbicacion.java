
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mUbicacion {
   Conexion con = new Conexion() ;
   ResultSet rs;
   String sql;
   String[] columnas = {"Código de cantón", "Nombre de Cantón", "Código de Provincia", "Nombre de Provincia"};
    
    public void listar(JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        try {
            sql = "SELECT C.codigo, C.nombre, P.codigo, P.nombre FROM CANTON C JOIN PROVINCIA P ON(C.codigo_prov = P.codigo);";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
}
