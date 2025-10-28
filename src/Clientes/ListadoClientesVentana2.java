package Clientes;

//Imports
import Principal.CalendarioSistema.Fecha;
import Principal.CalendarioSistema.Reloj;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Clase
public class ListadoClientesVentana2 extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    String ubicacion;
    String ubicacion_2;
    HashMap<String, Cliente> listadoClientesDatosPersonales = new HashMap<>();
    HashMap<String, ClienteSerFin> listadoClientesSerfin = new HashMap<>();
    NumberFormat conMoneda = NumberFormat.getCurrencyInstance();

    //Datos Personales Cliente
    String nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil;

    //Datos Empresa del Cliente
    String ocupacion, empresa, ingresos, tipoContrato, duracionEmpresa;

    //Datos Clientes Serfin con Prestamo
    String tipoPrestamo, modalidadPago, anosPago, numCuotas, montoPrestamo;

//Constructor clase con initComponents();
    public ListadoClientesVentana2() {
        initComponents();

        //Datos Tabla Clientes
        String cabecera[] = {"Nombre", "Apellido", "Cedula", "Edad", "Ciudad", "Dirección", "Celular", "Estado Civil", "Ocupación", "Empresa", "Ingresos", "Tipo de Contrato", "Duracion Empresa"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        tablaClientes.setModel(modelo);

        //Datos Tabla Clientes con Prestamo
        String cabecera2[] = {"Nombre", "Apellido", "Cedula", "Edad", "Ciudad", "Dirección", "Celular", "Estado Civil", "Tipo de Prestamo", "Modalidad de Pago", "Años a Pagar", "Numero de Cuotas a Pagar", "Monto Prestado"};
        String datos2[][] = {};
        modelo2 = new DefaultTableModel(datos2, cabecera2);
        tablaClientesConPrestamo.setModel(modelo2);

        //Ubicacion Registro Clinetes .txt
        this.ubicacion = "E:\\DocumentosProgramacion\\NetBeans\\POO\\SerFin\\src\\Clientes\\registroClientes.txt";
        this.ubicacion_2 = "E:\\DocumentosProgramacion\\NetBeans\\POO\\SerFin\\src\\Clientes\\clientesPrestamo.txt";

        //LOGO SerFin
        ImageIcon logo = new ImageIcon("src/logo/logo_serfin.png");
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(icono);
        //

        //Fecha y Hora
        Reloj reloj = new Reloj(labelHora);
        reloj.start();

        Fecha fecha = new Fecha(labelFecha);
        fecha.iniciar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        botonCargarClientes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelHora = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        botonCargarClientesConPrestamo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientesConPrestamo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de Datos Clientes");
        setResizable(false);

        labelLogo.setText("LOGO SerFin");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Edad", "Ciudad", "Dirección", "Celular", "Estado Civil", "Ocupacion", "Empresa", "Ingresos", "Tipo de Contrato", "Duracion Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
            tablaClientes.getColumnModel().getColumn(5).setResizable(false);
            tablaClientes.getColumnModel().getColumn(6).setResizable(false);
            tablaClientes.getColumnModel().getColumn(7).setResizable(false);
            tablaClientes.getColumnModel().getColumn(8).setResizable(false);
            tablaClientes.getColumnModel().getColumn(9).setResizable(false);
            tablaClientes.getColumnModel().getColumn(10).setResizable(false);
            tablaClientes.getColumnModel().getColumn(11).setResizable(false);
            tablaClientes.getColumnModel().getColumn(12).setResizable(false);
        }

        botonCargarClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCargarClientes.setText("Cargar Clientes");
        botonCargarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarClientesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelHora.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("Hora");

        labelFecha.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botonCargarClientesConPrestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonCargarClientesConPrestamo.setText("Cargar Clientes con Préstamo");
        botonCargarClientesConPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarClientesConPrestamoActionPerformed(evt);
            }
        });

        tablaClientesConPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaClientesConPrestamo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCargarClientesConPrestamo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonCargarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(884, 884, 884)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(botonCargarClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargarClientesConPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botones
    private void botonCargarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarClientesActionPerformed
        // TODO add your handling code here:
        cargarClientesDatosPersonales();
                 
    }//GEN-LAST:event_botonCargarClientesActionPerformed

    
    
    private void botonCargarClientesConPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarClientesConPrestamoActionPerformed
        // TODO add your handling code here:
        cargarClientesSerFinConPrestamo();
    }//GEN-LAST:event_botonCargarClientesConPrestamoActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // TODO add your handling code here:
        int fila = tablaClientes.rowAtPoint(evt.getPoint());
        if (fila > -1) {

            String valor = tablaClientes.getValueAt(fila, 0).toString();

            JOptionPane.showMessageDialog(null, valor);
        }

    }//GEN-LAST:event_tablaClientesMouseClicked

    //Metodos
    public void cargarClientesDatosPersonales() {

        try {
            FileReader r = new FileReader(ubicacion);
            BufferedReader br = new BufferedReader(r);

            String temp = "";

            while (temp != null) {

                temp = br.readLine();

                if (temp == null) {
                    break;
                }

                //Guardando Cliente
                String[] clientes = temp.split("\\/");

                this.nombre = clientes[0];
                this.apellido = clientes[1];
                this.cedula = clientes[2];
                this.edad = clientes[3];
                this.ciudad = clientes[4];
                this.direccion = clientes[5];
                this.celular = clientes[6];
                this.estadoCivil = clientes[7];
                this.ocupacion = clientes[8];
                this.empresa = clientes[9];
                this.ingresos = clientes[10];
                this.tipoContrato = clientes[11];
                this.duracionEmpresa = clientes[12];

                //Creando Cliente
                Cliente c = new Cliente(nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil, ocupacion, empresa, ingresos, tipoContrato, duracionEmpresa);

                //Mostrando Cliente
                String[] clientesFormat = temp.split("\\/");

                String ingresosFormat = conMoneda.format(Integer.parseInt(clientesFormat[10]));
                clientesFormat[10] = ingresosFormat;

                //HashMap Guardando Cliente Datos Personales
                if (!listadoClientesDatosPersonales.containsKey(cedula)) {
                    listadoClientesDatosPersonales.put(cedula, c);
                    ((DefaultTableModel) tablaClientes.getModel()).addRow(clientesFormat);
                    
                }
                
            }
            
        } catch (IOException e) {
        }
    }

    public void cargarClientesSerFinConPrestamo() {

        try {
            FileReader r = new FileReader(ubicacion_2);
            BufferedReader br = new BufferedReader(r);

            String temp = "";

            while (temp != null) {

                temp = br.readLine();

                if (temp == null) {
                    break;
                }

                //Guardando Cliente
                String[] clientesConPrestamo = temp.split("\\/");

                this.nombre = clientesConPrestamo[0];
                this.apellido = clientesConPrestamo[1];
                this.cedula = clientesConPrestamo[2];
                this.edad = clientesConPrestamo[3];
                this.ciudad = clientesConPrestamo[4];
                this.direccion = clientesConPrestamo[5];
                this.celular = clientesConPrestamo[6];
                this.estadoCivil = clientesConPrestamo[7];
                this.tipoPrestamo = clientesConPrestamo[8];
                this.modalidadPago = clientesConPrestamo[9];
                this.anosPago = clientesConPrestamo[10];
                this.numCuotas = clientesConPrestamo[11];
                this.montoPrestamo = clientesConPrestamo[12];

                ClienteSerFin cs = new ClienteSerFin();
                cs.datosClienteConPrestamo(nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil, tipoPrestamo, modalidadPago, anosPago, numCuotas, montoPrestamo);

                //Mostrando Cliente
                String[] clientesConPrestamoFormat = temp.split("\\/");

                String montoPrestamoFormat = conMoneda.format(Integer.parseInt(clientesConPrestamoFormat[12]));
                clientesConPrestamoFormat[12] = montoPrestamoFormat;

                if (!listadoClientesSerfin.containsKey(cedula)) {
                    listadoClientesSerfin.put(cedula, cs);
                    ((DefaultTableModel) tablaClientesConPrestamo.getModel()).addRow(clientesConPrestamoFormat);
                    

                }

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Los clientes no se pueden cargar, revise que si exista el archivo.");
        }
    }

    //Getter & Setter
    public HashMap<String, Cliente> getListadoClientesDatosPersonales() {
        return listadoClientesDatosPersonales;
    }

    public HashMap<String, ClienteSerFin> getListadoClientesSerfin() {
        return listadoClientesSerfin;
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
            java.util.logging.Logger.getLogger(ListadoClientesVentana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListadoClientesVentana2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarClientes;
    private javax.swing.JButton botonCargarClientesConPrestamo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaClientesConPrestamo;
    // End of variables declaration//GEN-END:variables
}
