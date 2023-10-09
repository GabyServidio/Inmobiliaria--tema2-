
package GUI;

import AccesoADatos.UsuarioData;
import Entidades.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Acevedo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form log
     */
    private UsuarioData usuarioData = new UsuarioData();
    public Inicio() {
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
        jtUsuario = new javax.swing.JTextField();
        jpPass = new javax.swing.JPasswordField();
        jlSalir = new javax.swing.JLabel();
        jlIngresar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsuario.setBackground(new java.awt.Color(40, 62, 49));
        jtUsuario.setForeground(new java.awt.Color(178, 208, 158));
        jtUsuario.setText("Ingrese su nombre de Usuario y contraseña");
        jtUsuario.setBorder(null);
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 280, 30));

        jpPass.setBackground(new java.awt.Color(40, 62, 49));
        jpPass.setForeground(new java.awt.Color(178, 208, 158));
        jpPass.setText("contraseña");
        jpPass.setBorder(null);
        jpPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPassMouseClicked(evt);
            }
        });
        jPanel1.add(jpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 280, 30));

        jlSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(178, 208, 158));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("SALIR");
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSalirMouseExited(evt);
            }
        });
        jPanel1.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 90, 30));

        jlIngresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlIngresar.setForeground(new java.awt.Color(178, 208, 158));
        jlIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIngresar.setText("INGRESAR");
        jlIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlIngresarMouseExited(evt);
            }
        });
        jPanel1.add(jlIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 90, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered
        jlSalir.setForeground(Color.white);
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited
        jlSalir.setForeground(new Color(178, 208, 158));
    }//GEN-LAST:event_jlSalirMouseExited

    private void jlIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIngresarMouseEntered
        jlIngresar.setForeground(Color.white);
    }//GEN-LAST:event_jlIngresarMouseEntered

    private void jlIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIngresarMouseExited
        jlIngresar.setForeground(new Color(178, 208, 158));
    }//GEN-LAST:event_jlIngresarMouseExited

    private void jtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMouseClicked
        if (jtUsuario.getText().equals("Ingrese su nombre de Usuario y contraseña")) {
            jtUsuario.setText("");
            jtUsuario.setForeground(Color.WHITE);
        }
        if (String.valueOf(jpPass.getPassword()).isEmpty()) {
            jpPass.setText("********");
            jpPass.setForeground(new Color(178, 208, 158));
        }

    }//GEN-LAST:event_jtUsuarioMouseClicked

    private void jpPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPassMouseClicked
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su nombre de Usuario y Contraseña");
            jtUsuario.setForeground(new Color(178, 208, 158));
        }
        if (String.valueOf(jpPass.getPassword()).equals("contraseña")) {
            jpPass.setText("");
            jpPass.setForeground(Color.WHITE);
        }


    }//GEN-LAST:event_jpPassMouseClicked

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
     dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIngresarMouseClicked
    String user = jtUsuario.getText();
    Usuario encontrado = usuarioData.buscarUsuario(user);
        System.out.println(user);
    char[] pass = jpPass.getPassword();
    String contraseña = new String(pass);
        if (encontrado !=null) {
            if (encontrado.getContraseña().equals(contraseña)) {
                    
                
                switch (encontrado.getTipo()) {
                    case "V": //llama a la ventana vendedor
                        JOptionPane.showMessageDialog(null, "ingreso como Vendedor");
                        dispose();
                        break;
                    case "I"://llama a la ventana Inspector
                         JOptionPane.showMessageDialog(null, "ingreso como Inspector");
                        dispose();
                        break;
                    case"A": //llama a la ventana Admnistrador
                         JOptionPane.showMessageDialog(null, "ingreso como Administrador");
                        dispose();
                         break;
                     
                    default:
                        throw new AssertionError();
                }
            }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        }
    }//GEN-LAST:event_jlIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlIngresar;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
