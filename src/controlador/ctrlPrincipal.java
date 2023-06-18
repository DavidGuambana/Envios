package controlador;

import vista.visPrincipal;

public class ctrlPrincipal {

    visPrincipal p;

    public ctrlPrincipal(visPrincipal p) {
        this.p = p;

    }

    public void control() {
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
