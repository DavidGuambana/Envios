/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class M_Camion extends Camion{
     public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
     public List<Camion> listar(String matricula) {
        List<Camion> camion1 = new ArrayList<>();
        try {
            if ("".equals(matricula)) {
                sql = "SELECT matricula, marca, modelo, potencia";
            } else {
                sql = "SELECT matricula, marca, modelo, potencia FROM persona WHERE CAMION='"+matricula+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Camion cami = new Camion(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4));
                   camion1.add(cami);
                }
            }
            con.close();
            return camion1;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean crear() {
        sql = "INSERT INTO persona(matricula, marca, modelo, potencia)"
                + " VALUES ('" + getMatricula()
                + "','" + getMarca()
                + "','" + getModelo()
                + "','" + getPotencia()+
                ")";
        return con.accion(sql);
    }
      public boolean actualizar() {
        sql = "UPDATE persona SET marca='"
                +getMarca()+"', modelo='"
                +getModelo()+"', potencia='"
                +getPotencia()+" WHERE cedula='"+getMatricula()+"'";
        return con.accion(sql);
    }
    public boolean eliminarPersona(String cedula){
        sql = "DELETE FROM persona WHERE cedula='"+cedula+"'";
        return con.accion(sql);
    }
      
      
}
