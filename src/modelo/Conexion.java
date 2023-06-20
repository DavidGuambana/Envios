package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;
public class Conexion {
    Connection con;
    Statement st;

    public void conectar() {
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ods.setUser("SYSTEM");
            ods.setPassword("1234");
            con = ods.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error de conexión!", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet consulta(String sql) {
        conectar();
        try {
            System.out.println(con);
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(rs);
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean accion(String sql) {
        conectar();
        try {
            st = con.createStatement();
            if (st.executeUpdate(sql) == 1) {
                st.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public void close(){
        conectar();
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
