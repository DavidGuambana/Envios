package controlador;

import vista.Principal;

public class ctrlPrincipal {

    Principal p;

    public ctrlPrincipal(Principal p) {
        this.p = p;

    }

    public void control() {
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
