package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    public JButton getJb_nuevo_camion() {
        return jb_nuevo_camion;
    }

    public void setJb_nuevo_camion(JButton jb_nuevo_camion) {
        this.jb_nuevo_camion = jb_nuevo_camion;
    }

    public JButton getJb_nuevo_chofer() {
        return jb_nuevo_chofer;
    }

    public void setJb_nuevo_chofer(JButton jb_nuevo_chofer) {
        this.jb_nuevo_chofer = jb_nuevo_chofer;
    }

    public JButton getJb_nuevo_cliente() {
        return jb_nuevo_cliente;
    }

    public void setJb_nuevo_cliente(JButton jb_nuevo_cliente) {
        this.jb_nuevo_cliente = jb_nuevo_cliente;
    }

    public JButton getJb_nuevo_envio() {
        return jb_nuevo_envio;
    }

    public void setJb_nuevo_envio(JButton jb_nuevo_envio) {
        this.jb_nuevo_envio = jb_nuevo_envio;
    }

    public JButton getJb_ubicaciones() {
        return jb_ubicaciones;
    }

    public void setJb_ubicaciones(JButton jb_ubicaciones) {
        this.jb_ubicaciones = jb_ubicaciones;
    }

    public JDesktopPane getJdp_principal() {
        return jdp_principal;
    }

    public void setJdp_principal(JDesktopPane jdp_principal) {
        this.jdp_principal = jdp_principal;
    }

    public JMenuItem getJmb_camiones() {
        return jmb_camiones;
    }

    public void setJmb_camiones(JMenuItem jmb_camiones) {
        this.jmb_camiones = jmb_camiones;
    }

    public JMenuItem getJmb_ciudades() {
        return jmb_ciudades;
    }

    public void setJmb_ciudades(JMenuItem jmb_ciudades) {
        this.jmb_ciudades = jmb_ciudades;
    }

    public JMenuItem getJmb_clientes() {
        return jmb_clientes;
    }

    public void setJmb_clientes(JMenuItem jmb_clientes) {
        this.jmb_clientes = jmb_clientes;
    }

    public JMenuItem getJmb_conductores() {
        return jmb_conductores;
    }

    public void setJmb_conductores(JMenuItem jmb_conductores) {
        this.jmb_conductores = jmb_conductores;
    }

    public JMenuItem getJmb_envios() {
        return jmb_envios;
    }

    public void setJmb_envios(JMenuItem jmb_envios) {
        this.jmb_envios = jmb_envios;
    }

    public JMenuItem getJmb_nuevo_envio() {
        return jmb_nuevo_envio;
    }

    public void setJmb_nuevo_envio(JMenuItem jmb_nuevo_envio) {
        this.jmb_nuevo_envio = jmb_nuevo_envio;
    }

    public JMenuItem getJmb_paquetes() {
        return jmb_paquetes;
    }

    public void setJmb_paquetes(JMenuItem jmb_paquetes) {
        this.jmb_paquetes = jmb_paquetes;
    }

    public JMenuItem getJmb_provincias() {
        return jmb_provincias;
    }

    public void setJmb_provincias(JMenuItem jmb_provincias) {
        this.jmb_provincias = jmb_provincias;
    }

    public JMenuItem getJmb_viajes() {
        return jmb_viajes;
    }

    public void setJmb_viajes(JMenuItem jmb_viajes) {
        this.jmb_viajes = jmb_viajes;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jdp_principal = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jb_nuevo_envio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jb_nuevo_cliente = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jb_nuevo_chofer = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jb_ubicaciones = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jb_nuevo_camion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jmb_nuevo_envio = new javax.swing.JMenuItem();
        jmb_envios = new javax.swing.JMenuItem();
        jmb_paquetes = new javax.swing.JMenuItem();
        jmb_viajes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmb_clientes = new javax.swing.JMenuItem();
        jmb_conductores = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmb_provincias = new javax.swing.JMenuItem();
        jmb_ciudades = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmb_camiones = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jdp_principal.setBackground(new java.awt.Color(51, 51, 51));
        jdp_principal.setMaximumSize(new java.awt.Dimension(805, 440));
        jdp_principal.setMinimumSize(new java.awt.Dimension(805, 440));

        javax.swing.GroupLayout jdp_principalLayout = new javax.swing.GroupLayout(jdp_principal);
        jdp_principal.setLayout(jdp_principalLayout);
        jdp_principalLayout.setHorizontalGroup(
            jdp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );
        jdp_principalLayout.setVerticalGroup(
            jdp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(0, 51, 153));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.add(jSeparator10);
        jToolBar1.add(jSeparator4);

        jb_nuevo_envio.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_envio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/recibido.png"))); // NOI18N
        jb_nuevo_envio.setBorder(null);
        jb_nuevo_envio.setFocusable(false);
        jb_nuevo_envio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_envio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_nuevo_envio);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator3);

        jb_nuevo_cliente.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/cliente.png"))); // NOI18N
        jb_nuevo_cliente.setBorder(null);
        jb_nuevo_cliente.setFocusable(false);
        jb_nuevo_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_nuevo_cliente);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator8);

        jb_nuevo_chofer.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_chofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/conductor.png"))); // NOI18N
        jb_nuevo_chofer.setBorder(null);
        jb_nuevo_chofer.setFocusable(false);
        jb_nuevo_chofer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_chofer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_nuevo_chofer);
        jToolBar1.add(jSeparator9);
        jToolBar1.add(jSeparator11);
        jToolBar1.add(jSeparator12);

        jb_ubicaciones.setBackground(new java.awt.Color(0, 51, 153));
        jb_ubicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mapa.png"))); // NOI18N
        jb_ubicaciones.setBorder(null);
        jb_ubicaciones.setFocusable(false);
        jb_ubicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ubicaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_ubicaciones);
        jToolBar1.add(jSeparator15);
        jToolBar1.add(jSeparator16);
        jToolBar1.add(jSeparator14);

        jb_nuevo_camion.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_camion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/camion-de-carga.png"))); // NOI18N
        jb_nuevo_camion.setBorder(null);
        jb_nuevo_camion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_camion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_nuevo_camion);

        jMenu10.setText("Paquetería");

        jmb_nuevo_envio.setText("Nuevo envio...");
        jMenu10.add(jmb_nuevo_envio);

        jmb_envios.setText("Envios");
        jMenu10.add(jmb_envios);

        jmb_paquetes.setText("Paquetes");
        jMenu10.add(jmb_paquetes);

        jmb_viajes.setText("Viajes");
        jMenu10.add(jmb_viajes);

        jMenuBar1.add(jMenu10);

        jMenu1.setText("Contactos");

        jmb_clientes.setText("Clientes");
        jMenu1.add(jmb_clientes);

        jmb_conductores.setText("Conductores");
        jMenu1.add(jmb_conductores);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Ubicaciones");

        jmb_provincias.setText("Provincias");
        jMenu7.add(jmb_provincias);

        jmb_ciudades.setText("Ciudades");
        jMenu7.add(jmb_ciudades);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Transportes");

        jmb_camiones.setText("Camiones...");
        jMenu4.add(jmb_camiones);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jdp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_nuevo_camion;
    private javax.swing.JButton jb_nuevo_chofer;
    private javax.swing.JButton jb_nuevo_cliente;
    private javax.swing.JButton jb_nuevo_envio;
    private javax.swing.JButton jb_ubicaciones;
    private javax.swing.JDesktopPane jdp_principal;
    private javax.swing.JMenuItem jmb_camiones;
    private javax.swing.JMenuItem jmb_ciudades;
    private javax.swing.JMenuItem jmb_clientes;
    private javax.swing.JMenuItem jmb_conductores;
    private javax.swing.JMenuItem jmb_envios;
    private javax.swing.JMenuItem jmb_nuevo_envio;
    private javax.swing.JMenuItem jmb_paquetes;
    private javax.swing.JMenuItem jmb_provincias;
    private javax.swing.JMenuItem jmb_viajes;
    // End of variables declaration//GEN-END:variables
}
