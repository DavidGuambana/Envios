
package controlador;

import controlador.util.FiltrarTabla;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    String mod=null;

    public ctrlPersona(M_persona modelo, visPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);  
        visualizar("");
        seleccionar(vista.getJtPersonas());
    }
    public void iniciarCtrlBtn() {
    vista.getJb_ModoEditar().addActionListener(l->editarmodo());
    vista.getJbOK().addActionListener(l->accionboton());
    
    
    }
       private void visualizar(String id) {
           dtm = new DefaultTableModel(null, columnas);
           personas = modelo.listar(id);
           personas.stream().forEach(p -> dtm.addRow(new Object[]{p.getCedula(), p.getNombre1(), p.getNombre2(),
           p.getApelido1(), p.getApellido2(), p.getDireccion(), p.getTelefono(), p.getCodigo_can()}));
           vista.getJtPersonas().setModel(dtm);
           vista.getJtPersonas().setRowHeight(30);
    }
    public void editarmodo() {
        llenarPerfil();
        modelo.actualizar();
        vista.getTxt_cedula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
    }
       
        public void llenarPerfil() {
        personas = modelo.listar(id);
        if (!personas.isEmpty()) {
            vista.getTxt_cedula().setText(personas.get(0).getCedula());
            vista.getTxt_nombre1().setText(personas.get(0).getNombre1());
            vista.getTxt_nombre2().setText(personas.get(0).getNombre2());
            vista.getTxt_apellido1().setText(personas.get(0).getApelido1());
            vista.getTxt_apellido2().setText(personas.get(0).getApellido2());
            vista.getTxt_direccion().setText(personas.get(0).getDireccion());
            vista.getTxt_telefono().setText(personas.get(0).getTelefono()); 
        }
    }
        public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 0).toString();
                    
                    llenarPerfil();
                }
            }
        });
    }
    public void accionboton( ) {
        if (vista.getJbOK().getText().equals("MODIFICAR")) {
             setearDatos();
             modelo.actualizar();
             visualizar("");
             
            
        }
    }
     public void setearDatos() {
        try {
            if (vista.getTxt_cedula().getText().isEmpty()||vista.getTxt_nombre1().getText().isEmpty()|| vista.getTxt_nombre2().getText().isEmpty() || vista.getTxt_direccion().getText().isEmpty()|| vista.getTxt_telefono().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            } else {
                modelo.setCedula(vista.getTxt_cedula().getText());
                modelo.setNombre1(vista.getTxt_nombre1().getText());
                modelo.setNombre2(vista.getTxt_nombre2().getText());
                modelo.setApelido1(vista.getTxt_apellido1().getText());
                modelo.setApellido2(vista.getTxt_apellido2().getText());
                modelo.setDireccion(vista.getTxt_direccion().getText());
                modelo.setTelefono(vista.getTxt_telefono().getText());
                modelo.setCodigo_can(1);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
        }
    }
        

}
