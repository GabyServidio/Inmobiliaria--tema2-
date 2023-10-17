/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import AccesoADatos.PersonaData;
import Entidades.Inmueble;
import Entidades.Usuario;
import java.awt.Color;

/**
 *
 * @author Veronica Porqueras
 */
public class MVendedor extends javax.swing.JFrame {

    public static PersonaData controlPer = new PersonaData();
    
    public static Inmueble inmubleSeleccionado = null;
    public MVendedor(Usuario ven) {
        initComponents();
        jtNombreSombra.setBackground(new Color(34,65,93, 200));
        nombreVendedor(ven);
    }
    private Color fondo = new Color(147,151,149);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtNombre = new javax.swing.JLabel();
        jtNombreSombra = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jlSalir = new javax.swing.JLabel();
        jlContacto = new javax.swing.JLabel();
        jlInmueble = new javax.swing.JLabel();
        jlMultas = new javax.swing.JLabel();
        jlContratos = new javax.swing.JLabel();
        jlInquilinos = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtNombre.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtNombre.setText("Nombre");
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 170, 50));

        jtNombreSombra.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jtNombreSombra.setForeground(new java.awt.Color(0, 0, 0));
        jtNombreSombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtNombreSombra.setText("Nombre");
        jPanel1.add(jtNombreSombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo100p.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jlSalir.setBackground(new java.awt.Color(34, 65, 93));
        jlSalir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("SALIR");
        jlSalir.setOpaque(true);
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSalirMouseEntered(evt);
            }
        });
        jPanel1.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 100, 40));

        jlContacto.setBackground(new java.awt.Color(147, 151, 149));
        jlContacto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlContacto.setForeground(new java.awt.Color(255, 255, 255));
        jlContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContacto.setText("CONTACTOS");
        jlContacto.setOpaque(true);
        jlContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlContactoMouseExited(evt);
            }
        });
        jPanel1.add(jlContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, 50));

        jlInmueble.setBackground(new java.awt.Color(34, 65, 93));
        jlInmueble.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlInmueble.setForeground(new java.awt.Color(255, 255, 255));
        jlInmueble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInmueble.setText("INMUEBLES");
        jlInmueble.setOpaque(true);
        jlInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlInmuebleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlInmuebleMouseExited(evt);
            }
        });
        jPanel1.add(jlInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, 50));

        jlMultas.setBackground(new java.awt.Color(34, 65, 93));
        jlMultas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlMultas.setForeground(new java.awt.Color(255, 255, 255));
        jlMultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMultas.setText("MULTAS");
        jlMultas.setOpaque(true);
        jlMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMultasMouseExited(evt);
            }
        });
        jPanel1.add(jlMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, 50));

        jlContratos.setBackground(new java.awt.Color(34, 65, 93));
        jlContratos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlContratos.setForeground(new java.awt.Color(255, 255, 255));
        jlContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContratos.setText("CONTRATOS");
        jlContratos.setOpaque(true);
        jlContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlContratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlContratosMouseEntered(evt);
            }
        });
        jPanel1.add(jlContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 210, 50));

        jlInquilinos.setBackground(new java.awt.Color(34, 65, 93));
        jlInquilinos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlInquilinos.setForeground(new java.awt.Color(255, 255, 255));
        jlInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInquilinos.setText("INQUILINOS");
        jlInquilinos.setOpaque(true);
        jlInquilinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlInquilinosMouseEntered(evt);
            }
        });
        jPanel1.add(jlInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 210, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo5.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContactoMouseEntered
        jlContacto.setForeground(Color.BLACK);
        jlContacto.setBackground(fondo);
    }//GEN-LAST:event_jlContactoMouseEntered

    private void jlContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContactoMouseExited
        jlContacto.setForeground(Color.WHITE);
        jlContacto.setBackground(fondo);
    }//GEN-LAST:event_jlContactoMouseExited

    private void jlInmuebleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInmuebleMouseEntered
        jlInmueble.setForeground(Color.BLACK);
        jlInmueble.setBackground(fondo);
    }//GEN-LAST:event_jlInmuebleMouseEntered

    private void jlMultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultasMouseEntered
        jlMultas.setForeground(Color.WHITE);
        jlMultas.setBackground(fondo);
    }//GEN-LAST:event_jlMultasMouseEntered

    private void jlContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContratosMouseEntered
        jlContratos.setForeground(Color.WHITE);
        jlContratos.setBackground(fondo);
    }//GEN-LAST:event_jlContratosMouseEntered

    private void jlInquilinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInquilinosMouseEntered
        jlInquilinos.setForeground(Color.WHITE);
        jlInquilinos.setBackground(fondo);
    }//GEN-LAST:event_jlInquilinosMouseEntered

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered
        jlSalir.setForeground(Color.WHITE);
        jlSalir.setBackground(fondo);
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlInmuebleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInmuebleMouseExited
        jlInmueble.setForeground(Color.BLACK);
        jlInmueble.setBackground(fondo);
    }//GEN-LAST:event_jlInmuebleMouseExited

    private void jlMultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultasMouseExited
        jlMultas.setForeground(Color.BLACK);
        jlMultas.setBackground(fondo);
    }//GEN-LAST:event_jlMultasMouseExited

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
         dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContratosMouseClicked
      AdmContratos cont = new AdmContratos(this, rootPaneCheckingEnabled);
     
      cont.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jlContratosMouseClicked

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
            java.util.logging.Logger.getLogger(MVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlContacto;
    private javax.swing.JLabel jlContratos;
    private javax.swing.JLabel jlInmueble;
    private javax.swing.JLabel jlInquilinos;
    private javax.swing.JLabel jlMultas;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jtNombre;
    private javax.swing.JLabel jtNombreSombra;
    // End of variables declaration//GEN-END:variables
private void nombreVendedor(Usuario nombre) {
        jtNombreSombra.setText(nombre.getUsuario());
        jtNombre.setText(nombre.getUsuario());
    }
}
