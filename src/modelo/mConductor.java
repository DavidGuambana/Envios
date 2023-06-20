package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mConductor extends Conductor {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
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
        sql = "SELECT P.CEDULA,P.NOMBRE1,P.NOMBRE2,P.APELLIDO1,P.APELLIDO2,P.DIRECCION,P.TELEFONO,PRO.NOMBRE,CAN.NOMBRE,C.ID_CON,C.LICENCIA,C.SALARIO\n" +
"FROM PERSONA P JOIN CONDUCTOR C ON(p.cedula=c.cedula_per) JOIN CANTON CAN ON (p.codigo_can=can.codigo ) JOIN provincia PRO ON(pro.codigo=can.codigo_prov) WHERE p.cedula='"+cedula+"'";
        rs = con.consulta(sql);
        con.close();
        return rs;
    }
    public boolean crear() {
        sql = "INSERT INTO conductor(licencia, salario, cedula_per)"
                + " VALUES ('" + getLicencia()
                + "','" + getSalario()
                + "','" + getCedula() + ")";
        return con.accion(sql);
    }
       public boolean actualizar() {
        sql = "UPDATE conductor SET licencia='"
                +getLicencia()+"', salario='"
                +getSalario()+" WHERE id_con='"+getId_conductor()+"'";
        return con.accion(sql);
    }
    public boolean eliminar (String id){
        sql = "DELETE FROM conductor WHERE id_con='"+id+"'";
        return con.accion(sql);
    }
}
