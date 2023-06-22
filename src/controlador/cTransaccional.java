package controlador;

import controlador.util.BotonTabla;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.mEnvio;
import modelo.mPaquete;
import modelo.mTransaccional;
import modelo.mViaje;
import vista.vTransaccional;

public final class cTransaccional {
    int num;
    vTransaccional vista;
    mTransaccional modelo;
    
    mViaje m_via = new mViaje();
    mEnvio m_env = new mEnvio();
    mPaquete m_paq = new mPaquete();
    
    
    JButton btnAgregar = new JButton();

    public cTransaccional(vTransaccional vista, mTransaccional modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        
        btnAgregar.setBackground(Color.WHITE);
        InsertarIcono(btnAgregar, "/vista/iconos/agregar.png");
        vista.getJtRegistros().setDefaultRenderer(Object.class, new BotonTabla());
         modelo.list_provincia(vista.getXprovincia());
         modelo.list_provincia(vista.getXprovincia2());
         modelo.list_canton(vista.getXcanton(), vista.getXprovincia());
         modelo.list_canton(vista.getXcanton2(), vista.getXprovincia2());
         control();
    }

    public void control() {
        vista.getJbSIGUIENTE().addActionListener(l -> siguiente());
        
        //combobox
        vista.getXprovincia().addActionListener(l-> modelo.list_canton(vista.getXcanton(), vista.getXprovincia()));
        vista.getXprovincia2().addActionListener(l-> modelo.list_canton(vista.getXcanton2(), vista.getXprovincia2()));

        //Control de JDialog y click tabla:
        vista.getJbElejirMatricula().addActionListener(l -> {
            abrirJDialog(1);
            num = 1;
            vista.getJtRegistros().addMouseListener(ml);
        });
        vista.getJbElejirConductor().addActionListener(l -> {
            abrirJDialog(2);
            num = 2;
            vista.getJtRegistros().addMouseListener(ml);
        });
        vista.getJbElejirViaje().addActionListener(l -> {
            abrirJDialog(3);
            num = 3;
            vista.getJtRegistros().addMouseListener(ml);
        });
        vista.getJbElejirRemitente().addActionListener(l -> {
            abrirJDialog(4);
            num = 4;
        vista.getJtRegistros().addMouseListener(ml);
        });
        vista.getJbElejirDestinatario().addActionListener(l -> {
            abrirJDialog(5);
            num = 5;
        vista.getJtRegistros().addMouseListener(ml);
        });
        vista.getJbElejirEnvio().addActionListener(l -> {
            abrirJDialog(6);
            num = 6;
        vista.getJtRegistros().addMouseListener(ml);
        });
    }

    public void siguiente() {
        if (vista.getTpEnvios().getSelectedIndex() == 0) {
            crear_viaje();
        }
        if (vista.getTpEnvios().getSelectedIndex() == 1) {
            crear_envio();
        }
        if (vista.getTpEnvios().getSelectedIndex() == 2) {
            crear_paquete();
        }
    }
    
