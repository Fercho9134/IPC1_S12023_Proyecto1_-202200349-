
package vista;

import Datos.AlmacenamientoDeDatos;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Datos;
import modelo.Usuario;

public class DatosFacturacion extends javax.swing.JPanel {

    public DatosFacturacion() {
        initComponents();
    }
    
    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    Usuario usuario;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNit = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosFacturacion = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(241, 250, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setBackground(new java.awt.Color(34, 34, 59));
        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(34, 34, 59));
        lblNombre.setText("Nombre completo:");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNombre.setBackground(new java.awt.Color(241, 250, 238));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(34, 34, 59));
        txtNombre.setBorder(null);
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 20));

        lblDireccion.setBackground(new java.awt.Color(34, 34, 59));
        lblDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(34, 34, 59));
        lblDireccion.setText("Dirección:");
        add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(241, 250, 238));
        txtDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(34, 34, 59));
        txtDireccion.setBorder(null);
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, 20));

        lblNit.setBackground(new java.awt.Color(34, 34, 59));
        lblNit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNit.setForeground(new java.awt.Color(34, 34, 59));
        lblNit.setText("Nit:");
        add(lblNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        btnAñadir.setBackground(new java.awt.Color(38, 70, 83));
        btnAñadir.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(241, 250, 238));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 100, 30));

        btnActualizar.setBackground(new java.awt.Color(38, 70, 83));
        btnActualizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(241, 250, 238));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(38, 70, 83));
        btnEliminar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 100, 30));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblDatosFacturacion.setBackground(new java.awt.Color(237, 237, 233));
        tblDatosFacturacion.setForeground(new java.awt.Color(34, 34, 59));
        tblDatosFacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDatosFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosFacturacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatosFacturacion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 600, 220));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Datos de facturacion");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        txtNit.setBackground(new java.awt.Color(241, 250, 238));
        txtNit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNit.setForeground(new java.awt.Color(34, 34, 59));
        txtNit.setBorder(null);
        add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 190, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 190, 20));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String nit = txtNit.getText();

        if (nombre.isEmpty() || direccion.isEmpty() || nit.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else {

            boolean existe = false;

            for (Datos dato : usuario.getDatos()) {

                if (dato.getNit().equals(nit)) {
                    existe = true;
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "Los datos ingresados ya se encuentran registrados");
            } else {
                Datos datosFact = new Datos(nombre,direccion,nit);

                usuario.setDatos(datosFact);
                cargarLista();
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Datos de facturacion agregados correctamente");
            }

        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String nit = txtNit.getText();


        if (nombre.isEmpty() || direccion.isEmpty() || nit.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben tener informacion");
        }else {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar los datos de facturacion ingresados", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {

                boolean existe = false;
                Iterator<Datos> iter = usuario.getDatos().iterator();
                while (iter.hasNext()) {
                    Datos datos = iter.next();
                
                    if (datos.getNombre().equals(nombre) && datos.getDireccion().equals(direccion) && datos.getNit().equals(nit)) {
                        existe = true;
                        iter.remove();
                        break;
                    }
                }
                if (existe) {
                    JOptionPane.showMessageDialog(null, "Se eliminaron los datos de facturacion");
                    cargarLista();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron datos de facturacion que coincidan con los ingresados");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminarán los datos de facturacion");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDatosFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosFacturacionMouseClicked
        int fila = tblDatosFacturacion.getSelectedRow();
        txtNombre.setText(tblDatosFacturacion.getValueAt(fila, 0).toString());
        txtDireccion.setText(tblDatosFacturacion.getValueAt(fila, 1).toString());
        txtNit.setText(tblDatosFacturacion.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblDatosFacturacionMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String nit = txtNit.getText();

        if (nombre.isEmpty() || direccion.isEmpty() || nit.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        }else {

            boolean existe = false;

            for (Datos datos : usuario.getDatos()) {
                if (datos.getNombre().equals(nombre) && datos.getNit().equals(nit)) {

                    existe = true;
                    datos.setDireccion(direccion);
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos de facturacion");
                cargarLista();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos de facturacion con los datos ingresados, recuerde que unicamente puede actualizar la direccion\ny el nombre y nit de los datos a actualizar debe estar presente en los campos correspondientes");
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    void obtenerUsuario() {
        for (Usuario usuario : datos.usuarios) {
            if (usuario.getCodigo() == datos.codigoUsuarioActual) {
                this.usuario = usuario;
            }
        }
    }
    
    void limpiarCampos() {
        txtDireccion.setText("");
        txtNit.setText("");
        txtNombre.setText("");
    }

    void cargarLista() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre completo");
        modelo.addColumn("Dirección");
        modelo.addColumn("Nit");

        for (Datos datos : usuario.getDatos()) {

         
            Object[] fila = {datos.getNombre(), datos.getDireccion(), datos.getNit()};
            modelo.addRow(fila);

        }

        tblDatosFacturacion.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblDatosFacturacion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
