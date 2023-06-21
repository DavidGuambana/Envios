package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class vConductor extends javax.swing.JInternalFrame {

    public vConductor() {
        initComponents();
        
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JComboBox<String> getCbColumnas() {
        return cbColumnas;
    }

    public JButton getJbOK() {
        return jbOK;
    }

    public JButton getJb_ModoEditar() {
        return jb_ModoEditar;
    }

    public JButton getJb_ModoNuevo() {
        return jb_ModoNuevo;
    }

    public JButton getJb_ModoVista() {
        return jb_ModoVista;
    }

    public JTable getJtConductores() {
        return jtConductores;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JComboBox<String> getCb_canton() {
        return cb_canton;
    }

    public JTextField getCb_id() {
        return cb_id;
    }

    public JComboBox<String> getCb_provincia() {
        return cb_provincia;
    }

    public JTextField getTxt_apellido1() {
        return txt_apellido1;
    }

    public JTextField getTxt_apellido2() {
        return txt_apellido2;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public JTextField getTxt_direccion() {
        return txt_direccion;
    }

    public JTextField getTxt_licencia() {
        return txt_licencia;
    }

    public JTextField getTxt_nombre1() {
        return txt_nombre1;
    }

    public JTextField getTxt_nombre2() {
        return txt_nombre2;
    }

    public JTextField getTxt_salario() {
        return txt_salario;
    }

    public JTextField getTxt_telefono() {
        return txt_telefono;
    }
    
    
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar = new javax.swing.JToolBar();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jb_ModoEditar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jb_ModoNuevo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jb_ModoVista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbOK = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txt_nombre2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txt_apellido1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txt_apellido2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txt_direccion = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txt_telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb_provincia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_canton = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        cb_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_licencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        txt_salario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConductores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cbColumnas = new javax.swing.JComboBox<>();
        jSeparator13 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(840, 480));
        setMinimumSize(new java.awt.Dimension(840, 480));
        setPreferredSize(new java.awt.Dimension(840, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jToolBar.setFloatable(false);
        jToolBar.setBackground(new java.awt.Color(0, 102, 153));
        jToolBar.setBorder(null);

        jSeparator5.setSeparatorSize(new java.awt.Dimension(25, 18));
        jToolBar.add(jSeparator5);

        jLabel1.setText("Cambiar de modo:");
        jToolBar.add(jLabel1);

        jSeparator2.setPreferredSize(new java.awt.Dimension(40, 18));
        jSeparator2.setSeparatorSize(new java.awt.Dimension(40, 18));
        jToolBar.add(jSeparator2);

        jb_ModoEditar.setText("Editar");
        jb_ModoEditar.setFocusable(false);
        jb_ModoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_ModoEditar);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 18));
        jToolBar.add(jSeparator3);

        jb_ModoNuevo.setText("Nuevo");
        jb_ModoNuevo.setFocusable(false);
        jb_ModoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_ModoNuevo);

        jSeparator4.setSeparatorSize(new java.awt.Dimension(30, 18));
        jToolBar.add(jSeparator4);

        jb_ModoVista.setText("Vista");
        jb_ModoVista.setFocusable(false);
        jb_ModoVista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ModoVista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jb_ModoVista);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("(Modo) conductor");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jbOK.setBackground(new java.awt.Color(0, 102, 153));
        jbOK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbOK.setForeground(new java.awt.Color(255, 255, 255));
        jbOK.setText("OK");
        jbOK.setBorder(null);
        jbOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(350, 32767));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cédula:");

        txt_cedula.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(0, 153, 204));
        txt_cedula.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator6.setOpaque(true);
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_nombre2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_nombre2.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Segundo nombre:");

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_apellido1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_apellido1.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Primer apellido:");

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_apellido2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_apellido2.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Segundo apellido:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Dirección:");

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_direccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_direccion.setBorder(null);

        jSeparator11.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator11.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator11.setOpaque(true);
        jSeparator11.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_telefono.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Teléfono:");

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator12.setOpaque(true);
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_nombre1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_nombre1.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Primer nombre:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Provincia:");

        cb_provincia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cb_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Rios", "Manabí ", "Morona Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora Chinchipe" }));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Cantón:");

        cb_canton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cb_canton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Alamor", "Alausí", "Alfredo Baquerizo Moreno", "Amaluza", "Ambato", "Arajuno", "Archidona", "Arenillas", "Atacames", "Atuntaqui", "Azogues", "Baba", "Babahoyo", "Baeza", "Bahía de Caráquez", "Balao", "Balsas", "Balzar", "Baños de Agua Santa", "Biblián", "Bolívar", "Buena Fe", "Calceta", "Caluma", "Camilo Ponce Enríquez", "Canton Guano", "Cañar", "Cariamanga", "Carlos Julio Arosemena Tola", "Catacocha", "Catamayo", "Catarama", "Cayambe", "Celica", "Cevallos", "Chaguarpamba", "Chambo", "Chilla", "Chillanes", "Chimbo", "Chone", "Chordeleg", "Chunchi", "Cnel. Marcelino Maridueña", "Colimes", "Cotacachi", "Cuenca", "Cumandá", "Daule", "Déleg", "Durán", "Echeandía", "El Ángel", "El Carmen", "El Chaco", "El Corazón", "El Dorado de Cascales", "El Guabo", "El Pan", "El Pangui", "El Tambo", "El Triunfo", "Esmeraldas", "Flavio Alfaro", "General Villamil", "Girón", "Gonzanamá", "Gral. Antonio Elizalde (Bucay)", "Gral. Leonidas Plaza Gutiérrez (Limón)", "Guachapala", "Gualaceo", "Gualaquiza", "Guamote", "Guaranda", "Guayaquil", "Guayzimi", "Huaca", "Huamboya", "Huaquillas", "Ibarra", "Isidro Ayora", "Jama", "Jaramijó", "Jipijapa", "Junín", "La Bonita", "La Concordia", "La Joya de los Sachas", "La Libertad", "La Maná", "La Troncal", "La Victoria", "Las Naves", "Latacunga", "Logroño", "Loja", "Lomas de Sargentillo", "Loreto", "Lumbaqui", "Macará", "Macas", "Machachi", "Machala", "Manta", "Marcabelí", "Mera", "Milagro", "Mira", "Mocache", "Mocha", "Montalvo", "Montecristi", "Muisne", "Nabón", "Naranjal", "Naranjito", "Nobol", "Nueva Loja", "Olmedo", "Olmedo", "Oña", "Otavalo", "Pablo Sexto", "Paccha", "Paján", "Palanda", "Palenque", "Palestina", "Pallatanga", "Palora", "Paquisha", "Pasaje", "Patate", "Paute", "Pedernales", "Pedro Carbo", "Pedro Vicente Maldonado", "Pelileo", "Penipe", "Pichincha", "Píllaro", "Pimampiro", "Pindal", "Piñas", "Portovelo", "Portoviejo", "Pucará", "Puebloviejo", "Puerto Ayora", "Puerto Baquerizo Moreno", "Puerto El Carmen de Putumayo", "Puerto Francisco de Orellana", "Puerto López", "Puerto Quito", "Puerto Villamil", "Pujilí", "Puyo", "Quero", "Quevedo", "Quilanga", "Quinsaloma", "Quito", "Riobamba", "Rioverde", "Rocafuerte", "Rosa Zárate", "Salinas", "Salitre", "Samborondón", "San Fernando", "San Gabriel", "San Juan Bosco", "San Lorenzo", "San Miguel", "San Miguel de Los Bancos", "San Miguel de Salcedo", "San Vicente", "Sangolquí", "Santa Ana", "Santa Clara", "Santa Elena", "Santa Isabel", "Santa Lucía", "Santa Rosa", "Santiago", "Santiago de Méndez", "Santo Domingo", "Saquisilí", "Saraguro", "Sevilla de Oro", "Shushufindi", "Sigchos", "Sígsig", "Simón Bolívar", "Sozoranga", "Sucre", "Sucúa", "Suscal", "Tabacundo", "Taisha", "Tarapoa", "Tena", "Tiputini", "Tisaleo", "Tosagua", "Tulcán", "Urcuquí", "Valdez (Limones)", "Valencia", "Velasco Ibarra", "Ventanas", "Villa La Unión (Cajabamba)", "Vinces", "Yacuambi", "Yaguachi", "Yantzaza", "Zamora", "Zapotillo", "Zaruma", "Zumba", "Zumbi" }));

        jSeparator14.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator14.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator14.setOpaque(true);
        jSeparator14.setPreferredSize(new java.awt.Dimension(50, 1));

        cb_id.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        cb_id.setForeground(new java.awt.Color(0, 153, 204));
        cb_id.setText("Autogenerado");
        cb_id.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("ID:");

        txt_licencia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_licencia.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Licencia:");

        jSeparator15.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator15.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator15.setOpaque(true);
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator16.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator16.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator16.setOpaque(true);
        jSeparator16.setPreferredSize(new java.awt.Dimension(50, 1));

        txt_salario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_salario.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Salario:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre1)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre2)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellido1)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellido2)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono)
                    .addComponent(txt_direccion)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_canton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_id)
                    .addComponent(txt_licencia)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_salario))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cedula))
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre1))
                .addGap(2, 2, 2)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre2))
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellido1))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellido2))
                .addGap(2, 2, 2)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_direccion))
                .addGap(2, 2, 2)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_telefono))
                .addGap(2, 2, 2)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cb_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cb_canton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_id))
                .addGap(2, 2, 2)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_licencia))
                .addGap(2, 2, 2)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_salario))
                .addGap(2, 2, 2)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPane.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        jtConductores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtConductores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtConductores);

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de conductores");
        jLabel2.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar...");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setOpaque(true);
        txtBuscar.setPreferredSize(new java.awt.Dimension(64, 17));
        txtBuscar.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.setSelectionColor(new java.awt.Color(204, 204, 204));

        cbColumnas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbColumnas.setForeground(new java.awt.Color(51, 51, 51));
        cbColumnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Conductor", "Licencia", "Salario", "Cedula" }));
        cbColumnas.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator13.setOpaque(true);
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbColumnas)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbColumnas;
    private javax.swing.JComboBox<String> cb_canton;
    private javax.swing.JTextField cb_id;
    private javax.swing.JComboBox<String> cb_provincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JButton jbOK;
    private javax.swing.JButton jb_ModoEditar;
    private javax.swing.JButton jb_ModoNuevo;
    private javax.swing.JButton jb_ModoVista;
    private javax.swing.JTable jtConductores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_licencia;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
