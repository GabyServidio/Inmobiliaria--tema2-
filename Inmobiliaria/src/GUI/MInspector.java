/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import AccesoADatos.ContratoData;
import AccesoADatos.InmuebleData;
import AccesoADatos.InspeccionData;
import AccesoADatos.MultaData;
import AccesoADatos.PersonaData;
import Entidades.Inmueble;
import Entidades.Inspeccion;
import Entidades.Usuario;

/**
 *
 * @author Veronica Porqueras
 */
public class MInspector extends javax.swing.JFrame {

    public static InmuebleData controlProp = new InmuebleData();
    public static PersonaData controlPers = new PersonaData();
    public static InspeccionData controlInsp = new InspeccionData();
    public static MultaData controlMulta = new MultaData();
    public static ContratoData controlContrato = new ContratoData();
    public static Usuario inspector = null;
    public static Inmueble inmuselec = null;
    public static Inspeccion inspeselec = null;

    /**
     * Creates new form mInspector
     */
    public MInspector(Usuario ins) {
        inspector = ins;
        initComponents();
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
        jbSalir = new javax.swing.JLabel();
        jbInspeccionar = new javax.swing.JLabel();
        jbListarInsp = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbSalir.setText("SALIR");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, 40));

        jbInspeccionar.setForeground(new java.awt.Color(0, 0, 0));
        jbInspeccionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbInspeccionar.setText("INSPECCIONAR");
        jbInspeccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbInspeccionarMouseClicked(evt);
            }
        });
        jPanel1.add(jbInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        jbListarInsp.setForeground(new java.awt.Color(0, 0, 0));
        jbListarInsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbListarInsp.setText("LISTAR INSPECCIONES");
        jbListarInsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbListarInspMouseClicked(evt);
            }
        });
        jPanel1.add(jbListarInsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 140, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo6.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInspeccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInspeccionarMouseClicked
        ListarInmuebles adminm = new ListarInmuebles(null, rootPaneCheckingEnabled, inspector);
        adminm.setLocationRelativeTo(null);
        adminm.setVisible(true);

    }//GEN-LAST:event_jbInspeccionarMouseClicked

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        dispose();
        Logging inicio = new Logging();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jbListarInspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListarInspMouseClicked
        ListarInspecciones insp = new ListarInspecciones(null, rootPaneCheckingEnabled);
        insp.setLocationRelativeTo(null);
        insp.setVisible(true);
    }//GEN-LAST:event_jbListarInspMouseClicked

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
            java.util.logging.Logger.getLogger(MInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbInspeccionar;
    private javax.swing.JLabel jbListarInsp;
    private javax.swing.JLabel jbSalir;
    // End of variables declaration//GEN-END:variables
}
