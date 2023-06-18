package modelo;

import java.util.Date;

public class Viaje {
    private int codigo;
    private String matricula;
    private Date fecha;
    private int codigo_can;
    private int id_con;

    public Viaje() {
    }

    public Viaje(int codigo, String matricula, Date fecha, int codigo_can, int id_con) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.fecha = fecha;
        this.codigo_can = codigo_can;
        this.id_con = id_con;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigo_can() {
        return codigo_can;
    }

    public void setCodigo_can(int codigo_can) {
        this.codigo_can = codigo_can;
    }

    public int getId_con() {
        return id_con;
    }

    public void setId_con(int id_con) {
        this.id_con = id_con;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", matricula=" + matricula + ", fecha=" + fecha + ", codigo_can=" + codigo_can + ", id_con=" + id_con + '}';
    }
}
