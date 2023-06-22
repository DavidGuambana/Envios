
package controlador;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conductor;
import modelo.mConductor;
import modelo.mPersona;
import modelo.mUbicacion;
import vista.vConductor;

public class cConductores {

    mConductor modelo;
    vConductor vista;
    mPersona modelop = new mPersona();
    List<Conductor> conductores = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"ID Conductor", "Licencia", "Salario", "Cedula"};
    String id;
    String mod = null;
    public static ResultSet rs = null;
    private mUbicacion modubi = new mUbicacion();

    public cConductores(mConductor modelo, vConductor vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        modubi.llenarcomboprovincia(vista.getCb_provincia());
        modubi.llenarcombocanton(vista.getCb_canton());
        visualizar("");
        seleccionar(vista.getJtConductores());
        iniciarCtrlBtn();
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
        conductores = modelo.listar(id);
        conductores.stream().forEach(p -> dtm.addRow(new Object[]{p.getId_conductor(), p.getLicencia(), p.getSalario(),
            p.getCedula()}));
        vista.getJtConductores().setModel(dtm);
        vista.getJtConductores().setRowHeight(30);
    }

    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 3).toString();
                    blockboton();
                    llenarPerfil();
                }
            }
        });
    }

    public void llenarPerfil() {
        rs = modelo.obtener_conductor(id);

        if (rs != null) {
            try {
                while (rs.next()) {
                    vista.getTxt_cedula().setText(rs.getString(1));//cedula
                    vista.getTxt_nombre1().setText(rs.getString(2));//nombre1
                    vista.getTxt_nombre2().setText(rs.getString(3));//nombew2
                    vista.getTxt_apellido1().setText(rs.getString(4));//apellido1
                    vista.getTxt_apellido2().setText(rs.getString(5));//apellido2
                    vista.getTxt_direccion().setText(rs.getString(6));//direccion
                    vista.getTxt_telefono().setText(rs.getString(7));//telefono
                    vista.getCb_provincia().setSelectedIndex(rs.getInt(8));
                    vista.getCb_canton().setSelectedIndex(rs.getInt(9));
                    vista.getCb_id().setText(rs.getInt(10) + "");//idcon
                    vista.getTxt_licencia().setText(rs.getString(11));//licencia
                    vista.getTxt_salario().setText(rs.getDouble(12) + "");//salario 

                }
            } catch (SQLException ex) {
                Logger.getLogger(cConductores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void editarmodo() {
        desbckbtn();
        llenarPerfil();

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
        vista.getTxt_licencia().setText("");
        vista.getTxt_salario().setText("");
        vista.getCb_provincia().setSelectedIndex(0);
        vista.getCb_canton().setSelectedIndex(0);

    }

    public void blockboton() {
        vista.getTxt_cedula().setEditable(false);
        vista.getTxt_nombre1().setEditable(false);
        vista.getTxt_nombre2().setEditable(false);
        vista.getTxt_apellido1().setEditable(false);
        vista.getTxt_apellido2().setEditable(false);
        vista.getTxt_direccion().setEditable(false);
        vista.getTxt_telefono().setEditable(false);
        vista.getTxt_licencia().setEditable(false);
        vista.getTxt_salario().setEditable(false);
        vista.getCb_id().setEditable(false);
        vista.getCb_canton().setEnabled(false);
        vista.getCb_canton().setBackground(Color.WHITE);
        vista.getCb_provincia().setEnabled(false);
        vista.getCb_provincia().setBackground(Color.WHITE);

    }

    public void desbckbtn() {
        vista.getTxt_cedula().setEditable(true);
        vista.getTxt_nombre1().setEditable(true);
        vista.getTxt_nombre2().setEditable(true);
        vista.getTxt_apellido1().setEditable(true);
        vista.getTxt_apellido2().setEditable(true);
        vista.getTxt_direccion().setEditable(true);
        vista.getTxt_telefono().setEditable(true);
        vista.getTxt_licencia().setEditable(true);
        vista.getTxt_salario().setEditable(true);
        vista.getCb_canton().setEnabled(true);
        vista.getCb_id().setEditable(false);
        vista.getCb_id().setText("Autogenerado");
        vista.getCb_canton().setBackground(Color.WHITE);
        vista.getCb_provincia().setEnabled(true);
        vista.getCb_provincia().setBackground(Color.WHITE);

    }

    public void setearDatos() {

        if (modelo.existeconductor(vista.getTxt_cedula().getText()) && modelop.existepersona(vista.getTxt_cedula().getText())) {
            System.out.println("entra al if de solo ingresar conductor");
            if (vista.getTxt_cedula().getText().isEmpty() || vista.getTxt_nombre1().getText().isEmpty() || vista.getTxt_nombre2().getText().isEmpty() || vista.getTxt_direccion().getText().isEmpty() || vista.getTxt_telefono().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            } else {
                if (JOptionPane.showConfirmDialog(null,
                        "¿El usuario ya existe como otra entidad desea actalizar los datos?",
                        "Crear registro", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {

                    try {
                        modelop.setCedula(vista.getTxt_cedula().getText());
                        modelop.setNombre1(vista.getTxt_nombre1().getText());
                        modelop.setNombre2(vista.getTxt_nombre2().getText());
                        modelop.setApelido1(vista.getTxt_apellido1().getText());
                        modelop.setApellido2(vista.getTxt_apellido2().getText());
                        modelop.setDireccion(vista.getTxt_direccion().getText());
                        modelop.setTelefono(vista.getTxt_telefono().getText());
                        modelop.setCodigo_can(vista.getCb_canton().getSelectedIndex());
                        modelo.setCedula(vista.getTxt_cedula().getText());
                        modelo.setLicencia(vista.getTxt_licencia().getText());
                        modelo.setSalario(Double.valueOf(vista.getTxt_salario().getText()));
                        modelop.actualizar();
                        modelo.crear();
                        visualizar("");
                        JOptionPane.showMessageDialog(null, "Ingresado correctamente");

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
                    }

                } else {
                    System.out.println("setea datos");
                    modelo.setCedula(vista.getTxt_cedula().getText());
                    modelo.setLicencia(vista.getTxt_licencia().getText());
                    modelo.setSalario(Double.valueOf(vista.getTxt_salario().getText()));
                    modelo.crear();

                }

            }
        }
        if (modelop.existepersona(vista.getTxt_cedula().getText())) {
        } else {
            modelo.setCedula(vista.getTxt_cedula().getText());
            modelo.setLicencia(vista.getTxt_licencia().getText());
            modelo.setSalario(Double.valueOf(vista.getTxt_salario().getText()));
            modelop.setCedula(vista.getTxt_cedula().getText());
            modelop.setNombre1(vista.getTxt_nombre1().getText());
            modelop.setNombre2(vista.getTxt_nombre2().getText());
            modelop.setApelido1(vista.getTxt_apellido1().getText());
            modelop.setApellido2(vista.getTxt_apellido2().getText());
            modelop.setDireccion(vista.getTxt_direccion().getText());
            modelop.setTelefono(vista.getTxt_telefono().getText());
            modelop.setCodigo_can(vista.getCb_canton().getSelectedIndex());
            modelop.crear();
            modelo.crear();
        }

    }

    public void setearDatosmod() {
        modelo.setId_conductor(Integer.parseInt(vista.getCb_id().getText()));
        modelo.setCedula(vista.getTxt_cedula().getText());
        modelo.setLicencia(vista.getTxt_licencia().getText());
        modelo.setSalario(Double.valueOf(vista.getTxt_salario().getText()));
        modelop.setCedula(vista.getTxt_cedula().getText());
        modelop.setNombre1(vista.getTxt_nombre1().getText());
        modelop.setNombre2(vista.getTxt_nombre2().getText());
        modelop.setApelido1(vista.getTxt_apellido1().getText());
        modelop.setApellido2(vista.getTxt_apellido2().getText());
        modelop.setDireccion(vista.getTxt_direccion().getText());
        modelop.setTelefono(vista.getTxt_telefono().getText());
        modelop.setCodigo_can(vista.getCb_canton().getSelectedIndex());
    }

    public void accionboton() {
        if (vista.getJbOK().getText().equals("MODIFICAR")) {
            setearDatosmod();
            modelop.actualizar();
            modelo.actualizar();
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
                    modelo.eliminar(vista.getCb_id().getText());
                    visualizar("");
                    JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
                }

            } else {

            }
            visualizar("");

        }

    }
      public void buscar() {
        if (!vista.getTxtBuscar().getText().isEmpty()) {
            String columna = "";
            int codigo = 0;
            switch (vista.getCbColumnas().getSelectedIndex()) {
                case 0:
                    columna = "ID_CON";
                    break;
                case 1:
                    columna = "LICENCIA";
                    break;
                case 2:
                    columna = "SALARIO";
                    break;
                case 3:
                    columna = "CEDULA_PER";
                    break;
            }
            modelo.buscar(vista.getTxtBuscar().getText(), columna, vista.getJtConductores());
        } else {
          visualizar("");
        }
    }

}
