package controlador;

import modelo.mPersona;
import modelo.mUbicacion;
import vista.vPersona;
import vista.vPrincipal;
import vista.vUbicacion;

public final class cPrincipal {

    vPrincipal p;
    vPersona vispersona;
    vUbicacion visubicacion;

    public cPrincipal(vPrincipal p) {
        this.p = p;
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        control();
        
    }

    public void control() {
       p.getJb_nuevo_cliente().addActionListener(l-> menuPersona());
       p.getJb_ubicaciones().addActionListener(l-> menuUbicaciones());
        
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
     
   
    
}
