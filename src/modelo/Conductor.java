package modelo;

public class Conductor {
   private int id_conductor;
   private String licencia;
   private Double salario;
   private String cedula;

    public Conductor() {
    }

    public Conductor(int id_conductor, String licencia, Double salario, String cedula) {
        this.id_conductor = id_conductor;
        this.licencia = licencia;
        this.salario = salario;
        this.cedula = cedula;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Conductor{" + "id_conductor=" + id_conductor + ", licencia=" + licencia + ", salario=" + salario + ", cedula=" + cedula + '}';
    }
}
