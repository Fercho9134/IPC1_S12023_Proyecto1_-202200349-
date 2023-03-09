package vista;

import Datos.AlmacenamientoDeDatos;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 *
 * @author Fernando
 */
public class DashboardUsuario extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdministrador
     */
    public DashboardUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnEnviosSolicitados = new javax.swing.JLabel();
        btnTarjetas = new javax.swing.JLabel();
        btnDatosFacturacion = new javax.swing.JLabel();
        btnCotizacion = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        lblRolUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        btnModificarPerfil = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard usuario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(38, 70, 83));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviosSolicitados.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEnviosSolicitados.setForeground(new java.awt.Color(241, 250, 238));
        btnEnviosSolicitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enviosSolicitados.png"))); // NOI18N
        btnEnviosSolicitados.setText("Envios solicit.");
        btnEnviosSolicitados.setAlignmentX(0.5F);
        btnEnviosSolicitados.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        btnEnviosSolicitados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviosSolicitados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviosSolicitadosMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnEnviosSolicitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 40));

        btnTarjetas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnTarjetas.setForeground(new java.awt.Color(241, 250, 238));
        btnTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        btnTarjetas.setText("Tarjetas Cred.");
        btnTarjetas.setAlignmentX(0.5F);
        btnTarjetas.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 8, 12, 8));
        btnTarjetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarjetasMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 40));

        btnDatosFacturacion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnDatosFacturacion.setForeground(new java.awt.Color(241, 250, 238));
        btnDatosFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datosFacturacion.png"))); // NOI18N
        btnDatosFacturacion.setText("Datos de Fact.");
        btnDatosFacturacion.setAlignmentX(0.5F);
        btnDatosFacturacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        btnDatosFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatosFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatosFacturacionMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnDatosFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 40));

        btnCotizacion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCotizacion.setForeground(new java.awt.Color(241, 250, 238));
        btnCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cotizacion.png"))); // NOI18N
        btnCotizacion.setText("Cotizacion");
        btnCotizacion.setAlignmentX(0.5F);
        btnCotizacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        btnCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCotizacionMouseClicked(evt);
            }
        });
        pnlPrincipal.add(btnCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 40));

        btnCerrarSesion.setBackground(new java.awt.Color(38, 70, 83));
        btnCerrarSesion.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(241, 250, 238));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, 30));

        lblRolUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        lblRolUsuario.setForeground(new java.awt.Color(241, 250, 238));
        lblRolUsuario.setText("Adminstrador");
        lblRolUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPrincipal.add(lblRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblNombreUsuario.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(241, 250, 238));
        lblNombreUsuario.setText("Nombre de usuario");
        lblNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlPrincipal.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profilePhoto.png"))); // NOI18N
        pnlPrincipal.add(lblFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnModificarPerfil.setBackground(new java.awt.Color(38, 70, 83));
        btnModificarPerfil.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        btnModificarPerfil.setForeground(new java.awt.Color(241, 250, 238));
        btnModificarPerfil.setText("Modificar perfil");
        btnModificarPerfil.setContentAreaFilled(false);
        btnModificarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPerfilActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnModificarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 480));

        container.setBackground(new java.awt.Color(241, 250, 238));
        container.setMinimumSize(new java.awt.Dimension(740, 480));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/camion.png"))); // NOI18N

        lblNombreEmpresa.setBackground(new java.awt.Color(37, 36, 34));
        lblNombreEmpresa.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(38, 70, 83));
        lblNombreEmpresa.setText("USAC - Delivery");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblLogo))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(lblNombreEmpresa))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lblLogo)
                .addGap(2, 2, 2)
                .addComponent(lblNombreEmpresa))
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 740, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    EnviosSolicitados envios = new EnviosSolicitados();
    Tarjetas tarjetas = new Tarjetas();
    DatosFacturacion datos = new DatosFacturacion();
    Cotizacion cotizacion = new Cotizacion();
    Login login = new Login();
    AlmacenamientoDeDatos datosGe = new AlmacenamientoDeDatos();
    ModificarUsuario modificar = new ModificarUsuario();

    public void setLblNombreUsuario(String texto) {
        this.lblNombreUsuario.setText(texto);
    }

    public void setLblRolUsuario(String texto) {
        this.lblRolUsuario.setText(texto);
    }

    public JLabel getLblFotoPerfil() {
        return lblFotoPerfil;
    }

    public void setLblFotoPerfil(JLabel lblFotoPerfil) {
        this.lblFotoPerfil = lblFotoPerfil;
    }

    void rellenarPanel(JPanel panel, String nombre) {
        panel.setSize(740, 480);
        panel.setLocation(0, 0);

        container.removeAll();
        container.add(panel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
        this.setTitle(nombre);
    }


    private void btnEnviosSolicitadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviosSolicitadosMouseClicked
        rellenarPanel(envios, "Envios realizados previamente");
        envios.obtenerUsuario();
        envios.rellenarTabla();
    }//GEN-LAST:event_btnEnviosSolicitadosMouseClicked

    private void btnTarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarjetasMouseClicked
        rellenarPanel(tarjetas, "Registro de tarjetas de crédito/débito");
        tarjetas.obtenerUsuario();
        tarjetas.cargarLista();
        tarjetas.limpiarCampos();
    }//GEN-LAST:event_btnTarjetasMouseClicked

    private void btnDatosFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatosFacturacionMouseClicked
        rellenarPanel(datos, "Registro de datos de facturacion");
        datos.obtenerUsuario();
        datos.cargarLista();
        datos.limpiarCampos();
    }//GEN-LAST:event_btnDatosFacturacionMouseClicked

    private void btnCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizacionMouseClicked
        rellenarPanel(cotizacion, "Cotizaciones y pedidos");
        cotizacion.obtenerUsuario();
        cotizacion.estadoInicial();
        cotizacion.cargarDatosFacturacionTarjetas();
        cotizacion.cargarDepartamentos();
    }//GEN-LAST:event_btnCotizacionMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnModificarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPerfilActionPerformed
        Usuario usuario=null;
        for(Usuario usuarios : datosGe.usuarios){
            if(usuarios.getCodigo() == datosGe.codigoUsuarioActual){
                usuario = usuarios;
                break;
            }
        }
        
        modificar.setVisible(true);
        modificar.modificarUsuario(usuario,false);
        this.dispose();
    }//GEN-LAST:event_btnModificarPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel btnCotizacion;
    private javax.swing.JLabel btnDatosFacturacion;
    private javax.swing.JLabel btnEnviosSolicitados;
    private javax.swing.JButton btnModificarPerfil;
    private javax.swing.JLabel btnTarjetas;
    private javax.swing.JPanel container;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}