package vista;

import Datos.AlmacenamientoDeDatos;
import Datos.GeneracionDeFacturas;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import modelo.Datos;
import modelo.Departamento;
import modelo.Municipio;
import modelo.Pedido;
import modelo.Region;
import modelo.Tarjeta;
import modelo.Usuario;

/**
 *
 * @author Fernando
 */
public class Cotizacion extends javax.swing.JPanel {

    /**
     * Creates new form Cotizacion
     */
    public Cotizacion() {
        initComponents();
    }

    AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
    Usuario usuario;
    Region regionOrigen = null;
    Region regionDestino = null;
    double precioEstandar;
    double precioEspecial;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeServicio = new javax.swing.ButtonGroup();
        tipoDePago = new javax.swing.ButtonGroup();
        container = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        lblDepartamentoOrigen = new javax.swing.JLabel();
        lstDepartamentosOr = new javax.swing.JComboBox<>();
        lblDatosFacturacion = new javax.swing.JLabel();
        lstMunicipiosOr = new javax.swing.JComboBox<>();
        lblMunicipioOrigen1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDirecciónOrigen = new javax.swing.JTextArea();
        lblOrigen1 = new javax.swing.JLabel();
        lblDepartamentoDestino = new javax.swing.JLabel();
        lstTarjetas = new javax.swing.JComboBox<>();
        lblMunicipioDestino = new javax.swing.JLabel();
        lstDatosFacturacion = new javax.swing.JComboBox<>();
        lblDirecciónDestino = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDirecciónDest = new javax.swing.JTextArea();
        lblServicioEspecial = new javax.swing.JLabel();
        txtPeso = new javax.swing.JSpinner();
        lblCantidad = new javax.swing.JLabel();
        btnGuardarGuia = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblNit = new javax.swing.JLabel();
        lblQ1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtServicioEspecial = new javax.swing.JTextField();
        lblQ2 = new javax.swing.JLabel();
        btnEspecial = new javax.swing.JRadioButton();
        btnEstandar = new javax.swing.JRadioButton();
        btnPagoConTarjeta = new javax.swing.JRadioButton();
        btnPagoContraEntrega = new javax.swing.JRadioButton();
        lstDepartamentosDest = new javax.swing.JComboBox<>();
        lblTipoDePago = new javax.swing.JLabel();
        lstMunicipiosDest = new javax.swing.JComboBox<>();
        lblDirecciónOrigen3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnCotizar = new javax.swing.JButton();
        lblServicioEstandar = new javax.swing.JLabel();
        txtServicioEstandar = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnGuardarFactura = new javax.swing.JButton();
        lblCantidad1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnCancelarCotizacion = new javax.swing.JButton();
        lblCantidad2 = new javax.swing.JLabel();
        lblPrecioEstandar = new javax.swing.JLabel();
        lblCantidad4 = new javax.swing.JLabel();
        lblPrecioEspacial = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        btnGuardarCotizacion = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(740, 480));

        container.setBackground(new java.awt.Color(241, 250, 238));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrigen.setBackground(new java.awt.Color(34, 34, 59));
        lblOrigen.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(34, 34, 59));
        lblOrigen.setText("Origen");
        container.add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblDepartamentoOrigen.setBackground(new java.awt.Color(34, 34, 59));
        lblDepartamentoOrigen.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDepartamentoOrigen.setForeground(new java.awt.Color(34, 34, 59));
        lblDepartamentoOrigen.setText("Departamento");
        container.add(lblDepartamentoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lstDepartamentosOr.setBackground(new java.awt.Color(241, 250, 238));
        lstDepartamentosOr.setForeground(new java.awt.Color(34, 34, 59));
        lstDepartamentosOr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstDepartamentosOrItemStateChanged(evt);
            }
        });
        container.add(lstDepartamentosOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        lblDatosFacturacion.setBackground(new java.awt.Color(34, 34, 59));
        lblDatosFacturacion.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblDatosFacturacion.setForeground(new java.awt.Color(34, 34, 59));
        lblDatosFacturacion.setText("Datos de facturación:");
        container.add(lblDatosFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        lstMunicipiosOr.setBackground(new java.awt.Color(241, 250, 238));
        lstMunicipiosOr.setForeground(new java.awt.Color(34, 34, 59));
        container.add(lstMunicipiosOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        lblMunicipioOrigen1.setBackground(new java.awt.Color(34, 34, 59));
        lblMunicipioOrigen1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblMunicipioOrigen1.setForeground(new java.awt.Color(34, 34, 59));
        lblMunicipioOrigen1.setText("Municipio");
        container.add(lblMunicipioOrigen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(70, 240));

        txtDirecciónOrigen.setBackground(new java.awt.Color(241, 250, 238));
        txtDirecciónOrigen.setColumns(20);
        txtDirecciónOrigen.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDirecciónOrigen.setForeground(new java.awt.Color(34, 34, 59));
        txtDirecciónOrigen.setLineWrap(true);
        txtDirecciónOrigen.setRows(5);
        jScrollPane1.setViewportView(txtDirecciónOrigen);

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 50));

        lblOrigen1.setBackground(new java.awt.Color(34, 34, 59));
        lblOrigen1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblOrigen1.setForeground(new java.awt.Color(34, 34, 59));
        lblOrigen1.setText("Destino");
        container.add(lblOrigen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblDepartamentoDestino.setBackground(new java.awt.Color(34, 34, 59));
        lblDepartamentoDestino.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDepartamentoDestino.setForeground(new java.awt.Color(34, 34, 59));
        lblDepartamentoDestino.setText("Departamento");
        container.add(lblDepartamentoDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lstTarjetas.setBackground(new java.awt.Color(241, 250, 238));
        lstTarjetas.setEnabled(false);
        container.add(lstTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, -1));

        lblMunicipioDestino.setBackground(new java.awt.Color(34, 34, 59));
        lblMunicipioDestino.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblMunicipioDestino.setForeground(new java.awt.Color(34, 34, 59));
        lblMunicipioDestino.setText("Municipio");
        container.add(lblMunicipioDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lstDatosFacturacion.setBackground(new java.awt.Color(241, 250, 238));
        lstDatosFacturacion.setForeground(new java.awt.Color(34, 34, 59));
        lstDatosFacturacion.setEnabled(false);
        lstDatosFacturacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstDatosFacturacionItemStateChanged(evt);
            }
        });
        container.add(lstDatosFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 110, -1));

        lblDirecciónDestino.setBackground(new java.awt.Color(34, 34, 59));
        lblDirecciónDestino.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDirecciónDestino.setForeground(new java.awt.Color(34, 34, 59));
        lblDirecciónDestino.setText("Dirección exacta");
        container.add(lblDirecciónDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(70, 240));

        txtDirecciónDest.setBackground(new java.awt.Color(241, 250, 238));
        txtDirecciónDest.setColumns(20);
        txtDirecciónDest.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDirecciónDest.setForeground(new java.awt.Color(34, 34, 59));
        txtDirecciónDest.setLineWrap(true);
        txtDirecciónDest.setRows(5);
        jScrollPane2.setViewportView(txtDirecciónDest);

        container.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 50));

        lblServicioEspecial.setBackground(new java.awt.Color(34, 34, 59));
        lblServicioEspecial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblServicioEspecial.setForeground(new java.awt.Color(34, 34, 59));
        lblServicioEspecial.setText("Servicio Especial");
        container.add(lblServicioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        txtPeso.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtPeso.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        container.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, -1));

        lblCantidad.setBackground(new java.awt.Color(34, 34, 59));
        lblCantidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(34, 34, 59));
        lblCantidad.setText("Precio base especial:");
        container.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        btnGuardarGuia.setBackground(new java.awt.Color(241, 250, 238));
        btnGuardarGuia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnGuardarGuia.setForeground(new java.awt.Color(34, 34, 59));
        btnGuardarGuia.setText("Guardar Guia");
        btnGuardarGuia.setBorder(null);
        btnGuardarGuia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarGuia.setEnabled(false);
        btnGuardarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGuiaActionPerformed(evt);
            }
        });
        container.add(btnGuardarGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(34, 34, 59));
        jSeparator1.setForeground(new java.awt.Color(34, 34, 59));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        container.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 10, 440));

        lblNit.setBackground(new java.awt.Color(34, 34, 59));
        lblNit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNit.setForeground(new java.awt.Color(34, 34, 59));
        lblNit.setText("Nit:");
        container.add(lblNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        lblQ1.setBackground(new java.awt.Color(34, 34, 59));
        lblQ1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblQ1.setForeground(new java.awt.Color(34, 34, 59));
        lblQ1.setText("Q");
        container.add(lblQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        txtNit.setEditable(false);
        txtNit.setBackground(new java.awt.Color(241, 250, 238));
        txtNit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNit.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 180, -1));

        lblTotal.setBackground(new java.awt.Color(34, 34, 59));
        lblTotal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(34, 34, 59));
        lblTotal.setText("Total:");
        container.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        txtServicioEspecial.setEditable(false);
        txtServicioEspecial.setBackground(new java.awt.Color(241, 250, 238));
        txtServicioEspecial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtServicioEspecial.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtServicioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 70, -1));

        lblQ2.setBackground(new java.awt.Color(34, 34, 59));
        lblQ2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblQ2.setForeground(new java.awt.Color(34, 34, 59));
        lblQ2.setText("Q");
        container.add(lblQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        btnEspecial.setBackground(new java.awt.Color(241, 250, 238));
        tipoDeServicio.add(btnEspecial);
        btnEspecial.setEnabled(false);
        btnEspecial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnEspecialItemStateChanged(evt);
            }
        });
        container.add(btnEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        btnEstandar.setBackground(new java.awt.Color(241, 250, 238));
        tipoDeServicio.add(btnEstandar);
        btnEstandar.setSelected(true);
        btnEstandar.setEnabled(false);
        btnEstandar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnEstandarItemStateChanged(evt);
            }
        });
        container.add(btnEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        btnPagoConTarjeta.setBackground(new java.awt.Color(241, 250, 238));
        tipoDePago.add(btnPagoConTarjeta);
        btnPagoConTarjeta.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnPagoConTarjeta.setForeground(new java.awt.Color(34, 34, 59));
        btnPagoConTarjeta.setText("Pago con tarjeta");
        btnPagoConTarjeta.setEnabled(false);
        btnPagoConTarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnPagoConTarjetaItemStateChanged(evt);
            }
        });
        container.add(btnPagoConTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        btnPagoContraEntrega.setBackground(new java.awt.Color(241, 250, 238));
        tipoDePago.add(btnPagoContraEntrega);
        btnPagoContraEntrega.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnPagoContraEntrega.setForeground(new java.awt.Color(34, 34, 59));
        btnPagoContraEntrega.setSelected(true);
        btnPagoContraEntrega.setText("Pago contra entrega ( + Q5.00)");
        btnPagoContraEntrega.setEnabled(false);
        btnPagoContraEntrega.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnPagoContraEntregaItemStateChanged(evt);
            }
        });
        container.add(btnPagoContraEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        lstDepartamentosDest.setBackground(new java.awt.Color(241, 250, 238));
        lstDepartamentosDest.setForeground(new java.awt.Color(34, 34, 59));
        lstDepartamentosDest.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstDepartamentosDestItemStateChanged(evt);
            }
        });
        container.add(lstDepartamentosDest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 110, -1));

        lblTipoDePago.setBackground(new java.awt.Color(34, 34, 59));
        lblTipoDePago.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblTipoDePago.setForeground(new java.awt.Color(34, 34, 59));
        lblTipoDePago.setText("Tipo de pago");
        container.add(lblTipoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        lstMunicipiosDest.setBackground(new java.awt.Color(241, 250, 238));
        lstMunicipiosDest.setForeground(new java.awt.Color(34, 34, 59));
        container.add(lstMunicipiosDest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 110, -1));

        lblDirecciónOrigen3.setBackground(new java.awt.Color(34, 34, 59));
        lblDirecciónOrigen3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDirecciónOrigen3.setForeground(new java.awt.Color(34, 34, 59));
        lblDirecciónOrigen3.setText("Dirección exacta");
        container.add(lblDirecciónOrigen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblNombre.setBackground(new java.awt.Color(34, 34, 59));
        lblNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(34, 34, 59));
        lblNombre.setText("Nombre;");
        container.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        lblDireccion.setBackground(new java.awt.Color(34, 34, 59));
        lblDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(34, 34, 59));
        lblDireccion.setText("Dirección:");
        container.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(241, 250, 238));
        txtTotal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 70, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(241, 250, 238));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 180, -1));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(241, 250, 238));
        txtDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 180, -1));

        btnCotizar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(34, 34, 59));
        btnCotizar.setText("Cotizar");
        btnCotizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnCotizar.setContentAreaFilled(false);
        btnCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        container.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 80, 30));

        lblServicioEstandar.setBackground(new java.awt.Color(34, 34, 59));
        lblServicioEstandar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblServicioEstandar.setForeground(new java.awt.Color(34, 34, 59));
        lblServicioEstandar.setText("Servicio Estandar");
        container.add(lblServicioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        txtServicioEstandar.setEditable(false);
        txtServicioEstandar.setBackground(new java.awt.Color(241, 250, 238));
        txtServicioEstandar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtServicioEstandar.setForeground(new java.awt.Color(34, 34, 59));
        container.add(txtServicioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 70, -1));

        btnPagar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(34, 34, 59));
        btnPagar.setText("Realizar Pago");
        btnPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnPagar.setContentAreaFilled(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        container.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 110, 30));

        btnGuardarFactura.setBackground(new java.awt.Color(241, 250, 238));
        btnGuardarFactura.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnGuardarFactura.setForeground(new java.awt.Color(34, 34, 59));
        btnGuardarFactura.setText("Guardar Factura");
        btnGuardarFactura.setBorder(null);
        btnGuardarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarFactura.setEnabled(false);
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });
        container.add(btnGuardarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 110, 30));

        lblCantidad1.setBackground(new java.awt.Color(34, 34, 59));
        lblCantidad1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCantidad1.setForeground(new java.awt.Color(34, 34, 59));
        lblCantidad1.setText("Cantidad de paquetes:");
        container.add(lblCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        container.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, -1));

        btnCancelarCotizacion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCancelarCotizacion.setForeground(new java.awt.Color(34, 34, 59));
        btnCancelarCotizacion.setText("Modificar");
        btnCancelarCotizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnCancelarCotizacion.setContentAreaFilled(false);
        btnCancelarCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCotizacionActionPerformed(evt);
            }
        });
        container.add(btnCancelarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 80, 30));

        lblCantidad2.setBackground(new java.awt.Color(34, 34, 59));
        lblCantidad2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCantidad2.setForeground(new java.awt.Color(34, 34, 59));
        lblCantidad2.setText("Peso del paquete (lbs):");
        container.add(lblCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        lblPrecioEstandar.setBackground(new java.awt.Color(34, 34, 59));
        lblPrecioEstandar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblPrecioEstandar.setForeground(new java.awt.Color(34, 34, 59));
        container.add(lblPrecioEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, 20));

        lblCantidad4.setBackground(new java.awt.Color(34, 34, 59));
        lblCantidad4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblCantidad4.setForeground(new java.awt.Color(34, 34, 59));
        lblCantidad4.setText("Precio base estandar:");
        container.add(lblCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        lblPrecioEspacial.setBackground(new java.awt.Color(34, 34, 59));
        lblPrecioEspacial.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblPrecioEspacial.setForeground(new java.awt.Color(34, 34, 59));
        container.add(lblPrecioEspacial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 110, 20));

        txtCVV.setBackground(new java.awt.Color(241, 250, 238));
        txtCVV.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(34, 34, 59));
        txtCVV.setText("CVV");
        txtCVV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCVVFocusGained(evt);
            }
        });
        container.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 70, -1));

        btnGuardarCotizacion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnGuardarCotizacion.setForeground(new java.awt.Color(34, 34, 59));
        btnGuardarCotizacion.setText("Guardar cotizacion");
        btnGuardarCotizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 59)));
        btnGuardarCotizacion.setContentAreaFilled(false);
        btnGuardarCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCotizacionActionPerformed(evt);
            }
        });
        container.add(btnGuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lstDepartamentosOrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstDepartamentosOrItemStateChanged
        String nombreDepartamento = "";
        String codigoRegionOrigen = "";
        if (lstDepartamentosOr.getSelectedItem() != null) {
            nombreDepartamento = lstDepartamentosOr.getSelectedItem().toString();
        }
        String codigoDepartamentoOrigen = "";
        lstMunicipiosOr.removeAllItems();

        for (Departamento departamento : datos.departamentos) {

            if (departamento.getNombreDepartamento().equals(nombreDepartamento)) {
                codigoRegionOrigen = departamento.getCodigoRegion();
                codigoDepartamentoOrigen = departamento.getCodigoDepartamento();
                break;
            }

        }

        for (Region region : datos.regiones) {
            if (region.getCodigoRegion().equals(codigoRegionOrigen)) {
                this.regionOrigen = region;
                break;
            }
        }

        for (Municipio municipio : datos.municipios) {

            if (municipio.getCodigoDepartamento().equals(codigoDepartamentoOrigen)) {
                lstMunicipiosOr.addItem(municipio.getNombreMunicipio());
            }

        }

        boolean municipiosExistencia = lstMunicipiosOr.getItemCount() != 0;

        if (municipiosExistencia == true) {
            lstMunicipiosOr.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_lstDepartamentosOrItemStateChanged

    private void lstDepartamentosDestItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstDepartamentosDestItemStateChanged
        String nombreDepartamento = "";
        String codigoRegionDestino = "";
        if (lstDepartamentosDest.getSelectedItem() != null) {
            nombreDepartamento = lstDepartamentosDest.getSelectedItem().toString();
        }
        String codigoDepartamentoDest = "";
        lstMunicipiosDest.removeAllItems();
        String codigoRegion = "";

        for (Departamento departamento : datos.departamentos) {

            if (departamento.getNombreDepartamento().equals(nombreDepartamento)) {
                codigoRegionDestino = departamento.getCodigoRegion();
                codigoDepartamentoDest = departamento.getCodigoDepartamento();
                codigoRegion = departamento.getCodigoRegion();
                break;
            }

        }

        for (Region region : datos.regiones) {
            if (region.getCodigoRegion().equals(codigoRegion)) {
                this.precioEstandar = region.getPrecioEstandar();
                this.precioEspecial = region.getPrecioEspecial();
                this.regionDestino = region;
                lblPrecioEstandar.setText(Double.toString(precioEstandar));
                lblPrecioEspacial.setText(Double.toString(precioEspecial));
                break;
            }
        }

        for (Municipio municipio : datos.municipios) {

            if (municipio.getCodigoDepartamento().equals(codigoDepartamentoDest)) {
                lstMunicipiosDest.addItem(municipio.getNombreMunicipio());
            }

        }

        boolean municipiosExistencia = lstMunicipiosDest.getItemCount() != 0;

        if (municipiosExistencia == true) {
            lstMunicipiosDest.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_lstDepartamentosDestItemStateChanged

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        double servicioEstandar = 0;
        double servicioEspecial = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        if (verificarCotizacion()) {
            deshabilitarCotizacion();
            btnCotizar.setVisible(false);
            btnCancelarCotizacion.setVisible(true);
            btnGuardarCotizacion.setVisible(true);

            servicioEstandar = (Double.parseDouble(lblPrecioEstandar.getText()) * Integer.parseInt(txtCantidad.getValue().toString()) * Integer.parseInt(txtPeso.getValue().toString()));
            servicioEspecial = (Double.parseDouble(lblPrecioEspacial.getText()) * Integer.parseInt(txtCantidad.getValue().toString()) * Integer.parseInt(txtPeso.getValue().toString()));

            double servicioEstandarRed = Double.valueOf(df.format(servicioEstandar));
            double servicioEspecialRed = Double.valueOf(df.format(servicioEspecial));

            txtServicioEstandar.setText(Double.toString(servicioEstandarRed));
            txtServicioEspecial.setText(Double.toString(servicioEspecialRed));

            if (btnEstandar.isSelected() && btnPagoContraEntrega.isSelected()) {
                txtTotal.setText(Double.toString(servicioEstandarRed + 5));

            } else if (btnEstandar.isSelected() && btnPagoConTarjeta.isSelected()) {
                txtTotal.setText(Double.toString(servicioEstandarRed));

            } else if (btnEspecial.isSelected() && btnPagoContraEntrega.isSelected()) {
                txtTotal.setText(Double.toString(servicioEspecialRed + 5));

            } else {
                txtTotal.setText(Double.toString(servicioEspecialRed));
            }

            habilitarPago();

        } else {
            JOptionPane.showMessageDialog(null, "Asegurese de que todos los campos contengan información");
        }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void btnCancelarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCotizacionActionPerformed
        txtServicioEstandar.setText("");
        txtServicioEspecial.setText("");
        txtTotal.setText("");
        inhabiliarPago();
        lstTarjetas.setEnabled(false);
        habilitarCotizacion();
        btnCancelarCotizacion.setVisible(false);
        btnGuardarCotizacion.setVisible(false);
        btnCotizar.setVisible(true);
    }//GEN-LAST:event_btnCancelarCotizacionActionPerformed

    private void btnEstandarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnEstandarItemStateChanged
        actualizarTotal();
    }//GEN-LAST:event_btnEstandarItemStateChanged

    private void btnEspecialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnEspecialItemStateChanged
        actualizarTotal();
    }//GEN-LAST:event_btnEspecialItemStateChanged

    private void btnPagoContraEntregaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnPagoContraEntregaItemStateChanged
        actualizarTotal();
        lstTarjetas.setEnabled(false);
        txtCVV.setEnabled(false);
        txtCVV.setText("CVV");
    }//GEN-LAST:event_btnPagoContraEntregaItemStateChanged

    private void btnPagoConTarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnPagoConTarjetaItemStateChanged
        actualizarTotal();
        lstTarjetas.setEnabled(true);
        txtCVV.setText("");
        txtCVV.setEnabled(true);
    }//GEN-LAST:event_btnPagoConTarjetaItemStateChanged

    private void lstDatosFacturacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstDatosFacturacionItemStateChanged
        String nit = "";
        if (lstDatosFacturacion.getSelectedItem() != null) {
            nit = lstDatosFacturacion.getSelectedItem().toString();
        }

        for (Datos datos : usuario.getDatos()) {
            if (datos.getNit().equals(nit)) {
                txtNit.setText(nit);
                txtNombre.setText(datos.getNombre());
                txtDireccion.setText(datos.getDireccion());
                break;
            }
        }
    }//GEN-LAST:event_lstDatosFacturacionItemStateChanged
    String codigoPaquete;
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (verificarCamposPago()) {
            deshabilitarCotizacion();
            inhabiliarPago();
            btnCancelarCotizacion.setEnabled(false);
            btnGuardarCotizacion.setEnabled(false);
            lstTarjetas.setEnabled(false);
            btnGuardarFactura.setEnabled(true);
            btnGuardarGuia.setEnabled(true);

            int numeroFactura = datos.numeroFactura;
            this.codigoPaquete = generarGuia();
            String nombreRegionOrigen = regionOrigen.getNombreRegion();
            String departamentoOrigen = lstDepartamentosOr.getSelectedItem().toString();
            String municipioOrigen = lstMunicipiosOr.getSelectedItem().toString();
            String nombreRegionDestino = regionDestino.getNombreRegion();
            String departamentoDestino = lstDepartamentosDest.getSelectedItem().toString();
            String municipioDestino = lstMunicipiosDest.getSelectedItem().toString();
            String nit = txtNit.getText();
            String tipoDePago = "";
            String fecha = obtenerFecha();
            String nombre = txtNombre.getText();

            if (btnPagoContraEntrega.isSelected()) {
                tipoDePago = "Pago contra entrega";
            } else {
                tipoDePago = "Pago con tarjeta";
            }

            int pesoPaquete = Integer.parseInt(txtPeso.getValue().toString());
            int cantidadPaquetes = Integer.parseInt(txtCantidad.getValue().toString());
            double total = Double.parseDouble(txtTotal.getText());

            String direccionOrigen = txtDirecciónOrigen.getText();
            String direccionDestino = txtDirecciónDest.getText();

            usuario.setPaquetesEnviados(usuario.getPaquetesEnviados() + cantidadPaquetes);
            usuario.setTotalVendido(usuario.getTotalVendido() + total);
            regionOrigen.setCantidadEnvios(regionOrigen.getCantidadEnvios() + cantidadPaquetes);
            regionOrigen.setTotalVendido(regionOrigen.getTotalVendido() + total);
            datos.ingresosTotales = datos.ingresosTotales + total;
            datos.paquetesEnviados = datos.paquetesEnviados + cantidadPaquetes;

            Pedido pedidoNuevo = new Pedido(numeroFactura, codigoPaquete, nombreRegionOrigen, departamentoOrigen, municipioOrigen, direccionOrigen, nombreRegionDestino, departamentoDestino, municipioDestino, direccionDestino, nit, nombre, tipoDePago, pesoPaquete, cantidadPaquetes, total, fecha);
            usuario.setPedidos(pedidoNuevo);
            //Final
            datos.numeroFactura++;

            JOptionPane.showMessageDialog(
                    null, "Envío generado exitosamente");

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar datos de facturacion de la lista y si seleccionó pago con tarjeta debe seleccionar una tarjeta\nde su cartera e ingresar el codigo CVV de la misma");
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtCVVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCVVFocusGained
        txtCVV.setText("");
    }//GEN-LAST:event_txtCVVFocusGained

    GeneracionDeFacturas generar = new GeneracionDeFacturas();
    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        String numeroFactura = Integer.toString(datos.numeroFactura - 1);
        String nombreRegionOrigen = regionOrigen.getNombreRegion();
        String departamentoOrigen = lstDepartamentosOr.getSelectedItem().toString();
        String municipioOrigen = lstMunicipiosOr.getSelectedItem().toString();
        String nombreRegionDestino = regionDestino.getNombreRegion();
        String departamentoDestino = lstDepartamentosDest.getSelectedItem().toString();
        String municipioDestino = lstMunicipiosDest.getSelectedItem().toString();
        String nit = txtNit.getText();
        String tipoDePago = "";
        String direccionOrigen = txtDirecciónOrigen.getText();
        String direccionDestino = txtDirecciónDest.getText();
        String fecha = obtenerFecha();
        int pesoPaquete = Integer.parseInt(txtPeso.getValue().toString());
        int cantidadPaquetes = Integer.parseInt(txtCantidad.getValue().toString());
        double total = Double.parseDouble(txtTotal.getText());

        if (btnPagoContraEntrega.isSelected()) {
            tipoDePago = "Pago contra entrega";
        } else {
            tipoDePago = "Pago con tarjeta";
        }

        generar.generarFactura(numeroFactura, fecha, codigoPaquete, nit, txtNombre.getText(), tipoDePago, nombreRegionOrigen, departamentoOrigen, municipioOrigen, nombreRegionDestino, departamentoDestino, municipioDestino, Integer.toString(pesoPaquete), Integer.toString(cantidadPaquetes), Double.toString(total), direccionOrigen, direccionDestino);
    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void btnGuardarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGuiaActionPerformed

        String nombreRegionOrigen = regionOrigen.getNombreRegion();
        String departamentoOrigen = lstDepartamentosOr.getSelectedItem().toString();
        String municipioOrigen = lstMunicipiosOr.getSelectedItem().toString();
        String nombreRegionDestino = regionDestino.getNombreRegion();
        String departamentoDestino = lstDepartamentosDest.getSelectedItem().toString();
        String municipioDestino = lstMunicipiosDest.getSelectedItem().toString();
        String tipoDePago = "";
        String direccionOrigen = txtDirecciónOrigen.getText();
        String direccionDestino = txtDirecciónDest.getText();
        String fecha = obtenerFecha();
        int pesoPaquete = Integer.parseInt(txtPeso.getValue().toString());
        int cantidadPaquetes = Integer.parseInt(txtCantidad.getValue().toString());
        double total = Double.parseDouble(txtTotal.getText());

        if (btnPagoContraEntrega.isSelected()) {
            tipoDePago = "Pago contra entrega";
        } else {
            tipoDePago = "Pago con tarjeta";
        }

        generar.generarGuia(fecha, codigoPaquete, tipoDePago, nombreRegionOrigen, departamentoOrigen, municipioOrigen, nombreRegionDestino, departamentoDestino, municipioDestino, Integer.toString(pesoPaquete), Integer.toString(cantidadPaquetes), Double.toString(total), direccionOrigen, direccionDestino);
    }//GEN-LAST:event_btnGuardarGuiaActionPerformed

    private void btnGuardarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCotizacionActionPerformed
        String departamentoOrigen = lstDepartamentosOr.getSelectedItem().toString();
        String municipioOrigen = lstMunicipiosOr.getSelectedItem().toString();
        String departamentoDestino = lstDepartamentosDest.getSelectedItem().toString();
        String municipioDestino = lstMunicipiosDest.getSelectedItem().toString();
        String direccionOrigen = txtDirecciónOrigen.getText();
        String direccionDestino = txtDirecciónDest.getText();
        int pesoPaquete = Integer.parseInt(txtPeso.getValue().toString());
        int cantidadPaquetes = Integer.parseInt(txtCantidad.getValue().toString());
        double totalEstandar = Double.parseDouble(txtServicioEstandar.getText());
        double totalEspecial = Double.parseDouble(txtServicioEspecial.getText());
        
        generar.generarCotizacion(departamentoOrigen, municipioOrigen, direccionOrigen, departamentoDestino, municipioDestino, direccionDestino, Integer.toString(cantidadPaquetes), Integer.toString(pesoPaquete), Double.toString(totalEstandar), Double.toString(totalEspecial));
    }//GEN-LAST:event_btnGuardarCotizacionActionPerformed

    String obtenerFecha() {
        String unido;
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        String anio = Integer.toString(c.get(Calendar.YEAR));
        unido = dia + "/" + (mes) + "/" + anio;
        return unido;
    }

    void actualizarTotal() {
        double servicioEstandar = Double.parseDouble(txtServicioEstandar.getText());
        double servicioEspecial = Double.parseDouble(txtServicioEspecial.getText());

        if (btnEstandar.isSelected() && btnPagoContraEntrega.isSelected()) {
            txtTotal.setText(Double.toString(servicioEstandar + 5));

        } else if (btnEstandar.isSelected() && btnPagoConTarjeta.isSelected()) {
            txtTotal.setText(Double.toString(servicioEstandar));

        } else if (btnEspecial.isSelected() && btnPagoContraEntrega.isSelected()) {
            txtTotal.setText(Double.toString(servicioEspecial + 5));

        } else {
            txtTotal.setText(Double.toString(servicioEspecial));
        }
    }

    boolean verificarCotizacion() {
        if (lstDepartamentosOr.getSelectedItem() != null && lstDepartamentosDest.getSelectedItem() != null && lstMunicipiosDest.getSelectedItem() != null
                && lstMunicipiosOr.getSelectedItem() != null && !(txtDirecciónDest.getText()).isEmpty() && !(txtDirecciónOrigen.getText()).isEmpty()) {
            return true;
        }
        return false;
    }

    boolean verificarCamposPago() {
        boolean respuesta = false;
        if (lstDatosFacturacion.getSelectedItem() != null) {
            if (btnPagoConTarjeta.isSelected()) {
                if (lstTarjetas.getSelectedItem() != null && !(txtCVV.getText()).isEmpty()) {
                    respuesta = true;
                } else {
                    respuesta = false;
                }
            } else {
                respuesta = true;
            }
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    void cargarDepartamentos() {
        btnCancelarCotizacion.setVisible(false);
        btnGuardarCotizacion.setVisible(false);
        boolean departamentosExistencia;
        for (Departamento departamento : datos.departamentos) {
            lstDepartamentosOr.addItem(departamento.getNombreDepartamento());
            lstDepartamentosDest.addItem(departamento.getNombreDepartamento());
        }

        departamentosExistencia = lstDepartamentosDest.getItemCount() != 0;

        if (departamentosExistencia == false) {
            deshabilitarCotizacion();
            JOptionPane.showMessageDialog(null, "No es posible realizar una cotizacion debido a que no hay ningún departamento con cobertura\nComuniquese con el administrador");
        } else {
            habilitarCotizacion();
        }
    }

    void deshabilitarCotizacion() {
        lstDepartamentosDest.setEnabled(false);
        lstDepartamentosOr.setEnabled(false);
        lstMunicipiosDest.setEnabled(false);
        lstMunicipiosOr.setEnabled(false);
        txtDirecciónDest.setEnabled(false);
        txtDirecciónOrigen.setEnabled(false);
        txtPeso.setEnabled(false);
        txtCantidad.setEnabled(false);
        btnCotizar.setEnabled(false);
    }

    void habilitarCotizacion() {
        lstDepartamentosDest.setEnabled(true);
        lstDepartamentosOr.setEnabled(true);
        lstMunicipiosDest.setEnabled(true);
        lstMunicipiosOr.setEnabled(true);
        txtDirecciónDest.setEnabled(true);
        txtDirecciónOrigen.setEnabled(true);
        txtPeso.setEnabled(true);
        txtCantidad.setEnabled(true);
        btnCotizar.setEnabled(true);
    }

    void inhabiliarPago() {
        btnEstandar.setEnabled(false);
        btnEspecial.setEnabled(false);
        btnPagoContraEntrega.setEnabled(false);
        btnPagoConTarjeta.setEnabled(false);
        btnPagar.setEnabled(false);
        lstDatosFacturacion.setEnabled(false);
        txtCVV.setEnabled(false);
    }

    void habilitarPago() {
        btnEstandar.setEnabled(true);
        btnEspecial.setEnabled(true);
        btnPagoContraEntrega.setEnabled(true);
        btnPagoConTarjeta.setEnabled(true);
        btnPagar.setEnabled(true);
        lstDatosFacturacion.setEnabled(true);

        if (btnPagoConTarjeta.isSelected()) {
            lstTarjetas.setEnabled(true);
            txtCVV.setEnabled(true);
        }
    }

    void obtenerUsuario() {
        for (Usuario usuario : datos.usuarios) {
            if (usuario.getCodigo() == datos.codigoUsuarioActual) {
                this.usuario = usuario;
            }
        }
    }

    void cargarDatosFacturacionTarjetas() {
        lstTarjetas.removeAllItems();
        lstDatosFacturacion.removeAllItems();
        for (Tarjeta tarjeta : usuario.getTarjetas()) {

            String numeroCompleto = tarjeta.getNumero();
            int longitudNumero = numeroCompleto.length();
            String ultimosCuatroDigitos = numeroCompleto.substring(longitudNumero - 4);
            String numerosCensurados = "X".repeat(longitudNumero - 4);
            String numeroTarjetaCensurado = numerosCensurados + ultimosCuatroDigitos;
            lstTarjetas.addItem(numeroTarjetaCensurado);
        }

        for (Datos datos : usuario.getDatos()) {
            lstDatosFacturacion.addItem(datos.getNit());
        }
    }

    public String generarGuia() {
        String diccionario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        Random random = new Random();
        String guia = "";
        boolean generar = false;

        do {

            StringBuilder constructor = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                int indice = random.nextInt(diccionario.length());
                char charAleatorio = diccionario.charAt(indice);
                constructor.append(charAleatorio);
            }
            guia = "IPC1C" + constructor.toString();
            for (Usuario usuarios : datos.usuarios) {
                for (Pedido pedido : usuarios.getPedidos()) {
                    if (pedido.getCodigoPaquete().equals(guia)) {
                        generar = true;
                        break;
                    } else {
                        generar = false;
                    }
                }
            }

        } while (generar);

        return guia;
    }

    void estadoInicial() {
        lstDepartamentosDest.removeAllItems();
        lstDepartamentosOr.removeAllItems();
        lstMunicipiosOr.removeAllItems();
        lstMunicipiosDest.removeAllItems();
        txtCantidad.setValue(1);
        txtPeso.setValue(1);
        txtDirecciónDest.setText("");
        txtDirecciónOrigen.setText("");
        lblPrecioEspacial.setText("");
        lblPrecioEstandar.setText("");
        habilitarCotizacion();
        inhabiliarPago();
        txtServicioEstandar.setText("");
        txtServicioEspecial.setText("");
        lstTarjetas.removeAllItems();
        lstDatosFacturacion.removeAllItems();
        txtNombre.setText("");
        txtDireccion.setText("");
        txtNit.setText("");
        btnGuardarFactura.setEnabled(false);
        btnGuardarGuia.setEnabled(false);
        btnCotizar.setVisible(true);
        if (btnPagoContraEntrega.isSelected()) {
            txtCVV.setText("CVV");
        } else {
            txtCVV.setText("");
        }
        txtCVV.setEnabled(false);
        lstTarjetas.setEnabled(false);
        btnCancelarCotizacion.setEnabled(true);
        btnGuardarCotizacion.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCotizacion;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JRadioButton btnEspecial;
    private javax.swing.JRadioButton btnEstandar;
    private javax.swing.JButton btnGuardarCotizacion;
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JButton btnGuardarGuia;
    private javax.swing.JButton btnPagar;
    private javax.swing.JRadioButton btnPagoConTarjeta;
    private javax.swing.JRadioButton btnPagoContraEntrega;
    private javax.swing.JPanel container;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblCantidad2;
    private javax.swing.JLabel lblCantidad4;
    private javax.swing.JLabel lblDatosFacturacion;
    private javax.swing.JLabel lblDepartamentoDestino;
    private javax.swing.JLabel lblDepartamentoOrigen;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDirecciónDestino;
    private javax.swing.JLabel lblDirecciónOrigen3;
    private javax.swing.JLabel lblMunicipioDestino;
    private javax.swing.JLabel lblMunicipioOrigen1;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigen1;
    private javax.swing.JLabel lblPrecioEspacial;
    private javax.swing.JLabel lblPrecioEstandar;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblServicioEspecial;
    private javax.swing.JLabel lblServicioEstandar;
    private javax.swing.JLabel lblTipoDePago;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JComboBox<String> lstDatosFacturacion;
    private javax.swing.JComboBox<String> lstDepartamentosDest;
    private javax.swing.JComboBox<String> lstDepartamentosOr;
    private javax.swing.JComboBox<String> lstMunicipiosDest;
    private javax.swing.JComboBox<String> lstMunicipiosOr;
    private javax.swing.JComboBox<String> lstTarjetas;
    private javax.swing.ButtonGroup tipoDePago;
    private javax.swing.ButtonGroup tipoDeServicio;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtDirecciónDest;
    private javax.swing.JTextArea txtDirecciónOrigen;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPeso;
    private javax.swing.JTextField txtServicioEspecial;
    private javax.swing.JTextField txtServicioEstandar;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
