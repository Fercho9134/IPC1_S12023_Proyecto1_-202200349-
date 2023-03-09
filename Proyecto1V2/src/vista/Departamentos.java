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
import modelo.Municipio;
import modelo.Region;

/**
 *
 * @author Fernando
 */
public class Departamentos extends javax.swing.JPanel {

    public Departamentos() {
        initComponents();
        cargarRegiones();
        cargarLista();
        cargarPrimerElemento();
    }

    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreRegion = new javax.swing.JLabel();
        txtNombreRegion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCodigoRegion = new javax.swing.JLabel();
        lstRegiones = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCodigoDepartamento = new javax.swing.JLabel();
        txtCodigoDepartamento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombreDepartamento = new javax.swing.JLabel();
        txtNombreDepartamento = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(241, 250, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRegion.setBackground(new java.awt.Color(34, 34, 59));
        lblNombreRegion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombreRegion.setForeground(new java.awt.Color(34, 34, 59));
        lblNombreRegion.setText("Nombre de la region:");
        add(lblNombreRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNombreRegion.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreRegion.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        txtNombreRegion.setForeground(new java.awt.Color(34, 34, 59));
        txtNombreRegion.setBorder(null);
        txtNombreRegion.setEnabled(false);
        add(txtNombreRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, 20));

        lblCodigoRegion.setBackground(new java.awt.Color(34, 34, 59));
        lblCodigoRegion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCodigoRegion.setForeground(new java.awt.Color(34, 34, 59));
        lblCodigoRegion.setText("Código de región:");
        add(lblCodigoRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lstRegiones.setBackground(new java.awt.Color(241, 250, 238));
        lstRegiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstRegionesItemStateChanged(evt);
            }
        });
        add(lstRegiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, -1));

        btnAñadir.setBackground(new java.awt.Color(38, 70, 83));
        btnAñadir.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(241, 250, 238));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 100, 30));

        btnActualizar.setBackground(new java.awt.Color(38, 70, 83));
        btnActualizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(241, 250, 238));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, 30));

        btnEliminar.setBackground(new java.awt.Color(38, 70, 83));
        btnEliminar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, 30));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblDepartamentos.setBackground(new java.awt.Color(237, 237, 233));
        tblDepartamentos.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tblDepartamentos.setForeground(new java.awt.Color(34, 34, 59));
        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDepartamentos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 600, 160));

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Departamentos");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lblCodigoDepartamento.setBackground(new java.awt.Color(34, 34, 59));
        lblCodigoDepartamento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCodigoDepartamento.setForeground(new java.awt.Color(34, 34, 59));
        lblCodigoDepartamento.setText("Codigo del departamento:");
        add(lblCodigoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        txtCodigoDepartamento.setBackground(new java.awt.Color(241, 250, 238));
        txtCodigoDepartamento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCodigoDepartamento.setForeground(new java.awt.Color(34, 34, 59));
        txtCodigoDepartamento.setBorder(null);
        add(txtCodigoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 150, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 150, 20));

        lblNombreDepartamento.setBackground(new java.awt.Color(34, 34, 59));
        lblNombreDepartamento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombreDepartamento.setForeground(new java.awt.Color(34, 34, 59));
        lblNombreDepartamento.setText("Nombe del departamento:");
        add(lblNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        txtNombreDepartamento.setBackground(new java.awt.Color(241, 250, 238));
        txtNombreDepartamento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombreDepartamento.setForeground(new java.awt.Color(34, 34, 59));
        txtNombreDepartamento.setBorder(null);
        add(txtNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 150, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 150, 20));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void lstRegionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstRegionesItemStateChanged
        txtNombreRegion.setText(obtenerNombreRegion(lstRegiones.getSelectedItem().toString()));
    }//GEN-LAST:event_lstRegionesItemStateChanged

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoRegion;
        if (lstRegiones.getSelectedItem() != null) {
            codigoRegion = lstRegiones.getSelectedItem().toString();
        } else {
            codigoRegion = "NOEXISTE";
        }

        String codigoDepartamento = txtCodigoDepartamento.getText();
        String nombreDepartamento = txtNombreDepartamento.getText();

        if (codigoRegion.isEmpty() || codigoDepartamento.isEmpty() || nombreDepartamento.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else if (lstRegiones.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Antes de crear un departamento, debe crear al menos una region");

        } else {

            boolean existe = false;

            for (Departamento departamentos : datos.departamentos) {

                if (departamentos.getCodigoDepartamento().equals(codigoDepartamento) || departamentos.getNombreDepartamento().equals(nombreDepartamento)) {
                    existe = true;
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "El codigo o nombre del departamento ya se encuentran registrado, revise sus datos");
            } else {

                datos.departamentos.add(new Departamento(codigoRegion, codigoDepartamento, nombreDepartamento));
                cargarLista();
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Departamento agregado correctamente");
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

        String codigoDepartamento = txtCodigoDepartamento.getText();
        String nombreDepartamento = txtNombreDepartamento.getText();

        if (codigoRegion.isEmpty() || codigoDepartamento.isEmpty() || nombreDepartamento.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");

        } else if (lstRegiones.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Debe haber una region para actualizar los departamentos de esa region");

        } else {

            boolean existe = false;

            for (Departamento departamentos : datos.departamentos) {
                if (departamentos.getCodigoDepartamento().equals(codigoDepartamento)) {

                    existe = true;
                    departamentos.setCodigoRegion(codigoRegion);
                    departamentos.setNombreDepartamento(nombreDepartamento);
                    break;
                }
            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el departamento con el codigo " + codigoDepartamento);
                cargarLista();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningun departamento con el codigo " + codigoDepartamento + "\nAsegurese de que en el campo Codigo Departamento se encuentre el codigo del departamento que desea actualizar");
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtener el departamento a eliminar
        String codigoDepartamento = txtCodigoDepartamento.getText();
        Departamento departamentoAEliminar = null;
        boolean asociados = false;

        for (Departamento departamento : datos.departamentos) {
            if (departamento.getCodigoDepartamento().equals(codigoDepartamento)) {
                departamentoAEliminar = departamento;
                break;
            }
        }

        // Si se encontró el departamento, buscar los municipios asociados
        if (departamentoAEliminar != null) {

            List<Municipio> municipiosAEliminar = new ArrayList<>();
            for (Municipio municipio : datos.municipios) {
                if (municipio.getCodigoDepartamento().equals(departamentoAEliminar.getCodigoDepartamento())) {
                    municipiosAEliminar.add(municipio);
                }
            }

            // Si se encontraron municipios asociados, preguntar al usuario si también desea eliminar los municipios
            if (!municipiosAEliminar.isEmpty()) {

                String mensaje = "Se eliminará el departamento " + departamentoAEliminar.getCodigoDepartamento() + " - " + departamentoAEliminar.getNombreDepartamento() + " y todos sus municipios asociados:";

               /* for (Municipio municipio : municipiosAEliminar) {

                    mensaje += "Municipio: " + municipio.getCodigoDepartamento() + " - " + municipio.getCodigoMunicipio() + " - " + municipio.getNombreMunicipio() + "\n";

                }*/

                mensaje += "\n¿Está seguro de que desea eliminar el departamento?";

                int respuesta = JOptionPane.showConfirmDialog(null, mensaje, "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    asociados = true;
                    // Eliminar los municipios
                    for (Municipio municipio : municipiosAEliminar) {
                        datos.municipios.remove(municipio);
                    }
                } else {
                    // Si el usuario no quiere eliminar los municipios no se elimina nada
                    JOptionPane.showMessageDialog(null, "No se eliminará el departamento ni sus municipios asociados");
                    return;

                }
            }
        }

// Finalmente, eliminar el departamento
        if (departamentoAEliminar != null) {

            if (asociados == false) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar el departamento " + departamentoAEliminar.getNombreDepartamento() + "\n*No tiene municipios asociados*", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {

                    datos.departamentos.remove(departamentoAEliminar);
                    JOptionPane.showMessageDialog(null, "Se eliminó el departamento con el código " + codigoDepartamento);
                    cargarLista();
                    limpiarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "No se eliminará el departamento");
                }
            } else {
                datos.departamentos.remove(departamentoAEliminar);
                JOptionPane.showMessageDialog(null, "Se eliminó el departamento con el código " + codigoDepartamento);
                cargarLista();
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningun departamento con el código " + codigoDepartamento);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartamentosMouseClicked
        int fila = tblDepartamentos.getSelectedRow();
        txtCodigoDepartamento.setText(tblDepartamentos.getValueAt(fila, 1).toString());
        txtNombreDepartamento.setText(tblDepartamentos.getValueAt(fila, 2).toString());

    }//GEN-LAST:event_tblDepartamentosMouseClicked

    void limpiarCampos() {
        txtCodigoDepartamento.setText("");
        txtNombreDepartamento.setText("");
    }

    void cargarRegiones() {

        for (Region regiones : datos.regiones) {
            lstRegiones.addItem(regiones.getCodigoRegion());
        }

    }

    String obtenerNombreRegion(String codigoRegion) {
        String nombreRegion = "";
        for (Region regiones : datos.regiones) {

            if (regiones.getCodigoRegion().equals(codigoRegion)) {
                nombreRegion = regiones.getNombreRegion();
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
        modelo.addColumn("Codigo del departamento");
        modelo.addColumn("Nombre del departamento");

        for (Departamento departamentos : datos.departamentos) {

            Object[] fila = {departamentos.getCodigoRegion(), departamentos.getCodigoDepartamento(), departamentos.getNombreDepartamento()};
            modelo.addRow(fila);

        }

        tblDepartamentos.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCodigoDepartamento;
    private javax.swing.JLabel lblCodigoRegion;
    private javax.swing.JLabel lblNombreDepartamento;
    private javax.swing.JLabel lblNombreRegion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JComboBox<String> lstRegiones;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtCodigoDepartamento;
    private javax.swing.JTextField txtNombreDepartamento;
    private javax.swing.JTextField txtNombreRegion;
    // End of variables declaration//GEN-END:variables
}
