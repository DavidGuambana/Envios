package controlador;

import controlador.util.BotonTabla;
import java.awt.Color;
import javax.swing.JButton;
import modelo.mTransaccional;
import vista.vTransaccional;

public final class cTransaccional {

    vTransaccional vista;
    mTransaccional modelo;

    JButton btnAgregar = new JButton();

    public cTransaccional(vTransaccional vista, mTransaccional modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        control();
        btnAgregar.setBackground(Color.WHITE);
        InsertarIcono(btnAgregar, "/vista/iconos/agregar.png");
        vista.getJtRegistros().setDefaultRenderer(Object.class, new BotonTabla());
    }

    

    
    
    public void control(){
        vista.getJbSIGUIENTE().addActionListener(l-> siguiente());
        
        //Control de JDialog:
        vista.getJbElejirMatricula().addActionListener(l-> abrirJDialog(1));
        
        vista.getJbElejirRemitente().addActionListener(l-> abrirJDialog(4));
        vista.getJbElejirDestinatario().addActionListener(l-> abrirJDialog(5));
    }
    
    public void siguiente(){
        
    }

    public void abrirJDialog(int num) {
        switch (num) {
            case 1:
                modelo.list_cam(vista.getJtRegistros(), btnAgregar);
                break;
            case 4:
                modelo.list_per(vista.getJtRegistros(), btnAgregar);
                break;
            case 5:
                modelo.list_per(vista.getJtRegistros(), btnAgregar);
                break;
        }
        vista.getJdDialog().setSize(792, 510);
        vista.getJdDialog().setLocationRelativeTo(vista);
        vista.getJdDialog().setVisible(true);
    }

    public void InsertarIcono(JButton bot, String ruta) { //insertar icono en boton:
        bot.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
    }
    
}
