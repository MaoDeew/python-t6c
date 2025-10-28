package TablaAmortizacion;

//Imports
import Clientes.ClienteSerFin;
import Principal.CalendarioSistema.Fecha;
import Principal.CalendarioSistema.Reloj;
import Principal.InterfazClienteSerFin;
import Principal.VentanaInicial;

//Imports de java
import java.text.NumberFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

//Imports para PDF
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;

public class InterfazInicialPrestamo extends javax.swing.JFrame {

    VentanaInicial vi = new VentanaInicial();
    NumberFormat conMoneda = NumberFormat.getCurrencyInstance();

    DefaultTableModel modelo;
  
    String cedula;
    String ubicacionTablasGeneradas="E:\\Documentos Programacion\\NetBeans\\POO\\SerFin\\src\\TablaAmortizacion\\TablasGuardadas\\";
    int numeroTabla= (int) (Math.random() * (105100-250500) + 250500);

    //Variables calculos
    int ingresos;
    int montoPrestamo;
    int cuotas;
    String modalidadPago;

    public InterfazInicialPrestamo() {
        initComponents();
        //LOGO SerFin
        ImageIcon logo = new ImageIcon("src/logo/logo_serfin.png");
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(icono);
        //
        
        //Fecha y Hora
        iniciarReloj();
        
        //Datos Tabla
        String cabecera[]={"Cuota #","Amortización","Interés","Pago de cada Cuota","Saldo"};
        String datos[][]={};
        modelo= new DefaultTableModel(datos,cabecera);
        tablaAmortizacion.setModel(modelo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbModalidadPago = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonSimulador = new javax.swing.JButton();
        botonGenerarPrestamo = new javax.swing.JButton();
        labelIngresos = new javax.swing.JLabel();
        campoIngresos = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();
        botonMostrarTipoPrestamos = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMontoPrestamo = new javax.swing.JLabel();
        campoMontoPrestamo = new javax.swing.JTextField();
        labelTituloTablaAmortizacion = new javax.swing.JLabel();
        labelTipoPrestamo = new javax.swing.JLabel();
        comboTipoPrestamo = new javax.swing.JComboBox<>();
        labelNumeroAnos = new javax.swing.JLabel();
        spinnerAnos = new javax.swing.JSpinner();
        rbAnual = new javax.swing.JRadioButton();
        rbSemestral = new javax.swing.JRadioButton();
        rbMensual = new javax.swing.JRadioButton();
        labelModalidadPago = new javax.swing.JLabel();
        botonGenerarTabla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelCuotaAmor = new javax.swing.JLabel();
        campoCuotaAmor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAmortizacion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelHora = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitulo.setText("Préstamos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonSimulador.setText("Simulación Amortización");
        botonSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSimuladorActionPerformed(evt);
            }
        });

