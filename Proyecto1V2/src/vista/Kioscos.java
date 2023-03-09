
package vista;

import Datos.AlmacenamientoDeDatos;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Kiosco;
import modelo.Region;

public class Kioscos extends javax.swing.JPanel {

   
    public Kioscos() {
        initComponents();
        cargarRegiones();
        cargarLista();
        cargarPrimerElemento();
    }

    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCodigoRegion = new javax.swing.JLabel();
        lstRegiones = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKioscos = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblNombreRegion = new javax.swing.JLabel();
        txtNombreRegion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(241, 250, 238));
        setPreferredSize(new java.awt.Dimension(740, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setBackground(new java.awt.Color(34, 34, 59));
        lblCodigo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(34, 34, 59));
        lblCodigo.setText("Código:");
        add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(241, 250, 238));
        txtCodigo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(34, 34, 59));
        txtCodigo.setBorder(null);
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 20));

        lblNombre.setBackground(new java.awt.Color(34, 34, 59));
        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(34, 34, 59));
        lblNombre.setText("Nombre:");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txtNombre.setBackground(new java.awt.Color(241, 250, 238));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(34, 34, 59));
        txtNombre.setBorder(null);
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, 20));

        lblCodigoRegion.setBackground(new java.awt.Color(34, 34, 59));
        lblCodigoRegion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCodigoRegion.setForeground(new java.awt.Color(34, 34, 59));
        lblCodigoRegion.setText("Código de región:");
        add(lblCodigoRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        lstRegiones.setBackground(new java.awt.Color(241, 250, 238));
        lstRegiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstRegionesItemStateChanged(evt);
            }
        });
        add(lstRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, -1));

        btnAñadir.setBackground(new java.awt.Color(38, 70, 83));
        btnAñadir.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(241, 250, 238));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, 30));

        btnActualizar.setBackground(new java.awt.Color(38, 70, 83));
        btnActualizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(241, 250, 238));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(38, 70, 83));
        btnEliminar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 100, 30));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblKioscos.setBackground(new java.awt.Color(237, 237, 233));
        tblKioscos.setForeground(new java.awt.Color(34, 34, 59));
        tblKioscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblKioscos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKioscosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKioscos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 600, 190));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Kioscos");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblNombreRegion.setBackground(new java.awt.Color(34, 34, 59));
        lblNombreRegion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombreRegion.setForeground(new java.awt.Color(34, 34, 59));
        lblNombreRegion.setText("Nombre de la region:");
        add(lblNombreRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        txtNombreRegion.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreRegion.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        txtNombreRegion.setForeground(new java.awt.Color(34, 34, 59));
        txtNombreRegion.setBorder(null);
        txtNombreRegion.setEnabled(false);
        add(txtNombreRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, 20));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void lstRegionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstRegionesItemStateChanged
        txtNombreRegion.setText(obtenerNombreRegion(lstRegiones.getSelectedItem().toString()));
    }//GEN-LAST:event_lstRegionesItemStateChanged

    private void tblKioscosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKioscosMouseClicked
        int fila = tblKioscos.getSelectedRow();
        txtCodigo.setText(tblKioscos.getValueAt(fila, 1).toString());
        txtNombre.setText(tblKioscos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblKioscosMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoRegion;
        if (lstRegiones.getSelectedItem() != null) {
            codigoRegion = lstRegiones.getSelectedItem().toString();
        } else {
            codigoRegion = "NOEXISTE";
        }

        String codigoKiosco = txtCodigo.getText();
        String nombreKiosco = txtNombre.getText();

        if (codigoRegion.isEmpty() || codigoKiosco.isEmpty() || nombreKiosco.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else if (lstRegiones.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Antes de crear un kiosco, debe crear al menos una region");

        } else {
            
            boolean existe = false;

            for (Kiosco kiosco : datos.kioscos) {

                if (kiosco.getCodigoKiosco().equals(codigoKiosco)) {
                    existe = true;
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "El codigo del kiosco ya se encuentran registrado, revise sus datos");
            } else {

                datos.kioscos.add(new Kiosco(codigoRegion, codigoKiosco, nombreKiosco));
                cargarLista();
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Kiosco agregado correctamente");
            }

        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigoRegion;
        if (lstRegiones.getSelectedItem() != null) {
            codigoRegion = lstRegiones.getSelectedItem().toString();
        } else {
            codigoRegion = "NOEXISTE";
        }

        String codigoKiosco = txtCodigo.getText();
        String nombreKiosco = txtNombre.getText();

        if (codigoRegion.isEmpty() || codigoKiosco.isEmpty() || nombreKiosco.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else if (lstRegiones.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Debe haber una region para actualizar los kioscos de esa region");

        } else {

            boolean existe = false;

            for (Kiosco kiosco : datos.kioscos) {
                if (kiosco.getCodigoKiosco().equals(codigoKiosco)) {

                    existe = true;
                    kiosco.setCodigoRegion(codigoRegion);
                    kiosco.setNombreKiosco(nombreKiosco);
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el kiosco con el codigo " + codigoKiosco);
                cargarLista();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningun kiosco con el codigo " + codigoKiosco + "\nAsegurese de que en el campo Codigo kiosco se encuentre el codigo del kiosco que desea actualizar");
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoKiosco = txtCodigo.getText();

        if (codigoKiosco.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo codigo kiosco debe contener el codigo del municipio que desea eliminar");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar el kiosco con el codigo " + codigoKiosco, "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                
                boolean existe = false;
                Iterator<Kiosco> iter = datos.kioscos.iterator();
                while (iter.hasNext()) {
                    Kiosco kiosco = iter.next();
                    if (kiosco.getCodigoKiosco().equals(codigoKiosco)) {
                        existe = true;
                        iter.remove();
                        break;
                    }
                }
                if (existe) {
                    JOptionPane.showMessageDialog(null, "Se eliminó el Kiosco con el codigo " + codigoKiosco);
                    cargarLista();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningun kiosco con el codigo " + codigoKiosco + "\nAsegurese de que en el campo Codigo kiosco se encuentre el codigo del kiosco que desea eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminará el kiosco");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
    }

    void cargarRegiones() {

        for (Region region : datos.regiones) {
            lstRegiones.addItem(region.getCodigoRegion());
        }

    }

    String obtenerNombreRegion(String codigoRegion) {
        String nombreRegion = "";
        for (Region region : datos.regiones) {

            if (region.getCodigoRegion().equals(codigoRegion)) {
                nombreRegion = region.getNombreRegion();
                break;
            }
        }

        return nombreRegion;
    }

    void cargarPrimerElemento() {
        if (lstRegiones.getSelectedItem() != null) {
            txtNombreRegion.setText(obtenerNombreRegion(lstRegiones.getSelectedItem().toString()));
        } else {

            txtNombreRegion.setText("-Vacio-");

        }
    }

    void cargarLista() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo de region");
        modelo.addColumn("Codigo del kiosco");
        modelo.addColumn("Nombre del kiosco");

        for (Kiosco kiosco : datos.kioscos) {

            Object[] fila = {kiosco.getCodigoRegion(), kiosco.getCodigoKiosco(), kiosco.getNombreKiosco()};
            modelo.addRow(fila);

        }

        tblKioscos.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoRegion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreRegion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JComboBox<String> lstRegiones;
    private javax.swing.JTable tblKioscos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreRegion;
    // End of variables declaration//GEN-END:variables
}
