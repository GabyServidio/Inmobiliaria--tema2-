/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import Entidades.Persona;
import Entidades.Usuario;
import static GUI.AdmPersona.controlPer;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class AdmUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form AdmUsuarios
     */
    private Persona buscada;
    private Usuario mostrado;
    private boolean editar;

    public AdmUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bloquearCampos();
        jbEditar.setEnabled(false);
        jbGuardar.setEnabled(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jchbEstado = new javax.swing.JCheckBox();
        jbEditar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpContrasenia = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(382, 371));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 367, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE EL DNI DE LA PERSONA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 52, 80, 30));

        jbBuscar.setText("Buscar");
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USUARIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CONTRASEÑA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jchbEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jchbEstado.setForeground(new java.awt.Color(0, 0, 0));
        jchbEstado.setText("EN ACTIVIDAD");
        getContentPane().add(jchbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jbEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jcbTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbTipo.setForeground(new java.awt.Color(0, 0, 0));
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "INSPECTOR", "VENDEDOR" }));
        getContentPane().add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("SALIR");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TIPO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        jpContrasenia.setText("jPasswordField1");
        getContentPane().add(jpContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, -1));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Background.setForeground(new java.awt.Color(0, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo4.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 367));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseClicked
        buscar();
        if (jlNombre.getText().isEmpty()) {
            jbEditar.setEnabled(false);
            jbGuardar.setEnabled(false);
        } else {
            jbGuardar.setText("CREAR");
            jbGuardar.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarMouseClicked

    private void jtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            evt.consume();
            buscar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniKeyTyped

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbGuardar.setEnabled(true);
        desbloquearCampos();// TODO add your handling code here:
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_jbGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdmUsuarios dialog = new AdmUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JCheckBox jchbEstado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JPasswordField jpContrasenia;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    public void bloquearCampos() {
        jlNombre.setEnabled(false);
        jtfUsuario.setEnabled(false);
        jpContrasenia.setEnabled(false);
        jcbTipo.setEnabled(false);
        jchbEstado.setEnabled(false);
    }

    public void desbloquearCampos() {
        jlNombre.setEnabled(true);
        jtfUsuario.setEnabled(true);
        jpContrasenia.setEnabled(true);
        jcbTipo.setEnabled(true);
        jchbEstado.setEnabled(true);
    }

    public void buscar() {
        try {
            if (jtfDni.getText().isEmpty() || jtfDni.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
            } else {
                int dni = Integer.parseInt(jtfDni.getText());
                buscada = controlPer.encontrarPersona(dni);
                if (buscada == null) {
                    Object[] opciones = {"Si", "No"};       //Crea un Vector con los textos a mostrar
                    int opcion = JOptionPane.showOptionDialog(null,
                            "No existe una persona con el DNI ingresado ¿Desea agregarla?",
                            "Confirmacion",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            null, opciones, opciones[1]);

                    if (opcion == JOptionPane.YES_OPTION) {
                        AdmPersona carga = new AdmPersona(null, rootPaneCheckingEnabled);
                        carga.setLocationRelativeTo(null);
                        carga.setVisible(true);
                    }
                } else {
                    int idUsuario = buscada.getId();

                    mostrado = MAdministrador.controlUsuario.buscarUsuario(idUsuario);
                    if (mostrado == null) {
                        jlNombre.setText(buscada.getNombre() + buscada.getApellido());
                        editar = false;
                        desbloquearCampos();
                    } else {
                        editar = true;
                        jlNombre.setText(buscada.getApellido() + ", " + buscada.getNombre());
                        jtfUsuario.setText(mostrado.getUsuario());
                        jpContrasenia.setText(mostrado.getContraseña());
                        String comboMostrado = mostrado.getTipo();
                        switch (comboMostrado) {
                            case "A":
                                jcbTipo.setSelectedItem("ADMINISTRADOR");
                                break;
                            case "I":
                                jcbTipo.setSelectedItem("INSPECTOR");
                                break;
                            case "V":
                                jcbTipo.setSelectedItem("VENDEDOR");
                                break;
                        }
                        jchbEstado.setSelected(mostrado.isEstado());
                    }

                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar sólo números");
        }
    }

    private void guardar() {
        if (jtfUsuario.getText().isEmpty() || jpContrasenia.getPassword() == null) {
            JOptionPane.showConfirmDialog(null, "Todos los campos son necesarios!");
        } else {
            int dni = Integer.parseInt(jtfDni.getText());
            String cbox = null;
            String password = String.valueOf(jpContrasenia.getPassword());
            buscada = controlPer.encontrarPersona(dni);
            int idUsuario = buscada.getId();
            String comboEditado = String.valueOf(jcbTipo.getSelectedItem());
            switch (comboEditado) {
                case "ADMINISTRADOR":
                    cbox = "A";
                    break;
                case "INSPECTOR":
                    cbox = "I";
                    break;
                case "VENDEDOR":
                    cbox = "V";
                    break;
            }

            if (editar) {
                Usuario editado = new Usuario(mostrado.getId(), idUsuario, jtfUsuario.getText(), password, cbox, jchbEstado.isSelected());
                MAdministrador.controlUsuario.actualizarUsuario(editado);
            } else {
                Usuario editado = new Usuario(idUsuario, jtfUsuario.getText(), password, cbox, jchbEstado.isSelected());
                MAdministrador.controlUsuario.RegistrarUsuario(editado);

            }
        }
    }
}
