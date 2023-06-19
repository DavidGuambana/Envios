package controlador;

import modelo.M_persona;
import modelo.M_ubicacion;
import vista.visPersona;
import vista.visPrincipal;
import vista.visUbicacion;

public final class ctrlPrincipal {

    visPrincipal p;
    visPersona vispersona;
    visUbicacion visubicacion;

    public ctrlPrincipal(visPrincipal p) {
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

       M_persona modper = new M_persona();
        try {
            p.getJdp_principal().add(vispersona);
        } catch (Exception e) {
            vispersona = new visPersona();
            p.getJdp_principal().add(vispersona);
        }
        
        ctrlPersona controlador = new ctrlPersona(modper, vispersona);
        controlador.iniciarCtrlBtn();
        
    }
    public void menuUbicaciones(){

        M_ubicacion model = new M_ubicacion();
        try {
            p.getJdp_principal().add(visubicacion);
        } catch (Exception e) {
            visubicacion = new visUbicacion();
            p.getJdp_principal().add(visubicacion);
        }
        
//       CtrlUbicaciones controlador = new CtrlUbicaciones(model, visubicacion);
        
    }
     
   
    
}
