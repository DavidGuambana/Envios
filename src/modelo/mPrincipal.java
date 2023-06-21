package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;

public class mPrincipal {

    Conexion con = new Conexion();
    ResultSet rs;

    public boolean llenarTabla(JTable tabla, String sql) {
        boolean Correcto;
        rs = con.consulta(sql);
        if (rs != null) {
            Correcto = true;
            try {
                //Obtener los metadatos del ResultSet
                ResultSetMetaData rsmd = rs.getMetaData();
                //Obtener el número de columnas
                int columnas = rsmd.getColumnCount();
                //Crear un modelo de tabla vacío
                DefaultTableModel modelo = new DefaultTableModel();
                //Añadir los nombres de las columnas al modelo
                for (int i = 1; i <= columnas; i++) {
                    modelo.addColumn(rsmd.getColumnName(i));
                }
                //Añadir las filas del ResultSet al modelo
                while (rs.next()) {
                    //Crear un arreglo para almacenar los datos de la fila
                    Object[] fila = new Object[columnas];
                    //Llenar el arreglo con los datos de la fila
                    for (int i = 0; i < columnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    //Añadir el arreglo al modelo como una fila
                    modelo.addRow(fila);
                }
                //Asignar el modelo a la tabla
                tabla.setModel(modelo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("sa");

            }
        } else {
            Correcto = false;
        }
        return Correcto;
    }
}
