package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
}
