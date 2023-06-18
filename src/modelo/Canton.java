package modelo;
public class Canton {
    private int codigo;
    String nombre;

    public Canton() {
    }

    public Canton(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Canton{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
