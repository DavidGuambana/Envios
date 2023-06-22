
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mMarcaModelo {
   Conexion con = new Conexion() ;
   ResultSet rs;
   String sql;
   String[] columnas = {"Código de modelo", "Nombre de modelo", "Código de marca", "Nombre de modelo"};
    
    public void listar(JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        try {
            sql = "SELECT mod.codigo, mod.nombre, mar.codigo, mar.nombre FROM MODELO mod JOIN MARCA mar ON(mod.codigo_mar = mar.codigo)";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }

    public void buscar(String txt, String columna, JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        try {
            sql = "SELECT mod.codigo, mod.nombre, mar.codigo, mar.nombre FROM MODELO mod JOIN MARCA mar ON(mod.codigo_mar = mar.codigo) WHERE " + columna + " LIKE '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
                }
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
    

    public void llenarcombomodelo(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            sql = "SELECT NOMBRE FROM MODELO";
            rs = con.consulta(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }

    public void llenarcombomarca(JComboBox cb) {
        try {
            cb.removeAllItems();
            cb.addItem("Seleccione...");
            sql = "SELECT NOMBRE FROM MARCA";
            rs = con.consulta(sql);
            while (rs.next()) {
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
        }
    }
    
    public int obteneridMOD(String nombre) {
        int codigo = 0;
        sql = "SELECT CODIGO FROM MODELO WHERE NOMBRE='" + nombre + "'";
        try {
            rs = con.consulta(sql);
            rs.next();
            codigo = rs.getInt(1);
            System.out.println(codigo);
        } catch (SQLException ex) {
        }
        con.close();
        return codigo;
    }
}