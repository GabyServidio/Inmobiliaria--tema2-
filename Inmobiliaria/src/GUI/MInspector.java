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
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

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
    private Color bUp = new Color(251,237,220);
    private Color bDown = Color.WHITE;
    public static Font fuenteBoton18 = cargarFuentePersonalizada("src/Img/font/UniversBlack.ttf", 18);
    public static Font fuenteBoton14 = cargarFuentePersonalizada("src/Img/font/UniversBlack.ttf", 14);
    public static Font fuenteNombre = cargarFuentePersonalizada("src/Img/font/UniversBlack.ttf", 32);
    public static Font fuenteLabel = cargarFuentePersonalizada("src/Img/font/Univers-light-normal.ttf", 12);
    private int xMouse, yMouse;
    /**
     * Creates new form mInspector
     */
    public MInspector(Usuario ins) {
        inspector = ins;
        initComponents();
        initFont();
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
        barra = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jlNombreSombra = new javax.swing.JLabel();
        jbSalir = new javax.swing.JLabel();
        jbInspeccionar = new javax.swing.JLabel();
        jbListarInsp = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setFocusable(false);
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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 20));

        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("jLabel1");
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 66, 352, 60));

        jlNombreSombra.setForeground(new java.awt.Color(174, 78, 75));
        jlNombreSombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombreSombra.setText("jLabel1");
        jPanel1.add(jlNombreSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 68, 352, 60));

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbSalir.setText("SALIR");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSalirMouseExited(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 523, 142, 40));

        jbInspeccionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbInspeccionar.setForeground(new java.awt.Color(255, 255, 255));
        jbInspeccionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbInspeccionar.setText("INSPECCIONAR");
        jbInspeccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbInspeccionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbInspeccionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbInspeccionarMouseExited(evt);
            }
        });
        jPanel1.add(jbInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 424, 203, 40));

        jbListarInsp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbListarInsp.setForeground(new java.awt.Color(255, 255, 255));
        jbListarInsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbListarInsp.setText("LISTAR INSPECCIONES");
        jbListarInsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbListarInspMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbListarInspMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbListarInspMouseExited(evt);
            }
        });
        jPanel1.add(jbListarInsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 352, 203, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BG_Inspector.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
      xMouse = evt.getX();
      yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void jbListarInspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListarInspMouseEntered
       jbListarInsp.setForeground(bUp);
    }//GEN-LAST:event_jbListarInspMouseEntered

    private void jbInspeccionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInspeccionarMouseEntered
    jbInspeccionar.setForeground(bUp);
    }//GEN-LAST:event_jbInspeccionarMouseEntered

    private void jbListarInspMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListarInspMouseExited
     jbListarInsp.setForeground(bDown);
    }//GEN-LAST:event_jbListarInspMouseExited

    private void jbInspeccionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInspeccionarMouseExited
       jbInspeccionar.setForeground(bDown);
    }//GEN-LAST:event_jbInspeccionarMouseExited

    private void jbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseEntered
     jbSalir.setForeground(bUp);
    }//GEN-LAST:event_jbSalirMouseEntered

    private void jbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseExited
       jbSalir.setForeground(bDown);
    }//GEN-LAST:event_jbSalirMouseExited

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
    private javax.swing.JPanel barra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbInspeccionar;
    private javax.swing.JLabel jbListarInsp;
    private javax.swing.JLabel jbSalir;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreSombra;
    // End of variables declaration//GEN-END:variables
    private void initFont() {
        jbInspeccionar.setFont(fuenteBoton18);
        jbListarInsp.setFont(fuenteBoton14);
        jbSalir.setFont(fuenteBoton18);
        jlNombre.setFont(fuenteNombre);
        jlNombreSombra.setFont(fuenteNombre);
        
        jlNombre.setText(inspector.getUsuario());
        jlNombreSombra.setText(inspector.getUsuario());
    }

    public static Font cargarFuentePersonalizada(String rutaFuente, float tamanio) {
        Font fuenteCargada = null;
        try {
            fuenteCargada = Font.createFont(Font.TRUETYPE_FONT, new java.io.File(rutaFuente));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fuenteCargada);
            fuenteCargada = fuenteCargada.deriveFont(tamanio);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al cargar la fuente: " + e);
        }
        return fuenteCargada;
    }
}
