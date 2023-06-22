package controlador;

import controlador.util.Validar;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.mPersona;
import modelo.Persona;
import modelo.mUbicacion;
import vista.vPersona;

public class cPersona {

    private final mPersona modelo;
    private final vPersona vista;
    
    List<Persona> personas = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Cedula", "Primer nombre", "Segundo nombre", "Primer Apellido", "Segundo Apellido", "Direccion", "Telefono", "Codigo canton"};
    String id;
    String mod=null;
    private final mUbicacion modubi = new mUbicacion();

    public cPersona(mPersona modelo, vPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        modubi.llenarcombocanton(vista.getCb_canton());
        modubi.llenarcomboprovincia(vista.getCb_provincia());
        vista.setVisible(true);  
        visualizar("");
        seleccionar(vista.getJtPersonas());
        crearmodo();
        controlKey();
    }
    public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJb_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getJb_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l -> accionboton());
        vista.getBtnBuscar().addActionListener(l -> buscar());

    }

    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        personas = modelo.listar(id);
        personas.stream().forEach(p -> dtm.addRow(new Object[]{p.getCedula(), p.getNombre1(), p.getNombre2(),
            p.getApelido1(), p.getApellido2(), p.getDireccion(), p.getTelefono(), p.getCodigo_can()}));
        vista.getJtPersonas().setModel(dtm);
        vista.getJtPersonas().setRowHeight(30);
    }
    
    private void buscar() {
        String columna = "";
        switch (vista.getCbColumnas().getSelectedIndex()) {

            case 0: columna = "cedula";break;
            case 1: columna = "nombre1";break;
            case 2: columna = "nombre2";break;
            case 3: columna = "apellido1";break;
            case 4: columna = "apellido2";break;
            case 5: columna = "direccion";break;
            case 6: columna = "telefono";break;
            case 7: columna = "codigo_can";break;
        }
        
        dtm = new DefaultTableModel(null, columnas);
        personas = modelo.buscar(vista.getTxtBuscar().getText(), columna);
        personas.stream().forEach(p -> dtm.addRow(new Object[]{p.getCedula(), p.getNombre1(), p.getNombre2(),
            p.getApelido1(), p.getApellido2(), p.getDireccion(), p.getTelefono(), p.getCodigo_can()}));
        vista.getJtPersonas().setModel(dtm);
        vista.getJtPersonas().setRowHeight(30);
    }

    public void editarmodo() {
        llenarPerfil();
        desbckbtn();
        vista.getTxt_cedula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
    }
      public void crearmodo() {
        vaciarPerfil();
        desbckbtn();
        vista.getTxt_cedula().setEditable(true);
        vista.getJbOK().setText("REGISTRAR");
    }
       public void eliminarver() {
        llenarPerfil();
        blockboton();
        vista.getTxt_cedula().setEditable(false);
        vista.getJbOK().setText("ELIMINAR");
    }
        
      
        public void vaciarPerfil() {
            vista.getTxt_cedula().setText("");
            vista.getTxt_nombre1().setText("");
            vista.getTxt_nombre2().setText("");
            vista.getTxt_apellido1().setText("");
            vista.getTxt_apellido2().setText("");
            vista.getTxt_direccion().setText("");
            vista.getTxt_telefono().setText(""); 
        
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
            vista.getCb_canton().setSelectedIndex(personas.get(0).getCodigo_can());
            String nombrec = vista.getCb_canton().getSelectedItem().toString();
            vista.getCb_provincia().setSelectedIndex(modubi.obteneridPRO(nombrec));

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

    public void accionboton() {
        if (vista.getJbOK().getText().equals("MODIFICAR")) {
            if (setearDatos()) {
                modelo.actualizar();
                visualizar("");
            }
        }
        if (vista.getJbOK().getText().equals("REGISTRAR")) {
            if (setearDatos()) {
                modelo.crear();
                visualizar("");
            }
            
        }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
            if (JOptionPane.showConfirmDialog(null,
                    "¿Está seguro de que desea eliminar el registro seleccionado?",
                    "Eliminar registro", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {

                try {
                    modelo.eliminar(vista.getTxt_cedula().getText());
                    visualizar("");
                    JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");
                    crearmodo();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
                }

            }
        }

    }
     public boolean setearDatos() {
        boolean correcto = false;
        try {
            if (!Validar.cedula(vista.getTxt_cedula().getText())||vista.getTxt_cedula().getText().isEmpty()||vista.getTxt_nombre1().getText().isEmpty()|| vista.getTxt_nombre2().getText().isEmpty() || vista.getTxt_direccion().getText().isEmpty()|| vista.getTxt_telefono().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
                if (!Validar.cedula(vista.getTxt_cedula().getText())) {
                    JOptionPane.showMessageDialog(null, "¡Cédula incorrecta!");
                }
            } else {
                modelo.setCedula(vista.getTxt_cedula().getText());
                modelo.setNombre1(vista.getTxt_nombre1().getText());
                modelo.setNombre2(vista.getTxt_nombre2().getText());
                modelo.setApelido1(vista.getTxt_apellido1().getText());
                modelo.setApellido2(vista.getTxt_apellido2().getText());
                modelo.setDireccion(vista.getTxt_direccion().getText());
                modelo.setTelefono(vista.getTxt_telefono().getText());
                modelo.setCodigo_can(1);
                String nombrec = vista.getCb_canton().getSelectedItem().toString();
                System.out.println(nombrec);
                System.out.println(modubi.obtenerid(nombrec));
                modelo.setCodigo_can(modubi.obtenerid(nombrec));
                correcto = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
            correcto = false;
        }
        return correcto;
    }
    public void blockboton(){
        vista.getTxt_cedula().setEditable(false);
        vista.getTxt_nombre1().setEditable(false);
        vista.getTxt_nombre2().setEditable(false);
        vista.getTxt_apellido1().setEditable(false);
        vista.getTxt_apellido2().setEditable(false);
        vista.getTxt_direccion().setEditable(false);
        vista.getTxt_telefono().setEditable(false);
        vista.getCb_canton().setEnabled(false);
        vista.getCb_canton().setBackground(Color.WHITE);
        vista.getCb_provincia().setEnabled(false);
        vista.getCb_provincia().setBackground(Color.WHITE);


    
}
      public void desbckbtn(){
          vista.getTxt_cedula().setEditable(true);
          vista.getTxt_nombre1().setEditable(true);
          vista.getTxt_nombre2().setEditable(true);
          vista.getTxt_apellido1().setEditable(true);
          vista.getTxt_apellido2().setEditable(true);
          vista.getTxt_direccion().setEditable(true);
          vista.getTxt_telefono().setEditable(true);
          vista.getCb_canton().setEnabled(true);
          vista.getCb_canton().setBackground(Color.WHITE);
          vista.getCb_provincia().setEnabled(true);
          vista.getCb_provincia().setBackground(Color.WHITE);
    
}
      public void controlKey() {
        vista.getTxt_cedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxt_cedula(), 10); 
            }
        });
        vista.getTxt_nombre1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxt_nombre1(), 30); 
            }
        });
        vista.getTxt_nombre2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxt_nombre2(), 30); 
            }
        });
        vista.getTxt_apellido1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxt_apellido1(), 30); 
            }
        });
        vista.getTxt_apellido2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxt_apellido2(), 30); 
            }
        });
        vista.getTxt_direccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.nombre_compuesto(vista.getTxt_direccion(), 60); 
            }
        });
        vista.getTxt_telefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxt_telefono(), 10); 
            }
        });
    }
}
