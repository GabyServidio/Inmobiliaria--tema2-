package GUI;

import Entidades.Contrato;
import Entidades.Inspeccion;
import Entidades.Inspector;
import Entidades.Persona;
import Entidades.Usuario;
import java.awt.Frame;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarInspecciones extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private boolean buscarXfecha = false;

    public static Inspeccion inspEdit = null;
    public static int idInspeccion;
    public static int idInquilino;

    private Inspeccion seleccionada = null;
    private Persona seleInquilino = null;
    private Contrato seleContrato = null;

    public ListarInspecciones(Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Inspecciones");
        initComponents();
        jDCFecha.setVisible(true);
        jDCFecha.setEnabled(false);
        jTFDato.setEditable(false);
        llenarCombo();
        cabecera();
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFDato = new javax.swing.JTextField();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInspecciones = new javax.swing.JTable();
        jCBBuscarPor = new javax.swing.JComboBox<>();
        jBEditar = new javax.swing.JButton();
        jBMulta = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFDato.setBackground(new java.awt.Color(51, 33, 71));
        jTFDato.setForeground(new java.awt.Color(251, 227, 185));
        jTFDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFDatoMouseClicked(evt);
            }
        });
        jTFDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFDatoKeyReleased(evt);
            }
        });
        getContentPane().add(jTFDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 109, 160, 40));
        jTFDato.getAccessibleContext().setAccessibleDescription("Ingrese la fecha");

        jDCFecha.setForeground(new java.awt.Color(251, 227, 185));
        jDCFecha.setToolTipText("dd/MM/yyyy");
        jDCFecha.setDateFormatString("Ingrese Fecha");
        jDCFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaPropertyChange(evt);
            }
        });
        getContentPane().add(jDCFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 109, -1, 40));
        jDCFecha.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setBackground(new java.awt.Color(51, 33, 71));
        jLabel1.setForeground(new java.awt.Color(251, 227, 185));
        jLabel1.setText("BUSCAR POR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 90, 40));

        jScrollPane1.setBackground(new java.awt.Color(51, 33, 71));
        jScrollPane1.setForeground(new java.awt.Color(251, 227, 185));
        jScrollPane1.setOpaque(false);

        jTInspecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID INSPECCIÓN", "ID INSPECTOR", "ID INMUEBLE", "FECHA", "DETALLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTInspecciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInspecciones);
        if (jTInspecciones.getColumnModel().getColumnCount() > 0) {
            jTInspecciones.getColumnModel().getColumn(1).setResizable(false);
            jTInspecciones.getColumnModel().getColumn(2).setResizable(false);
            jTInspecciones.getColumnModel().getColumn(3).setResizable(false);
            jTInspecciones.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 380, 190));

        jCBBuscarPor.setBackground(new java.awt.Color(51, 33, 71));
        jCBBuscarPor.setForeground(new java.awt.Color(251, 227, 185));
        jCBBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBBuscarPorItemStateChanged(evt);
            }
        });
        getContentPane().add(jCBBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 109, 110, 40));

        jBEditar.setBackground(new java.awt.Color(51, 33, 71));
        jBEditar.setForeground(new java.awt.Color(251, 227, 185));
        jBEditar.setText("EDITAR");
        jBEditar.setToolTipText("Editar");
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEditarMouseClicked(evt);
            }
        });
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 387, -1, 45));

        jBMulta.setBackground(new java.awt.Color(51, 33, 71));
        jBMulta.setForeground(new java.awt.Color(251, 227, 185));
        jBMulta.setText("MULTAR");
        jBMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultaActionPerformed(evt);
            }
        });
        getContentPane().add(jBMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 387, -1, 45));

        jBSalir.setBackground(new java.awt.Color(51, 33, 71));
        jBSalir.setForeground(new java.awt.Color(251, 227, 185));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida2.png"))); // NOI18N
        jBSalir.setToolTipText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 387, -1, 45));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BG_ListarInspecciones.png"))); // NOI18N
        Background.setText("BUSCAR POR");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBBuscarPorItemStateChanged
        cambiarInfo();        // TODO add your handling code here:
    }//GEN-LAST:event_jCBBuscarPorItemStateChanged

    private void jTFDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFDatoMouseClicked
        if (!jCBBuscarPor.getSelectedItem().equals("FECHA")) {
            jTFDato.setText("");
        }
    }//GEN-LAST:event_jTFDatoMouseClicked

    private void jTFDatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDatoKeyReleased
        if (jTFDato.getText().isEmpty()) {
            limpiarFila();
            cargarTabla();
        } else {
            buscar();
        }
    }//GEN-LAST:event_jTFDatoKeyReleased

    private void jDCFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFechaPropertyChange
        if (buscarXfecha) {
            buscar();
        }
    }//GEN-LAST:event_jDCFechaPropertyChange

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseClicked
        try {
            int id = (int) modelo.getValueAt(jTInspecciones.getSelectedRow(), 0);
            seleccionada = MInspector.controlInsp.buscarInspeccion(id);
            inspEdit = seleccionada;
            DetalleInspeccion detalleedit = new DetalleInspeccion(null, rootPaneCheckingEnabled);
            detalleedit.setLocationRelativeTo(null);
            detalleedit.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una inspección ");
        }
    }//GEN-LAST:event_jBEditarMouseClicked

    private void jBMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultaActionPerformed
        try {
            int idInmueble = (int) modelo.getValueAt(jTInspecciones.getSelectedRow(), 2);
            seleContrato = MInspector.controlContrato.encontrarContratoXIdInmueble(idInmueble);
            int idInquilino = seleContrato.getIdInquilino();
            int id = (int) modelo.getValueAt(jTInspecciones.getSelectedRow(), 0);
            seleccionada = MInspector.controlInsp.buscarInspeccion(id);
            idInspeccion = seleccionada.getId();
            dispose();
            
            if (seleContrato != null) {
                Multar nuevamulta = new Multar(null, rootPaneCheckingEnabled, idInspeccion, idInquilino);
                nuevamulta.setLocationRelativeTo(null);
                nuevamulta.setVisible(true);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una inspección ");
        } catch(NullPointerException np){
        }
    }//GEN-LAST:event_jBMultaActionPerformed

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
            java.util.logging.Logger.getLogger(ListarInspecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarInspecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarInspecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarInspecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarInspecciones dialog = new ListarInspecciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Background;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBMulta;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBBuscarPor;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDato;
    private javax.swing.JTable jTInspecciones;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        jCBBuscarPor.addItem("ID INSPECTOR");
        jCBBuscarPor.addItem("ID INMUEBLE");
        jCBBuscarPor.addItem("FECHA");
    }

    private void cabecera() {
        modelo.addColumn("ID INSPECCIÓN");
        modelo.addColumn("ID INSPECTOR");
        modelo.addColumn("ID INMUEBLE");
        modelo.addColumn("FECHA");
        modelo.addColumn("DESCRIPCIÓN");

        jTInspecciones.setModel(modelo);
        TableRowSorter<DefaultTableModel> ordenar = new TableRowSorter<>(modelo);
        jTInspecciones.setRowSorter(ordenar);
    }

    private void cargarTabla() {
        for (Inspeccion inspeccion : MInspector.controlInsp.listarInspeciones()) {

            modelo.addRow(new Object[]{
                inspeccion.getId(),
                inspeccion.getIdInspector(),
                inspeccion.getIdInmueble(),
                inspeccion.getFecha(),
                inspeccion.getDescripcion()
            }
            );
        }

    }

    private void limpiarFila() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cambiarInfo() {
        String opcion = jCBBuscarPor.getSelectedItem().toString();

        switch (opcion) {
            case "ID INSPECTOR":
                buscarXfecha = false;
                jTFDato.setVisible(true);
                jTFDato.setText("Ingrese el ID del inspector");
                jTFDato.setEditable(true);
                jDCFecha.setVisible(false);
                break;

            case "ID INMUEBLE":
                buscarXfecha = false;
                jDCFecha.setVisible(false);
                jTFDato.setVisible(true);
                jTFDato.setText("Ingrese el ID del inmueble");
                jTFDato.setEditable(true);
                break;

            case "FECHA":
                jDCFecha.setVisible(true);
                jTFDato.setVisible(false);
                jDCFecha.setEnabled(true);
                buscarXfecha = true;
                break;

        }

    }

    private void buscar() {
        String opcion = jCBBuscarPor.getSelectedItem().toString();
        switch (opcion) {
            case "ID INSPECTOR":
                limpiarFila();
                buscarXIdInspector();
                break;
            case "ID INMUEBLE":
                limpiarFila();
                buscarXIdInmueble();
                break;
            case "FECHA":
                limpiarFila();
                buscarXFecha();
                break;
        }
    }

    private void buscarXIdInspector() {
        for (Inspeccion inspeccion : MInspector.controlInsp.listarInspeciones()) {
            if (inspeccion.getIdInspector() == Integer.parseInt(jTFDato.getText())) {
                modelo.addRow(new Object[]{
                    inspeccion.getId(),
                    inspeccion.getIdInspector(),
                    inspeccion.getIdInmueble(),
                    inspeccion.getFecha(),
                    inspeccion.getDescripcion()
                }
                );
            }
        }
    }

    private void buscarXIdInmueble() {
        for (Inspeccion inspeccion : MInspector.controlInsp.listarInspeciones()) {
            if (inspeccion.getIdInmueble() == Integer.parseInt(jTFDato.getText())) {
                modelo.addRow(new Object[]{
                    inspeccion.getId(),
                    inspeccion.getIdInspector(),
                    inspeccion.getIdInmueble(),
                    inspeccion.getFecha(),
                    inspeccion.getDescripcion()
                }
                );
            }
        }
    }

    private void buscarXFecha() {
        for (Inspeccion inspeccion : MInspector.controlInsp.listarInspeciones()) {
            Date fecha = jDCFecha.getDate();
            LocalDate fechaInsp = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (inspeccion.getFecha().equals(fechaInsp)) {
                modelo.addRow(new Object[]{
                    inspeccion.getId(),
                    inspeccion.getIdInspector(),
                    inspeccion.getIdInmueble(),
                    inspeccion.getFecha(),
                    inspeccion.getDescripcion()
                }
                );
            }
        }
    }
}
