package vista;

public class vT1 extends javax.swing.JInternalFrame {

    public vT1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_id_conductor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txt_matricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txt_fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre_conductor = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        cb_provincia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_canton = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(350, 32767));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Código:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 125, -1));

        txt_codigo.setEditable(false);
        txt_codigo.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(0, 153, 204));
        txt_codigo.setText("Autogenerado");
        txt_codigo.setBorder(null);
        jPanel3.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 30, 190, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator6.setOpaque(true);
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 52, 190, -1));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 413, 190, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID de conductor:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 391, 125, -1));

        txt_id_conductor.setEditable(false);
        txt_id_conductor.setBackground(new java.awt.Color(255, 255, 255));
        txt_id_conductor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txt_id_conductor.setForeground(new java.awt.Color(0, 153, 204));
        txt_id_conductor.setBorder(null);
        jPanel3.add(txt_id_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 391, 190, -1));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 105, 190, -1));

        txt_matricula.setEditable(false);
        txt_matricula.setBackground(new java.awt.Color(255, 255, 255));
        txt_matricula.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_matricula.setBorder(null);
        jPanel3.add(txt_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 83, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Matrícula:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 125, -1));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 1));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 158, 190, -1));

        txt_fecha.setEditable(false);
        txt_fecha.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_fecha.setText("Autogenerado");
        txt_fecha.setBorder(null);
        jPanel3.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 136, 190, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 136, 125, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombre conductor:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 444, 125, -1));

        txt_nombre_conductor.setEditable(false);
        txt_nombre_conductor.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_conductor.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_nombre_conductor.setBorder(null);
        jPanel3.add(txt_nombre_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 444, 190, -1));

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 1));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 466, 190, -1));

        cb_provincia.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cb_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Rios", "Manabí ", "Morona Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora Chinchipe" }));
        jPanel3.add(cb_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 189, 190, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Provincia:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 191, 125, 23));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Cantón:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, 125, 26));

        cb_canton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cb_canton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Alamor", "Alausí", "Alfredo Baquerizo Moreno", "Amaluza", "Ambato", "Arajuno", "Archidona", "Arenillas", "Atacames", "Atuntaqui", "Azogues", "Baba", "Babahoyo", "Baeza", "Bahía de Caráquez", "Balao", "Balsas", "Balzar", "Baños de Agua Santa", "Biblián", "Bolívar", "Buena Fe", "Calceta", "Caluma", "Camilo Ponce Enríquez", "Canton Guano", "Cañar", "Cariamanga", "Carlos Julio Arosemena Tola", "Catacocha", "Catamayo", "Catarama", "Cayambe", "Celica", "Cevallos", "Chaguarpamba", "Chambo", "Chilla", "Chillanes", "Chimbo", "Chone", "Chordeleg", "Chunchi", "Cnel. Marcelino Maridueña", "Colimes", "Cotacachi", "Cuenca", "Cumandá", "Daule", "Déleg", "Durán", "Echeandía", "El Ángel", "El Carmen", "El Chaco", "El Corazón", "El Dorado de Cascales", "El Guabo", "El Pan", "El Pangui", "El Tambo", "El Triunfo", "Esmeraldas", "Flavio Alfaro", "General Villamil", "Girón", "Gonzanamá", "Gral. Antonio Elizalde (Bucay)", "Gral. Leonidas Plaza Gutiérrez (Limón)", "Guachapala", "Gualaceo", "Gualaquiza", "Guamote", "Guaranda", "Guayaquil", "Guayzimi", "Huaca", "Huamboya", "Huaquillas", "Ibarra", "Isidro Ayora", "Jama", "Jaramijó", "Jipijapa", "Junín", "La Bonita", "La Concordia", "La Joya de los Sachas", "La Libertad", "La Maná", "La Troncal", "La Victoria", "Las Naves", "Latacunga", "Logroño", "Loja", "Lomas de Sargentillo", "Loreto", "Lumbaqui", "Macará", "Macas", "Machachi", "Machala", "Manta", "Marcabelí", "Mera", "Milagro", "Mira", "Mocache", "Mocha", "Montalvo", "Montecristi", "Muisne", "Nabón", "Naranjal", "Naranjito", "Nobol", "Nueva Loja", "Olmedo", "Olmedo", "Oña", "Otavalo", "Pablo Sexto", "Paccha", "Paján", "Palanda", "Palenque", "Palestina", "Pallatanga", "Palora", "Paquisha", "Pasaje", "Patate", "Paute", "Pedernales", "Pedro Carbo", "Pedro Vicente Maldonado", "Pelileo", "Penipe", "Pichincha", "Píllaro", "Pimampiro", "Pindal", "Piñas", "Portovelo", "Portoviejo", "Pucará", "Puebloviejo", "Puerto Ayora", "Puerto Baquerizo Moreno", "Puerto El Carmen de Putumayo", "Puerto Francisco de Orellana", "Puerto López", "Puerto Quito", "Puerto Villamil", "Pujilí", "Puyo", "Quero", "Quevedo", "Quilanga", "Quinsaloma", "Quito", "Riobamba", "Rioverde", "Rocafuerte", "Rosa Zárate", "Salinas", "Salitre", "Samborondón", "San Fernando", "San Gabriel", "San Juan Bosco", "San Lorenzo", "San Miguel", "San Miguel de Los Bancos", "San Miguel de Salcedo", "San Vicente", "Sangolquí", "Santa Ana", "Santa Clara", "Santa Elena", "Santa Isabel", "Santa Lucía", "Santa Rosa", "Santiago", "Santiago de Méndez", "Santo Domingo", "Saquisilí", "Saraguro", "Sevilla de Oro", "Shushufindi", "Sigchos", "Sígsig", "Simón Bolívar", "Sozoranga", "Sucre", "Sucúa", "Suscal", "Tabacundo", "Taisha", "Tarapoa", "Tena", "Tiputini", "Tisaleo", "Tosagua", "Tulcán", "Urcuquí", "Valdez (Limones)", "Valencia", "Velasco Ibarra", "Ventanas", "Villa La Unión (Cajabamba)", "Vinces", "Yacuambi", "Yaguachi", "Yantzaza", "Zamora", "Zapotillo", "Zaruma", "Zumba", "Zumbi" }));
        jPanel3.add(cb_canton, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 245, 190, -1));

        jScrollPane.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_canton;
    private javax.swing.JComboBox<String> cb_provincia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_id_conductor;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nombre_conductor;
    // End of variables declaration//GEN-END:variables
}
