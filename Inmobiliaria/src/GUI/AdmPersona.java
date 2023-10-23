
package GUI;

import AccesoADatos.PersonaData;
import Entidades.Persona;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AdmPersona extends javax.swing.JDialog {

    private Persona buscada;
    public static PersonaData controlPer = new PersonaData();
    private boolean personaEditada = false;
    
    public AdmPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Administracion de Personas");
        initComponents();
        bloquear(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCuil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBNueva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTEstado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Documento: ");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDocumentoActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre: ");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jInternalFrame1.getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido: ");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));
        jInternalFrame1.getContentPane().add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cuil: ");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jInternalFrame1.getContentPane().add(jTCuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Domicilio: ");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefono: ");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email:  ");
        jInternalFrame1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jInternalFrame1.getContentPane().add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 174, -1));
        jInternalFrame1.getContentPane().add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 110, -1));
        jInternalFrame1.getContentPane().add(jTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 140, -1));

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 40));

        jBBaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBaja.setText("Baja");
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jBNueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBNueva.setText("Nueva");
        jBNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jBNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jInternalFrame1.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, 360, 10));
        jInternalFrame1.getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 242, 360, 20));
        jInternalFrame1.getContentPane().add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDocumentoActionPerformed

    private void jBNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaActionPerformed
        limpiarJt();
        jBBuscar.setEnabled(false);
        bloquear(true);
        blkGuardar(true);
        jBBaja.setEnabled(false);
        jBEditar.setEnabled(false);
        jTEstado.setEnabled(false);
        jBNueva.setEnabled(false);
        jTEstado.setSelected(true);
        
    }//GEN-LAST:event_jBNuevaActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        bloquear(true);
        blkGuardar(true);
        personaEditada = true;
        
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaActionPerformed
        bloquear(true);
        blkGuardar(true);
        AdmPersona.controlPer.eliminarPersona(buscada);
    }//GEN-LAST:event_jBBajaActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        try {
            if (jTDocumento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un DNI válido");
            } else {
                Object[] opciones = {"SI", "NO", "CANCELAR"};       //Crea un Vector con los textos a mostrar
                int opcion = JOptionPane.showOptionDialog(null,
                        "¿Todos los datos son Correctos?",
                        "Confirmacion",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        null, opciones, opciones[2]);
                jTEstado.setEnabled(false);
                if (opcion == JOptionPane.YES_OPTION) {
                    int dni = Integer.parseInt(jTDocumento.getText());
                    String nombre = jTNombre.getText();
                    String apellido = jTApellido.getText();
                    Long cuil= Long.parseLong(jTCuil.getText());
                    int telefono= Integer.parseInt(jTTelefono.getText());
                    String domicilio= jTDomicilio.getText();
                    String email= jTEmail.getText();
                    boolean estado = jTEstado.isSelected();
                    System.out.println(jTCuil.getText());                    
                    if (personaEditada) {
                        Persona nueva = new Persona(buscada.getId(), nombre, apellido, dni, cuil, domicilio, telefono, email, estado);
                        MVendedor.controlPer.editarPersona(nueva);
                        limpiarJt();
                        blkGuardar(false);
                        bloquear(false);
                        jBBuscar.setEnabled(true);
                        personaEditada = false;
                    } else {
                        Persona nueva = new Persona(nombre, apellido, dni, cuil, domicilio, telefono, email, estado);
                        
                        MVendedor.controlPer.agregarPersona(nueva);
                        limpiarJt();
                        blkGuardar(false);
                        bloquear(false);
                        jBBuscar.setEnabled(true);
                    }
                } else if (opcion == JOptionPane.NO_OPTION) {

                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                    limpiarJt();
                    bloquear(false);
                    blkGuardar(false);
                    jBBuscar.setEnabled(true);
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos ingresados");
        }
       
    }//GEN-LAST:event_jBGuardarActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdmPersona dialog = new AdmPersona(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNueva;
    private javax.swing.JButton jBSalir;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCuil;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JRadioButton jTEstado;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables

    public void buscar(){
        if (jTDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
        } else {
           
                int dni = Integer.parseInt(jTDocumento.getText());
                buscada = controlPer.encontrarPersona(dni);
                if (buscada == null) {
                                                            
                } else {
                    
                    jTNombre.setText(buscada.getNombre());
                    jTApellido.setText(buscada.getApellido());
                    jTCuil.setText(String.valueOf(buscada.getCuil()));
                    jTDomicilio.setText(buscada.getDomicilio());
                    jTTelefono.setText(String.valueOf(buscada.getTelefono()));
                    jTEmail.setText(buscada.getEmail());
                    jTEstado.setSelected(buscada.isEstado());
                    
                                                         
                    if (buscada.isEstado()) {
                        jBBaja.setEnabled(true);
                        jBEditar.setEnabled(true);
                        jBGuardar.setEnabled(true);
                    } else {
                        jBBaja.setEnabled(false);
                        jBEditar.setEnabled(true);
                        jBGuardar.setEnabled(true);
                    }
                }
           
        }
     }
     
    public void bloquear(boolean estado) {
        jTApellido.setEnabled(estado);
        jTNombre.setEnabled(estado);
        jTCuil.setEnabled(estado);
        jTTelefono.setEnabled(estado);
        jTDomicilio.setEnabled(estado);
        jTEmail.setEnabled(estado);
        jTEstado.setEnabled(estado);
        jBEditar.setEnabled(estado);
        jBBaja.setEnabled(estado);
        jBGuardar.setEnabled(estado);
        
        if (!estado) {
            jTApellido.setDisabledTextColor(Color.BLACK);
            jTNombre.setDisabledTextColor(Color.BLACK);
            jTDocumento.setDisabledTextColor(Color.BLACK);
            jTCuil.setDisabledTextColor(Color.BLACK);
            jTTelefono.setDisabledTextColor(Color.BLACK);
            jTDomicilio.setDisabledTextColor(Color.BLACK);
            jTEmail.setDisabledTextColor(Color.BLACK);
            
            
        }
    }

    public void blkGuardar(boolean estado) {
        jBGuardar.setEnabled(estado);
    }

    public void limpiarJt() {
        jTApellido.setText("");
        jTNombre.setText("");
//        jTDocumento.setText("");
        jTCuil.setText("");
        jTTelefono.setText("");
        jTDomicilio.setText("");
        jTEmail.setText("");
        jTEstado.setText("");
        
        
    }
}
