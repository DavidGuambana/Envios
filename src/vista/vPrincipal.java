package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class vPrincipal extends javax.swing.JFrame {

    public vPrincipal() {
        initComponents();
    }

    public JButton getJbDesconectar() {
        return jbDesconectar;
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

    public JButton getJb_marcas_modelos() {
        return jb_marcas_modelos;
    }

    public JButton getJbConectar() {
        return jbConectar;
    }

    public JComboBox<String> getJcTipo() {
        return jcTipo;
    }

    public JTextField getTxtIP() {
        return txtIP;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public JDialog getjDialog() {
        return jDialog;
    }

    public static JTextArea getOutput() {
        return Output;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public JButton getBtnEjecutar() {
        return btnEjecutar;
    }

    public static JTextArea getImput() {
        return imput;
    }

    public JComboBox<String> getJcCount() {
        return jcCount;
    }

    public JComboBox<String> getJcSQL() {
        return jcSQL;
    }

    public JComboBox<String> getJcTabla() {
        return jcTabla;
    }

    public JLabel getLbEstado() {
        return lbEstado;
    }

    public JLabel getLbRegistros() {
        return lbRegistros;
    }

    public JLabel getLbTipo() {
        return lbTipo;
    }
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtIP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbConectar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jdp_principal = new javax.swing.JDesktopPane();
        jToolBar = new javax.swing.JToolBar();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jb_nuevo_envio = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jb_nuevo_cliente = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jb_nuevo_chofer = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jb_nuevo_camion = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jb_ubicaciones = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jb_marcas_modelos = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jScrollPane3 = new javax.swing.JScrollPane();
        imput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcCount = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();
        lbRegistros = new javax.swing.JLabel();
        jcSQL = new javax.swing.JComboBox<>();
        jcTabla = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btnEjecutar = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        btnBorrar = new javax.swing.JButton();
        jbDesconectar = new javax.swing.JButton();
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

        jDialog.setBackground(new java.awt.Color(153, 204, 255));
        jDialog.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(318, 494));
        jPanel2.setMinimumSize(new java.awt.Dimension(318, 494));

        txtIP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIP.setText("127.0.0.1");
        txtIP.setToolTipText("Ingrese la dirección IP...");
        txtIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CONEXIÓN A ORACLE");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jLabel11.setOpaque(true);

        jcTipo.setBackground(new java.awt.Color(51, 204, 255));
        jcTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcTipo.setForeground(new java.awt.Color(255, 255, 255));
        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "localhost", "LAN" }));
        jcTipo.setToolTipText("Seleccione el tipo de conexión...");
        jcTipo.setBorder(null);
        jcTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcTipoItemStateChanged(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Dirección IP");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Tipo de conexión");

        jbConectar.setBackground(new java.awt.Color(227, 227, 227));
        jbConectar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbConectar.setText("CONECTAR");
        jbConectar.setBorder(null);
        jbConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Usuario");

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setText("system");
        txtUser.setToolTipText("Ingrese el usuario...");
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Contraseña");

        txtPassword.setText("1234");
        txtPassword.setToolTipText("Ingrese la contraseña...");
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcTipo, 0, 278, Short.MAX_VALUE)
                    .addComponent(txtIP)
                    .addComponent(txtUser)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(4, 4, 4)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jbConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        jb_nuevo_camion.setBackground(new java.awt.Color(0, 51, 153));
        jb_nuevo_camion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/camion-de-carga.png"))); // NOI18N
        jb_nuevo_camion.setToolTipText("Camiones...");
        jb_nuevo_camion.setBorder(null);
        jb_nuevo_camion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_nuevo_camion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_nuevo_camion);

        jSeparator15.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator15);

        jb_ubicaciones.setBackground(new java.awt.Color(0, 51, 153));
        jb_ubicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mapa.png"))); // NOI18N
        jb_ubicaciones.setToolTipText("Ubicaciones...");
        jb_ubicaciones.setBorder(null);
        jb_ubicaciones.setFocusable(false);
        jb_ubicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ubicaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_ubicaciones);

        jSeparator13.setSeparatorSize(new java.awt.Dimension(50, 30));
        jToolBar.add(jSeparator13);

        jb_marcas_modelos.setBackground(new java.awt.Color(0, 51, 153));
        jb_marcas_modelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/signo-de-interrogacion.png"))); // NOI18N
        jb_marcas_modelos.setToolTipText("Marcas y modelos...");
        jb_marcas_modelos.setBorder(null);
        jb_marcas_modelos.setFocusable(false);
        jb_marcas_modelos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_marcas_modelos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_marcas_modelos);

        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setSeparatorSize(new java.awt.Dimension(50, 30));

        jScrollPane3.setBorder(null);

        imput.setBackground(new java.awt.Color(0, 0, 0));
        imput.setColumns(20);
        imput.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        imput.setForeground(new java.awt.Color(255, 255, 255));
        imput.setLineWrap(true);
        imput.setRows(5);
        imput.setWrapStyleWord(true);
        imput.setBorder(null);
        jScrollPane3.setViewportView(imput);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oracle SQL:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registros:");

        jcCount.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jcCount.setForeground(new java.awt.Color(0, 204, 255));
        jcCount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        lbEstado.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(0, 204, 255));
        lbEstado.setText("Activo");

        lbRegistros.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        lbRegistros.setForeground(new java.awt.Color(0, 204, 255));
        lbRegistros.setText("0");

        jcSQL.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jcSQL.setForeground(new java.awt.Color(0, 204, 255));
        jcSQL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "SELECT", "INSERT", "UPDATE", "DELETE" }));

        jcTabla.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jcTabla.setForeground(new java.awt.Color(0, 204, 255));
        jcTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "PERSONA", "CONDUCTOR", "CAMION", "VIAJE", "ENVIO", "PAQUETE" }));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tabla:");

        lbTipo.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 204, 255));
        lbTipo.setText("LAN/localhost");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de conexión:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COUNT");

        jScrollPane4.setBorder(null);

        Output.setEditable(false);
        Output.setBackground(new java.awt.Color(51, 51, 51));
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        Output.setForeground(new java.awt.Color(0, 204, 51));
        Output.setLineWrap(true);
        Output.setRows(5);
        Output.setText("...");
        Output.setWrapStyleWord(true);
        Output.setBorder(null);
        jScrollPane4.setViewportView(Output);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Output:");

        btnEjecutar.setBackground(new java.awt.Color(204, 204, 204));
        btnEjecutar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/jugar2.png"))); // NOI18N
        btnEjecutar.setToolTipText("Ejecutar SQL...");
        btnEjecutar.setBorder(null);
        btnEjecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator17.setSeparatorSize(new java.awt.Dimension(50, 30));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/eliminar_24px.png"))); // NOI18N
        btnBorrar.setToolTipText("Limpiar...");
        btnBorrar.setBorder(null);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbDesconectar.setBackground(new java.awt.Color(255, 0, 0));
        jbDesconectar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        jbDesconectar.setText("Desconectar");
        jbDesconectar.setToolTipText("Descanectar (Salir...) ");
        jbDesconectar.setBorder(null);
        jbDesconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTipo))
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jcSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(jcSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jcCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(lbRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lbTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lbEstado)
                                    .addComponent(jbDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)))))
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

    private void jcTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcTipoItemStateChanged
        if (jcTipo.getSelectedIndex()==0) {
            txtIP.setText("127.0.0.1");
        } else{
            txtIP.setText("");
        }
    }//GEN-LAST:event_jcTipoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Output;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEjecutar;
    public static javax.swing.JTextArea imput;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JButton jbConectar;
    private javax.swing.JButton jbDesconectar;
    private javax.swing.JButton jb_marcas_modelos;
    private javax.swing.JButton jb_nuevo_camion;
    private javax.swing.JButton jb_nuevo_chofer;
    private javax.swing.JButton jb_nuevo_cliente;
    private javax.swing.JButton jb_nuevo_envio;
    private javax.swing.JButton jb_ubicaciones;
    private javax.swing.JComboBox<String> jcCount;
    private javax.swing.JComboBox<String> jcSQL;
    private javax.swing.JComboBox<String> jcTabla;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JDesktopPane jdp_principal;
    private javax.swing.JMenu jmCamiones;
    private javax.swing.JMenu jmUbicaciones;
    private javax.swing.JMenuItem jmb_clientes;
    private javax.swing.JMenuItem jmb_conductores;
    private javax.swing.JMenuItem jmb_envios;
    private javax.swing.JMenuItem jmb_nuevo_envio;
    private javax.swing.JMenuItem jmb_paquetes;
    private javax.swing.JMenuItem jmb_viajes;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbRegistros;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTextField txtIP;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
