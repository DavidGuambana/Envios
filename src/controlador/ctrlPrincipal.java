package controlador;

import modelo.M_persona;
import vista.visPersona;
import vista.visPrincipal;

public class ctrlPrincipal {

    visPrincipal p;
    visPersona vispersona;

    public ctrlPrincipal(visPrincipal p) {
        this.p = p;
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        control();
        
    }

    public void control() {
       p.getJb_nuevo_cliente().addActionListener(l-> menuPersona());
        
        
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
     
   
    
}
