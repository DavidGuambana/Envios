package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.vPrincipal;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import modelo.mPrincipal;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(vPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        vPrincipal vp = new vPrincipal();
        mPrincipal mp = new  mPrincipal();
        cPrincipal ctrlprprincipal = new cPrincipal(vp,mp);
    }
}
