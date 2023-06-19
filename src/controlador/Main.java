package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.visPrincipal;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {
    public static void main(String [] args){
        
         try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(visPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        visPrincipal vp =new visPrincipal();
        ctrlPrincipal ctrlprprincipal=new ctrlPrincipal( vp);
    }
}
