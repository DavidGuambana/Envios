package controlador;

import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.mCamion;
import modelo.mConductor;
import modelo.mMarcaModelo;
import modelo.mPersona;
import modelo.mPrincipal;
import modelo.mTransaccional;
import modelo.mUbicacion;
import vista.vCamion;
import vista.vConductor;
import vista.vModelo;
import vista.vPersona;
import vista.vPrincipal;
import vista.vTransaccional;
import vista.vUbicacion;

public final class cPrincipal {

    vPrincipal p;
    vPersona vispersona;
    vUbicacion visubicacion;
    vCamion viscamion;
    vConductor visconduc;
    vModelo vismarcamodelo;
    vTransaccional vistransaccional;
    mPrincipal m;

    public cPrincipal(vPrincipal p, mPrincipal m) {
        this.p = p;
        this.m = m;
        control();
        p.getjDialog().setSize(330, 530);
        p.getjDialog().setLocationRelativeTo(p);
        p.getjDialog().setVisible(true);
    }
    
    Conexion con;

    public void control() { 
        p.getJbConectar().addActionListener(l -> Conectar());
        p.getJbDesconectar().addActionListener(l -> Desconectar());
        p.getBtnEjecutar().addActionListener(l -> RUN_SQL());
        p.getJcTipo().addActionListener(l-> cambiar_tc());
        
        
        p.getJb_nuevo_envio().addActionListener(l -> menuTransaccional());
        p.getJb_nuevo_cliente().addActionListener(l -> menuPersona());
        p.getJb_ubicaciones().addActionListener(l -> menuUbicaciones());
        p.getJb_nuevo_chofer().addActionListener(l -> menuConductores());
        //p.getJb_nuevo_camion().addActionListener(l-> menuCamiones());
        p.getJb_marcas_modelos().addActionListener(l -> menuMarcaModelo());

    }

    public void menuPersona() {

        mPersona modper = new mPersona();
        try {
            p.getJdp_principal().add(vispersona);
        } catch (Exception e) {
            vispersona = new vPersona();
            p.getJdp_principal().add(vispersona);
        }
        
        cPersona controlador = new cPersona(modper, vispersona);
        controlador.iniciarCtrlBtn();
        
    }
    public void menuUbicaciones(){

        mUbicacion model = new mUbicacion();
        try {
            p.getJdp_principal().add(visubicacion);
        } catch (Exception e) {
            visubicacion = new vUbicacion();
            p.getJdp_principal().add(visubicacion);
        }
        cUbicacion controlador = new cUbicacion(model, visubicacion);
    }
    
    public void menuCamiones(){

        mCamion model = new mCamion();
        try {
            p.getJdp_principal().add(viscamion);
        } catch (Exception e) {
            viscamion = new vCamion();
            p.getJdp_principal().add(viscamion);
        }
        cCamion controlador = new cCamion(model, viscamion);
    }

    public void menuConductores() {
        mConductor model = new mConductor();
        try {
            p.getJdp_principal().add(visconduc);
        } catch (Exception e) {
            visconduc = new vConductor();
            p.getJdp_principal().add(visconduc);
        }
        cConductores controlador = new cConductores(model, visconduc);
    }

    public void menuMarcaModelo() {
        mMarcaModelo model = new mMarcaModelo();
        try {
            p.getJdp_principal().add(vismarcamodelo);
        } catch (Exception e) {
            vismarcamodelo = new vModelo();
            p.getJdp_principal().add(vismarcamodelo);
        }
        cMarcaModelo controlador = new cMarcaModelo(model, vismarcamodelo);
    }
    
    public void menuTransaccional(){
        mTransaccional model = new mTransaccional(); 
       try {
            p.getJdp_principal().add(vistransaccional);
        } catch (Exception e) {
            vistransaccional = new vTransaccional();
            p.getJdp_principal().add(vistransaccional);
        }
        cTransaccional controlador = new cTransaccional(vistransaccional,model);
    }

    public void Conectar() {
        if (p.getTxtIP().getText().isEmpty() || p.getTxtUser().getText().isEmpty() || p.getTxtPassword().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aún hay campos por completar!");
        } else {
            Conexion.IP = p.getTxtIP().getText();
            Conexion.user = p.getTxtUser().getText();
            Conexion.password = p.getTxtPassword().getText();
            con = new Conexion();
            if (con.conectar()) {
                p.getjDialog().setVisible(false);
                p.setLocationRelativeTo(null);
                setearVariables();
                p.setVisible(true);
            }
        }
    }

    public void Desconectar() {
        if (JOptionPane.showConfirmDialog(null, "Está a punto de desconectarse ¿Desea continuar?",
                "Cerrar Sesión!", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            Conexion.IP = "";
            Conexion.user = "";
            Conexion.password = "";
            con.close();
            p.getjDialog().setVisible(true);
            p.setVisible(false);
        }
    }

    public void setearVariables() {
        if (p.getTxtIP().getText().toLowerCase().equals("localhost") || p.getTxtIP().getText().equals("127.0.0.1")) {
            p.getLbTipo().setText("localhost");
        } else {
            p.getLbTipo().setText("LAN");
        }
        p.getLbEstado().setText("Activo");
        //COUNT DE REGISTROS
    }
    public void RUN_SQL() {
        if (!p.getImput().getText().isEmpty()) {
            if (m.llenarTabla(p.getJtRS(), p.getImput().getText())) {
                p.getjDialogRS().setSize(792, 510);
                p.getjDialogRS().setLocationRelativeTo(p);
                p.getjDialogRS().setVisible(true);
            }
        }
    }
    public void cambiar_tc(){
        if (p.getJcTipo().getSelectedIndex()==0) {
            p.getTxtIP().setText("127.0.0.1");
        } else{
            p.getTxtIP().setText("");
        }
    }
}
