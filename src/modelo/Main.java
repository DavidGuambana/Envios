package modelo;

import controlador.ctrlPrincipal;
import vista.Principal;

public class Main {
    public static void main(String [] args){
        Principal p = new Principal();
        ctrlPrincipal ctrl_prin = new ctrlPrincipal(p);
        ctrl_prin.control();
    }
}
