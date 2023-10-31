package GUI;

import AccesoADatos.PersonaData;
import Entidades.Persona;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLDataException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdmPersona extends javax.swing.JDialog {

    private Persona buscada;
    public static PersonaData controlPer = new PersonaData();
    private boolean personaEditada = false;
    private Font label = MVendedor.fuenteLabel;
    private Font boton = MVendedor.fuenteBoton12;
    private Font nombre = MVendedor.fuenteBoton18;
    private int xMouse, yMouse;
    public AdmPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //setTitle("Administracion de Personas");
        initComponents();
        initFont();
        colorBG();
        bloquear(false);
        blkGuardar(false);
        jBEditar.setEnabled(false);
        jBBaja.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        jlVentana = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jlCuil = new javax.swing.JLabel();
        jTCuil = new javax.swing.JTextField();
        jlDomicilio = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jTEstado = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBNueva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(410, 429));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(410, 429));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setOpaque(false);
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 260, 20));

        jlVentana.setForeground(new java.awt.Color(9, 37, 60));
        jlVentana.setText("Administracion Clientes");
        jPanel1.add(jlVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        jlDocumento.setBackground(new java.awt.Color(8, 36, 59));
        jlDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jlDocumento.setText("Documento: ");
        jPanel1.add(jlDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 90, 32));

        jTDocumento.setBackground(new java.awt.Color(9, 37, 60));
        jTDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jTDocumento.setBorder(null);
        jTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 55, 130, 32));

        jlNombre.setBackground(new java.awt.Color(8, 36, 59));
        jlNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre: ");
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 115, 70, 32));

        jTNombre.setBackground(new java.awt.Color(9, 37, 60));
        jTNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTNombre.setBorder(null);
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 220, 32));

        jlApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(255, 255, 255));
        jlApellido.setText("Apellido: ");
        jPanel1.add(jlApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 158, -1, 32));

        jTApellido.setBackground(new java.awt.Color(9, 37, 60));
        jTApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTApellido.setBorder(null);
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 158, 220, 32));

        jlCuil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCuil.setForeground(new java.awt.Color(255, 255, 255));
        jlCuil.setText("Cuil: ");
        jPanel1.add(jlCuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 201, -1, 32));

        jTCuil.setBackground(new java.awt.Color(9, 37, 60));
        jTCuil.setForeground(new java.awt.Color(255, 255, 255));
        jTCuil.setBorder(null);
        jPanel1.add(jTCuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 201, 110, 32));

        jlDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        jlDomicilio.setText("Domicilio: ");
        jPanel1.add(jlDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, -1, 32));

        jTDomicilio.setBackground(new java.awt.Color(9, 37, 60));
        jTDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        jTDomicilio.setBorder(null);
        jPanel1.add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 244, 270, 32));

        jlTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefono.setText("Telefono: ");
        jPanel1.add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 201, -1, 32));

        jTTelefono.setBackground(new java.awt.Color(9, 37, 60));
        jTTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTTelefono.setBorder(null);
        jPanel1.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 201, 120, 32));

        jTEmail.setBackground(new java.awt.Color(9, 37, 60));
        jTEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTEmail.setBorder(null);
        jPanel1.add(jTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 287, 200, 32));

        jlEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(255, 255, 255));
        jlEmail.setText("Email:  ");
        jPanel1.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 287, -1, 32));

        jTEstado.setBackground(new java.awt.Color(9, 37, 60));
        jTEstado.setForeground(new java.awt.Color(255, 255, 255));
        jTEstado.setText("Estado");
        jPanel1.add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 287, 80, 32));

        jBBuscar.setBackground(new java.awt.Color(9, 37, 60));
        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("BUSCAR");
        jBBuscar.setToolTipText("BUSCAR");
        jBBuscar.setBorder(null);
        jBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 80, 40));

        jBBaja.setBackground(new java.awt.Color(9, 37, 60));
        jBBaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBaja.setForeground(new java.awt.Color(255, 255, 255));
        jBBaja.setText("Baja");
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });
        jPanel1.add(jBBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 347, 60, 50));

        jBEditar.setBackground(new java.awt.Color(9, 37, 60));
        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEditar.setForeground(new java.awt.Color(255, 255, 255));
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 347, 80, 50));

        jBGuardar.setBackground(new java.awt.Color(9, 37, 60));
        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 347, 90, 50));

        jBSalir.setBackground(new java.awt.Color(9, 37, 60));
        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 347, 60, 50));

        jBNueva.setBackground(new java.awt.Color(9, 37, 60));
        jBNueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBNueva.setForeground(new java.awt.Color(255, 255, 255));
        jBNueva.setText("Nueva");
        jBNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(jBNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 347, 80, 50));

        jSeparator1.setForeground(new java.awt.Color(9, 37, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 10));

        jSeparator2.setForeground(new java.awt.Color(9, 37, 60));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 10));

        BG.setForeground(new java.awt.Color(255, 255, 255));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BG_Personas.png"))); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(410, 429));
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 429));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

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
                    Long cuil = Long.parseLong(jTCuil.getText());
                    int telefono = Integer.parseInt(jTTelefono.getText());
                    String domicilio = jTDomicilio.getText();
                    String email = jTEmail.getText();
                    boolean estado = jTEstado.isSelected();

                    if (personaEditada) {
                        Persona nueva = new Persona(buscada.getId(), nombre, apellido, dni, cuil, domicilio, telefono, email, estado);
                        MVendedor.controlPer.editarPersona(nueva);
                        limpiarJt();
                        blkGuardar(false);
                        bloquear(false);
                        jBBuscar.setEnabled(true);
                        personaEditada = false;
                        jBNueva.setEnabled(true);
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
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos ingresados" + e);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        bloquear(true);

        if (jTEstado.isEnabled()) {
            jTEstado.setEnabled(false);
        } else {
            jTEstado.setEnabled(true);
        }
        jBEditar.setEnabled(false);
        jBBaja.setEnabled(false);
        jBGuardar.setEnabled(true);
        personaEditada = true;
        jBNueva.setEnabled(false);
        jBBuscar.setEnabled(false);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaActionPerformed
        bloquear(true);
        blkGuardar(true);
        AdmPersona.controlPer.eliminarPersona(buscada);
        bloquear(false);
        blkGuardar(false);
        limpiarJt();
        jBBaja.setEnabled(false);
        jBEditar.setEnabled(false);
        jBNueva.setEnabled(true);
    }//GEN-LAST:event_jBBajaActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDocumentoActionPerformed

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
     int x = evt.getXOnScreen();
     int y = evt.getYOnScreen();
     this.setLocation(x- xMouse,  y- yMouse);
        
    }//GEN-LAST:event_barraMouseDragged

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
    private javax.swing.JLabel BG;
    private javax.swing.JPanel barra;
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNueva;
    private javax.swing.JButton jBSalir;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCuil;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlVentana;
    // End of variables declaration//GEN-END:variables
    private void initFont(){
     jlDocumento.setFont(label);
        jlApellido.setFont(label);
        jlNombre.setFont(label);
        jlCuil.setFont(label);
        jlTelefono.setFont(label);
        jlDomicilio.setFont(label);
        jlEmail.setFont(label);
        jTApellido.setFont(label);
        jTNombre.setFont(label);
        jTDocumento.setFont(label);
        jTCuil.setFont(label);
        jTTelefono.setFont(label);
        jTDomicilio.setFont(label);
        jTEmail.setFont(label);
        jTEstado.setFont(label);
        jlVentana.setFont(nombre);
    }
    public void buscar() {
   
            if (jTDocumento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
            } else {

                int dni = Integer.parseInt(jTDocumento.getText());

                buscada = controlPer.encontrarPersona(dni);
                if (buscada == null) {
                     JOptionPane.showMessageDialog(null, "No existe persona con ese DNI");
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
                        jBGuardar.setEnabled(false);
                        jBNueva.setEnabled(false);

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

        if (!estado) {
            jTApellido.setDisabledTextColor(Color.WHITE);
            jTNombre.setDisabledTextColor(Color.WHITE);
            jTDocumento.setDisabledTextColor(Color.WHITE);
            jTCuil.setDisabledTextColor(Color.WHITE);
            jTTelefono.setDisabledTextColor(Color.WHITE);
            jTDomicilio.setDisabledTextColor(Color.WHITE);
            jTEmail.setDisabledTextColor(Color.WHITE);
            jTEstado.setBackground(new Color(9, 37, 60));

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

    private void colorBG() {
        Color fondo = new Color(8, 36, 59, 240);
        jlDocumento.setBackground(fondo);
        jlApellido.setBackground(fondo);
        jlNombre.setBackground(fondo);
        jlCuil.setBackground(fondo);
        jlTelefono.setBackground(fondo);
        jlDomicilio.setBackground(fondo);
        jlEmail.setBackground(fondo);

        jlDocumento.setForeground(Color.WHITE);
        jlApellido.setForeground(Color.WHITE);
        jlNombre.setForeground(Color.WHITE);
        jlCuil.setForeground(Color.WHITE);
        jlTelefono.setForeground(Color.WHITE);
        jlDomicilio.setForeground(Color.WHITE);
        jlEmail.setForeground(Color.WHITE);

        jTApellido.setBackground(fondo);
        jTNombre.setBackground(fondo);
        jTDocumento.setBackground(fondo);
        jTCuil.setBackground(fondo);
        jTTelefono.setBackground(fondo);
        jTDomicilio.setBackground(fondo);
        jTEmail.setBackground(fondo);
        jTEstado.setBackground(fondo);
        jTApellido.setForeground(Color.WHITE);
        jTNombre.setForeground(Color.WHITE);
        jTDocumento.setForeground(Color.WHITE);
        jTCuil.setForeground(Color.WHITE);
        jTTelefono.setForeground(Color.WHITE);
        jTDomicilio.setForeground(Color.WHITE);
        jTEmail.setForeground(Color.WHITE);
        jTEstado.setForeground(Color.WHITE);
    }

}
