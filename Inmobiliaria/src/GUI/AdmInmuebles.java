package GUI;

import AccesoADatos.PersonaData;
import Entidades.Persona;
import static GUI.MVendedor.controlPer;
import static GUI.MVendedor.inmubleSeleccionado;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.JOptionPane;

/**
 *
 * @author Veronica Porqueras
 */
public class AdmInmuebles extends javax.swing.JDialog {
            
    private Persona buscada;
    
    public AdmInmuebles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jBGuardar.setEnabled(false);
        jBAgregarInmueble.setEnabled(false);
        bloquearJt(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCondiciones = new javax.swing.JPanel();
        jBAgregarInmueble = new javax.swing.JButton();
        jLSuperficie = new javax.swing.JLabel();
        jLAmbientes = new javax.swing.JLabel();
        jLBanios = new javax.swing.JLabel();
        jLGarage = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLZona = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTDireccion = new javax.swing.JTextField();
        jTSuperficie = new javax.swing.JTextField();
        jTZona = new javax.swing.JTextField();
        jTAmbientes = new javax.swing.JTextField();
        jTBanios = new javax.swing.JTextField();
        jTGarage = new javax.swing.JTextField();
        jTTipoInmueble = new javax.swing.JTextField();
        jTEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCondiciones = new javax.swing.JTextArea();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPCondiciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAgregarInmueble.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAgregarInmueble.setText("Agregar Inmueble");
        jBAgregarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarInmuebleActionPerformed(evt);
            }
        });
        jPCondiciones.add(jBAgregarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLSuperficie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSuperficie.setText("Superficie :");
        jPCondiciones.add(jLSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLAmbientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLAmbientes.setText("Cantidad de ambientes :");
        jPCondiciones.add(jLAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLBanios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBanios.setText("Cantidad de baños :");
        jPCondiciones.add(jLBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLGarage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLGarage.setText("Garage :");
        jPCondiciones.add(jLGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDireccion.setText("Dirección del Inmueble :");
        jPCondiciones.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLEstado.setText("Estado :");
        jPCondiciones.add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLZona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLZona.setText("Zona :");
        jPCondiciones.add(jLZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTipo.setText("Tipo de Inmueble :");
        jPCondiciones.add(jLTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Condiciones del propietario para el contrato :");
        jPCondiciones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        jPCondiciones.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 210, -1));
        jPCondiciones.add(jTSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 40, -1));
        jPCondiciones.add(jTZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 40, -1));
        jPCondiciones.add(jTAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 40, -1));
        jPCondiciones.add(jTBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 40, -1));
        jPCondiciones.add(jTGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 40, -1));
        jPCondiciones.add(jTTipoInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 40, -1));
        jPCondiciones.add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, -1));

        jTCondiciones.setColumns(20);
        jTCondiciones.setRows(5);
        jScrollPane1.setViewportView(jTCondiciones);

        jPCondiciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 520, 70));

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPCondiciones.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre :");
        jPCondiciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPCondiciones.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));

        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar Inmueble");
        jPCondiciones.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido :");
        jPCondiciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));
        jPCondiciones.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 180, -1));
        jPCondiciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, 520, 10));
        jPCondiciones.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 520, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingresar DNI:");
        jPCondiciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPCondiciones.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, -1));

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar Propietario");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPCondiciones.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));
        jPCondiciones.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 520, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAgregarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarInmuebleActionPerformed
        jBGuardar.setEnabled(true);
        
    }//GEN-LAST:event_jBAgregarInmuebleActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBBuscarActionPerformed

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
    private javax.swing.JButton jBAgregarInmueble;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLAmbientes;
    private javax.swing.JLabel jLBanios;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLGarage;
    private javax.swing.JLabel jLSuperficie;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPCondiciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTAmbientes;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTBanios;
    private javax.swing.JTextArea jTCondiciones;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTGarage;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTSuperficie;
    private javax.swing.JTextField jTTipoInmueble;
    private javax.swing.JTextField jTZona;
    // End of variables declaration//GEN-END:variables
    
    public void limpiarJt() {
    
        jTSuperficie.setText("");
        jTAmbientes.setText("");
        jTBanios.setText("");
        jTDireccion.setText("");
        jTEstado.setText("");
        jTGarage.setText("");
        jTTipoInmueble.setText("");
        jTZona.setText("");
        jTCondiciones.setText("");
    }

    public void bloquearJt(boolean estado) {
        
        jTNombre.setEnabled(estado);
        jTApellido.setEnabled(estado);
        jTSuperficie.setEnabled(estado);
        jTAmbientes.setEnabled(estado);
        jTBanios.setEnabled(estado);
        jTDireccion.setEnabled(estado);
        jTEstado.setEnabled(estado);
        jTGarage.setEnabled(estado);
        jTTipoInmueble.setEnabled(estado);
        jTZona.setEnabled(estado);
        jTCondiciones.setEnabled(estado);
    }

    public void buscar(){
        if (jTDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
        } else {
           
            int dni = Integer.parseInt(jTDni.getText());
            buscada = MVendedor.controlPer.encontrarPersona(dni);
            if (buscada == null) {
                JOptionPane.showMessageDialog(null, "El DNI ingresado no corresponde a un propietario");
            } else {
                jTNombre.setText(buscada.getNombre());
                jTApellido.setText(buscada.getApellido());
                jTApellido.setDisabledTextColor(Color.BLACK);
                jTNombre.setDisabledTextColor(Color.BLACK);
                jBGuardar.setEnabled(true);
                bloquearJt(true);
            }
        }
 
    }


}
