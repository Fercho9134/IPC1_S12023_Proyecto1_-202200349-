package vista;

import Datos.AlmacenamientoDeDatos;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Kiosco;
import modelo.Usuario;

public class RegistrarUsuario extends javax.swing.JFrame {

    public RegistrarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        cargarKioscos();
        verificarKioscos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        grupoRol = new javax.swing.ButtonGroup();
        pnlIcon = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblDireccionImagen = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblApellido = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtContrasenia = new javax.swing.JPasswordField();
        lblDpi = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblGenero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        btnMasculino = new javax.swing.JRadioButton();
        btnFemenino = new javax.swing.JRadioButton();
        txtAlias = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblNacionalidad = new javax.swing.JLabel();
        lblFotografia = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblTelefono = new javax.swing.JLabel();
        btnUsrIndividual = new javax.swing.JRadioButton();
        btnUsrEmpresarial = new javax.swing.JRadioButton();
        btnUsrKiosco = new javax.swing.JRadioButton();
        lblAlias = new javax.swing.JLabel();
        lstNacionalidad = new javax.swing.JComboBox<>();
        lblRol = new javax.swing.JLabel();
        btnAñadirFoto = new javax.swing.JButton();
        lblFotoUsuario = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblRol1 = new javax.swing.JLabel();
        lstKioscos = new javax.swing.JComboBox<>();
        lblAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registar nuevo usuario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIcon.setBackground(new java.awt.Color(38, 70, 83));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(241, 250, 238));
        lblTitulo.setText("Registrar usuario");

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N

        lblDireccionImagen.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        lblDireccionImagen.setForeground(new java.awt.Color(38, 70, 83));
        lblDireccionImagen.setText("profilePhoto.png");

        javax.swing.GroupLayout pnlIconLayout = new javax.swing.GroupLayout(pnlIcon);
        pnlIcon.setLayout(pnlIconLayout);
        pnlIconLayout.setHorizontalGroup(
            pnlIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconLayout.createSequentialGroup()
                .addGroup(pnlIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIconLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblTitulo))
                    .addGroup(pnlIconLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblIcon))
                    .addGroup(pnlIconLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblDireccionImagen)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlIconLayout.setVerticalGroup(
            pnlIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(lblDireccionImagen)
                .addContainerGap())
        );

        getContentPane().add(pnlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 550));

        pnlPrincipal.setBackground(new java.awt.Color(241, 250, 238));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreo.setBackground(new java.awt.Color(241, 250, 238));
        txtCorreo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(34, 34, 59));
        txtCorreo.setBorder(null);
        pnlPrincipal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 30));
        pnlPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, 20));

        txtNombre.setBackground(new java.awt.Color(241, 250, 238));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(34, 34, 59));
        txtNombre.setBorder(null);
        pnlPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, 30));
        pnlPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 20));

        lblCorreo.setBackground(new java.awt.Color(34, 34, 59));
        lblCorreo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(34, 34, 59));
        lblCorreo.setText("Correo:");
        pnlPrincipal.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtApellido.setBackground(new java.awt.Color(241, 250, 238));
        txtApellido.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(34, 34, 59));
        txtApellido.setBorder(null);
        pnlPrincipal.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 30));
        pnlPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 20));

        lblApellido.setBackground(new java.awt.Color(34, 34, 59));
        lblApellido.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(34, 34, 59));
        lblApellido.setText("Apellido:");
        pnlPrincipal.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblContrasenia.setBackground(new java.awt.Color(34, 34, 59));
        lblContrasenia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(34, 34, 59));
        lblContrasenia.setText("Contraseña:");
        pnlPrincipal.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        pnlPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, 20));

        txtContrasenia.setBackground(new java.awt.Color(241, 250, 238));
        txtContrasenia.setBorder(null);
        pnlPrincipal.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, 30));

        lblDpi.setBackground(new java.awt.Color(34, 34, 59));
        lblDpi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDpi.setForeground(new java.awt.Color(34, 34, 59));
        lblDpi.setText("DPI:");
        pnlPrincipal.add(lblDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        pnlPrincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 190, 20));

        lblGenero.setBackground(new java.awt.Color(34, 34, 59));
        lblGenero.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(34, 34, 59));
        lblGenero.setText("Genero:");
        pnlPrincipal.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lblNombre.setBackground(new java.awt.Color(34, 34, 59));
        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(34, 34, 59));
        lblNombre.setText("Nombre:");
        pnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtDpi.setBackground(new java.awt.Color(241, 250, 238));
        txtDpi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDpi.setForeground(new java.awt.Color(34, 34, 59));
        txtDpi.setBorder(null);
        pnlPrincipal.add(txtDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 30));

        lblFechaNacimiento.setBackground(new java.awt.Color(34, 34, 59));
        lblFechaNacimiento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(34, 34, 59));
        lblFechaNacimiento.setText("Fecha de nacimiento:");
        pnlPrincipal.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        btnMasculino.setBackground(new java.awt.Color(241, 250, 238));
        grupoGenero.add(btnMasculino);
        btnMasculino.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnMasculino.setForeground(new java.awt.Color(34, 34, 59));
        btnMasculino.setSelected(true);
        btnMasculino.setText("Masculino");
        pnlPrincipal.add(btnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        btnFemenino.setBackground(new java.awt.Color(241, 250, 238));
        grupoGenero.add(btnFemenino);
        btnFemenino.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnFemenino.setForeground(new java.awt.Color(34, 34, 59));
        btnFemenino.setText("Femenino");
        pnlPrincipal.add(btnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        txtAlias.setBackground(new java.awt.Color(241, 250, 238));
        txtAlias.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtAlias.setForeground(new java.awt.Color(34, 34, 59));
        txtAlias.setBorder(null);
        pnlPrincipal.add(txtAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 190, 30));
        pnlPrincipal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 190, 20));

        lblNacionalidad.setBackground(new java.awt.Color(34, 34, 59));
        lblNacionalidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(34, 34, 59));
        lblNacionalidad.setText("Nacionalidad:");
        pnlPrincipal.add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        lblFotografia.setBackground(new java.awt.Color(34, 34, 59));
        lblFotografia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblFotografia.setForeground(new java.awt.Color(34, 34, 59));
        lblFotografia.setText("Fotografía:");
        pnlPrincipal.add(lblFotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(241, 250, 238));
        txtTelefono.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(34, 34, 59));
        txtTelefono.setBorder(null);
        pnlPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 190, 30));
        pnlPrincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 190, 20));

        lblTelefono.setBackground(new java.awt.Color(34, 34, 59));
        lblTelefono.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(34, 34, 59));
        lblTelefono.setText("Teléfono:");
        pnlPrincipal.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        btnUsrIndividual.setBackground(new java.awt.Color(241, 250, 238));
        grupoRol.add(btnUsrIndividual);
        btnUsrIndividual.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnUsrIndividual.setForeground(new java.awt.Color(34, 34, 59));
        btnUsrIndividual.setSelected(true);
        btnUsrIndividual.setText("Usuario Individual");
        pnlPrincipal.add(btnUsrIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        btnUsrEmpresarial.setBackground(new java.awt.Color(241, 250, 238));
        grupoRol.add(btnUsrEmpresarial);
        btnUsrEmpresarial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnUsrEmpresarial.setForeground(new java.awt.Color(34, 34, 59));
        btnUsrEmpresarial.setText("Usuario Empresarial");
        pnlPrincipal.add(btnUsrEmpresarial, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        btnUsrKiosco.setBackground(new java.awt.Color(241, 250, 238));
        grupoRol.add(btnUsrKiosco);
        btnUsrKiosco.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnUsrKiosco.setForeground(new java.awt.Color(34, 34, 59));
        btnUsrKiosco.setText("Kiosco");
        btnUsrKiosco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnUsrKioscoItemStateChanged(evt);
            }
        });
        pnlPrincipal.add(btnUsrKiosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        lblAlias.setBackground(new java.awt.Color(34, 34, 59));
        lblAlias.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblAlias.setForeground(new java.awt.Color(34, 34, 59));
        lblAlias.setText("Alias:");
        pnlPrincipal.add(lblAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        lstNacionalidad.setBackground(new java.awt.Color(241, 250, 238));
        lstNacionalidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lstNacionalidad.setForeground(new java.awt.Color(34, 34, 59));
        lstNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        lstNacionalidad.setSelectedIndex(72);
        pnlPrincipal.add(lstNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, -1));

        lblRol.setBackground(new java.awt.Color(34, 34, 59));
        lblRol.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblRol.setForeground(new java.awt.Color(34, 34, 59));
        lblRol.setText("Kiosco asociado:");
        pnlPrincipal.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        btnAñadirFoto.setBackground(new java.awt.Color(241, 250, 238));
        btnAñadirFoto.setForeground(new java.awt.Color(34, 34, 59));
        btnAñadirFoto.setText("Añadir");
        btnAñadirFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 70, 83)));
        btnAñadirFoto.setContentAreaFilled(false);
        btnAñadirFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirFotoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAñadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 50, 20));

        lblFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profilePhoto.png"))); // NOI18N
        pnlPrincipal.add(lblFotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        btnRegistrarUsuario.setBackground(new java.awt.Color(38, 70, 83));
        btnRegistrarUsuario.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(241, 250, 238));
        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 70, 83)));
        btnRegistrarUsuario.setBorderPainted(false);
        btnRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(38, 70, 83));
        btnCancelar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(241, 250, 238));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 70, 83)));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 120, 30));

        txtFecha.setBackground(new java.awt.Color(241, 250, 238));
        txtFecha.setForeground(new java.awt.Color(34, 34, 59));
        txtFecha.setDateFormatString("dd/MM/yyyy");
        txtFecha.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFecha.setMaxSelectableDate(new java.util.Date(253370790096000L));
        pnlPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, 30));

        lblRol1.setBackground(new java.awt.Color(34, 34, 59));
        lblRol1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblRol1.setForeground(new java.awt.Color(34, 34, 59));
        lblRol1.setText("Rol:");
        pnlPrincipal.add(lblRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        lstKioscos.setBackground(new java.awt.Color(241, 250, 238));
        lstKioscos.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lstKioscos.setEnabled(false);
        pnlPrincipal.add(lstKioscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 90, -1));

        lblAlerta.setBackground(new java.awt.Color(255, 0, 0));
        lblAlerta.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 240, 10));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 610, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getCorreoV() {
        return txtCorreo.getText();
    }

    public String getNombreV() {
        return txtNombre.getText();
    }

    public String getApellidoV() {
        return txtApellido.getText();
    }

    public String getContrasenaV() {
        return txtContrasenia.getText();
    }

    public String getDpiV() {
        return txtDpi.getText();
    }

    public String getFechaNacimientoV() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha;
        if (txtFecha.getDate() != null) {
            fecha = dateFormat.format(txtFecha.getDate());
        } else {
            fecha = "";
        }
        return fecha;
    }

    public String getGeneroV() {

        if (btnMasculino.isSelected()) {
            return "Masculino";
        } else {
            return "Femenino";
        }
    }

    public String getNacionalidadV() {
        return lstNacionalidad.getSelectedItem().toString();
    }

    public String getAliasV() {
        return txtAlias.getText();
    }

    public String getTelefonoV() {
        return txtTelefono.getText();
    }

    public String getRolV() {
        if (btnUsrEmpresarial.isSelected()) {
            return "Usuario empresarial";
        } else if (btnUsrIndividual.isSelected()) {
            return "Usuario individual";
        } else {
            return "Kiosco";
        }
    }

    public String getRutaImagenV() {
        return lblDireccionImagen.getText();
    }

    private boolean contraseñaValida(String contraseña) {
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_/#\\-$%&?*!])[A-Za-z\\d_/#\\-$%&?*!]{4,}$";

        return contraseña.matches(patron);
    }

    private String devolverKioscoAsociado() {
        String kiosco;

        if (lstKioscos.getSelectedItem() != null && btnUsrKiosco.isSelected()) {
            kiosco = lstKioscos.getSelectedItem().toString();
        } else {
            kiosco = "Ninguno";
        }

        return kiosco;
    }

    private void cargarKioscos() {

        for (Kiosco kiosco : datos.kioscos) {
            lstKioscos.addItem(kiosco.getCodigoKiosco());
        }
    }

    private void verificarKioscos() {
        if (lstKioscos.getItemCount() == 0) {
            btnUsrKiosco.setEnabled(false);
            lblAlerta.setText("No hay kioscos disponibles para asociar");
        }
    }

    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    
    private void btnAñadirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirFotoActionPerformed
        String ruta = "";
        JFileChooser seleccionarFoto = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, JPEG, PNG & GIF", "jpg", "png", "gif", "jpeg");
        seleccionarFoto.setFileFilter(filtro);
        int seleccion = seleccionarFoto.showOpenDialog(this);

        if (seleccion == seleccionarFoto.APPROVE_OPTION) {
            ruta = seleccionarFoto.getSelectedFile().getPath();
            lblDireccionImagen.setText(ruta);

            Image imagen = new ImageIcon(ruta).getImage();
            ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblFotoUsuario.getWidth(), lblFotoUsuario.getHeight(), Image.SCALE_SMOOTH));

            lblFotoUsuario.setIcon(icono);
        }

    }//GEN-LAST:event_btnAñadirFotoActionPerformed

    private static int codigoUsuario = 0;

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        int codigo = codigoUsuario;
        String correo = getCorreoV();
        String nombre = getNombreV();
        String apellido = getApellidoV();
        String contrasena = getContrasenaV();
        String dpi = getDpiV();
        String fechaNacimiento = getFechaNacimientoV();
        String genero = getGeneroV();
        String nacionalidad = getNacionalidadV();
        String alias = getAliasV();
        String telefono = getTelefonoV();
        String rol = getRolV();
        String rutaFoto = getRutaImagenV();
        String kioscoAsociado = devolverKioscoAsociado();

        if (correo.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || contrasena.isEmpty() || dpi.isEmpty()
                || fechaNacimiento.isEmpty() || genero.isEmpty() || nacionalidad.isEmpty() || alias.isEmpty()
                || telefono.isEmpty() || rol.isEmpty() || rutaFoto.isEmpty() || kioscoAsociado.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else if (contraseñaValida(contrasena) == false) {

            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una mayuscula, una minuscula, un numero ,un caracter especial y 4 caracteres");

        } else {
            boolean existe = false;

            for (Usuario usuario : datos.usuarios) {
                if (usuario.getCorreo().equals(correo)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {

                JOptionPane.showMessageDialog(null, "El correo ingresado ya esta registrado con otro usuario");

            } else {

                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");

                datos.usuarios.add(new Usuario(codigo, correo, nombre, apellido, contrasena, dpi, fechaNacimiento, genero, nacionalidad, alias, telefono, rol, rutaFoto, kioscoAsociado,0, 0));
                codigoUsuario++;
                this.dispose();

            }
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnUsrKioscoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnUsrKioscoItemStateChanged
        if (btnUsrKiosco.isSelected()) {
            lstKioscos.setEnabled(true);
        } else {
            lstKioscos.setEnabled(false);
        }
    }//GEN-LAST:event_btnUsrKioscoItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirFoto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnFemenino;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JRadioButton btnUsrEmpresarial;
    private javax.swing.JRadioButton btnUsrIndividual;
    private javax.swing.JRadioButton btnUsrKiosco;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.ButtonGroup grupoRol;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccionImagen;
    private javax.swing.JLabel lblDpi;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFotoUsuario;
    private javax.swing.JLabel lblFotografia;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblRol1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JComboBox<String> lstKioscos;
    private javax.swing.JComboBox<String> lstNacionalidad;
    private javax.swing.JPanel pnlIcon;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDpi;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
