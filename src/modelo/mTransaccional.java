package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mTransaccional{
    Conexion con = new Conexion();
    ResultSet rs;
    String sql;
    DefaultTableModel dtm;
    
    String[] col_cam = {"Matrícula", "Modelo", "Marca", "Acción"};
    String[] col_con = {"ID", "Licencia", "Salario", "Cédula", "Acción"};
    String[] col_via = {"Código", "Matrícula", "Fecha", "Código canton", "ID conductor", "Acción"};
    String[] col_per = {"Cedula", "Primer nombre", "Segundo nombre", "Primer apellido", "Segundo apellido", "Acción"};
    String[] col_env = {"Código", "Fecha", "Código viaje", "Acción"};
    
    
    public void list_cam(JTable tabla, JButton b, JComboBox c) {
        for (int i = 0; i < col_cam.length-1; i++) {
            c.addItem(col_cam[i]);
        }
        dtm = new DefaultTableModel(null, col_cam);
        try {
            sql = "SELECT c.matricula, mo.nombre, ma.nombre FROM CAMION c JOIN MODELO mo ON (c.codigo_mod = mo.codigo) JOIN MARCA ma ON (mo.id_codigo_mar = ma.codigo)";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),b});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
    
     public void list_con(JTable tabla, JButton b,JComboBox c) {
         for (int i = 0; i < col_con.length-1; i++) {
            c.addItem(col_con[i]);
        }
        dtm = new DefaultTableModel(null, col_con);
        try {
            sql = "SELECT * FROM CONDUCTOR";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getString(4),b});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
     
      public void list_via(JTable tabla, JButton b,JComboBox c) {
          for (int i = 0; i < col_via.length-1; i++) {
            c.addItem(col_via[i]);
        }
        dtm = new DefaultTableModel(null, col_via);
        try {
            sql = "SELECT * FROM VIAJE";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3),rs.getInt(4),rs.getInt(5),b});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
      
     
    public void list_per(JTable tabla, JButton b,JComboBox c) {
        for (int i = 0; i < col_per.length-1; i++) {
            c.addItem(col_per[i]);
        }
        dtm = new DefaultTableModel(null, col_per);
        try {
            sql = "SELECT cedula, nombre1, nombre2, apellido1, apellido2 FROM PERSONA";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),b});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
    
      public void list_env(JTable tabla, JButton b,JComboBox c) {
          for (int i = 0; i < col_env.length-1; i++) {
            c.addItem(col_env[i]);
        }
        dtm = new DefaultTableModel(null, col_env);
        try {
            sql = "SELECT * FROM ENVIO";
            rs = con.consulta(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1),rs.getDate(2),rs.getInt(3),b});
            }
            tabla.setModel(dtm);
            con.close();
        } catch (SQLException ex) {
        }
    }
    public void list_canton(JComboBox canton, JComboBox provincia){
        if (provincia.getSelectedIndex() == 0) {
            sql = "SELECT NOMBRE FROM CANTON";
        } else{
            sql = "SELECT C.NOMBRE FROM CANTON C JOIN PROVINCIA P ON(C.CODIGO_PROV = P.CODIGO) WHERE P.NOMBRE = '"+provincia.getSelectedItem().toString()+"'";
        }
        rs = con.consulta(sql);
        if (rs != null) {
            try {
                canton.removeAllItems();
                canton.addItem("Seleccione...");
                while (rs.next()) {
                    canton.addItem(rs.getString(1));
                }
            } catch (SQLException ex) {
            }
        }
    }
    
    public void list_provincia (JComboBox provincia){
        sql = "SELECT NOMBRE FROM PROVINCIA";
        rs = con.consulta(sql);
        if (rs != null) {
            try {
                provincia.removeAllItems();
                provincia.addItem("Seleccione...");
                while (rs.next()) {
                    provincia.addItem(rs.getString(1));
                }
            } catch (SQLException ex) {
            }
        }
    }
}
