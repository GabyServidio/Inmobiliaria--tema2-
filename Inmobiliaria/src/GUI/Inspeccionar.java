package GUI;

import Entidades.Inmueble;
import Entidades.Inspeccion;
import Entidades.Usuario;
import static GUI.MInspector.controlPers;
import static GUI.MInspector.controlProp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class Inspeccionar extends javax.swing.JDialog {

    public Inspeccionar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        editarInsp();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADetalle = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(45, 27, 66));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA DE INSPECCIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 79, -1, 40));

        jLabel5.setBackground(new java.awt.Color(45, 27, 66));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Detalle de Inspección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 146, -1, -1));

        jButton1.setBackground(new java.awt.Color(45, 27, 66));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        jButton1.setToolTipText("Guardar");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jDCFecha.setBackground(new java.awt.Color(45, 27, 66));
        jDCFecha.setForeground(new java.awt.Color(255, 255, 255));
        jDCFecha.setDateFormatString("dd/MM/aaaa");
        jPanel1.add(jDCFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 79, 190, 40));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(224, 83));

        jTADetalle.setBackground(new java.awt.Color(45, 27, 66));
        jTADetalle.setColumns(20);
        jTADetalle.setForeground(new java.awt.Color(255, 255, 255));
        jTADetalle.setRows(5);
        jScrollPane1.setViewportView(jTADetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 364, 143));

        jButton3.setBackground(new java.awt.Color(45, 27, 66));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida2.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BG_Inspeccionar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jDCFecha == null) {
            JOptionPane.showMessageDialog(this, "El campo fecha debe estar completo");
        } else if (jTADetalle == null || jTADetalle.equals(" ")) {
            JOptionPane.showMessageDialog(this, "El campo Detalle debe estar completo");
        } else {
            guardar();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Object[] opcion = {"Sí", "Cancelar"};
        int op = JOptionPane.showOptionDialog(null, "¿Desea salir sin guardar?", "Advertencia", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION,
                null, opcion, opcion[1]);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Inspeccionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inspeccionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inspeccionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inspeccionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inspeccionar dialog = new Inspeccionar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADetalle;
    // End of variables declaration//GEN-END:variables

    private void editarInsp() {
        if (MInspector.inspeselec != null) {

            jDCFecha.setDate(java.sql.Date.valueOf(MInspector.inspeselec.getFecha()));
            jTADetalle.setText(MInspector.inspeselec.getDescripcion());
            jDCFecha.setEnabled(false);
        }
    }

    private void guardar() {
        Date fecha = jDCFecha.getDate();
        LocalDate fechaInsp = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Inspeccion Inspec = new Inspeccion(MInspector.inspector.getId(),
                MInspector.inmuselec.getId(), fechaInsp,
                jTADetalle.getText());

        if (MInspector.inspeselec != null) {
            MInspector.controlInsp.editarInspeccion(Inspec);
            MInspector.inspeselec = null;
        } else {
            MInspector.controlInsp.crearInspeccion(Inspec);
        }

    }
}
