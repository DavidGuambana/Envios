package controlador;
import vista.Principal;
import vista.visConductor;

public class Main {
    public static void main(String [] args){
        Principal p = new Principal();
        ctrlPrincipal ctrl_prin = new ctrlPrincipal(p);
        ctrl_prin.control();
        visConductor visconductor = new visConductor();
        visconductor.setVisible(true);
        p.getJdp_principal().add(visconductor);
    }
}
