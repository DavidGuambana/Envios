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
                sql = "SELECT matricula, codigo_mod, potencia FROM camion ";
            } else {
                sql = "SELECT matricula, codigo_mod, potencia FROM camion WHERE matricula='"+matricula+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Camion cami = new Camion(rs.getString(1),rs.getInt(2), rs.getInt(3));
                   camion.add(cami);
                }
            }
            con.close();
            return camion;
        } catch (SQLException ex) {
            System.out.println();
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO camion(matricula, codigo_mod, potencia)"
                + " VALUES ('" + getMatricula()
                + "'," + getModelo()
                + "," + getPotencia()+")";
          System.out.println(sql);
        return con.accion(sql);
    }
      public boolean actualizar() {
        sql = "UPDATE camion SET codigo_mod="
                +getModelo()+", potencia='"
                +getPotencia()+"' WHERE matricula='"+getMatricula()+"'";
          System.out.println(sql);
        return con.accion(sql);
    }
    public boolean eliminar(String matricula){
        sql = "DELETE FROM camion WHERE matricula='"+matricula+"'";
        return con.accion(sql);
    }
    public List<Camion> buscar(String txt, String campo) {
        List<Camion> camiones = new ArrayList<>();
        try {
            sql = "SELECT matricula, codigo_mod, potencia FROM camion WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Camion camione = new Camion(rs.getString(1), rs.getInt(2), rs.getInt(3));
                    camiones.add(camione);
                }
            }
            con.close();
            return camiones;
        } catch (SQLException ex) {
            return null;
        }
    } 
       public int obteneridmarca(int codigo) {
        int idmarca = 0;
        sql = "SELECT CODIGO_MAR FROM MODELO WHERE CODIGO="+codigo+""; 
        try {
            rs = con.consulta(sql); 
            rs.next();
            idmarca = rs.getInt(1); 
        } catch (SQLException ex) {
        }
        con.close();
        return idmarca;
    }
      
}