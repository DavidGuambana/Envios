package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mConductor extends Conductor {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    String[] columnas = {"ID Conductor", "Licencia", "Salario", "Cedula"};
    
    public List<Conductor> listar(String id) {
        List<Conductor> conductores = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT id_con, licencia, salario, cedula_per FROM conductor";
            } else {
                sql = "SELECT id_con, licencia, salario, cedula_per FROM conductor WHERE id_con='" + id + "'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
//   
                    Conductor conductor = new Conductor(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
                    conductores.add(conductor);
                }
            }
            con.close();
            return conductores;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet obtener_conductor(String cedula) {
        sql = "SELECT P.CEDULA,P.NOMBRE1,P.NOMBRE2,P.APELLIDO1,P.APELLIDO2,P.DIRECCION,P.TELEFONO,PRO.CODIGO,CAN.CODIGO,C.ID_CON,C.LICENCIA,C.SALARIO\n"
                + "FROM PERSONA P JOIN CONDUCTOR C ON(p.cedula=c.cedula_per) JOIN CANTON CAN ON (p.codigo_can=can.codigo ) JOIN provincia PRO ON(pro.codigo=can.codigo_prov) WHERE p.cedula='" + cedula + "'";
        rs = con.consulta(sql);
        return rs;
    }
    public boolean crear() {
        sql = "INSERT INTO conductor(licencia, salario, cedula_per)"
                + " VALUES ('" + getLicencia()
                + "'," + getSalario()
                + ",'" + getCedula() + "')";
        System.out.println(sql);
        return con.accion(sql);
    }
       public boolean actualizar() {
        sql = "UPDATE conductor SET licencia='"
                +getLicencia()+"', salario="
                +getSalario()+" WHERE id_con='"+getId_conductor()+"'";
           System.out.println(sql);
        return con.accion(sql);
    }
    public boolean eliminar (String id){
        sql = "DELETE FROM conductor WHERE id_con="+id+"";
        System.out.println(sql);
        return con.accion(sql);
    }
        public boolean existeconductor(String cedula) {
        boolean exist = false;
        try {
            sql = "SELECT COUNT(CEDULA_PER)FROM CONDUCTOR WHERE CEDULA_PER=" + cedula + "";
            System.out.println(sql);
            rs = con.consulta(sql);
            rs.next();
            if (rs.getInt(1) == 0) {
                exist = true;
                System.out.println("entra false");
            } else {
                exist = false;
                System.out.println("entra true");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
        public void buscar(String txt, String columna, JTable tabla) {
        DefaultTableModel dtm = new DefaultTableModel(null, columnas);
        try {
            sql = "SELECT ID_CON,LICENCIA,SALARIO,CEDULA_PER FROM CONDUCTOR WHERE " + columna + " LIKE '%" + txt + "'";
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

}
