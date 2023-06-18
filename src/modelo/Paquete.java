package modelo;

public class Paquete {
    public int codigopaq;
    public String descripcion;
    public Double peso;
    public Double precio;
    public String cedula_rem;
    public String cedula_dest;
    public int codigo_can;
    public String direccion;
    public int codigo_envio;

    public Paquete() {
    }

    public Paquete(int codigopaq, String descripcion, Double peso, Double precio, String cedula_rem, String cedula_dest, int codigo_can, String direccion, int codigo_envio) {
        this.codigopaq = codigopaq;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
        this.cedula_rem = cedula_rem;
        this.cedula_dest = cedula_dest;
        this.codigo_can = codigo_can;
        this.direccion = direccion;
        this.codigo_envio = codigo_envio;
    }

    public int getCodigopaq() {
        return codigopaq;
    }

    public void setCodigopaq(int codigopaq) {
        this.codigopaq = codigopaq;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCedula_rem() {
        return cedula_rem;
    }

    public void setCedula_rem(String cedula_rem) {
        this.cedula_rem = cedula_rem;
    }

    public String getCedula_dest() {
        return cedula_dest;
    }

    public void setCedula_dest(String cedula_dest) {
        this.cedula_dest = cedula_dest;
    }

    public int getCodigo_can() {
        return codigo_can;
    }

    public void setCodigo_can(int codigo_can) {
        this.codigo_can = codigo_can;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_envio() {
        return codigo_envio;
    }

    public void setCodigo_envio(int codigo_envio) {
        this.codigo_envio = codigo_envio;
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigopaq=" + codigopaq + ", descripcion=" + descripcion + ", peso=" + peso + ", precio=" + precio + ", cedula_rem=" + cedula_rem + ", cedula_dest=" + cedula_dest + ", codigo_can=" + codigo_can + ", direccion=" + direccion + ", codigo_envio=" + codigo_envio + '}';
    }
    
    
}
