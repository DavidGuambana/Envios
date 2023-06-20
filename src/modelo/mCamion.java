package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mCamion extends Camion{
     public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
     public List<Camion> listar(String matricula) {
        List<Camion> camion = new ArrayList<>();
        try {
            if ("".equals(matricula)) {
                sql = "SELECT matricula, codigo_mod, potencia FROM CAMION ";
            } else {
                sql = "SELECT matricula, codigo_mod, potencia FROM CAMION WHERE matricula='"+matricula+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Camion cami = new Camion(rs.getString(1),rs.getInt(2), rs.getString(4));
                   camion.add(cami);
                }
            }
            con.close();
            return camion;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO CAMION(matricula, marca, modelo, potencia)"
                + " VALUES ('" + getMatricula()
                + "'," + getModelo()
                + "','" + getPotencia()+")";
        return con.accion(sql);
    }
      public boolean actualizar() {
        sql = "UPDATE CAMION SET codigo_mod="
                +getModelo()+", potencia='"
                +getPotencia()+"' WHERE matricula='"+getMatricula()+"'";
        return con.accion(sql);
    }
    public boolean eliminar(String matricula){
        sql = "DELETE FROM CAMION WHERE matricula='"+matricula+"'";
        return con.accion(sql);
    }
      
      
}
