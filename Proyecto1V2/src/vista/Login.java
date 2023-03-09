package vista;

import Datos.AlmacenamientoDeDatos;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setSize(651, 350);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        pnlInicio = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrarse = new javax.swing.JButton();
        lblIconPass = new javax.swing.JLabel();
        lblIconUser = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);
        setSize(new java.awt.Dimension(651, 350));

        pnlPrincipal.setPreferredSize(new java.awt.Dimension(651, 350));

        pnlLogo.setBackground(new java.awt.Color(38, 70, 83));
        pnlLogo.setPreferredSize(new java.awt.Dimension(325, 350));
        pnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/camion.png"))); // NOI18N
        pnlLogo.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        lblNombreEmpresa.setBackground(new java.awt.Color(37, 36, 34));
        lblNombreEmpresa.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(241, 250, 238));
        lblNombreEmpresa.setText("USAC - Delivery");
        pnlLogo.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        pnlInicio.setBackground(new java.awt.Color(241, 250, 238));
        pnlInicio.setPreferredSize(new java.awt.Dimension(270, 350));
        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(241, 250, 238));
        txtUsuario.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(37, 36, 34));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setBorder(null);
        txtUsuario.setMargin(new java.awt.Insets(2, 6, 2, 1));
        pnlInicio.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 200, 28));

        txtContrasenia.setBackground(new java.awt.Color(241, 250, 238));
        txtContrasenia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(37, 36, 34));
        txtContrasenia.setBorder(null);
        pnlInicio.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 28));
        pnlInicio.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 20));
        pnlInicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 20));

        btnRegistrarse.setBackground(new java.awt.Color(241, 250, 238));
        btnRegistrarse.setForeground(new java.awt.Color(34, 34, 59));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 70, 83)));
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        pnlInicio.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, 30));

        lblIconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        pnlInicio.add(lblIconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        pnlInicio.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(37, 36, 34));
        lblTitulo.setText("Inicio de sesión");
        pnlInicio.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(241, 250, 238));
        btnIngresar.setForeground(new java.awt.Color(34, 34, 59));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 70, 83)));
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlInicio.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, 30));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar(){
        txtUsuario.setText("");
        txtContrasenia.setText("");
    }
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        RegistrarUsuario registrar = new RegistrarUsuario();
        registrar.setVisible(true);
   
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
        
        String correo = txtUsuario.getText();
        String contrasena = txtContrasenia.getText();
        
        boolean existe = false;
        
        for (Usuario usuario : datos.usuarios) {
            
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {
                String mensaje = "Bienvenido " + usuario.getNombre() + "\n Rol: " + usuario.getRol();
                JOptionPane.showMessageDialog(null, mensaje);
                existe = true;

                this.dispose();

                DashboardUsuario dashUsuario = new DashboardUsuario();
                dashUsuario.setVisible(true);

                dashUsuario.setLblNombreUsuario(usuario.getNombre() + " " + usuario.getApellido());
                dashUsuario.setLblRolUsuario(usuario.getRol());
                datos.codigoUsuarioActual = usuario.getCodigo();

                Image imagen = new ImageIcon(usuario.getRutaFotografia()).getImage();
                ImageIcon icono = new ImageIcon(imagen.getScaledInstance(dashUsuario.getLblFotoPerfil().getWidth(), dashUsuario.getLblFotoPerfil().getHeight(), Image.SCALE_SMOOTH));

                dashUsuario.getLblFotoPerfil().setIcon(icono);
                break;
            }
        }

        if (correo.equals("admin") && contrasena.equals("admin")) {
            String mensaje = "Bienvenido Fernando\n Rol: Administrador";
            JOptionPane.showMessageDialog(null, mensaje);
            existe = true;
            
            DashboardAdministrador dashAdmin = new DashboardAdministrador();
            dashAdmin.setVisible(true);
            this.dispose();
        }

        if (!existe) {

            JOptionPane.showMessageDialog(null, "Datos incorrectos");

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIconPass;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
