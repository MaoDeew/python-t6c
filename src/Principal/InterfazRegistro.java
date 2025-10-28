package Principal;

//Imports
import Clientes.Cliente;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Clase
public class InterfazRegistro extends javax.swing.JFrame {

    //Datos Personales Cliente (Interfaz Registro)
    String nombre;
    String apellido;
    String cedula;
    String edad;
    String ciudad;
    String direccion;
    String celular;
    String estadoCivil;
    String ocupacion;
    String empresa;
    String ingresos;
    String tipoContrato;
    String duracionEmpresa;

    String ubicacionArchivo;

    //Constructor clase con initComponents();
    public InterfazRegistro() {
        initComponents();

        //LOGO SerFin
        ImageIcon logo = new ImageIcon("src/logo/logo_serfin.png");
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(icono);
        //

        //Ubicacion Registro Clinetes .txt
        this.ubicacionArchivo = "E:\\Documentos Programacion\\NetBeans\\POO\\SerFin\\src\\Clientes\\registroClientes.txt";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        labelTitulo = new javax.swing.JLabel();
        panelDatosPersonales = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCiudad = new javax.swing.JTextField();
        labelEdad = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        cbEdad = new javax.swing.JComboBox<>();
        panelDatosEmpresa = new javax.swing.JPanel();
        labelEmpresa = new javax.swing.JLabel();
        labelIngresos = new javax.swing.JLabel();
        campoEmpresa = new javax.swing.JTextField();
        campoIngresos = new javax.swing.JTextField();
        labelContrato = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        cbTipoContrato = new javax.swing.JComboBox<>();
        botonRegistrarse = new javax.swing.JButton();
        labelOcupacion = new javax.swing.JLabel();
        cbOcupacion = new javax.swing.JComboBox<>();
        cbDuracionEmpresa = new javax.swing.JComboBox<>();
        labelLogo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField1.setText("jTextField1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox1.setText("jCheckBox1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("REGISTRO");

        panelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        panelDatosPersonales.setToolTipText("");

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApellido.setText("Apellido:");

        labelCiudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCiudad.setText("Ciudad de residencia:");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDireccion.setText("Dirección residencia:");

        labelCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCelular.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Estado Civil:");

        cbEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo", "Unión Libre" }));
        cbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoCivilActionPerformed(evt);
            }
        });

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        campoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoApellidoKeyTyped(evt);
            }
        });

        campoCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCiudadKeyTyped(evt);
            }
        });

        labelEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEdad.setText("Edad:");

        campoDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDireccionKeyTyped(evt);
            }
        });

        campoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCelularKeyTyped(evt);
            }
        });

        labelCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCedula.setText("Cedula:");

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });
        campoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCedulaKeyTyped(evt);
            }
        });

        cbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));

        javax.swing.GroupLayout panelDatosPersonalesLayout = new javax.swing.GroupLayout(panelDatosPersonales);
        panelDatosPersonales.setLayout(panelDatosPersonalesLayout);
        panelDatosPersonalesLayout.setHorizontalGroup(
            panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEdad)
                            .addComponent(labelApellido)
                            .addComponent(labelCedula))
                        .addGap(84, 84, 84)
                        .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(campoApellido))
                            .addComponent(cbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosPersonalesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelCiudad))
                            .addComponent(labelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombre)
                                    .addComponent(labelCelular))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(campoCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCelular, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap())
        );
        panelDatosPersonalesLayout.setVerticalGroup(
            panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdad)
                    .addComponent(cbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCiudad)
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelular)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelDatosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa"));

        labelEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmpresa.setText("Empresa actual:");

        labelIngresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelIngresos.setText("Ingresos Mensuales:");

        campoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEmpresaKeyTyped(evt);
            }
        });

        campoIngresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoIngresosKeyTyped(evt);
            }
        });

        labelContrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelContrato.setText("Tipo de contrato:");

        labelDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDuracion.setText("Duración en la empresa:");

        cbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Término Fijo", "Término Indefinido", "Obra-Labor", "Prestaciones de Servicios", "Aprendizaje", "Ocacional de Trabajo" }));
        cbTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoContratoActionPerformed(evt);
            }
        });

        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonRegistrarse.setText("REGISTRARSE");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        labelOcupacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOcupacion.setText("Ocupación");

        cbOcupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Independiente", "Empleado" }));

        cbDuracionEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 año a 5 años", "5 a 10 años", "10 a 20 años", "20 a 30 años", "30 a 40 años" }));

        javax.swing.GroupLayout panelDatosEmpresaLayout = new javax.swing.GroupLayout(panelDatosEmpresa);
        panelDatosEmpresa.setLayout(panelDatosEmpresaLayout);
        panelDatosEmpresaLayout.setHorizontalGroup(
            panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEmpresaLayout.createSequentialGroup()
                        .addComponent(botonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEmpresaLayout.createSequentialGroup()
                        .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosEmpresaLayout.createSequentialGroup()
                                .addComponent(labelOcupacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosEmpresaLayout.createSequentialGroup()
                                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmpresa)
                                    .addComponent(labelIngresos)
                                    .addComponent(labelContrato)
                                    .addComponent(labelDuracion))
                                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosEmpresaLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbTipoContrato, 0, 1, Short.MAX_VALUE)
                                                .addComponent(campoIngresos))
                                            .addComponent(campoEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelDatosEmpresaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDuracionEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(20, 20, 20))))
        );
        panelDatosEmpresaLayout.setVerticalGroup(
            panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEmpresaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOcupacion)
                    .addComponent(cbOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIngresos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContrato)
                    .addComponent(cbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDuracion)
                    .addComponent(cbDuracionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelLogo.setText("LOGO SERFIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelDatosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    //Restricciones KeyTyped
    private void cbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoCivilActionPerformed

    private void cbTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoContratoActionPerformed

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_campoApellidoKeyTyped

    private void campoCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_campoCedulaKeyTyped

    private void campoCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCiudadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_campoCiudadKeyTyped

    private void campoDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDireccionKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_campoDireccionKeyTyped

    private void campoCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCelularKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_campoCelularKeyTyped

    private void campoEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEmpresaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_campoEmpresaKeyTyped

    private void campoIngresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIngresosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_campoIngresosKeyTyped

    //Boton Registrarse
    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:       
        //JFrame conectados con Datos Personales
        this.nombre = campoNombre.getText();
        this.apellido = campoApellido.getText();
        this.cedula = campoCedula.getText();
        this.edad = cbEdad.getSelectedItem().toString();
        this.ciudad = campoCiudad.getText();
        this.direccion = campoDireccion.getText();
        this.celular = campoCelular.getText();
        this.estadoCivil = cbEstadoCivil.getSelectedItem().toString();
        this.ocupacion = cbOcupacion.getSelectedItem().toString();
        this.empresa = campoEmpresa.getText();
        this.ingresos = campoIngresos.getText();
        this.tipoContrato = cbTipoContrato.getSelectedItem().toString();
        this.duracionEmpresa = cbDuracionEmpresa.getSelectedItem().toString();
        //

        Cliente c = new Cliente(nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil, ocupacion, empresa, ingresos, tipoContrato, duracionEmpresa);

        //Validacion todos los 13 datos esten registrados a Cliente
        if (nombre.equals("") || apellido.equals("") || cedula.equals("") || ciudad.equals("") || direccion.equals("") || celular.equals("") || empresa.equals("") || ingresos.equals("")) {
            JOptionPane.showMessageDialog(null, "Su registro a SerFin es incompleto, revise que todos los campos esten escritos. ");

        } else {
            c.guardarClientesDatosPersonales();
            JOptionPane.showMessageDialog(null, "Su registro a SerFin es satisfactorio, ");
            Limpiar();
        }

    }//GEN-LAST:event_botonRegistrarseActionPerformed

    //Metodo Limpiar Campos de texto (TextField)
    private void Limpiar() {
        campoNombre.setText("");
        campoApellido.setText("");
        campoCedula.setText("");
        campoCiudad.setText("");
        campoDireccion.setText("");
        campoCelular.setText("");
        campoEmpresa.setText("");
        campoIngresos.setText("");
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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazRegistro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmpresa;
    private javax.swing.JTextField campoIngresos;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> cbDuracionEmpresa;
    private javax.swing.JComboBox<String> cbEdad;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbOcupacion;
    private javax.swing.JComboBox<String> cbTipoContrato;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelContrato;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelIngresos;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelOcupacion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDatosEmpresa;
    private javax.swing.JPanel panelDatosPersonales;
    // End of variables declaration//GEN-END:variables
}
