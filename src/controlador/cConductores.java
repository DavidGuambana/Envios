
package controlador;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Conductor;
import modelo.Persona;
import modelo.mConductor;
import modelo.mUbicacion;
import vista.vConductor;

public class cConductores {

    private final mConductor modelo;
    private final vConductor vista;
    List<Conductor> conductores = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"ID Conductor", "Licencia", "Salario", "Cedula"};
    String id;
    String mod = null;
    public static ResultSet rs = null;

    private final mUbicacion modubi = new mUbicacion();

    public cConductores(mConductor modelo, vConductor vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setVisible(true);
        visualizar("");

    }

    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        conductores = modelo.listar(id);
        conductores.stream().forEach(p -> dtm.addRow(new Object[]{p.getId_conductor(), p.getLicencia(), p.getSalario(),
            p.getCedula()}));
        vista.getJtConductores().setModel(dtm);
        vista.getJtConductores().setRowHeight(30);
    }

}
