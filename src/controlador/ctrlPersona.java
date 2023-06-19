
package controlador;

import controlador.util.FiltrarTabla;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.M_persona;
import modelo.Persona;
import vista.visPersona;

public class ctrlPersona {

    private final M_persona modelo;
    private final visPersona vista;
    
    List<Persona> personas = new ArrayList<Persona>();
    DefaultTableModel dtm;
//   cedula, nombre1,  nombre2,  apelido1, apellido2, direccion,  telefono,  codigo_can
    String[] columnas = {"Cedula", "Primer nombre", "Segundo nombre", "Primer Apellido", "Segundo Apellido", "Direccion", "Telefono", "Codigo canton"};
    String id;

    public ctrlPersona(M_persona modelo, visPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);  
        visualizar("");
    }
    public void iniciarCtrlBtn() {
       

    }
       private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        personas = modelo.listar(id);
        personas.stream().forEach(p -> dtm.addRow(new Object[]{p.getCedula(), p.getNombre1(), p.getNombre2(),
            p.getApelido1(), p.getApellido2(), p.getDireccion(), p.getTelefono(), p.getCodigo_can()}));
        vista.getJtPersonas().setModel(dtm);
        vista.getJtPersonas().setRowHeight(30);
    }

}
