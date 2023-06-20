
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mMarcaModelo {
   Conexion con = new Conexion() ;
   ResultSet rs;
   String sql;
   String[] columnas = {"Código de cantón", "Nombre de Cantón", "Código de Provincia", "Nombre de Provincia"};
    
    public void listar(JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        try {
            sql = "SELECT mod.codigo, mod.nombre, mar.codigo, mar.nombre FROM MODELO C JOIN PROVINCIA P ON(C.codigo_prov = P.codigo)";
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
            sql = "SELECT C.codigo, C.nombre, P.codigo, P.nombre FROM CANTON C JOIN PROVINCIA P ON(C.codigo_prov = P.codigo) WHERE " + columna + " LIKE '%" + txt + "'";
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
    
    //EJEMPLO CON ARRAYLIST
    /*
    public List<Persona> listarPersonasLike(String txt,String campo) {
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            sql = "SELECT idpersona, nombres, apellidos, fechanacimiento, telefono, sexo, sueldo, cupo, foto, correo FROM persona WHERE "+campo+" like '%"+txt+"'";
            rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona();
                    persona.setIdPersona(rs.getString(1));
                    persona.setNombrePersona(rs.getString(2));
                    persona.setApellidoPersona(rs.getString(3));
                    persona.setFechanacimineto(rs.getDate(4));
                    persona.setTelefono(rs.getString(5));
                    persona.setSexo(rs.getString(6));
                    persona.setSueldo(rs.getInt(7));
                    persona.setCupo(rs.getInt(8));
                    //persona.setFoto(rs.getByte(9));
                    persona.setCorreo(rs.getString(10));
                    listaPersonas.add(persona);
                }
            }
            return listaPersonas;
        } catch (SQLException ex) {
            return null;
        }
    }
    */

//    public void llenarcombocanton(JComboBox cb) {
//        try {
//            cb.removeAllItems();
//            cb.addItem("Seleccione...");
//            sql = "SELECT NOMBRE FROM CANTON";
//            rs = con.consulta(sql);
//            while (rs.next()) {
//                cb.addItem(rs.getString(1));
//            }
//        } catch (SQLException ex) {
//        }

//    }
//
//    public void llenarcomboprovincia(JComboBox cb) {
//        try {
//            cb.removeAllItems();
//            cb.addItem("Seleccione...");
//            sql = "SELECT NOMBRE FROM PROVINCIA";
//            rs = con.consulta(sql);
//            while (rs.next()) {
//                cb.addItem(rs.getString(1));
//            }
//        } catch (SQLException ex) {
//        }
//    }
    
    public int obtenerid(String nombre) {
        int codigo = 0;

        sql = "SELECT CODIGO FROM CANTON WHERE NOMBRE='" + nombre + "'";

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
