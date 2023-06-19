package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.visPrincipal;
import vista.visConductor;
//import com.jtattoo.plaf.*;AeroLookAndFeel
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import vista.visPersona;
import vista.visUbicacion;

public class Main {
    public static void main(String [] args){
        
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(visPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        visPrincipal p = new visPrincipal();
        
        ctrlPrincipal ctrl_prin = new ctrlPrincipal(p);
        ctrl_prin.control();
        visConductor visconductor = new visConductor();
        visconductor.setVisible(true);
        
        visPersona vispersona = new visPersona();
        vispersona.setVisible(true);
        
        visUbicacion visubicacion = new visUbicacion();
        visubicacion.setVisible(true);
        p.getJdp_principal().add(vispersona);
    }
}
