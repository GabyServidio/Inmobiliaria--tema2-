/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import AccesoADatos.UsuarioData;
import Entidades.Usuario;
import java.awt.Color;

/**
 *
 * @author Veronica Porqueras
 */
public class MAdministrador extends javax.swing.JFrame {

        public static UsuarioData controlUsuario = new UsuarioData();

    /**
     * Creates new form mAdministrador
     */
    private final Color fondo = new Color(34, 65, 93);
    private final Color fondoR = new Color(145, 146, 145);
    private Usuario user;
    public MAdministrador(Usuario user) {
        this.user = user;
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
        LOGO = new javax.swing.JLabel();
        jlContacto = new javax.swing.JLabel();
        jlListarInmuebles = new javax.swing.JLabel();
        jlInmueble1 = new javax.swing.JLabel();
        jlMultas = new javax.swing.JLabel();
        jlContratos = new javax.swing.JLabel();
        jbSalir = new javax.swing.JLabel();
        jbListarInsp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo100p.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 150, -1));

        jlContacto.setBackground(new java.awt.Color(147, 151, 149));
        jlContacto.setFont(new java.awt.Font("Univers-Black", 0, 18)); // NOI18N
        jlContacto.setForeground(new java.awt.Color(255, 255, 255));
        jlContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContacto.setText("CONTACTOS");
        jlContacto.setPreferredSize(new java.awt.Dimension(163, 30));
        jlContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlContactoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlContactoMouseExited(evt);
            }
        });
        jPanel1.add(jlContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 163, 30));

        jlListarInmuebles.setBackground(new java.awt.Color(34, 65, 93));
        jlListarInmuebles.setFont(new java.awt.Font("Univers-Black", 0, 14)); // NOI18N
        jlListarInmuebles.setForeground(new java.awt.Color(255, 255, 255));
        jlListarInmuebles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListarInmuebles.setText("LISTAR INMUEBLES");
        jlListarInmuebles.setPreferredSize(new java.awt.Dimension(163, 30));
        jlListarInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListarInmueblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlListarInmueblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlListarInmueblesMouseExited(evt);
            }
        });
        jPanel1.add(jlListarInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 163, 30));

        jlInmueble1.setBackground(new java.awt.Color(34, 65, 93));
        jlInmueble1.setFont(new java.awt.Font("Univers-Black", 1, 14)); // NOI18N
        jlInmueble1.setForeground(new java.awt.Color(255, 255, 255));
        jlInmueble1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInmueble1.setText("CREAR INMUEBLE");
        jlInmueble1.setPreferredSize(new java.awt.Dimension(163, 30));
        jlInmueble1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInmueble1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlInmueble1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlInmueble1MouseExited(evt);
            }
        });
        jPanel1.add(jlInmueble1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 163, 30));

        jlMultas.setBackground(new java.awt.Color(34, 65, 93));
        jlMultas.setFont(new java.awt.Font("Univers-Black", 1, 18)); // NOI18N
        jlMultas.setForeground(new java.awt.Color(255, 255, 255));
        jlMultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMultas.setText("MULTAS");
        jlMultas.setPreferredSize(new java.awt.Dimension(163, 30));
        jlMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMultasMouseExited(evt);
            }
        });
        jPanel1.add(jlMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 163, 30));

        jlContratos.setBackground(new java.awt.Color(34, 65, 93));
        jlContratos.setFont(new java.awt.Font("Univers-Black", 1, 18)); // NOI18N
        jlContratos.setForeground(new java.awt.Color(255, 255, 255));
        jlContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlContratos.setText("CONTRATOS");
        jlContratos.setPreferredSize(new java.awt.Dimension(163, 30));
        jlContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlContratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlContratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlContratosMouseExited(evt);
            }
        });
        jPanel1.add(jlContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 163, 30));

        jbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbSalir.setText("SALIR");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 140, 40));

        jbListarInsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbListarInsp.setText("LISTAR INSPECCIONES");
        jbListarInsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbListarInspMouseClicked(evt);
            }
        });
        jPanel1.add(jbListarInsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 140, 40));

        jLabel1.setText("GESTIÓN DE USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo1.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContactoMouseClicked
        AdmPersona persona = new AdmPersona(null, rootPaneCheckingEnabled);
        persona.setLocationRelativeTo(null);
        persona.setVisible(true);

    }//GEN-LAST:event_jlContactoMouseClicked

    private void jlContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContactoMouseEntered
        jlContacto.setForeground(Color.BLACK);
        jlContacto.setBackground(fondo);
    }//GEN-LAST:event_jlContactoMouseEntered

    private void jlContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContactoMouseExited
        jlContacto.setForeground(Color.WHITE);
        jlContacto.setBackground(fondo);
    }//GEN-LAST:event_jlContactoMouseExited

    private void jlListarInmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListarInmueblesMouseClicked
        ListarInmuebles listaInmueble = new ListarInmuebles(this, rootPaneCheckingEnabled, user);
        listaInmueble.setLocationRelativeTo(null);
        listaInmueble.setVisible(true);
    }//GEN-LAST:event_jlListarInmueblesMouseClicked

    private void jlListarInmueblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListarInmueblesMouseEntered
        jlListarInmuebles.setForeground(Color.BLACK);
        jlListarInmuebles.setBackground(fondoR);
    }//GEN-LAST:event_jlListarInmueblesMouseEntered

    private void jlListarInmueblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListarInmueblesMouseExited
        jlListarInmuebles.setForeground(Color.WHITE);
        jlListarInmuebles.setBackground(fondo);
    }//GEN-LAST:event_jlListarInmueblesMouseExited

    private void jlInmueble1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInmueble1MouseClicked
        AdmInmuebles inmueble = new AdmInmuebles(this, rootPaneCheckingEnabled);
        inmueble.setLocationRelativeTo(null);
        inmueble.setVisible(true);
    }//GEN-LAST:event_jlInmueble1MouseClicked

    private void jlInmueble1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInmueble1MouseEntered
        jlInmueble1.setForeground(Color.BLACK);
        jlInmueble1.setBackground(fondoR);
    }//GEN-LAST:event_jlInmueble1MouseEntered

    private void jlInmueble1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInmueble1MouseExited
        jlInmueble1.setForeground(Color.WHITE);
        jlInmueble1.setBackground(fondo);
    }//GEN-LAST:event_jlInmueble1MouseExited

    private void jlMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultasMouseClicked
        AdmMulta multa = new AdmMulta(this, rootPaneCheckingEnabled);
        multa.setLocationRelativeTo(null);
        multa.setVisible(true);
    }//GEN-LAST:event_jlMultasMouseClicked

    private void jlMultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultasMouseEntered
        jlMultas.setForeground(Color.BLACK);
        jlMultas.setBackground(fondoR);
    }//GEN-LAST:event_jlMultasMouseEntered

    private void jlMultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMultasMouseExited
        jlMultas.setForeground(Color.WHITE);
        jlMultas.setBackground(fondo);
    }//GEN-LAST:event_jlMultasMouseExited

    private void jlContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContratosMouseClicked
        ListarContratos lista = new ListarContratos(null, rootPaneCheckingEnabled);
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
    }//GEN-LAST:event_jlContratosMouseClicked

    private void jlContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContratosMouseEntered
        jlContratos.setForeground(Color.BLACK);
        jlContratos.setBackground(fondoR);
    }//GEN-LAST:event_jlContratosMouseEntered

    private void jlContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlContratosMouseExited
        jlContratos.setForeground(Color.WHITE);
        jlContratos.setBackground(fondo);
    }//GEN-LAST:event_jlContratosMouseExited

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
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbListarInsp;
    private javax.swing.JLabel jbSalir;
    private javax.swing.JLabel jlContacto;
    private javax.swing.JLabel jlContratos;
    private javax.swing.JLabel jlInmueble1;
    private javax.swing.JLabel jlListarInmuebles;
    private javax.swing.JLabel jlMultas;
    // End of variables declaration//GEN-END:variables
}
