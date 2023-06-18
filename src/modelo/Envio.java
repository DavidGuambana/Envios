package modelo;

import java.util.Date;

public class Envio {
    private int codigo;
    private Date fecha;
    private int codigo_vista;

    public Envio() {
    }
    
    public Envio(int codigo, Date fecha, int codigo_vista) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.codigo_vista = codigo_vista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigo_vista() {
        return codigo_vista;
    }

    public void setCodigo_vista(int codigo_vista) {
        this.codigo_vista = codigo_vista;
    }

    @Override
    public String toString() {
        return "Envio{" + "codigo=" + codigo + ", fecha=" + fecha + ", codigo_vista=" + codigo_vista + '}';
    }
}
