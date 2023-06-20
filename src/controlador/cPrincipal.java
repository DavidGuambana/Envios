package controlador;

import modelo.mCamion;
import modelo.mConductor;
import modelo.mMarcaModelo;
import modelo.mPersona;
import modelo.mUbicacion;
import vista.vCamion;
import vista.vConductor;
import vista.vModelo;
import vista.vPersona;
import vista.vPrincipal;
import vista.vUbicacion;

public final class cPrincipal {

    vPrincipal p;
    vPersona vispersona;
    vUbicacion visubicacion;
    vCamion viscamion;
    vConductor visconduc;
    vModelo vismarcamodelo;

    public cPrincipal(vPrincipal p) {
        this.p = p;
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        control();
        
    }

    public void control() {
       p.getJb_nuevo_cliente().addActionListener(l-> menuPersona());
       p.getJb_ubicaciones().addActionListener(l-> menuUbicaciones());
       p.getJb_nuevo_chofer().addActionListener(l-> menuConductores());
       //p.getJb_nuevo_camion().addActionListener(l-> menuCamiones());
       p.getJb_marcas_modelos().addActionListener(l-> menuMarcaModelo());
       
    }
    public void menuPersona(){

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
      public void menuConductores(){

        mConductor model = new mConductor();
        try {
            p.getJdp_principal().add(visconduc);
        } catch (Exception e) {
            visconduc = new vConductor();
            p.getJdp_principal().add(visconduc);
        }
        cConductores controlador = new cConductores(model, visconduc);
    }
      public void menuMarcaModelo(){

        mMarcaModelo model = new mMarcaModelo();
        try {
            p.getJdp_principal().add(vismarcamodelo);
        } catch (Exception e) {
            vismarcamodelo = new vModelo();
            p.getJdp_principal().add(vismarcamodelo);
        }
        cMarcaModelo controlador = new cMarcaModelo(model, vismarcamodelo);
    }
}
