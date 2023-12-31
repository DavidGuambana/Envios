package controlador;
import controlador.util.Validar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;
import modelo.mCamion;
import modelo.mMarcaModelo;
import vista.vCamion;

public class cCamion {

    private final mCamion modelos;
    private final vCamion vista;
    
    List<Camion> camiones = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"matricula", "modelo", "potencia"};
    String id;
    String mod=null;
    private final mMarcaModelo modelomarca = new mMarcaModelo();

    public cCamion(mCamion modelo, vCamion vista) {
        vista.setVisible(true); 
        this.modelos = modelo;
        this.vista = vista;
        modelomarca.llenarcombomarca(vista.getCb_marca());
        modelomarca.llenarcombomodelo(vista.getCb_modelo());
        
        seleccionar(vista.getJtCamiones());
        iniciarCtrlBtn();
        crearmodo();
        visualizar("");
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
        camiones = modelos.listar(id);
        camiones.stream().forEach(p -> dtm.addRow(new Object[]{p.getMatricula(), p.getModelo(), p.getPotencia()
        }));
        vista.getJtCamiones().setModel(dtm);
        vista.getJtCamiones().setRowHeight(30);
    }

     
    private void buscar() {
        String columna = "";
        switch (vista.getCbColumnas().getSelectedIndex()) {

            case 0: columna = "matricula";break;
            case 1: columna = "codigo_mod";break;
            case 2: columna = "potencia";break;
            
        }
        
        dtm = new DefaultTableModel(null, columnas);
        camiones = modelos.buscar(vista.getTxtBuscar().getText(), columna);
        camiones.stream().forEach(p -> dtm.addRow(new Object[]{p.getMatricula(), p.getModelo(), p.getPotencia()}));
        vista.getJtCamiones().setModel(dtm);
        vista.getJtCamiones().setRowHeight(30);
    }

    public void editarmodo() {
        llenarPerfil();
        desbckbtn();
        vista.getTxt_matricula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
    }
      public void crearmodo() {
        vaciarPerfil();
        desbckbtn();
        vista.getTxt_matricula().setEditable(true);
        vista.getJbOK().setText("REGISTRAR");
    }
       public void eliminarver() {
        llenarPerfil();
        blockboton();
        vista.getTxt_matricula().setEditable(false);
        vista.getJbOK().setText("ELIMINAR");
    }
        
      
        public void vaciarPerfil() {
            vista.getTxt_matricula().setText("");
            vista.getCb_modelo().setSelectedItem("");
            vista.getTxt_potencia().setText("");
            vista.getCb_marca().setSelectedIndex(0);
            vista.getCb_modelo().setSelectedIndex(0);
          
        
    }
       
        public void llenarPerfil() {
        camiones = modelos.listar(id);
        if (!camiones.isEmpty()) {
            vista.getTxt_matricula().setText(camiones.get(0).getMatricula());
            vista.getTxt_potencia().setText(camiones.get(0).getPotencia()+"");
            vista.getCb_modelo().setSelectedIndex(camiones.get(0).getModelo()); 
            vista.getCb_marca().setSelectedIndex(modelos.obteneridmarca(camiones.get(0).getModelo()));
            
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
             modelos.actualizar();
             visualizar("");
        }
        if (vista.getJbOK().getText().equals("REGISTRAR")) {
             setearDatos();
             visualizar("");
             
        }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
               if (JOptionPane.showConfirmDialog(null, 
                "¿Está seguro de que desea eliminar el registro seleccionado?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
             
            try {
                if (modelos.eliminar(vista.getTxt_matricula().getText())) {
                    JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");
                    visualizar("");
                } else{
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR");
                }
                
                
                crearmodo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
            }
        }
        }
        
    }
    public void setearDatos() {
        try {
            if (vista.getTxt_matricula().getText().isEmpty()||vista.getTxt_potencia().getText().isEmpty()||vista.getCb_modelo().getSelectedIndex()==0||vista.getCb_marca().getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            } else {
                modelos.setMatricula(vista.getTxt_matricula().getText());
                modelos.setModelo(vista.getCb_modelo().getSelectedIndex());
                modelos.setPotencia(Integer.parseInt(vista.getTxt_potencia().getText()));
                modelos.crear();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
        }
    }

    public void blockboton() {
        vista.getTxt_matricula().setEditable(false);
        vista.getTxt_potencia().setEditable(false);
        vista.getCb_modelo().setEnabled(false);
    }

    public void desbckbtn() {
        vista.getTxt_matricula().setEditable(true);
        vista.getTxt_potencia().setEditable(true);
        vista.getCb_modelo().setEnabled(true);
    }
    public void controlKey() {
        vista.getTxt_potencia().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxt_potencia(), 4); 
            }
        });
        vista.getTxt_matricula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.nombre_compuesto(vista.getTxt_matricula(), 7); 
            }
        });
//        vista.getTxt_nombre2().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.letras(vista.getTxt_nombre2(), 30); 
//            }
//        });
//        vista.getTxt_apellido1().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.letras(vista.getTxt_apellido1(), 30); 
//            }
//        });
//        vista.getTxt_apellido2().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.letras(vista.getTxt_apellido2(), 30); 
//            }
//        });
//        vista.getTxt_direccion().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.nombre_compuesto(vista.getTxt_direccion(), 60); 
//            }
//        });
//        vista.getTxt_telefono().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.numero(vista.getTxt_telefono(), 10); 
//            }
//        });
//        vista.getTxt_salario().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e){
//                Validar.dinero(vista.getTxt_salario(), 7); 
//            }
//        });
    }
}
