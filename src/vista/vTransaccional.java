package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class vTransaccional extends javax.swing.JInternalFrame {

    public vTransaccional() {
        initComponents();
    }
    
    

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JComboBox<String> getCbColumnas() {
        return cbColumnas;
    }

    public JProgressBar getjProgressBar() {
        return jProgressBar;
    }

    public JButton getJbElejirConductor() {
        return jbElejirConductor;
    }

    public JButton getJbElejirDestinatario() {
        return jbElejirDestinatario;
    }

    public JButton getJbElejirEnvio() {
        return jbElejirEnvio;
    }

    public JButton getJbElejirMatricula() {
        return jbElejirMatricula;
    }

    public JButton getJbElejirRemitente() {
        return jbElejirRemitente;
    }

    public JButton getJbElejirViaje() {
        return jbElejirViaje;
    }

    

    public JButton getJbSaltarEnvío() {
        return jbSaltarEnvío;
    }

    public JButton getJbSaltarViaje() {
        return jbSaltarViaje;
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }


    public JDialog getJdDialog() {
        return jdDialog;
    }

    public JPanel getJpEnvio() {
        return jpEnvio;
    }

    public JPanel getJpPaquete() {
        return jpPaquete;
    }

    public JPanel getJpViaje() {
        return jpViaje;
    }

    public JTable getJtRegistros() {
        return jtRegistros;
    }

    public JTabbedPane getTpEnvios() {
        return tpEnvios;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JComboBox<String> getXcanton() {
        return xcanton;
    }

    public JComboBox<String> getXcanton2() {
        return xcanton2;
    }

    public JTextField getXcedula_destinatario() {
        return xcedula_destinatario;
    }

    public JTextField getXcedula_remitente() {
        return xcedula_remitente;
    }

    public JTextField getXcodigo_envio() {
        return xcodigo_envio;
    }

    public JTextField getXcodigo_viaje() {
        return xcodigo_viaje;
    }

    public JTextArea getXdescripcion() {
        return xdescripcion;
    }

    public JTextField getXdireccion() {
        return xdireccion;
    }

    public JDateChooser getXfecha_envio() {
        return xfecha_envio;
    }

    public JDateChooser getXfecha_viaje() {
        return xfecha_viaje;
    }

    public JTextField getXid_conductor() {
        return xid_conductor;
    }

    public JTextField getXmatricula() {
        return xmatricula;
    }

    public JTextField getXpeso() {
        return xpeso;
    }

    public JTextField getXprecio() {
        return xprecio;
    }

    public JComboBox<String> getXprovincia() {
        return xprovincia;
    }

    public JComboBox<String> getXprovincia2() {
        return xprovincia2;
    }

    public JButton getJbRenvio() {
        return jbRenvio;
    }

    public JButton getJbRpaquete() {
        return jbRpaquete;
    }

    public JButton getJbRviaje() {
        return jbRviaje;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtRegistros = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cbColumnas = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        sep_pro = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        tpEnvios = new javax.swing.JTabbedPane();
        jpViaje = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        xid_conductor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xprovincia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        xcanton = new javax.swing.JComboBox<>();
        xfecha_viaje = new com.toedter.calendar.JDateChooser();
        xmatricula = new javax.swing.JTextField();
        jbElejirMatricula = new javax.swing.JButton();
        jbElejirConductor = new javax.swing.JButton();
        jbSaltarViaje = new javax.swing.JButton();
        jbRviaje = new javax.swing.JButton();
        jpEnvio = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        xcodigo_viaje = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        xfecha_envio = new com.toedter.calendar.JDateChooser();
        jbElejirViaje = new javax.swing.JButton();
        jbSaltarEnvío = new javax.swing.JButton();
        jbRenvio = new javax.swing.JButton();
        jpPaquete = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        xcedula_remitente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        xcedula_destinatario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        xdireccion = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        xpeso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        xprovincia2 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        xcanton2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        xdescripcion = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        JTextField1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        JTextField2 = new javax.swing.JTextField();
        xprecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        xcodigo_envio = new javax.swing.JTextField();
        jbElejirRemitente = new javax.swing.JButton();
        jbElejirDestinatario = new javax.swing.JButton();
        jbElejirEnvio = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        jbRpaquete = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jtRegistros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jtRegistros.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtRegistros.setOpaque(false);
        jtRegistros.setRowHeight(40);
        jtRegistros.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jtRegistros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtRegistros.getTableHeader().setResizingAllowed(false);
        jtRegistros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtRegistros);

        lbTitulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbTitulo.setText("Listado de ...");

        jPanel7.setBackground(new java.awt.Color(239, 239, 239));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cbColumnas.setBackground(new java.awt.Color(239, 239, 239));
        cbColumnas.setBorder(null);

        txtBuscar.setBackground(new java.awt.Color(239, 239, 239));
        txtBuscar.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(239, 239, 239));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar.setBorder(null);

        btnLimpiar.setBackground(new java.awt.Color(239, 239, 239));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/marca-x.png"))); // NOI18N
        btnLimpiar.setBorder(null);

        sep_pro.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sep_pro.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbColumnas, 0, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(sep_pro)
                    .addComponent(txtBuscar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbColumnas, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitulo)
                .addGap(17, 17, 17)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jdDialogLayout = new javax.swing.GroupLayout(jdDialog.getContentPane());
        jdDialog.getContentPane().setLayout(jdDialogLayout);
        jdDialogLayout.setHorizontalGroup(
            jdDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jdDialogLayout.setVerticalGroup(
            jdDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(840, 480));
        setMinimumSize(new java.awt.Dimension(840, 480));
        setPreferredSize(new java.awt.Dimension(840, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(805, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(805, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(805, 440));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡En esta sección puedes registrar paso a paso un envío!");

        jProgressBar.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tpEnvios.setBackground(new java.awt.Color(255, 255, 255));
        tpEnvios.setOpaque(true);

        jpViaje.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(350, 32767));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID de conductor:");

        xid_conductor.setEditable(false);
        xid_conductor.setBackground(new java.awt.Color(255, 255, 255));
        xid_conductor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xid_conductor.setForeground(new java.awt.Color(0, 153, 204));
        xid_conductor.setText("Autoasignado");
        xid_conductor.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Matrícula de camión:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de viaje:");

        xprovincia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Provincia:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Cantón:");

        xcanton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xcanton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        xfecha_viaje.setDateFormatString("yyyy-MM-dd");
        xfecha_viaje.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xfecha_viaje.setPreferredSize(new java.awt.Dimension(85, 27));

        xmatricula.setEditable(false);
        xmatricula.setBackground(new java.awt.Color(255, 255, 255));
        xmatricula.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xmatricula.setForeground(new java.awt.Color(0, 153, 204));
        xmatricula.setText("Autoasignado");
        xmatricula.setBorder(null);

        jbElejirMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirMatricula.setBorder(null);
        jbElejirMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbElejirConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirConductor.setBorder(null);
        jbElejirConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xprovincia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xcanton, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xid_conductor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(xfecha_viaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xmatricula))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbElejirMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jbElejirConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(xmatricula)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbElejirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(xfecha_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xcanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(xid_conductor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jbElejirConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jbSaltarViaje.setBackground(new java.awt.Color(0, 204, 0));
        jbSaltarViaje.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jbSaltarViaje.setForeground(new java.awt.Color(255, 255, 255));
        jbSaltarViaje.setText("¡Ya tengo un viaje resitrado! SALTAR...");
        jbSaltarViaje.setBorder(null);
        jbSaltarViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbRviaje.setBackground(new java.awt.Color(0, 102, 153));
        jbRviaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbRviaje.setForeground(new java.awt.Color(255, 255, 255));
        jbRviaje.setText("SIGUIENTE...");
        jbRviaje.setBorder(null);
        jbRviaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpViajeLayout = new javax.swing.GroupLayout(jpViaje);
        jpViaje.setLayout(jpViajeLayout);
        jpViajeLayout.setHorizontalGroup(
            jpViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpViajeLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jpViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpViajeLayout.createSequentialGroup()
                        .addComponent(jbRviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jbSaltarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jpViajeLayout.setVerticalGroup(
            jpViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpViajeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSaltarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpEnvios.addTab("Registrar viaje", jpViaje);

        jpEnvio.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(350, 32767));

        jSeparator11.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator11.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator11.setOpaque(true);
        jSeparator11.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Código de viaje");

        xcodigo_viaje.setEditable(false);
        xcodigo_viaje.setBackground(new java.awt.Color(255, 255, 255));
        xcodigo_viaje.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xcodigo_viaje.setForeground(new java.awt.Color(0, 153, 204));
        xcodigo_viaje.setText("Autoasignado");
        xcodigo_viaje.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Fecha de envío:");

        xfecha_envio.setDateFormatString("yyyy-MM-dd");
        xfecha_envio.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xfecha_envio.setPreferredSize(new java.awt.Dimension(85, 27));

        jbElejirViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirViaje.setBorder(null);
        jbElejirViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xcodigo_viaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(xfecha_envio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jbElejirViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(xfecha_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(xcodigo_viaje)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbElejirViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jbSaltarEnvío.setBackground(new java.awt.Color(0, 204, 0));
        jbSaltarEnvío.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jbSaltarEnvío.setForeground(new java.awt.Color(255, 255, 255));
        jbSaltarEnvío.setText("¡Ya tengo un envío resitrado! SALTAR...");
        jbSaltarEnvío.setBorder(null);
        jbSaltarEnvío.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbRenvio.setBackground(new java.awt.Color(0, 102, 153));
        jbRenvio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbRenvio.setForeground(new java.awt.Color(255, 255, 255));
        jbRenvio.setText("SIGUIENTE...");
        jbRenvio.setBorder(null);
        jbRenvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpEnvioLayout = new javax.swing.GroupLayout(jpEnvio);
        jpEnvio.setLayout(jpEnvioLayout);
        jpEnvioLayout.setHorizontalGroup(
            jpEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnvioLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnvioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnvioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSaltarEnvío, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEnvioLayout.setVerticalGroup(
            jpEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnvioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbRenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jbSaltarEnvío, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        tpEnvios.addTab("Registrar envío", jpEnvio);

        jpPaquete.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(350, 32767));

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 1));

        xcedula_remitente.setEditable(false);
        xcedula_remitente.setBackground(new java.awt.Color(255, 255, 255));
        xcedula_remitente.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xcedula_remitente.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cédula del remitente:");

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 1));

        xcedula_destinatario.setEditable(false);
        xcedula_destinatario.setBackground(new java.awt.Color(255, 255, 255));
        xcedula_destinatario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xcedula_destinatario.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Cédula del destinatario:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Dirección destinatario:");

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator12.setOpaque(true);
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 1));

        xdireccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xdireccion.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator13.setOpaque(true);
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 1));

        xpeso.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xpeso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xpeso.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Peso:");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Provincia:");

        xprovincia2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprovincia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Cantón:");

        xcanton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xcanton2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jScrollPane3.setBorder(null);

        xdescripcion.setColumns(20);
        xdescripcion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xdescripcion.setLineWrap(true);
        xdescripcion.setRows(5);
        xdescripcion.setWrapStyleWord(true);
        xdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane3.setViewportView(xdescripcion);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Descripción:");

        JTextField1.setEditable(false);
        JTextField1.setBackground(new java.awt.Color(255, 255, 255));
        JTextField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField1.setText("Kg.");
        JTextField1.setBorder(null);

        jSeparator14.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator14.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator14.setOpaque(true);
        jSeparator14.setPreferredSize(new java.awt.Dimension(50, 1));

        JTextField2.setEditable(false);
        JTextField2.setBackground(new java.awt.Color(255, 255, 255));
        JTextField2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JTextField2.setText("$.");
        JTextField2.setBorder(null);

        xprecio.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        xprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xprecio.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Precio:");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Código de envío:");

        xcodigo_envio.setEditable(false);
        xcodigo_envio.setBackground(new java.awt.Color(255, 255, 255));
        xcodigo_envio.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        xcodigo_envio.setForeground(new java.awt.Color(0, 153, 204));
        xcodigo_envio.setText("Autoasignado");
        xcodigo_envio.setBorder(null);

        jbElejirRemitente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirRemitente.setBorder(null);
        jbElejirRemitente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbElejirDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirDestinatario.setBorder(null);
        jbElejirDestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbElejirEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar.png"))); // NOI18N
        jbElejirEnvio.setBorder(null);
        jbElejirEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator15.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator15.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator15.setOpaque(true);
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 1));

        jbRpaquete.setBackground(new java.awt.Color(0, 102, 153));
        jbRpaquete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbRpaquete.setForeground(new java.awt.Color(255, 255, 255));
        jbRpaquete.setText("FINALIZAR");
        jbRpaquete.setBorder(null);
        jbRpaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(xpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xprovincia2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xcanton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xcodigo_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xdireccion))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(xprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(JTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbElejirEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(xcedula_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(xcedula_remitente, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbElejirDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbElejirRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addComponent(jbRpaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(xpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(xprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(xcedula_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbElejirRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(xcedula_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jbElejirDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbElejirEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(xdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(xprovincia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(xcanton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(xcodigo_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRpaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout jpPaqueteLayout = new javax.swing.GroupLayout(jpPaquete);
        jpPaquete.setLayout(jpPaqueteLayout);
        jpPaqueteLayout.setHorizontalGroup(
            jpPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPaqueteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPaqueteLayout.setVerticalGroup(
            jpPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaqueteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        tpEnvios.addTab("Registrar paquete", jpPaquete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162))
            .addComponent(tpEnvios, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tpEnvios))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextField1;
    private javax.swing.JTextField JTextField2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbColumnas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbElejirConductor;
    private javax.swing.JButton jbElejirDestinatario;
    private javax.swing.JButton jbElejirEnvio;
    private javax.swing.JButton jbElejirMatricula;
    private javax.swing.JButton jbElejirRemitente;
    private javax.swing.JButton jbElejirViaje;
    private javax.swing.JButton jbRenvio;
    private javax.swing.JButton jbRpaquete;
    private javax.swing.JButton jbRviaje;
    private javax.swing.JButton jbSaltarEnvío;
    private javax.swing.JButton jbSaltarViaje;
    private javax.swing.JDialog jdDialog;
    private javax.swing.JPanel jpEnvio;
    private javax.swing.JPanel jpPaquete;
    private javax.swing.JPanel jpViaje;
    private javax.swing.JTable jtRegistros;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator sep_pro;
    private javax.swing.JTabbedPane tpEnvios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JComboBox<String> xcanton;
    private javax.swing.JComboBox<String> xcanton2;
    private javax.swing.JTextField xcedula_destinatario;
    private javax.swing.JTextField xcedula_remitente;
    private javax.swing.JTextField xcodigo_envio;
    private javax.swing.JTextField xcodigo_viaje;
    private javax.swing.JTextArea xdescripcion;
    private javax.swing.JTextField xdireccion;
    private com.toedter.calendar.JDateChooser xfecha_envio;
    private com.toedter.calendar.JDateChooser xfecha_viaje;
    private javax.swing.JTextField xid_conductor;
    private javax.swing.JTextField xmatricula;
    private javax.swing.JTextField xpeso;
    private javax.swing.JTextField xprecio;
    private javax.swing.JComboBox<String> xprovincia;
    private javax.swing.JComboBox<String> xprovincia2;
    // End of variables declaration//GEN-END:variables
}
