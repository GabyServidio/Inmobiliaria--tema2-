/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

/**
 *
 * @author Veronica Porqueras
 */
public class AdmContratos extends javax.swing.JDialog {

    /**
     * Creates new form AdmContratos
     */
    public AdmContratos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bCrear = new javax.swing.JLabel();
        jpInquilino = new javax.swing.JPanel();
        jtInquilino = new javax.swing.JTextField();
        bBuscarInquilino1 = new javax.swing.JLabel();
        TXTinquilino1 = new javax.swing.JLabel();
        NombreInquilino = new javax.swing.JLabel();
        ApellidoInquilino = new javax.swing.JLabel();
        dniInquilino = new javax.swing.JLabel();
        CuilInquilino = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        telefonoInquilino = new javax.swing.JLabel();
        eMailInquilino = new javax.swing.JLabel();
        janelGarante = new javax.swing.JPanel();
        jtGarante = new javax.swing.JTextField();
        NombreGarante = new javax.swing.JLabel();
        ApellidoGarante = new javax.swing.JLabel();
        dniGarante = new javax.swing.JLabel();
        CuilGarante = new javax.swing.JLabel();
        DireccionGarante = new javax.swing.JLabel();
        telefonoGarante = new javax.swing.JLabel();
        eMailGarante = new javax.swing.JLabel();
        TXTGarante = new javax.swing.JLabel();
        bBuscargarante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCrear.setBackground(new java.awt.Color(51, 51, 255));
        bCrear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bCrear.setForeground(new java.awt.Color(255, 255, 255));
        bCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bCrear.setText("CREAR");
        bCrear.setOpaque(true);
        jPanel1.add(bCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 40));

        jtInquilino.setText("ingrese DNI del inquilino");
        jtInquilino.setBorder(null);
        jtInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtInquilinoActionPerformed(evt);
            }
        });

        bBuscarInquilino1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPerson.png"))); // NOI18N
        bBuscarInquilino1.setText("Buscar");

        TXTinquilino1.setText("Inquilino");

        NombreInquilino.setText("Nombre");

        ApellidoInquilino.setText("Apellido");

        dniInquilino.setText("DNI");

        CuilInquilino.setText("CUIL/CUIT");

        Direccion.setText("Direccion");

        telefonoInquilino.setText("telefono");

        eMailInquilino.setText("eMail");

        javax.swing.GroupLayout jpInquilinoLayout = new javax.swing.GroupLayout(jpInquilino);
        jpInquilino.setLayout(jpInquilinoLayout);
        jpInquilinoLayout.setHorizontalGroup(
            jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInquilinoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(TXTinquilino1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBuscarInquilino1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInquilinoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInquilinoLayout.createSequentialGroup()
                        .addComponent(NombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ApellidoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInquilinoLayout.createSequentialGroup()
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(CuilInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInquilinoLayout.createSequentialGroup()
                        .addComponent(dniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(telefonoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eMailInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpInquilinoLayout.setVerticalGroup(
            jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInquilinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTinquilino1)
                        .addComponent(jtInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscarInquilino1))
                .addGap(18, 18, 18)
                .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreInquilino)
                    .addComponent(ApellidoInquilino))
                .addGap(14, 14, 14)
                .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion)
                    .addComponent(CuilInquilino))
                .addGap(14, 14, 14)
                .addGroup(jpInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniInquilino)
                    .addComponent(telefonoInquilino))
                .addGap(14, 14, 14)
                .addComponent(eMailInquilino)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jpInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 170));

        jtGarante.setText("ingrese DNI del Garante");
        jtGarante.setBorder(null);
        jtGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGaranteActionPerformed(evt);
            }
        });

        NombreGarante.setText("Nombre");

        ApellidoGarante.setText("Apellido");

        dniGarante.setText("DNI");

        CuilGarante.setText("CUIL/CUIT");

        DireccionGarante.setText("Direccion");

        telefonoGarante.setText("telefono");

        eMailGarante.setText("eMail");

        TXTGarante.setText("Garante");

        bBuscargarante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPerson.png"))); // NOI18N
        bBuscargarante.setText("Buscar");

        javax.swing.GroupLayout janelGaranteLayout = new javax.swing.GroupLayout(janelGarante);
        janelGarante.setLayout(janelGaranteLayout);
        janelGaranteLayout.setHorizontalGroup(
            janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelGaranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(janelGaranteLayout.createSequentialGroup()
                        .addComponent(TXTGarante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBuscargarante))
                    .addGroup(janelGaranteLayout.createSequentialGroup()
                        .addComponent(NombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(janelGaranteLayout.createSequentialGroup()
                        .addComponent(dniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CuilGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eMailGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(janelGaranteLayout.createSequentialGroup()
                        .addComponent(DireccionGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        janelGaranteLayout.setVerticalGroup(
            janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelGaranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTGarante)
                        .addComponent(jtGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscargarante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreGarante)
                    .addComponent(ApellidoGarante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniGarante)
                    .addComponent(CuilGarante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(janelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionGarante)
                    .addComponent(telefonoGarante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eMailGarante)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(janelGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 410, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGaranteActionPerformed

    private void jtInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtInquilinoActionPerformed

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
            java.util.logging.Logger.getLogger(AdmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdmContratos dialog = new AdmContratos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel ApellidoGarante;
    private javax.swing.JLabel ApellidoInquilino;
    private javax.swing.JLabel CuilGarante;
    private javax.swing.JLabel CuilInquilino;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel DireccionGarante;
    private javax.swing.JLabel NombreGarante;
    private javax.swing.JLabel NombreInquilino;
    private javax.swing.JLabel TXTGarante;
    private javax.swing.JLabel TXTinquilino1;
    private javax.swing.JLabel bBuscarInquilino1;
    private javax.swing.JLabel bBuscargarante;
    private javax.swing.JLabel bCrear;
    private javax.swing.JLabel dniGarante;
    private javax.swing.JLabel dniInquilino;
    private javax.swing.JLabel eMailGarante;
    private javax.swing.JLabel eMailInquilino;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel janelGarante;
    private javax.swing.JPanel jpInquilino;
    private javax.swing.JTextField jtGarante;
    private javax.swing.JTextField jtInquilino;
    private javax.swing.JLabel telefonoGarante;
    private javax.swing.JLabel telefonoInquilino;
    // End of variables declaration//GEN-END:variables
}
