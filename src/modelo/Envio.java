package modelo;

import java.util.Date;

public class Envio {
    private int codigo;
    private Date fecha;
    private int codigo_via;

    public Envio() {
    }

    public Envio(int codigo, Date fecha, int codigo_via) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.codigo_via = codigo_via;
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

    public int getCodigo_via() {
        return codigo_via;
    }

    public void setCodigo_via(int codigo_via) {
        this.codigo_via = codigo_via;
    }

    @Override
    public String toString() {
        return "Envio{" + "codigo=" + codigo + ", fecha=" + fecha + ", codigo_via=" + codigo_via + '}';
    }
}