    public void crear_viaje(){
        Date fecha;
        try {
            fecha = vista.getXfecha_viaje().getDate();
        } catch (Exception e) {
            fecha = null;
        }
        if (vista.getXmatricula().getText().equals("Autoasignado") ||fecha==null|| vista.getXcanton().getSelectedIndex() == 0||
                vista.getXid_conductor().getText().equals("Autoasignado")) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
        } else{
            m_via.setMatricula(vista.getXmatricula().getText());
            Long d = fecha.getTime();
            java.sql.Date fecha_env = new java.sql.Date(d);
            m_via.setFecha(fecha_env);
            m_via.setCodigo_can(modelo.getCodigoCan(vista.getXcanton().getSelectedItem().toString()));
            m_via.setId_con(Integer.parseInt(vista.getXid_conductor().getText()));
            m_via.crear();
            vista.getXcodigo_viaje().setText(""+m_via.ultimoCodigo());
            JOptionPane.showMessageDialog(null, "¡Viaje registrado correctamente!");
            vista.getTpEnvios().setSelectedIndex(1);
        }
    }
    
    public void crear_envio(){
        Date fecha;
        try {
            fecha = vista.getXfecha_envio().getDate();
        } catch (Exception e) {
            fecha = null;
        }
        if (vista.getXcodigo_viaje().getText().equals("Autoasignado") || fecha == null) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
        } else {
            m_env.setCodigo_via(Integer.parseInt(vista.getXcodigo_viaje().getText()));
            Long d = fecha.getTime();
            java.sql.Date fecha_via = new java.sql.Date(d);
            m_env.setFecha(fecha_via);
            m_env.crear();
            vista.getXcodigo_envio().setText("" + m_env.ultimoCodigo());
            JOptionPane.showMessageDialog(null, "¡Envío registrado correctamente!");
            vista.getTpEnvios().setSelectedIndex(2);
        }
    }
    
    public void crear_paquete(){
        Double peso;
        try {
            peso = Double.valueOf(vista.getXpeso().getText());
        } catch (Exception e) {
            peso = 0.0;
        }
        Double precio;
        try {
            precio = Double.valueOf(vista.getXprecio().getText());
        } catch (Exception e) {
            precio = 0.0;
        }
        
        if (vista.getXdescripcion().getText().isEmpty()|| peso<=0||precio<=0||
                vista.getXcanton().getSelectedIndex() == 0|| vista.getXcedula_remitente().getText().isEmpty()||
                vista.getXcedula_destinatario().getText().isEmpty()|| vista.getXdireccion().getText().isEmpty()||
                vista.getXcanton2().getSelectedIndex()==0 || vista.getXcodigo_envio().getText().equals("Autoasignado")) {
            JOptionPane.showMessageDialog(null, "¡Aún tienes campos por completar!");
        } else {
            m_paq.setDescripcion(vista.getXdescripcion().getText());
            m_paq.setPeso(peso);
            m_paq.setPrecio(precio);
            m_paq.setCedula_rem(vista.getXcedula_remitente().getText());
            m_paq.setCedula_dest(vista.getXcedula_destinatario().getText());
            m_paq.setCodigo_can(modelo.getCodigoCan(vista.getXcanton().getSelectedItem().toString()));
            m_paq.setDireccion(vista.getXdireccion().getText());
            m_via.crear();
            JOptionPane.showMessageDialog(null, "¡Paquete registrado correctamente!");
        }
    }

    public void abrirJDialog(int num) {
        vista.getCbColumnas().removeAllItems();
        String titulo = "";
        switch (num) {
            case 1:
                modelo.list_cam(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas() ); titulo = "Listado de camiones";
                break;
            case 2:
                modelo.list_con(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas()); titulo = "Listado de conductores";
                break;
            case 3:
                modelo.list_via(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas()); titulo = "Listado de viajes";
                break;
            case 4:
                modelo.list_per(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas()); titulo = "Listado de remitentes(personas)";
                break;
            case 5:
                modelo.list_per(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas()); titulo = "Listado de destinatarios(personas)";
                break;
            case 6:
                modelo.list_env(vista.getJtRegistros(), btnAgregar,vista.getCbColumnas()); titulo = "Listado de envios";
                break;
        }
        vista.getLbTitulo().setText(titulo);
        vista.getJdDialog().setSize(792, 510);
        vista.getJdDialog().setLocationRelativeTo(vista);
        vista.getJdDialog().setVisible(true);
    }

    public void InsertarIcono(JButton bot, String ruta) { //insertar icono en boton:
        bot.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
    }
    
    MouseListener ml = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent me) {
            if (me.getClickCount() == 1) {
                String id = vista.getJtRegistros().getValueAt(vista.getJtRegistros().getSelectedRow(), 0).toString();
                int xcolum = vista.getJtRegistros().getColumnModel().getColumnIndexAtX(me.getX());
                int xrow = me.getY() / vista.getJtRegistros().getRowHeight();
                if (xcolum <= vista.getJtRegistros().getColumnCount() && xcolum >= 0 && xrow <= vista.getJtRegistros().getRowCount() && xrow >= 0) {
                    Object obj = vista.getJtRegistros().getValueAt(xrow, xcolum);
                    if (obj instanceof JButton) {
                        setear_id(num, id);
                        vista.getJdDialog().setVisible(false);
                        vista.getJtRegistros().removeMouseListener(ml);
                    }
                }
            }
        }
    };
    
    public void setear_id(int num, String id){
        switch (num) {
            case 1: vista.getXmatricula().setText(id);break;
            case 2: vista.getXid_conductor().setText(id);break;
            case 3: vista.getXcodigo_viaje().setText(id);break;
            case 4: vista.getXcedula_remitente().setText(id);break;
            case 5: vista.getXcedula_destinatario().setText(id);break;
            case 6: vista.getXcodigo_envio().setText(id);break;
        }
    }

}
