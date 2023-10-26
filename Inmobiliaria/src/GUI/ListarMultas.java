
package GUI;

import Entidades.Contrato;
import Entidades.Inspeccion;
import Entidades.Multa;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarMultas extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public ListarMultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarCombo();
        armarCabecera();
        cargarTabla();
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
        jLabel2 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jcbOpcion = new javax.swing.JComboBox<>();
        jtDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione por que desea listar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jcbOpcion.setBorder(null);
        jcbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 30));

        jtDato.setBackground(new java.awt.Color(138, 175, 188));
        jtDato.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jtDato.setBorder(null);
        jtDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatoMouseClicked(evt);
            }
        });
        jtDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDatoActionPerformed(evt);
            }
        });
        jtDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDatoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDatoKeyTyped(evt);
            }
        });
        jPanel1.add(jtDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 20));

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 800));

        jtMultas.setBackground(new java.awt.Color(138, 175, 188));
        jtMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtMultas.setDragEnabled(true);
        jtMultas.setGridColor(new java.awt.Color(118, 151, 117));
        jtMultas.setOpaque(false);
        jScrollPane1.setViewportView(jtMultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1000x400x70o.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionActionPerformed
        cambiarInfo();
    }//GEN-LAST:event_jcbOpcionActionPerformed

    private void jtDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatoMouseClicked
        jtDato.setText("");
    }//GEN-LAST:event_jtDatoMouseClicked

    private void jtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDatoActionPerformed

    }//GEN-LAST:event_jtDatoActionPerformed

    private void jtDatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDatoKeyReleased
        limpiarFila();
        if (jtDato.getText().isEmpty()) {
            cargarTabla();
        } else {
            buscar();
        }
    }//GEN-LAST:event_jtDatoKeyReleased

    private void jtDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDatoKeyTyped
        char c = evt.getKeyChar();
        switch (jcbOpcion.getSelectedItem().toString()) {
            case "Nro. Multa":

            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                evt.consume(); // Consumir el evento si no es una letra o espacio
                JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

            }
            break;
            case "Nro. Inspección":

            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                evt.consume(); // Consumir el evento si no es una letra o espacio
                JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

            }
            break;
            case "Cod. Inquilino":
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                evt.consume(); // Consumir el evento si no es una letra o espacio
                JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");
            }
            break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_jtDatoKeyTyped

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        MInspector.controlInsp = null;
        MVendedor.controlContrato = null;
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ListarMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarMultas dialog = new ListarMultas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbOpcion;
    private javax.swing.JTextField jtDato;
    private javax.swing.JTable jtMultas;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        jcbOpcion.addItem("Nro. Multa");
        jcbOpcion.addItem("Nro. Inspección");
        jcbOpcion.addItem("Cod. Inquilino");
        
    }

    private void armarCabecera() {
        modelo.addColumn("Nro. Multa");
        modelo.addColumn("Nro. Inspección");
        modelo.addColumn("Cod. Inquilino");
        modelo.addColumn("Fecha de Confección");
        modelo.addColumn("Fecha de Pago");
        modelo.addColumn("Monto");
        jtMultas.setModel(modelo);
        TableRowSorter<DefaultTableModel> ordenar = new TableRowSorter<>(modelo);
        jtMultas.setRowSorter(ordenar);
    }

    private void cambiarInfo() {
        String opcion = jcbOpcion.getSelectedItem().toString();
        switch (opcion) {
            case "Nro. Multa":
                jtDato.setText("Ingrese el número de multa");
                break;
            case "Nro. Inspección":
                jtDato.setText("Ingrese el número de inspección");
                break;
            case "Cod. Inquilino":
                jtDato.setText("Ingrese código de inquilino");
                break;
            
        }
    }

    private void limpiarFila() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void cargarTabla() {
        for (Multa multa : MInspector.controlMulta.listarMulta()){
            Inspeccion inspeccion = MInspector.controlInsp.buscarInspeccion(multa.getIdInspeccion());
            Contrato inquilino = MVendedor.controlContrato.encontrarContrato(multa.getIdInquilino());
            modelo.addRow(new Object[]{
                multa.getId(),
                multa.getIdInspeccion(),
                multa.getIdInquilino(),
                multa.getFechaConfeccion(),
                multa.getFechaPago(),
                multa.getMonto()
            });
        }

    }
    
    private void buscar() {
        String opcion = jcbOpcion.getSelectedItem().toString();
        switch (opcion) {
            case "Nro. Multa":
                buscarXMulta();
                break;
            case "Nro. Inspección":
                buscarXInspeccion();
                break;
            case "Nro. Inquilino":
                buscarXInquilino();
                break;
            
        }
    }
    
    private void buscarXMulta() {
        for (Multa multa : MInspector.controlMulta.listarMulta()){
            if (multa.getId() == Integer.parseInt(jtDato.getText())){
                Inspeccion inspeccion = MInspector.controlInsp.buscarInspeccion(multa.getIdInspeccion());
                Contrato inquilino = MVendedor.controlContrato.encontrarContrato(multa.getIdInquilino());
                modelo.addRow(new Object[]{
                    multa.getId(),
                    multa.getIdInspeccion(),
                    multa.getIdInquilino(),
                    multa.getFechaConfeccion(),
                    multa.getFechaPago(),
                    multa.getMonto()
                    
                });
            }
        }
    }
    
    private void buscarXInspeccion(){
        for (Multa multa : MInspector.controlMulta.listarMulta()){
            if (multa.getIdInspeccion() == Integer.parseInt(jtDato.getText())){
                Inspeccion inspeccion = MInspector.controlInsp.buscarInspeccion(multa.getIdInspeccion());
                Contrato inquilino = MVendedor.controlContrato.encontrarContrato(multa.getIdInquilino());
                modelo.addRow(new Object[]{
                    multa.getId(),
                    multa.getIdInspeccion(),
                    multa.getIdInquilino(),
                    multa.getFechaConfeccion(),
                    multa.getFechaPago(),
                    multa.getMonto()
                    
                });
            }
        }
    }
    
    private void buscarXInquilino(){
        for (Multa multa : MInspector.controlMulta.listarMulta()){
            if (multa.getIdInquilino() == Integer.parseInt(jtDato.getText())){
                Inspeccion inspeccion = MInspector.controlInsp.buscarInspeccion(multa.getIdInspeccion());
                Contrato inquilino = MVendedor.controlContrato.encontrarContrato(multa.getIdInquilino());
                modelo.addRow(new Object[]{
                    multa.getId(),
                    multa.getIdInspeccion(),
                    multa.getIdInquilino(),
                    multa.getFechaConfeccion(),
                    multa.getFechaPago(),
                    multa.getMonto()
                    
                });
            }
        }
    }
    
        
}