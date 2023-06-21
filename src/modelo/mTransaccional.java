package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
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
    
    public void list_cam(JTable tabla, JButton b) {
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
    public void list_per(JTable tabla, JButton b) {
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
    
    
    
//    
//    
//      public boolean crear() {
//        sql = "INSERT INTO envio(fecha, codigo_via)"
//                + " VALUES ('" + getFecha()
//                + "," + getCodigo_vista()+")";
//        return con.accion(sql);
//    }
// 
//
//    public boolean eliminar(int codigo) {
//        sql = "DELETE FROM envio WHERE codigo=" + codigo + "";
//        return con.accion(sql);
//    }

    
}
