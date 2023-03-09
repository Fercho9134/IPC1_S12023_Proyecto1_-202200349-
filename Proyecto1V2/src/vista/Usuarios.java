/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Datos.AlmacenamientoDeDatos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author Fernando
 */
public class Usuarios extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    public Usuarios() {
        initComponents();
    }
    
    
    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    
    Usuario obtenerUsuario(String correo) {
        Usuario usuarioMod = null;
        for (Usuario usuario : datos.usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                usuarioMod = usuario;
                return usuarioMod;
            }
        }
        return usuarioMod;
    }
   
    
    public void cargarListaUsuarios() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo del usuario");
        modelo.addColumn("Correo del usuario");
        modelo.addColumn("Nombre y apellido");
        modelo.addColumn("Contraseña");

        for (Usuario usuario : datos.usuarios) {

            Object[] fila = {usuario.getCodigo(), usuario.getCorreo(), usuario.getNombre() + " " +usuario.getApellido(),usuario.getContrasena()};
            modelo.addRow(fila);

        }

        tblUsuarios.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblRegionesConMasEnvios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAdminUsuario = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(740, 480));

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Usuarios");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblRegionesConMasEnvios.setBackground(new java.awt.Color(34, 34, 59));
        lblRegionesConMasEnvios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblRegionesConMasEnvios.setForeground(new java.awt.Color(34, 34, 59));
        lblRegionesConMasEnvios.setText("Usuarios registrados en el sistema");
        jPanel1.add(lblRegionesConMasEnvios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblUsuarios.setBackground(new java.awt.Color(237, 237, 233));
        tblUsuarios.setForeground(new java.awt.Color(34, 34, 59));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 650, 280));

        btnAdminUsuario.setBackground(new java.awt.Color(241, 250, 238));
        btnAdminUsuario.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnAdminUsuario.setForeground(new java.awt.Color(34, 34, 59));
        btnAdminUsuario.setText("Administrar usuario");
        btnAdminUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnAdminUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 150, 30));

        btnActualizar.setBackground(new java.awt.Color(241, 250, 238));
        btnActualizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(34, 34, 59));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    ModificarUsuario modificar = new ModificarUsuario();
    private void btnAdminUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminUsuarioActionPerformed
        if(!devolverCorreo().isEmpty()){
            modificar.setVisible(true);
            modificar.modificarUsuario(obtenerUsuario(devolverCorreo()),true);
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario que desea modificar de la tabla");
        }
    }//GEN-LAST:event_btnAdminUsuarioActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarListaUsuarios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    String devolverCorreo() {
        String correo = "";
        
        int fila = tblUsuarios.getSelectedRow();
        
        if(fila > -1){
        correo = tblUsuarios.getValueAt(fila, 1).toString();
        }
        return correo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdminUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRegionesConMasEnvios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
