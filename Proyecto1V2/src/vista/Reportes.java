/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Datos.AlmacenamientoDeDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import modelo.Municipio;
import modelo.Region;
import modelo.Usuario;

/**
 *
 * @author Fernando
 */
public class Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        txtIngresosTotales.setEditable(false);
        txtPaquetesEnviados.setEditable(false);
    }
    
    
    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    ArrayList<Region> copiaRegiones = new ArrayList<>();
    ArrayList<Usuario> copiaUsuarios = new ArrayList<>();

    public void ordenarRegiones() {
        copiaRegiones = datos.regiones;
        Comparator<Region> comparador = new Comparator<Region>() {
            @Override
            public int compare(Region r1, Region r2) {
                return r2.getCantidadEnvios() - r1.getCantidadEnvios();
            }

        };

        Collections.sort(copiaRegiones, comparador);
    }
    
    public void ordenarUsuarios() {
        copiaUsuarios = datos.usuarios;
        Comparator<Usuario> comparadorUsuarios = new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u2.getPaquetesEnviados() - u1.getPaquetesEnviados();
            }

        };

        Collections.sort(copiaUsuarios, comparadorUsuarios);
    }
    
    public void cargarListaRegiones() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo de la region");
        modelo.addColumn("Nombre de  la region");
        modelo.addColumn("Total recaudado (Q)");
        modelo.addColumn("Total paquetes enviados");

        for (Region region : copiaRegiones) {

            Object[] fila = {region.getCodigoRegion(), region.getNombreRegion(), region.getTotalVendido(), region.getCantidadEnvios()};
            modelo.addRow(fila);

        }

        tblRegionesMasEnviadas.setModel(modelo);
    }
    
    public void cargarListaUsuarios() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo del usuario");
        modelo.addColumn("Correo del usuario");
        modelo.addColumn("Nombre y apellido");
        modelo.addColumn("Total gastado (Q)");
        modelo.addColumn("Paquetes enviados");

        for (Usuario usuario : copiaUsuarios) {

            Object[] fila = {usuario.getCodigo(), usuario.getCorreo(), usuario.getNombre() + " " +usuario.getApellido(),usuario.getTotalVendido(), usuario.getPaquetesEnviados()};
            modelo.addRow(fila);

        }

        tblUsuariosMasEnvios.setModel(modelo);
    }

    public void cargarCamposDeTexto(){
        txtPaquetesEnviados.setText(Integer.toString(datos.paquetesEnviados));
        txtIngresosTotales.setText(Double.toString(datos.ingresosTotales));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblRegionesConMasEnvios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegionesMasEnviadas = new javax.swing.JTable();
        lblIngresosTotales = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsuariosMasEnvios = new javax.swing.JTable();
        lblUsuarioMasEnvios = new javax.swing.JLabel();
        txtIngresosTotales = new javax.swing.JTextField();
        lblIngresosTotales1 = new javax.swing.JLabel();
        txtPaquetesEnviados = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(740, 480));

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Reportes");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblRegionesConMasEnvios.setBackground(new java.awt.Color(34, 34, 59));
        lblRegionesConMasEnvios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblRegionesConMasEnvios.setForeground(new java.awt.Color(34, 34, 59));
        lblRegionesConMasEnvios.setText("Regiones con más envíos");
        jPanel1.add(lblRegionesConMasEnvios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblRegionesMasEnviadas.setBackground(new java.awt.Color(237, 237, 233));
        tblRegionesMasEnviadas.setForeground(new java.awt.Color(34, 34, 59));
        tblRegionesMasEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRegionesMasEnviadas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 650, 110));

        lblIngresosTotales.setBackground(new java.awt.Color(34, 34, 59));
        lblIngresosTotales.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblIngresosTotales.setForeground(new java.awt.Color(34, 34, 59));
        lblIngresosTotales.setText("Ingresos totales:");
        jPanel1.add(lblIngresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jScrollPane3.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane3.setForeground(new java.awt.Color(34, 34, 59));

        tblUsuariosMasEnvios.setBackground(new java.awt.Color(237, 237, 233));
        tblUsuariosMasEnvios.setForeground(new java.awt.Color(34, 34, 59));
        tblUsuariosMasEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblUsuariosMasEnvios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 650, 110));

        lblUsuarioMasEnvios.setBackground(new java.awt.Color(34, 34, 59));
        lblUsuarioMasEnvios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblUsuarioMasEnvios.setForeground(new java.awt.Color(34, 34, 59));
        lblUsuarioMasEnvios.setText("Usuarios con más paquetes enviados");
        jPanel1.add(lblUsuarioMasEnvios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtIngresosTotales.setBackground(new java.awt.Color(241, 250, 238));
        txtIngresosTotales.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtIngresosTotales.setForeground(new java.awt.Color(34, 34, 59));
        txtIngresosTotales.setBorder(null);
        jPanel1.add(txtIngresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 160, 20));

        lblIngresosTotales1.setBackground(new java.awt.Color(34, 34, 59));
        lblIngresosTotales1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblIngresosTotales1.setForeground(new java.awt.Color(34, 34, 59));
        lblIngresosTotales1.setText("Paquetes enviados:");
        jPanel1.add(lblIngresosTotales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        txtPaquetesEnviados.setBackground(new java.awt.Color(241, 250, 238));
        txtPaquetesEnviados.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtPaquetesEnviados.setForeground(new java.awt.Color(34, 34, 59));
        txtPaquetesEnviados.setBorder(null);
        jPanel1.add(txtPaquetesEnviados, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 160, 20));

        btnActualizar.setBackground(new java.awt.Color(38, 70, 83));
        btnActualizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(241, 250, 238));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 100, 30));

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

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ordenarRegiones();
        ordenarUsuarios();
        cargarListaRegiones();
        cargarListaUsuarios();
        cargarCamposDeTexto();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIngresosTotales;
    private javax.swing.JLabel lblIngresosTotales1;
    private javax.swing.JLabel lblRegionesConMasEnvios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioMasEnvios;
    private javax.swing.JTable tblRegionesMasEnviadas;
    private javax.swing.JTable tblUsuariosMasEnvios;
    private javax.swing.JTextField txtIngresosTotales;
    private javax.swing.JTextField txtPaquetesEnviados;
    // End of variables declaration//GEN-END:variables
}
