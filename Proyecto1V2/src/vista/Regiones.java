/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Datos.AlmacenamientoDeDatos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Departamento;
import modelo.Kiosco;
import modelo.Municipio;
import modelo.Region;

/**
 *
 * @author Fernando
 */
public class Regiones extends javax.swing.JPanel {

    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();

    public Regiones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrecioEstandar = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAñadir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegiones = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        lblPrecioEspecial = new javax.swing.JLabel();
        txtPrecioEstandar = new javax.swing.JSpinner();
        txtPrecioEspecial = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(241, 250, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrecioEstandar.setBackground(new java.awt.Color(34, 34, 59));
        lblPrecioEstandar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblPrecioEstandar.setForeground(new java.awt.Color(34, 34, 59));
        lblPrecioEstandar.setText("Precio estandar:");
        add(lblPrecioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

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

        tblRegiones.setBackground(new java.awt.Color(237, 237, 233));
        tblRegiones.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tblRegiones.setForeground(new java.awt.Color(34, 34, 59));
        tblRegiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegiones);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 600, 190));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Regiones y precios");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblCodigo1.setBackground(new java.awt.Color(34, 34, 59));
        lblCodigo1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(34, 34, 59));
        lblCodigo1.setText("Código:");
        add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblPrecioEspecial.setBackground(new java.awt.Color(34, 34, 59));
        lblPrecioEspecial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblPrecioEspecial.setForeground(new java.awt.Color(34, 34, 59));
        lblPrecioEspecial.setText("Precios especial:");
        add(lblPrecioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        txtPrecioEstandar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtPrecioEstandar.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 0.05d));
        add(txtPrecioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 100, -1));

        txtPrecioEspecial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtPrecioEspecial.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 0.05d));
        add(txtPrecioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 100, -1));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoRegion = txtCodigo.getText();
        String nombreRegion = txtNombre.getText();
        double precioEstandar = Double.parseDouble(txtPrecioEstandar.getValue().toString());
        double precioEspecial = Double.parseDouble(txtPrecioEspecial.getValue().toString());
        

        if (codigoRegion.isEmpty() || nombreRegion.isEmpty() || precioEstandar == 0 || precioEspecial == 0) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else {

            boolean existe = false;

            for (Region regiones : datos.regiones) {
                if (regiones.getCodigoRegion().equals(codigoRegion) || regiones.getNombreRegion().equals(nombreRegion)) {

                    existe = true;
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "El nombre o codigo ingresado ya se encuentra registrado");
            } else {

                datos.regiones.add(new Region(codigoRegion, nombreRegion, precioEstandar, precioEspecial, 0, 0));
                cargarLista();
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Region agregada correctamente");
            }

        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigoRegion = txtCodigo.getText();
        String nombreRegion = txtNombre.getText();
        double precioEstandar = Double.parseDouble(txtPrecioEstandar.getValue().toString());
        double precioEspecial = Double.parseDouble(txtPrecioEspecial.getValue().toString());

        if (codigoRegion.isEmpty() || nombreRegion.isEmpty() || precioEstandar == 0 || precioEspecial == 0) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else {

            boolean existe = false;

            for (Region regiones : datos.regiones) {
                if (regiones.getCodigoRegion().equals(codigoRegion)) {

                    existe = true;
                    regiones.setNombreRegion(nombreRegion);
                    regiones.setPrecioEstandar(precioEstandar);
                    regiones.setPrecioEspecial(precioEspecial);

                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó la region con el codigo " + codigoRegion);
                cargarLista();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna region con el codigo " + codigoRegion + "\nAsegurese de que en el campo Codigo Region se encuentre el codigo de la region que desea actualizar");
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtener la región a eliminar
        String codigoRegion = txtCodigo.getText();
        Region regionAEliminar = null;
        boolean asociados = false;
        for (Region region : datos.regiones) {
            if (region.getCodigoRegion().equals(codigoRegion)) {
                regionAEliminar = region;
                break;
            }
        }

        // Si se encontró la región, buscar los departamentos asociados
        if (regionAEliminar != null) {

            List<Departamento> departamentosAEliminar = new ArrayList<>();
            for (Departamento departamento : datos.departamentos) {
                if (departamento.getCodigoRegion().equals(regionAEliminar.getCodigoRegion())) {
                    departamentosAEliminar.add(departamento);
                }
            }

            List<Municipio> municipiosAEliminar = new ArrayList<>();
            for (Departamento departamento : departamentosAEliminar) {
                for (Municipio municipio : datos.municipios) {
                    if (municipio.getCodigoDepartamento().equals(departamento.getCodigoDepartamento())) {
                        municipiosAEliminar.add(municipio);
                    }
                }
            }

            List<Kiosco> kioscosAEliminar = new ArrayList<>();
            for (Kiosco kiosco : datos.kioscos) {
                if (kiosco.getCodigoRegion().equals(regionAEliminar.getCodigoRegion())) {
                    kioscosAEliminar.add(kiosco);
                }
            }

            // Si se encontraron departamentos asociados, preguntar al usuario si también desea eliminar los departamentos y los municipios
            if (!departamentosAEliminar.isEmpty() || !kioscosAEliminar.isEmpty()) {

                String mensaje = "Se eliminará la región " + regionAEliminar.getCodigoRegion() + " - " + regionAEliminar.getNombreRegion() + " y todos sus departamentos, municipios y kioscos asociados";

                /*for (Kiosco kiosco : kioscosAEliminar) {

                    mensaje += "Kiosco: " + kiosco.getCodigoRegion() + " - " + kiosco.getCodigoKiosco() + " - " + kiosco.getNombreKiosco() + "\n";

                }

                for (Departamento departamento : departamentosAEliminar) {
                    mensaje += "Departamento: " + departamento.getCodigoRegion() + " - " + departamento.getCodigoDepartamento() + " - " + departamento.getNombreDepartamento() + "\n";

                    for (Municipio municipio : municipiosAEliminar) {
                        if (municipio.getCodigoDepartamento().equals(departamento.getCodigoDepartamento())) {
                            mensaje += "\tMunicipio: " + municipio.getCodigoDepartamento() + " - " + municipio.getCodigoMunicipio() + " - " + municipio.getNombreMunicipio() + "\n";
                        }
                    }
                }*/

                mensaje += "\n¿Está seguro de que desea eliminar la región?";

                int respuesta = JOptionPane.showConfirmDialog(null, mensaje, "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    asociados = true;
                    // Eliminar los municipios
                    for (Municipio municipio : municipiosAEliminar) {
                        datos.municipios.remove(municipio);
                    }
                } else {
                    // Si el usuario no quiere eliminar los municipios, no se eliminan los departamentos ni la región
                    JOptionPane.showMessageDialog(null, "No se eliminará la region, ni los departamentos ni los municipios asociados a esta");
                    return;

                }
            }

            // Eliminar los departamentos
            for (Departamento departamento : departamentosAEliminar) {
                datos.departamentos.remove(departamento);
            }

            for (Kiosco kiosco : kioscosAEliminar) {
                datos.kioscos.remove(kiosco);
            }
        }

// Finalmente, eliminar la región
        if (regionAEliminar != null) {

            if (asociados == false) {
                
                int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar la region " + regionAEliminar.getNombreRegion() + "\n*No tiene departamentos, municipios ni kioscos asociados*", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {

                    datos.regiones.remove(regionAEliminar);
                    JOptionPane.showMessageDialog(null, "Se eliminó la región con el código " + codigoRegion);
                    cargarLista();
                    limpiarCampos();

                }else{
                    JOptionPane.showMessageDialog(null, "No se eliminará la región");
                }
            } else {
                datos.regiones.remove(regionAEliminar);
                JOptionPane.showMessageDialog(null, "Se eliminó la región con el código " + codigoRegion);
                cargarLista();
                limpiarCampos();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna región con el código " + codigoRegion);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegionesMouseClicked
        int fila = tblRegiones.getSelectedRow();
        txtCodigo.setText(tblRegiones.getValueAt(fila, 0).toString());
        txtNombre.setText(tblRegiones.getValueAt(fila, 1).toString());
        txtPrecioEstandar.setValue(Double.parseDouble(tblRegiones.getValueAt(fila, 2).toString()));
        txtPrecioEspecial.setValue(Double.parseDouble(tblRegiones.getValueAt(fila, 3).toString()));
    }//GEN-LAST:event_tblRegionesMouseClicked
    void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecioEspecial.setValue(1);
        txtPrecioEstandar.setValue(1);
    }

    void cargarLista() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo de region");
        modelo.addColumn("Nombre de region");
        modelo.addColumn("Precio estandar");
        modelo.addColumn("Precio especial");

        for (Region regiones : datos.regiones) {

            Object[] fila = {regiones.getCodigoRegion(), regiones.getNombreRegion(), regiones.getPrecioEstandar(), regiones.getPrecioEspecial()};
            modelo.addRow(fila);

        }

        tblRegiones.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioEspecial;
    private javax.swing.JLabel lblPrecioEstandar;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTable tblRegiones;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPrecioEspecial;
    private javax.swing.JSpinner txtPrecioEstandar;
    // End of variables declaration//GEN-END:variables
}
