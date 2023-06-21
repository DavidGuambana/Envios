package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mPersona extends Persona {
    
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Persona> listar(String cedula) {
        List<Persona> personas = new ArrayList<>();
        try {
            if ("".equals(cedula)) {
                sql = "SELECT cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, codigo_can FROM persona";
            } else {
                sql = "SELECT cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, codigo_can FROM persona WHERE cedula='"+cedula+"'";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                  personas.add(persona);
                }
            }
            con.close();
            return personas;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crear() {
        sql = "INSERT INTO persona(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, codigo_can)"
                + " VALUES ('" + getCedula()
                + "','" + getNombre1()
                + "','" + getNombre2()
                + "','" + getApelido1()
                + "','" + getApellido2()
                + "','" + getDireccion()
                + "','" + getTelefono()
                + "'," + getCodigo_can()+")";
        System.out.println(sql);
        return con.accion(sql);
    }
    
    public boolean actualizar() {
        sql = "UPDATE persona SET nombre1='"
                +getNombre1()+"', nombre2='"
                +getNombre2()+"', apellido1='"
                +getApelido1()+"', apellido2='"
                +getApellido2()+"', direccion='"
                +getDireccion()+"', telefono='"
                +getTelefono()+"', codigo_can="
                +getCodigo_can()+" WHERE cedula='"+getCedula()+"'";
        return con.accion(sql);
    }
    public boolean eliminar(String cedula){
        sql = "DELETE FROM persona WHERE cedula='"+cedula+"'";
        System.out.println(sql);
        return con.accion(sql);
    }

    public List<Persona> buscar(String txt, String campo) {
        List<Persona> personas = new ArrayList<>();
        try {
            sql = "SELECT cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono, codigo_can FROM persona WHERE " + campo + " like '%" + txt + "'";
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                    personas.add(persona);
                }
            }
            con.close();
            return personas;
        } catch (SQLException ex) {
            return null;
        }
    }
      public boolean existepersona (String cedula){
         boolean exist = false;
        try {
            sql = "SELECT COUNT(CEDULA)FROM PERSONA WHERE CEDULA="+cedula+"";
            System.out.println(sql);
            rs = con.consulta(sql);
            rs.next();
            if (rs.getInt(1) == 0) {
                exist = false;
                System.out.println("entra false");
            } else {
                exist = true;
                System.out.println("entra true");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }


}
