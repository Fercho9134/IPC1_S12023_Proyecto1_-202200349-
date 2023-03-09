/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Datos.AlmacenamientoDeDatos;
import Datos.GeneracionDeFacturas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.Usuario;

/**
 *
 * @author Fernando
 */
public class EnviosSolicitados extends javax.swing.JPanel {

    /**
     * Creates new form EnviosSolicitados
     */
    public EnviosSolicitados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnGuardarFactura = new javax.swing.JButton();
        btnGuardarGuia = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(740, 480));

        jPanel1.setBackground(new java.awt.Color(241, 250, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(37, 36, 34));
        lblTitulo.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(38, 70, 83));
        lblTitulo.setText("Envíos solicitados");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(241, 250, 238));
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 59));

        tblPedidos.setBackground(new java.awt.Color(237, 237, 233));
        tblPedidos.setForeground(new java.awt.Color(34, 34, 59));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblPedidos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 660, 330));

        btnGuardarFactura.setBackground(new java.awt.Color(241, 250, 238));
        btnGuardarFactura.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnGuardarFactura.setForeground(new java.awt.Color(34, 34, 59));
        btnGuardarFactura.setText("Guardar Factura");
        btnGuardarFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnGuardarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 110, 30));

        btnGuardarGuia.setBackground(new java.awt.Color(241, 250, 238));
        btnGuardarGuia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnGuardarGuia.setForeground(new java.awt.Color(34, 34, 59));
        btnGuardarGuia.setText("Guardar Guia");
        btnGuardarGuia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnGuardarGuia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGuiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 110, 30));

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
    GeneracionDeFacturas generar = new GeneracionDeFacturas();
    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        if (!devolverCodigoPaquete().isEmpty()) {

            for (Pedido pedido : usuario.getPedidos()) {
                if (pedido.getCodigoPaquete().equals(devolverCodigoPaquete())) {
                    generar.generarFactura(Integer.toString(pedido.getNumeroFactura()), pedido.getFecha(), pedido.getCodigoPaquete(),
                            pedido.getNit(), pedido.getNombre(), pedido.getTipoDePago(), pedido.getRegionOrigen(),
                            pedido.getDepartamentoOrigen(), pedido.getMunicipioOrigen(), pedido.getRegionDestino(),
                            pedido.getDepartamentoDestino(), pedido.getMunicipioDestino(), Integer.toString(pedido.getPesoPaquete()),
                            Integer.toString(pedido.getCantidadPaquete()), Double.toString(pedido.getTotal()), pedido.getDireccionOrigen(),
                            pedido.getDireccionDestino());
                    
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el envio de la lista del cual desea imprimir la factura");
        }
    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void btnGuardarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGuiaActionPerformed
        if(!devolverCodigoPaquete().isEmpty()){
        
            for (Pedido pedido : usuario.getPedidos()) {
                if (pedido.getCodigoPaquete().equals(devolverCodigoPaquete())) {
                    generar.generarGuia(pedido.getFecha(), pedido.getCodigoPaquete(), pedido.getTipoDePago(), pedido.getRegionOrigen(), pedido.getDepartamentoOrigen(), pedido.getMunicipioOrigen(), pedido.getRegionDestino(), pedido.getDepartamentoDestino(), pedido.getMunicipioDestino(), Integer.toString(pedido.getPesoPaquete()), Integer.toString(pedido.getCantidadPaquete()), Double.toString(pedido.getTotal()), pedido.getDireccionOrigen(), pedido.getDireccionDestino());
                    
                    break;
                }
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione el envio de la lista del cual desea imprimir la guía de rastreo");
        }
    }//GEN-LAST:event_btnGuardarGuiaActionPerformed

    Usuario usuario = null;
    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();

    void obtenerUsuario() {
        for (Usuario usuario : datos.usuarios) {
            if (usuario.getCodigo() == datos.codigoUsuarioActual) {
                this.usuario = usuario;
            }
        }
    }

    public void rellenarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero de factura");
        modelo.addColumn("Codigo del paquete");
        modelo.addColumn("Departamento de origen");
        modelo.addColumn("Departamento de destino");
        modelo.addColumn("Tipo de pago");
        modelo.addColumn("Total");

        for (Pedido pedido : usuario.getPedidos()) {

            Object[] fila = {pedido.getNumeroFactura(), pedido.getCodigoPaquete(), pedido.getDepartamentoOrigen(), pedido.getDepartamentoDestino(), pedido.getTipoDePago(), pedido.getTotal()};
            modelo.addRow(fila);

        }

        tblPedidos.setModel(modelo);

    }

    String devolverCodigoPaquete() {
        String codigoPaquete = "";
        
        int fila = tblPedidos.getSelectedRow();
        
        if(fila > -1){
        codigoPaquete = tblPedidos.getValueAt(fila, 1).toString();
        }
        return codigoPaquete;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JButton btnGuardarGuia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
