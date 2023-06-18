package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.Principal;
import vista.visConductor;
import com.jtattoo.plaf.*;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

public class Main {
    public static void main(String [] args){
        //NimbusLookAndFeel
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Principal p = new Principal();
        
        
        
        
        ctrlPrincipal ctrl_prin = new ctrlPrincipal(p);
        ctrl_prin.control();
        visConductor visconductor = new visConductor();
        visconductor.setVisible(true);
        p.getJdp_principal().add(visconductor);
    }
}