        botonGenerarPrestamo.setText("Generar Préstamo");
        botonGenerarPrestamo.setVisible(false);
        botonGenerarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarPrestamoActionPerformed(evt);
            }
        });

        labelIngresos.setText("Ingresos Mensuales");

        campoIngresos.setEditable(false);

        botonLimpiar.setText("Limpiar Tabla de Amortización");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonMostrarTipoPrestamos.setText("Mostrar Tipo Préstamos");
        botonMostrarTipoPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTipoPrestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonGenerarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonMostrarTipoPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonSimulador)
                                .addGap(18, 18, 18)
                                .addComponent(botonLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelIngresos)
                                .addGap(18, 18, 18)
                                .addComponent(campoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngresos)
                    .addComponent(campoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSimulador)
                    .addComponent(botonLimpiar))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenerarPrestamo)
                    .addComponent(botonMostrarTipoPrestamos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelLogo.setText("LOGO SERFIN");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMontoPrestamo.setText("Monto Préstamo (Capital)");
        labelMontoPrestamo.setVisible(false);
        jPanel2.add(labelMontoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, -1, -1));

        campoMontoPrestamo.setVisible(false);
        campoMontoPrestamo.setEditable(false);
        jPanel2.add(campoMontoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 44, 136, -1));

        labelTituloTablaAmortizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloTablaAmortizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloTablaAmortizacion.setText("Tabla de Amortización");
        labelTituloTablaAmortizacion.setEnabled(false);
        jPanel2.add(labelTituloTablaAmortizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 633, -1));

        labelTipoPrestamo.setVisible(false);
        labelTipoPrestamo.setText("Tipo Préstamo");
        jPanel2.add(labelTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, -1, -1));

        comboTipoPrestamo.setVisible(false);
        comboTipoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito Libre Inversión (SerFin)", "Credito Vehiculo (SerFin)", "Credito Vivienda (Otra entidad financiera)", "Credito Libre Inversión (Otra entidad financiera)", "Credito Vehiculo (Otra entidad financiera)" }));
        jPanel2.add(comboTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 70, -1, -1));

        labelNumeroAnos.setVisible(false);
        labelNumeroAnos.setText("Número de años");
        jPanel2.add(labelNumeroAnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        spinnerAnos.setVisible(false);
        spinnerAnos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        jPanel2.add(spinnerAnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 103, -1, -1));

        rbAnual.setVisible(false);
        rbModalidadPago.add(rbAnual);
        rbAnual.setText("Anual");
        rbAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnualActionPerformed(evt);
            }
        });
        jPanel2.add(rbAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 55, -1, -1));

        rbSemestral.setVisible(false);
        rbModalidadPago.add(rbSemestral);
        rbSemestral.setText("Semestral");
        rbSemestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSemestralActionPerformed(evt);
            }
        });
        jPanel2.add(rbSemestral, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 78, -1, -1));

        rbMensual.setVisible(false);
        rbModalidadPago.add(rbMensual);
        rbMensual.setText("Mensual");
        rbMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMensualActionPerformed(evt);
            }
        });
        jPanel2.add(rbMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 103, -1, -1));

        labelModalidadPago.setVisible(false);
        labelModalidadPago.setText("Modalidad Pago:");
        jPanel2.add(labelModalidadPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 34, -1, -1));

        botonGenerarTabla.setVisible(false);
        botonGenerarTabla.setText("Generar Tabla");
        botonGenerarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarTablaActionPerformed(evt);
            }
        });
        jPanel2.add(botonGenerarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 115, 31));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCuotaAmor.setVisible(false);
        labelCuotaAmor.setText("Cuota");

        campoCuotaAmor.setVisible(false);
        campoCuotaAmor.setEditable(false);

        tablaAmortizacion.setVisible(false);
        jScrollPane1.setVisible(false);
        tablaAmortizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cuota #", "Amortización", "Interés", "Pago cada Cuota", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAmortizacion.setEnabled(false);
        jScrollPane1.setViewportView(tablaAmortizacion);
        if (tablaAmortizacion.getColumnModel().getColumnCount() > 0) {
            tablaAmortizacion.getColumnModel().getColumn(0).setResizable(false);
            tablaAmortizacion.getColumnModel().getColumn(1).setResizable(false);
            tablaAmortizacion.getColumnModel().getColumn(2).setResizable(false);
            tablaAmortizacion.getColumnModel().getColumn(3).setResizable(false);
            tablaAmortizacion.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCuotaAmor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCuotaAmor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCuotaAmor)
                    .addComponent(campoCuotaAmor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelHora.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("HORA");

        labelFecha.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("FECHA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSimuladorActionPerformed
        // TODO add your handling code here:
        validacionSimulacionPrestamo();
    }//GEN-LAST:event_botonSimuladorActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarPreSimulacion();
        botonGenerarPrestamo.setVisible(false);
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonGenerarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarTablaActionPerformed
        // TODO add your handling code here:
       
       //Seleccion tipo de Pago 
        if(rbAnual.isSelected())
        {
        modalidadPago="Anual";
        cuotas=Integer.parseInt(spinnerAnos.getValue().toString());
        }
        if(rbMensual.isSelected())
        {
        modalidadPago="Mensual";
        cuotas=12*(Integer.parseInt(spinnerAnos.getValue().toString()));
        }
        if(rbSemestral.isSelected())
        {
        modalidadPago="Semestral";
        cuotas=2*(Integer.parseInt(spinnerAnos.getValue().toString()));
        }

        if(rbAnual.isSelected()==false && rbMensual.isSelected()==false && rbSemestral.isSelected()==false)
        {
        JOptionPane.showMessageDialog(null, "No se puede generar la simulacion, Seleccione el tipo de pago"
                + "\n para poder realizar la simulacion de la Tabla.");
        }else{
        
        //Objeto Simulacion
        Simulacion sim = new Simulacion();
        sim.obtenerDatos(montoPrestamo, cuotas, comboTipoPrestamo.getSelectedItem().toString());
        sim.calcularCuotaAmortizacion();
        String cuotaConFormato= conMoneda.format(sim.cuotaTabla);
        
        //Mostrar visible Textfield Cuota
        labelCuotaAmor.setVisible(true);
        campoCuotaAmor.setVisible(true);
        campoCuotaAmor.setText(cuotaConFormato);
        
        //Mostrar Visible la Tabla
        jScrollPane1.setVisible(true);
        tablaAmortizacion.setVisible(true);
        
        //Formato Valor Monto del Prestamo
        String montoPrestamoConFormato=conMoneda.format(montoPrestamo);

        //Fila 1 de la Tabla
        String [] fila1 = {"0","-","-","-",""+montoPrestamoConFormato};
        modelo.addRow(fila1);
        
        //Genera Tabla de Amortización segun #Cuotas
        for(int i=0 ; i<cuotas ; i++){
            //Contador desde 1 hasta #cuotas
            int contador = i+1;
         
            //Cuota==#1
            if(i==0){
            sim.interesCapital=(sim.monto*sim.inte);//Interes Capital desde Monto Prestamo
            sim.amortizacion = sim.cuotaTabla - (sim.monto * sim.inte); //Amortizacion Capital desde Monto Prestamo
            sim.saldo=sim.monto-sim.amortizacion;} //Primer saldo a pagar desde Monto Prestamo
            else{
            //Cuota>#1
            sim.interesCapital=(sim.saldo*sim.inte);//Interes Capital desde Saldos (variables)
            sim.amortizacion = sim.cuotaTabla - (sim.saldo * sim.inte);//Amortizacion Capital desde Saldos (variables)
            sim.saldo=sim.saldo-sim.amortizacion;} //Saldos variables desde Primer saldo
            
                       
            //Formato de Valores
            String amortizacionConFormato=conMoneda.format(sim.amortizacion);
            String saldoConFormato=conMoneda.format(sim.saldo);
            String interesCapitalConFormato=conMoneda.format(sim.interesCapital);
            
            
            //Filas i de la Tabla
            String [] filas = {""+contador,""+amortizacionConFormato,""+interesCapitalConFormato,""+cuotaConFormato,""+saldoConFormato};
            
            //Añade las filas i a la Tabla
            modelo.addRow(filas);
        
        }
        
        botonGenerarPrestamo.setVisible(true);
    }//GEN-LAST:event_botonGenerarTablaActionPerformed
    }
    
    private void rbAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnualActionPerformed
        // TODO add your handling code here:
        rbAnual.getText();
    }//GEN-LAST:event_rbAnualActionPerformed

    private void rbSemestralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSemestralActionPerformed
        // TODO add your handling code here:
        rbSemestral.getText();
    }//GEN-LAST:event_rbSemestralActionPerformed

    private void rbMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMensualActionPerformed
        // TODO add your handling code here:
        rbMensual.getText();
    }//GEN-LAST:event_rbMensualActionPerformed

    private void botonMostrarTipoPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarTipoPrestamosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Credito Libre Inversión (SerFin) = 1% Tasa de Interés\n" +
                                                "Credito Vehiculo (SerFin) = 1.5% Tasa de Interés\n" +
                                                "Credito Vivienda (Otra entidad financiera) = 1.5% Tasa de Interés\n" +
                                                "Credito Libre Inversión (Otra entidad financiera) = 2.5% Tasa de Interés\n" +
                                                "Credito Vehiculo (Otra entidad financiera) = 1% Tasa de Interés");
        
    }//GEN-LAST:event_botonMostrarTipoPrestamosActionPerformed

    private void botonGenerarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarPrestamoActionPerformed
        // TODO add your handling code here:
        
       int pregunta = JOptionPane.showConfirmDialog(null,  "¿Esta seguro de continuar?","", JOptionPane.YES_NO_OPTION);
            if(pregunta== JOptionPane.YES_OPTION){
             vi.buscarClienteSinMensaje(cedula);
             generarTablaEnPdfParaSerFin();
             generarTablaEnPdfParaCliente();
             String fecha = labelFecha.getText();
             
                ClienteSerFin cs = new ClienteSerFin();
                cs.datosClienteConPrestamo(vi.getNombre(), vi.getApellido(), cedula, vi.getEdad(), vi.getCiudad(),
                 vi.getDireccion(), vi.getCelular(), vi.getEstadoCivil(), comboTipoPrestamo.getSelectedItem().toString(), modalidadPago, 
                 spinnerAnos.getValue().toString(),String.valueOf(cuotas),String.valueOf(montoPrestamo));
                
                cs.guardarClienteConPrestamo();
            }
            
    }//GEN-LAST:event_botonGenerarPrestamoActionPerformed

    //Metodo antes de llenar datos para la Tabla de Amortización
    private void iniciarPreSimulacion()
    {
    //Titulo
    labelTituloTablaAmortizacion.setEnabled(true);

    //TextField Monto Prestamo
    labelMontoPrestamo.setVisible(true);
    campoMontoPrestamo.setVisible(true);
    String formatoMoneda= conMoneda.format(montoPrestamo);
    campoMontoPrestamo.setText(formatoMoneda);
            
    //Textfield Cuota Tabla Amortizacion
    labelCuotaAmor.setVisible(false);
    campoCuotaAmor.setVisible(false);
    
    //ComboBox Tipo Prestamo
    labelTipoPrestamo.setVisible(true);
    comboTipoPrestamo.setVisible(true);
    
    //Spinner años
    labelNumeroAnos.setVisible(true);
    spinnerAnos.setVisible(true);
    
    //RadioButtons
    labelModalidadPago.setVisible(true);
    rbAnual.setVisible(true);
    rbMensual.setVisible(true);
    rbSemestral.setVisible(true);
    
    //Boton Generar Tabla
    botonGenerarTabla.setVisible(true);
    
    //Tabla
    jScrollPane1.setVisible(false);
    tablaAmortizacion.setVisible(false);
    
    }
    
    //Metodo validacion cantidad a simular el Prestamo (MontoPrestamo)
    private void validacionSimulacionPrestamo() {
        try {
            montoPrestamo = Integer.parseInt(JOptionPane.showInputDialog("¿Que valor quisiera simular su prestamo?"));

            if (montoPrestamo <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor valido.");
            }
            
            if (montoPrestamo > ingresos) {
                JOptionPane.showMessageDialog(null, "Con el monto ingresado, el banco Serfin no podra hacer su Simulacion de Credito."
                        + "\nYa que el monto ingresado es mayor a su valor de Ingresos Mensuales."
                        + "\nIntente de nuevo con un valor menor al que ingreso.");
            }

            if (montoPrestamo < ingresos && montoPrestamo>0) {
                JOptionPane.showMessageDialog(null, "OK");
                iniciarPreSimulacion();
            }
            

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Hubo un error. No ingrese letras o signos, SOLO NÚMEROS.");
        }

    }
    
    //Metodo para Limpiar datos para la Tabla de Amortización
    private void limpiarPreSimulacion()
    {
    //Titulo
    labelTituloTablaAmortizacion.setEnabled(false);

    //TextField Monto Prestamo
    labelMontoPrestamo.setVisible(false);
    campoMontoPrestamo.setVisible(false);
    
    //Textfield Cuota Tabla Amortizacion
    labelCuotaAmor.setVisible(false);
    campoCuotaAmor.setVisible(false);
    
    //ComboBox Tipo Prestamo
    labelTipoPrestamo.setVisible(false);
    comboTipoPrestamo.setVisible(false);
    
    //Spinner años
    labelNumeroAnos.setVisible(false);
    spinnerAnos.setVisible(false);
    
    //RadioButtons
    labelModalidadPago.setVisible(false);
    rbAnual.setVisible(false);
    rbMensual.setVisible(false);
    rbSemestral.setVisible(false);
    
    //Boton Generar Tabla
    botonGenerarTabla.setVisible(false);
    
    //Tabla
    jScrollPane1.setVisible(false);
    tablaAmortizacion.setVisible(false);
    
    limpiarTabla();
    
    }
    
    //Metodo para Limpiar Tabla de Amortizacion
    private void limpiarTabla(){
       for (int i = 0; i < tablaAmortizacion.getRowCount(); i++) {
           modelo.removeRow(i);
           i-=1;
       }
   }
    
    //Metodo Tabla a PDF para SerFin
    private void generarTablaEnPdfParaSerFin()
    {
        String montoPrestamoConFormato=conMoneda.format(montoPrestamo);
        try {

            FileOutputStream archivo = new FileOutputStream(ubicacionTablasGeneradas+"Tabla #"+numeroTabla+".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            documento.addAuthor("Banco SerFin ©");
            
            Font font = new Font();
            font.setFamily("Arial Black");
            font.setSize(22);
            
            documento.add(new Paragraph("Tabla Amortización #"+numeroTabla+" - Banco SerFin ©",font));
            documento.add(new Paragraph("Tabla generada el Día: "+labelFecha.getText()+" a las: "+labelHora.getText()));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            documento.add(new Paragraph("Nombre: "+vi.getNombre().toUpperCase()+"                                       Edad: "+vi.getEdad()+"\n"
                                        +"Apellido: "+vi.getApellido().toUpperCase()+"                                  Ciudad Residencia: "+vi.getCiudad().toUpperCase()+"\n"         
                                        +"Cedula: C.C. "+cedula+"                                   Dirección: "+vi.getDireccion().toUpperCase()+"\n"
                                        +"Valor del Prestamo: "+montoPrestamoConFormato+"                   Estado Civil: "+vi.getEstadoCivil().toUpperCase()));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            documento.add(new Paragraph("Tipo de Prestamo: "+comboTipoPrestamo.getSelectedItem().toString()));
            documento.add(new Paragraph("Numero de años del Prestamo: "+spinnerAnos.getValue().toString()));
            documento.add(new Paragraph("Modalidad de Pago: "+modalidadPago));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            PdfPTable pdfTable = new PdfPTable(tablaAmortizacion.getColumnCount());
            
            documento.add(new Paragraph("                                   "));
            
            //Añadiendo cabecera de JTable a PdfPTable
            for (int i = 0; i < tablaAmortizacion.getColumnCount(); i++) {
                pdfTable.addCell(tablaAmortizacion.getColumnName(i));
            }
            //Extrayendo filas y columnas de JTable a PdfPTable
            for (int filas = 0; filas < tablaAmortizacion.getRowCount(); filas++) {
                for (int cols = 0; cols < tablaAmortizacion.getColumnCount(); cols++) {
                    pdfTable.addCell(tablaAmortizacion.getModel().getValueAt(filas, cols).toString());

                }
            }
            documento.add(pdfTable);
            
            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Guardando");
        }
    
    }
    
    //Metodo Tabla a PDF para Cliente
    private void generarTablaEnPdfParaCliente()
    {
        
        JFileChooser jfchooser = new JFileChooser();
        
        int opcionEscogida = jfchooser.showSaveDialog(this);
        
        if(opcionEscogida== JFileChooser.APPROVE_OPTION)
        {
            File f = jfchooser.getSelectedFile();
            String direccionEscogida= f.toString();
        
        
    String montoPrestamoConFormato=conMoneda.format(montoPrestamo);
        try {

            FileOutputStream archivo = new FileOutputStream(direccionEscogida+".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            documento.addAuthor("Banco SerFin ©");
            //documento.add((Element) new ImageIcon("src/logo/logo_serfin.png"));
            
            Font font = new Font();
            font.setFamily("Arial Black");
            font.setSize(22);
            
            documento.add(new Paragraph("Tabla Amortización #"+numeroTabla+" - Banco SerFin ©",font));
            documento.add(new Paragraph("Tabla generada el Día: "+labelFecha.getText()+" a las: "+labelHora.getText()));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            documento.add(new Paragraph("Nombre: "+vi.getNombre().toUpperCase()+"                                       Edad: "+vi.getEdad()+"\n"
                                        +"Apellido: "+vi.getApellido().toUpperCase()+"                                  Ciudad Residencia: "+vi.getCiudad().toUpperCase()+"\n"         
                                        +"Cedula: C.C. "+cedula+"                                   Dirección: "+vi.getDireccion().toUpperCase()+"\n"
                                        +"Valor del Prestamo: "+montoPrestamoConFormato+"                   Estado Civil: "+vi.getEstadoCivil().toUpperCase()));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            
            documento.add(new Paragraph("Tipo de Prestamo: "+comboTipoPrestamo.getSelectedItem().toString()));
            documento.add(new Paragraph("Numero de años del Prestamo: "+spinnerAnos.getValue().toString()));
            documento.add(new Paragraph("Modalidad de Pago: "+modalidadPago));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            
            documento.add(new Paragraph("                                   "));
            
            PdfPTable pdfTable = new PdfPTable(tablaAmortizacion.getColumnCount());
            
            //Añadiendo cabecera de JTable a PdfPTable
            for (int i = 0; i < tablaAmortizacion.getColumnCount(); i++) {
                pdfTable.addCell(tablaAmortizacion.getColumnName(i));
            }
            //Extrayendo filas y columnas de JTable a PdfPTable
            for (int filas = 0; filas < tablaAmortizacion.getRowCount(); filas++) {
                for (int cols = 0; cols < tablaAmortizacion.getColumnCount(); cols++) {
                    pdfTable.addCell(tablaAmortizacion.getModel().getValueAt(filas, cols).toString());

                }
            }
            documento.add(pdfTable);
            
            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Guardando");
        }
        
        JOptionPane.showMessageDialog(null, "El prestamo ya quedo registrado en nuestro sistema.\n"
                                           +"El archivo pdf quedo guardado en: \n"+direccionEscogida+".pdf");
        
        }
    }
    
    //Getters y Setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public JTextField getCampoIngresos() {
        return campoIngresos;
    }
    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    private void iniciarReloj(){
        
        Reloj reloj = new Reloj(labelHora);
        reloj.start();
        
        Fecha fecha = new Fecha(labelFecha);
        fecha.iniciar();
        
    }

    //Main
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
            java.util.logging.Logger.getLogger(InterfazInicialPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicialPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicialPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicialPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazInicialPrestamo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerarPrestamo;
    private javax.swing.JButton botonGenerarTabla;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonMostrarTipoPrestamos;
    private javax.swing.JButton botonSimulador;
    private javax.swing.JTextField campoCuotaAmor;
    private javax.swing.JTextField campoIngresos;
    private javax.swing.JTextField campoMontoPrestamo;
    private javax.swing.JComboBox<String> comboTipoPrestamo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCuotaAmor;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelIngresos;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelModalidadPago;
    private javax.swing.JLabel labelMontoPrestamo;
    private javax.swing.JLabel labelNumeroAnos;
    private javax.swing.JLabel labelTipoPrestamo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloTablaAmortizacion;
    private javax.swing.JRadioButton rbAnual;
    private javax.swing.JRadioButton rbMensual;
    private javax.swing.ButtonGroup rbModalidadPago;
    private javax.swing.JRadioButton rbSemestral;
    private javax.swing.JSpinner spinnerAnos;
    public javax.swing.JTable tablaAmortizacion;
    // End of variables declaration//GEN-END:variables

    
}
