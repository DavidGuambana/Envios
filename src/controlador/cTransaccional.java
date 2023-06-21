package controlador;

import vista.vTransaccional;

public class cTransaccional {
    vTransaccional vista;

    public cTransaccional(vTransaccional vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        control();
    }
    
    public void control(){
        vista.getJbSIGUIENTE().addActionListener(l-> siguiente());
    }
    
    public void siguiente(){
        
    }
}
