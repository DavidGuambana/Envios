package modelo;

public class Persona {
    public String cedula;
    public String nombre1;
    public String nombre2;
    public String apelido1;
    public String apellido2;
    public String direccion;
    public String telefono;
    public int codigo_can;

    public Persona() {
    }

    public Persona(String cedula, String nombre1, String nombre2, String apelido1, String apellido2, String direccion, String telefono, int codigo_can) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apelido1 = apelido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo_can = codigo_can;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo_can() {
        return codigo_can;
    }

    public void setCodigo_can(int codigo_can) {
        this.codigo_can = codigo_can;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apelido1=" + apelido1 + ", apellido2=" + apellido2 + ", direccion=" + direccion + ", telefono=" + telefono + ", codigo_can=" + codigo_can + '}';
    }
   
}
