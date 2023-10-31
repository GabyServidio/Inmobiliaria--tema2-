package GUI;

import AccesoADatos.InmuebleData;
import AccesoADatos.PersonaData;
import Entidades.Inmueble;
import Entidades.Persona;
import static GUI.MVendedor.controlPer;
import java.awt.Color;
import java.util.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import static GUI.MVendedor.controlInm;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

public class AdmInmuebles extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Persona buscada;
    private String jTEstado;
    private Font label = MVendedor.fuenteLabel;
    private Font button = MVendedor.fuenteBoton14;

    public AdmInmuebles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initFont();
        jBGuardar.setEnabled(false);
        compruebaEdicion();
        cargarCombo();
        //bloquearJt(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLSuperficie = new javax.swing.JLabel();
        jLAmbientes = new javax.swing.JLabel();
        jLBanios = new javax.swing.JLabel();
        jLGarage = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLZona = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jTDireccion = new javax.swing.JTextField();
        jTSuperficie = new javax.swing.JTextField();
        jTZona = new javax.swing.JTextField();
        jTAmbientes = new javax.swing.JTextField();
        jTBanios = new javax.swing.JTextField();
        jTGarage = new javax.swing.JTextField();
        jTTipoInmueble = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCondiciones = new javax.swing.JTextArea();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDCFechaCon = new com.toedter.calendar.JDateChooser();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSuperficie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSuperficie.setForeground(new java.awt.Color(0, 0, 0));
        jLSuperficie.setText("Superficie :");
        jPanel.add(jLSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 192, -1, 30));

        jLAmbientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLAmbientes.setForeground(new java.awt.Color(0, 0, 0));
        jLAmbientes.setText("Cantidad de ambientes :");
        jPanel.add(jLAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 286, -1, 30));

        jLBanios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBanios.setForeground(new java.awt.Color(0, 0, 0));
        jLBanios.setText("Cantidad de baños :");
        jPanel.add(jLBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 239, -1, 30));

        jLGarage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLGarage.setForeground(new java.awt.Color(0, 0, 0));
        jLGarage.setText("Garage :");
        jPanel.add(jLGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 239, -1, 30));

        jLDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jLDireccion.setText("Dirección del Inmueble :");
        jPanel.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 145, -1, 30));

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLEstado.setText("Estado :");
        jPanel.add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 239, 60, 30));

        jLZona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLZona.setForeground(new java.awt.Color(0, 0, 0));
        jLZona.setText("Zona :");
        jPanel.add(jLZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 192, -1, 30));

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTipo.setForeground(new java.awt.Color(0, 0, 0));
        jLTipo.setText("Tipo de Inmueble :");
        jPanel.add(jLTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 192, -1, 30));

        jcbEstado.setBackground(new java.awt.Color(125, 159, 175));
        jPanel.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 239, 150, 30));

        jTDireccion.setBackground(new java.awt.Color(125, 159, 175));
        jTDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jTDireccion.setBorder(null);
        jPanel.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 145, 210, 30));

        jTSuperficie.setBackground(new java.awt.Color(125, 159, 175));
        jTSuperficie.setForeground(new java.awt.Color(0, 0, 0));
        jTSuperficie.setBorder(null);
        jTSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSuperficieKeyTyped(evt);
            }
        });
        jPanel.add(jTSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 192, 40, 30));

        jTZona.setBackground(new java.awt.Color(125, 159, 175));
        jTZona.setForeground(new java.awt.Color(0, 0, 0));
        jTZona.setBorder(null);
        jPanel.add(jTZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 192, 60, 30));

        jTAmbientes.setBackground(new java.awt.Color(125, 159, 175));
        jTAmbientes.setForeground(new java.awt.Color(0, 0, 0));
        jTAmbientes.setBorder(null);
        jTAmbientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAmbientesKeyTyped(evt);
            }
        });
        jPanel.add(jTAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 286, 30, 30));

        jTBanios.setBackground(new java.awt.Color(125, 159, 175));
        jTBanios.setForeground(new java.awt.Color(0, 0, 0));
        jTBanios.setBorder(null);
        jTBanios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBaniosKeyTyped(evt);
            }
        });
        jPanel.add(jTBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 239, 20, 30));

        jTGarage.setBackground(new java.awt.Color(125, 159, 175));
        jTGarage.setForeground(new java.awt.Color(0, 0, 0));
        jTGarage.setBorder(null);
        jTGarage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTGarageKeyTyped(evt);
            }
        });
        jPanel.add(jTGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 239, 20, 30));

        jTTipoInmueble.setBackground(new java.awt.Color(125, 159, 175));
        jTTipoInmueble.setForeground(new java.awt.Color(0, 0, 0));
        jTTipoInmueble.setBorder(null);
        jPanel.add(jTTipoInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 192, 110, 30));

        jTCondiciones.setBackground(new java.awt.Color(125, 159, 175));
        jTCondiciones.setColumns(20);
        jTCondiciones.setForeground(new java.awt.Color(0, 0, 0));
        jTCondiciones.setRows(5);
        jTCondiciones.setText("Condiciones Particulares del Contrato");
        jTCondiciones.setBorder(null);
        jTCondiciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTCondiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCondicionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCondiciones);

        jPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 500, 110));

        jBSalir.setBackground(new java.awt.Color(125, 159, 175));
        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre :");
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 97, -1, 30));

        jTNombre.setBackground(new java.awt.Color(125, 159, 175));
        jTNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTNombre.setBorder(null);
        jPanel.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 97, 180, 30));

        jBGuardar.setBackground(new java.awt.Color(125, 159, 175));
        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBGuardar.setText("Guardar Inmueble");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido :");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 97, -1, 30));

        jTApellido.setBackground(new java.awt.Color(125, 159, 175));
        jTApellido.setForeground(new java.awt.Color(0, 0, 0));
        jTApellido.setBorder(null);
        jPanel.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 97, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 25, 25));
        jLabel3.setText("Ingresar DNI:");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 44, -1, 28));

        jTDni.setBackground(new java.awt.Color(125, 159, 175));
        jTDni.setForeground(new java.awt.Color(0, 0, 0));
        jTDni.setBorder(null);
        jTDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDniKeyTyped(evt);
            }
        });
        jPanel.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 44, 150, 28));

        jBBuscar.setBackground(new java.awt.Color(125, 159, 175));
        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(25, 25, 25));
        jBBuscar.setText("Buscar Propietario");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Construcción:");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 286, -1, 30));

        jDCFechaCon.setBackground(new java.awt.Color(125, 159, 175));
        jDCFechaCon.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(jDCFechaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 286, 150, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BG_AdmInmueble.png"))); // NOI18N
        jPanel.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        buscar();
        bloquearJt(true);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try {
            if (jTSuperficie.getText().isEmpty() || jTAmbientes.getText().isEmpty()
                    || jTBanios.getText().isEmpty() || jTDireccion.getText().isEmpty()
                    || jTGarage.getText().isEmpty()
                    || jTTipoInmueble.getText().isEmpty() || jTZona.getText().isEmpty()
                    || jTCondiciones.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "todos los datos son obligatorios");
            } else {
                Object[] opciones = {"SI", "NO", "CANCELAR"};
                int opcion = JOptionPane.showOptionDialog(null,
                        "¿Todos los datos son Correctos?",
                        "Confirmacion",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        null, opciones, opciones[2]);

                if (opcion == JOptionPane.YES_OPTION) {

                    int propi = 0;
                    int superficie = Integer.parseInt(jTSuperficie.getText());
                    int ambientes = Integer.parseInt(jTAmbientes.getText());
                    int banios = Integer.parseInt(jTBanios.getText());
                    String direccion = jTDireccion.getText();
                    String estado = jcbEstado.getSelectedItem().toString();
                    int garage = Integer.parseInt(jTGarage.getText());
                    String tipo = jTTipoInmueble.getText();
                    String zona = jTZona.getText();
                    String condiciones = jTCondiciones.getText();
                    Date fecha = jDCFechaCon.getDate();
                    LocalDate fechaConstruccion = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    Inmueble nuevo = new Inmueble(propi, superficie, ambientes, banios, fechaConstruccion,
                            garage, estado, direccion, zona, tipo, condiciones);

                    if (MVendedor.inmubleSeleccionado == null) {
                        nuevo.setIdPropietario(buscada.getId());
                        MVendedor.controlInm.GuardarInmueble(nuevo);
                    } else {
                        int id = MVendedor.inmubleSeleccionado.getId();
                        nuevo.setId(id);
                        int idPropietario = MVendedor.inmubleSeleccionado.getIdPropietario();
                        nuevo.setIdPropietario(idPropietario);
                        MVendedor.controlInm.modificarInmueble(nuevo);
                        MVendedor.inmubleSeleccionado = null;
                    }

                } else if (opcion == JOptionPane.NO_OPTION) {

                } else if (opcion == JOptionPane.CANCEL_OPTION) {

                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSuperficieKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
            evt.consume(); // Consumir el evento si no es una letra o espacio
            JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

        }
    }//GEN-LAST:event_jTSuperficieKeyTyped

    private void jTBaniosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBaniosKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
            evt.consume(); // Consumir el evento si no es una letra o espacio
            JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

        }
    }//GEN-LAST:event_jTBaniosKeyTyped

    private void jTGarageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTGarageKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
            evt.consume(); // Consumir el evento si no es una letra o espacio
            JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

        }
    }//GEN-LAST:event_jTGarageKeyTyped

    private void jTAmbientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAmbientesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
            evt.consume(); // Consumir el evento si no es una letra o espacio
            JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

        }
    }//GEN-LAST:event_jTAmbientesKeyTyped

    private void jTDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDniKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
            evt.consume(); // Consumir el evento si no es una letra o espacio
            JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

        }
    }//GEN-LAST:event_jTDniKeyTyped

    private void jTCondicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCondicionesMouseClicked
        if (MVendedor.inmubleSeleccionado == null) {
            jTCondiciones.setText("");
        }
    }//GEN-LAST:event_jTCondicionesMouseClicked

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
            java.util.logging.Logger.getLogger(AdmInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdmInmuebles dialog = new AdmInmuebles(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaCon;
    private javax.swing.JLabel jLAmbientes;
    private javax.swing.JLabel jLBanios;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLGarage;
    private javax.swing.JLabel jLSuperficie;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAmbientes;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTBanios;
    private javax.swing.JTextArea jTCondiciones;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTGarage;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTSuperficie;
    private javax.swing.JTextField jTTipoInmueble;
    private javax.swing.JTextField jTZona;
    private javax.swing.JComboBox<String> jcbEstado;
    // End of variables declaration//GEN-END:variables
    private void initFont() {
        jBBuscar.setFont(button);
        jBGuardar.setFont(button);
        jBSalir.setFont(button);

        jDCFechaCon.setFont(label);
        jLAmbientes.setFont(label);
        jLBanios.setFont(label);
        jLDireccion.setFont(label);
        jLEstado.setFont(label);
        jLGarage.setFont(label);
        jLSuperficie.setFont(label);
        jLTipo.setFont(label);
        jLZona.setFont(label);
        jLabel1.setFont(label);
        jLabel2.setFont(label);
        jLabel3.setFont(label);
        jLabel4.setFont(label);
        jPanel.setFont(label);
        jScrollPane1.setFont(label);
        jTAmbientes.setFont(label);
        jTApellido.setFont(label);
        jTBanios.setFont(label);
        jTCondiciones.setFont(label);
        jTDireccion.setFont(label);
        jTDni.setFont(label);
        jTGarage.setFont(label);
        jTNombre.setFont(label);
        jTSuperficie.setFont(label);
        jTTipoInmueble.setFont(label);
        jTZona.setFont(label);
        jcbEstado.setFont(label);

    }

    private void cargarCombo() {
        jcbEstado.addItem("DISPONIBLE");
        jcbEstado.addItem("NO DISPONIBLE");
        jcbEstado.addItem("RESERVADO");

    }

    private void compruebaEdicion() {
        Date fechadate = null;
        Inmueble selec = MVendedor.inmubleSeleccionado;
        if (selec == null) {

        } else {
            Persona prop = MVendedor.controlPer.encontrarPersonaXId(selec.getIdPropietario());
            jBBuscar.setEnabled(false);
            jTDni.setText(prop.getDni() + "");
            jTDni.setEnabled(false);
            bloquearJt(true);
            jTNombre.setText(prop.getNombre());
            jTApellido.setText(prop.getApellido());
            jTSuperficie.setText(selec.getSuperficie() + "");
            jTAmbientes.setText(selec.getCantAmbientes() + "");
            jTBanios.setText(selec.getCanBaños() + "");
            jTDireccion.setText(selec.getDireccion());
            jcbEstado.setSelectedItem(selec.getEstadoInmueble());
            jTGarage.setText(selec.getGarage() + "");
            jTTipoInmueble.setText(selec.getTipo());
            jTZona.setText(selec.getZona());
            jTCondiciones.setText(selec.getCondicionesContrato());
            LocalDate fechaLocalDate = selec.getFechaConstruccion();
            Date fechaDate = Date.from(fechaLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDCFechaCon.setDate(fechaDate);
            jBGuardar.setEnabled(true);

        }

    }

    private void limpiarJt() {

        jTSuperficie.setText("");
        jTAmbientes.setText("");
        jTBanios.setText("");
        jTDireccion.setText("");
        jTEstado = jcbEstado.getSelectedItem().toString();
        jTGarage.setText("");
        jTTipoInmueble.setText("");
        jTZona.setText("");
        jTCondiciones.setText("");
    }

    private void bloquearJt(boolean estado) {

        jTNombre.setEnabled(estado);
        jTApellido.setEnabled(estado);
        jTSuperficie.setEnabled(estado);
        jTAmbientes.setEnabled(estado);
        jTBanios.setEnabled(estado);
        jTDireccion.setEnabled(estado);
        jcbEstado.setEnabled(estado);
        jTGarage.setEnabled(estado);
        jTTipoInmueble.setEnabled(estado);
        jTZona.setEnabled(estado);
        jTCondiciones.setEnabled(estado);
        jDCFechaCon.setEnabled(estado);
    }

    public void buscar() {
        if (jTDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
        } else {

            int dni = Integer.parseInt(jTDni.getText());
            buscada = MVendedor.controlPer.encontrarPersona(dni);
            if (buscada == null) {
                Object[] opciones = {"Si", "No"};       //Crea un Vector con los textos a mostrar
                int opcion = JOptionPane.showOptionDialog(null,
                        "El DNI no se encuentra en la Base de Datos ¿Desea agregar la persona?",
                        "Confirmacion",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        null, opciones, opciones[1]);

                if (opcion == JOptionPane.YES_OPTION) {
                    AdmPersona carga = new AdmPersona(null, rootPaneCheckingEnabled);
                    carga.setLocationRelativeTo(null);
                    carga.setVisible(true);
                    cargaPropietario();
                }
            } else {

                cargaPropietario();

            }
        }

    }

    private void cargaPropietario() {
        jTNombre.setText(buscada.getNombre());
        jTApellido.setText(buscada.getApellido());
        jBGuardar.setEnabled(true);
        jBBuscar.setEnabled(false);
        jTNombre.setEnabled(false);
        jTApellido.setEnabled(false);
        jTDni.setEnabled(false);
        jTApellido.setDisabledTextColor(Color.BLACK);
        jTNombre.setDisabledTextColor(Color.BLACK);
        jTDni.setDisabledTextColor(Color.BLACK);
    }
}
