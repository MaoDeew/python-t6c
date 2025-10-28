package Principal;

//Imports
import Clientes.Cliente;
import Clientes.ListadoClientesVentana1;
import Clientes.ListadoClientesVentana2;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Clase
public class VentanaInicial extends javax.swing.JFrame {

    //Clientes Datos Personales
    ListadoClientesVentana2 lcv2 = new ListadoClientesVentana2();//

    String nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil;

    //Datos Empresa del Cliente
    String ocupacion, empresa, ingresos, tipoContrato, duracionEmpresa;
    String cedulaLogIn;

    //Constructor clase con initComponents();
    public VentanaInicial() {
        initComponents();

        //LOGO SerFin
        ImageIcon logo = new ImageIcon("src/logo/logo_serfin.png");
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(icono);
        //

        //Metodo txt Clientes Datos Personales
        lcv2.cargarClientesDatosPersonales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Bienvenido a SerFin ");

        botonRegistrarse.setText("REGISTRARSE");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        labelLogo.setText("LOGO SERFIN");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCedula.setText("Digite su Cedula:");

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });
        campoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCedulaKeyTyped(evt);
            }
        });

        botonLogin.setText("Iniciar Sesión");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLogin))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonRegistrarse)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegistrarse)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    //Boton Registrarse
    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        String campo = campoCedula.getText();
        if (campo.equals("")) {
            InterfazRegistro ir = new InterfazRegistro();
            ir.setVisible(Boolean.TRUE);
            ir.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

    }//GEN-LAST:event_botonRegistrarseActionPerformed

    //LogIn con Boton
    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        // TODO add your handling code here:
        buscarClienteConMensaje();

        if (lcv2.getListadoClientesDatosPersonales().containsKey(cedulaLogIn)) {

            //Ventana InterfazClienteSerfin
            InterfazClienteSerFin ics = new InterfazClienteSerFin();

            ics.setVisible(Boolean.TRUE);
            ics.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            ics.getCampoNombre().setText(nombre.toUpperCase());
            ics.getCampoApellido().setText(apellido.toUpperCase());
            ics.getCampoCedula().setText(cedula.toUpperCase());
            ics.getCampoCelular().setText(celular.toUpperCase());
            ics.getCampoCiudad().setText(ciudad.toUpperCase());
            ics.getCampoDireccion().setText(direccion.toUpperCase());
            ics.getCampoEdad().setText(edad.toUpperCase());
            ics.getCampoEstadoCivil().setText(estadoCivil.toUpperCase());

        }

    }//GEN-LAST:event_botonLoginActionPerformed

    //Validacion solo Números KeyTyped
    private void campoCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_campoCedulaKeyTyped

    //LogIn con solo Enter
    private void campoCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarClienteConMensaje();

            if (lcv2.getListadoClientesDatosPersonales().containsKey(cedulaLogIn)) {
                InterfazClienteSerFin ics = new InterfazClienteSerFin();

                ics.setVisible(Boolean.TRUE);
                ics.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                ics.getCampoNombre().setText(nombre.toUpperCase());
                ics.getCampoApellido().setText(apellido.toUpperCase());
                ics.getCampoCedula().setText(cedula.toUpperCase());
                ics.getCampoCelular().setText(celular.toUpperCase());
                ics.getCampoCiudad().setText(ciudad.toUpperCase());
                ics.getCampoDireccion().setText(direccion.toUpperCase());
                ics.getCampoEdad().setText(edad.toUpperCase());
                ics.getCampoEstadoCivil().setText(estadoCivil.toUpperCase());
            }
        }

        //LogIn a Ventana ListadoClientesVentana1 (funcionarios Serfin)
        if (evt.getKeyCode() == KeyEvent.VK_F10) {
            ListadoClientesVentana1 lcv1 = new ListadoClientesVentana1();
            lcv1.setVisible(Boolean.TRUE);
            lcv1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }//GEN-LAST:event_campoCedulaKeyPressed

    //Boton acceso Ingenieros
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    //Metodos
    private void buscarClienteConMensaje() {
        this.cedulaLogIn = campoCedula.getText();

        if (lcv2.getListadoClientesDatosPersonales().containsKey(cedulaLogIn)) {

            Cliente c = lcv2.getListadoClientesDatosPersonales().get(cedulaLogIn);

            this.nombre = c.getNombre();
            this.apellido = c.getApellido();
            this.cedula = c.getCedula();
            this.edad = c.getEdad();
            this.ciudad = c.getCiudad();
            this.direccion = c.getDireccion();
            this.celular = c.getCelular();
            this.estadoCivil = c.getEstadoCivil();
            this.ocupacion = c.getOcupacion();
            this.empresa = c.getEmpresa();
            this.ingresos = c.getIngresos();
            this.tipoContrato = c.getTipoContrato();
            this.duracionEmpresa = c.getDuracionEmpresa();

            JOptionPane.showMessageDialog(null, "Bienvenido Sr/Sra: " + nombre + " " + apellido);

        } else {
            JOptionPane.showMessageDialog(null, "No existe ese usuario en el sistema");
        }
    }

    public void buscarClienteSinMensaje(String cedula) {

        if (lcv2.getListadoClientesDatosPersonales().containsKey(cedula)) {

            Cliente c = lcv2.getListadoClientesDatosPersonales().get(cedula);

            this.nombre = c.getNombre();
            this.apellido = c.getApellido();
            this.cedula = c.getCedula();
            this.edad = c.getEdad();
            this.ciudad = c.getCiudad();
            this.direccion = c.getDireccion();
            this.celular = c.getCelular();
            this.estadoCivil = c.getEstadoCivil();
            this.ocupacion = c.getOcupacion();
            this.empresa = c.getEmpresa();
            this.ingresos = c.getIngresos();
            this.tipoContrato = c.getTipoContrato();
            this.duracionEmpresa = c.getDuracionEmpresa();

        }
    }

    //Getters
    public JTextField getCampoCedula() {
        return campoCedula;
    }

    public String getCedulaLogIn() {
        return cedulaLogIn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getIngresos() {
        return ingresos;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public String getDuracionEmpresa() {
        return duracionEmpresa;
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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
