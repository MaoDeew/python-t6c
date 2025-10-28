package Clientes;

//Imports
import Empresas.EnterpriseForm;
import PagoServicios.RegistroServicios;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Clase
public class ListadoClientesVentana1 extends javax.swing.JFrame {

    //Ingenieros
    private String u1 = "Mauricio";
    private String passwordU1 = "201522503";
    private String u2 = "Jorge";
    private String passwordU2 = "201411907";
    private String u3 = "Daniela";
    private String passwordU3 = "201516365";
    private String u4 = "David G";
    private String passwordU4 = "201520300";
    private String u5 = "David Q";
    private String passwordU5 = "201523278";

    Icon icono;

    //Constructor clase con initComponents();
    public ListadoClientesVentana1() {
        initComponents();

        //LOGO SerFin
        ImageIcon logo = new ImageIcon("src/logo/logo_serfin.png");
        icono = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(icono);
        //

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelLogo.setText("LOGO SerFin");

        labelUsuario.setText("Usuario");

        jLabel1.setText("Contraseña");

        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEntrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEntrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Entrar
    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        // TODO add your handling code here:

        String pass = "";

        String usuario = campoUsuario.getText();

        char[] password = campoPassword.getPassword();

        for (int i = 0; i < password.length; i++) {
            pass += password[i];
        }

        //Validacion Mauricio
        if (usuario.equals(u1) && pass.equals(passwordU1)) {
            String seleccion = JOptionPane.showInputDialog("Ingrese:\n 1. Clientes\n 2. Empresas\n 3.Servicios");

            if (seleccion.equals("Clientes")) {
                ListadoClientesVentana2 ventana2 = new ListadoClientesVentana2();
                ventana2.setVisible(Boolean.TRUE);
                ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Empresas")) {
                EnterpriseForm ventanaEmpresas = new EnterpriseForm();
                ventanaEmpresas.setVisible(Boolean.TRUE);
                ventanaEmpresas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Servicios")) {
                RegistroServicios ventanaServicios = new RegistroServicios();
                ventanaServicios.setVisible(Boolean.TRUE);
                ventanaServicios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

        }

        //Validacion Jorge
        if (usuario.equals(u2) && pass.equals(passwordU2)) {
            String seleccion = JOptionPane.showInputDialog("Ingrese:\n 1. Clientes\n 2. Empresas\n 3.Servicios");

            if (seleccion.equals("Clientes")) {
                ListadoClientesVentana2 ventana2 = new ListadoClientesVentana2();
                ventana2.setVisible(Boolean.TRUE);
                ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Empresas")) {
                EnterpriseForm ventanaEmpresas = new EnterpriseForm();
                ventanaEmpresas.setVisible(Boolean.TRUE);
                ventanaEmpresas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Servicios")) {
                RegistroServicios ventanaServicios = new RegistroServicios();
                ventanaServicios.setVisible(Boolean.TRUE);
                ventanaServicios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        }

        //Validacion Daniela
        if (usuario.equals(u3) && pass.equals(passwordU3)) {
            String seleccion = JOptionPane.showInputDialog("Ingrese:\n 1. Clientes\n 2. Empresas\n 3.Servicios");

            if (seleccion.equals("Clientes")) {
                ListadoClientesVentana2 ventana2 = new ListadoClientesVentana2();
                ventana2.setVisible(Boolean.TRUE);
                ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Empresas")) {
                EnterpriseForm ventanaEmpresas = new EnterpriseForm();
                ventanaEmpresas.setVisible(Boolean.TRUE);
                ventanaEmpresas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Servicios")) {
                RegistroServicios ventanaServicios = new RegistroServicios();
                ventanaServicios.setVisible(Boolean.TRUE);
                ventanaServicios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        }

        //Validacion David G
        if (usuario.equals(u4) && pass.equals(passwordU4)) {
            String seleccion = JOptionPane.showInputDialog("Ingrese:\n 1. Clientes\n 2. Empresas\n 3.Servicios");

            if (seleccion.equals("Clientes")) {
                ListadoClientesVentana2 ventana2 = new ListadoClientesVentana2();
                ventana2.setVisible(Boolean.TRUE);
                ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Empresas")) {
                EnterpriseForm ventanaEmpresas = new EnterpriseForm();
                ventanaEmpresas.setVisible(Boolean.TRUE);
                ventanaEmpresas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Servicios")) {
                RegistroServicios ventanaServicios = new RegistroServicios();
                ventanaServicios.setVisible(Boolean.TRUE);
                ventanaServicios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        }

        //Validacion David Q
        if (usuario.equals(u5) && pass.equals(passwordU5)) {
            String seleccion = JOptionPane.showInputDialog("Ingrese:\n 1. Clientes\n 2. Empresas\n 3.Servicios");

            if (seleccion.equals("Clientes")) {
                ListadoClientesVentana2 ventana2 = new ListadoClientesVentana2();
                ventana2.setVisible(Boolean.TRUE);
                ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Empresas")) {
                EnterpriseForm ventanaEmpresas = new EnterpriseForm();
                ventanaEmpresas.setVisible(Boolean.TRUE);
                ventanaEmpresas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }

            if (seleccion.equals("Servicios")) {
                RegistroServicios ventanaServicios = new RegistroServicios();
                ventanaServicios.setVisible(Boolean.TRUE);
                ventanaServicios.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        }


    }//GEN-LAST:event_botonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoClientesVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoClientesVentana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListadoClientesVentana1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
