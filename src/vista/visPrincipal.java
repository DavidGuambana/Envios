package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class visPrincipal extends javax.swing.JFrame {

    public visPrincipal() {
        initComponents();
    }

    public JButton getJb_nuevo_camion() {
        return jb_nuevo_camion;
    }

    public JButton getJb_nuevo_chofer() {
        return jb_nuevo_chofer;
    }

    public JButton getJb_nuevo_cliente() {
        return jb_nuevo_cliente;
    }

    public JButton getJb_nuevo_envio() {
        return jb_nuevo_envio;
    }

    public JButton getJb_ubicaciones() {
        return jb_ubicaciones;
    }

    public JDesktopPane getJdp_principal() {
        return jdp_principal;
    }

    public JMenuItem getJmb_clientes() {
        return jmb_clientes;
    }

    public JMenuItem getJmb_conductores() {
        return jmb_conductores;
    }

    public JMenuItem getJmb_envios() {
        return jmb_envios;
    }

    public JMenuItem getJmb_nuevo_envio() {
        return jmb_nuevo_envio;
    }

    public JMenuItem getJmb_paquetes() {
        return jmb_paquetes;
    }

    public JMenuItem getJmb_viajes() {
        return jmb_viajes;
    }

    public JMenu getJmCamiones() {
        return jmCamiones;
    }

    public JMenu getJmUbicaciones() {
        return jmUbicaciones;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jdp_principal = new javax.swing.JDesktopPane();
        jToolBar = new javax.swing.JToolBar();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jb_nuevo_envio = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jb_nuevo_cliente = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jb_nuevo_chofer = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jb_ubicaciones = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jb_nuevo_camion = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jScrollPane3 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Output1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        btnBuscar1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jmb_nuevo_envio = new javax.swing.JMenuItem();
        jmb_envios = new javax.swing.JMenuItem();
        jmb_paquetes = new javax.swing.JMenuItem();
        jmb_viajes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmb_clientes = new javax.swing.JMenuItem();
        jmb_conductores = new javax.swing.JMenuItem();
        jmUbicaciones = new javax.swing.JMenu();
        jmCamiones = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jdp_principal.setBackground(new java.awt.Color(51, 51, 51));
        jdp_principal.setMaximumSize(new java.awt.Dimension(805, 440));
        jdp_principal.setMinimumSize(new java.awt.Dimension(805, 440));

        javax.swing.GroupLayout jdp_principalLayout = new javax.swing.GroupLayout(jdp_principal);
        jdp_principal.setLayout(jdp_principalLayout);
        jdp_principalLayout.setHorizontalGroup(
            jdp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jdp_principalLayout.setVerticalGroup(
            jdp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar.setFloatable(false);
        jToolBar.setBackground(new java.awt.Color(0, 51, 153));
        jToolBar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar.setRollover(true);
        jToolBar.setBorderPainted(false);

        jSeparator10.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator10);

        jb_nuevo_envio.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_envio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/recibido.png"))); // NOI18N
        jb_nuevo_envio.setToolTipText("Nuevo envio...");
        jb_nuevo_envio.setBorder(null);
        jb_nuevo_envio.setFocusable(false);
        jb_nuevo_envio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_envio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_nuevo_envio);

        jSeparator11.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator11);

        jb_nuevo_cliente.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/cliente.png"))); // NOI18N
        jb_nuevo_cliente.setToolTipText("Clientes...");
        jb_nuevo_cliente.setBorder(null);
        jb_nuevo_cliente.setFocusable(false);
        jb_nuevo_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_nuevo_cliente);

        jSeparator12.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator12);

        jb_nuevo_chofer.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_chofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/conductor.png"))); // NOI18N
        jb_nuevo_chofer.setToolTipText("Conductores...");
        jb_nuevo_chofer.setBorder(null);
        jb_nuevo_chofer.setFocusable(false);
        jb_nuevo_chofer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_chofer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_nuevo_chofer);

        jSeparator14.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator14);

        jb_ubicaciones.setBackground(new java.awt.Color(0, 51, 153));
        jb_ubicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mapa.png"))); // NOI18N
        jb_ubicaciones.setToolTipText("Ubicaciones...");
        jb_ubicaciones.setBorder(null);
        jb_ubicaciones.setFocusable(false);
        jb_ubicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ubicaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_ubicaciones);

        jSeparator15.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator15);

        jb_nuevo_camion.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_camion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/camion-de-carga.png"))); // NOI18N
        jb_nuevo_camion.setToolTipText("Camiones...");
        jb_nuevo_camion.setBorder(null);
        jb_nuevo_camion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_camion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_nuevo_camion);

        jSeparator13.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator13);

        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setSeparatorSize(new java.awt.Dimension(50, 30));

        jScrollPane3.setBorder(null);

        Output.setBackground(new java.awt.Color(0, 0, 0));
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        Output.setForeground(new java.awt.Color(255, 255, 255));
        Output.setLineWrap(true);
        Output.setRows(5);
        Output.setWrapStyleWord(true);
        Output.setBorder(null);
        jScrollPane3.setViewportView(Output);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oracle SQL:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registros:");

        jComboBox1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Activo");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("0");

        jComboBox2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 204, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "INSERT", "UPDATE", "DELETE" }));

        jComboBox3.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 204, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "PERSONA", "CONDUCTOR", "CAMION", "VIAJE", "ENVIO", "PAQUETE" }));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tabla:");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("LAN/localhost");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de conexión:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COUNT");

        jScrollPane4.setBorder(null);

        Output1.setEditable(false);
        Output1.setBackground(new java.awt.Color(51, 51, 51));
        Output1.setColumns(20);
        Output1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        Output1.setForeground(new java.awt.Color(0, 204, 51));
        Output1.setLineWrap(true);
        Output1.setRows(5);
        Output1.setText("...");
        Output1.setWrapStyleWord(true);
        Output1.setBorder(null);
        jScrollPane4.setViewportView(Output1);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Output:");

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/jugar2.png"))); // NOI18N
        btnBuscar.setToolTipText("Ejecutar SQL...");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator17.setSeparatorSize(new java.awt.Dimension(50, 30));

        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/eliminar_24px.png"))); // NOI18N
        btnBuscar1.setToolTipText("Limpiar...");
        btnBuscar1.setBorder(null);
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(59, 59, 59)))))
                .addContainerGap())
        );

        jScrollPane.setViewportView(jPanel1);

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

        jmUbicaciones.setText("Ubicaciones");
        jMenuBar1.add(jmUbicaciones);

        jmCamiones.setText("Camiones");
        jMenuBar1.add(jmCamiones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jdp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Output;
    public static javax.swing.JTextArea Output1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JButton jb_nuevo_camion;
    private javax.swing.JButton jb_nuevo_chofer;
    private javax.swing.JButton jb_nuevo_cliente;
    private javax.swing.JButton jb_nuevo_envio;
    private javax.swing.JButton jb_ubicaciones;
    private javax.swing.JDesktopPane jdp_principal;
    private javax.swing.JMenu jmCamiones;
    private javax.swing.JMenu jmUbicaciones;
    private javax.swing.JMenuItem jmb_clientes;
    private javax.swing.JMenuItem jmb_conductores;
    private javax.swing.JMenuItem jmb_envios;
    private javax.swing.JMenuItem jmb_nuevo_envio;
    private javax.swing.JMenuItem jmb_paquetes;
    private javax.swing.JMenuItem jmb_viajes;
    // End of variables declaration//GEN-END:variables
}
