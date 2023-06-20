package controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;
import modelo.mCamion;
import vista.vCamion;

public class cCamion {

    private final mCamion modelo;
    private final vCamion vista;

    List<Camion> camiones = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Matricula", "Marca", "Modelo", "Potencia"};
    String id;
    String mod = null;

    public cCamion(mCamion modelo, vCamion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar("");
        seleccionar(vista.getJtCamiones());
    }

    public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJbOK().addActionListener(l -> accionboton());

    }

    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        camiones = modelo.listar(id);
        camiones.stream().forEach(p -> dtm.addRow(new Object[]{p.getMatricula(), p.getMarca(), p.getModelo(), p.getPotencia()}));
        vista.getJtCamiones().setModel(dtm);
        vista.getJtCamiones().setRowHeight(30);
    }

    public void editarmodo() {
        llenarPerfil();
        modelo.actualizar();
        vista.getTxt_matricula().setEditable(false);
        vista.getJbOK().setText("MODIFICAR");
    }

    public void llenarPerfil() {
        camiones = modelo.listar(id);
        if (!camiones.isEmpty()) {
            vista.getTxt_matricula().setText(camiones.get(0).getMatricula());
            vista.getCb_marca().setSelectedItem(camiones.get(0).getMarca());
            vista.getCb_modelo().setSelectedItem(camiones.get(0).getModelo());
            vista.getTxt_potencia().setText(camiones.get(0).getPotencia());

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
            setearDatos();
            modelo.actualizar();
            visualizar("");
        }
    }

    public void setearDatos() {
        try {
            if (vista.getTxt_matricula().getText().isEmpty() || vista.getTxt_potencia().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            } else {
                modelo.setMatricula(vista.getTxt_matricula().getText());
                //modelo.setModelo(vista.getCb_modelo().getSelectedItem().toString());
                modelo.setPotencia(vista.getTxt_potencia().getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
        }
    }
}
