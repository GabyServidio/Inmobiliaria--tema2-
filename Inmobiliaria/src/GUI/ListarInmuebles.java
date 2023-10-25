/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import Entidades.Inmueble;
import Entidades.Persona;
import Entidades.Usuario;
import AccesoADatos.InmuebleData;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Veronica Porqueras
 */
public class ListarInmuebles extends javax.swing.JDialog {

    /**
     * Creates new form ListarInmjebles
     */
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private Usuario usuario = null;
    private InmuebleData controlInm = new InmuebleData();
    public ListarInmuebles(java.awt.Frame parent, boolean modal, Usuario user) {
        super(parent, modal);
        usuario = user;
        setTitle("Listar Inmuebles");
        initComponents();
        compruebaUsuario();
        llenarCombo();
        cabecera();
        cargarTabla();
        ajustarAnchoColumnas();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmueble = new javax.swing.JTable();
        jtDato = new javax.swing.JTextField();
        jbContratar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbInspeccionar = new javax.swing.JButton();
        jcbOpcion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 450));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 800));

        jtInmueble.setBackground(new java.awt.Color(138, 175, 188));
        jtInmueble.setForeground(new java.awt.Color(0, 0, 0));
        jtInmueble.setModel(new javax.swing.table.DefaultTableModel(
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
        jtInmueble.setDragEnabled(true);
        jtInmueble.setGridColor(new java.awt.Color(118, 151, 117));
        jtInmueble.setOpaque(false);
        jScrollPane1.setViewportView(jtInmueble);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 980, 330));

        jtDato.setBackground(new java.awt.Color(138, 175, 188));
        jtDato.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jtDato.setForeground(new java.awt.Color(0, 0, 0));
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

        jbContratar.setForeground(new java.awt.Color(0, 0, 0));
        jbContratar.setText("Contratar");
        jbContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContratarActionPerformed(evt);
            }
        });
        jPanel1.add(jbContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jbInspeccionar.setForeground(new java.awt.Color(0, 0, 0));
        jbInspeccionar.setText("Inspeccionar");
        jbInspeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInspeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbInspeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jcbOpcion.setBorder(null);
        jcbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 30));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione por que desea listar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1000x400x70o.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionActionPerformed
        cambiarInfo();
    }//GEN-LAST:event_jcbOpcionActionPerformed

    private void jtDatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDatoKeyReleased
        limpiarFila();
        if (jtDato.getText().isEmpty()) {
            cargarTabla();
        } else {
            buscar();
        }
    }//GEN-LAST:event_jtDatoKeyReleased

    private void jtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDatoActionPerformed

    }//GEN-LAST:event_jtDatoActionPerformed

    private void jtDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatoMouseClicked
        jtDato.setText("");
    }//GEN-LAST:event_jtDatoMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MVendedor.inmubleSeleccionado = null;
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            int fila = jtInmueble.getSelectedRow();
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            MVendedor.inmubleSeleccionado = MVendedor.controlInm.buscarInmuebleXId(id);
            limpiarFila();
            AdmInmuebles edit = new AdmInmuebles(null, rootPaneCheckingEnabled);
            edit.setVisible(rootPaneCheckingEnabled);
            cargarTabla();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila primero", "Error", JOptionPane.ERROR);

        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbInspeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInspeccionarActionPerformed
        try {
            int fila = jtInmueble.getSelectedRow();
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            if (isVendedor()) {
                MVendedor.inmubleSeleccionado = controlInm.buscarInmuebleXId(id);
            }else{
                MInspector.inmuselec = controlInm.buscarInmuebleXId(id);
            }
                    
                    
            Inspeccionar insp = new Inspeccionar(null, rootPaneCheckingEnabled);
            insp.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila primero", "Error", JOptionPane.ERROR);

        }
    }//GEN-LAST:event_jbInspeccionarActionPerformed

    private void jbContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContratarActionPerformed
        try {
            int fila = jtInmueble.getSelectedRow();
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            MVendedor.inmubleSeleccionado = MVendedor.controlInm.buscarInmuebleXId(id);
            AdmContratos contrato = new AdmContratos(null, rootPaneCheckingEnabled);
            contrato.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila primero", "Error", JOptionPane.ERROR);

        }
    }//GEN-LAST:event_jbContratarActionPerformed

    private void jtDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDatoKeyTyped
        char c = evt.getKeyChar();
        switch (jcbOpcion.getSelectedItem().toString()) {
            case "Codigo":

                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                    evt.consume(); // Consumir el evento si no es una letra o espacio
                    JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

                }
                break;
            case "Propietario":

                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                    evt.consume(); // Consumir el evento si no es una letra o espacio
                    JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");

                }
                break;
            case "Direccion":
                if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
                    evt.consume(); // Consumir el evento = hace que la tecla apretada no se refleje en el textField
                }
                break;
            case "Zona":
                if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
                    evt.consume(); // Consumir el evento = hace que la tecla apretada no se refleje en el textField
                }
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jtDatoKeyTyped

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
            java.util.logging.Logger.getLogger(ListarInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ListarInmuebles dialog = new ListarInmuebles(new javax.swing.JFrame(), true, vendedor);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbContratar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbInspeccionar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbOpcion;
    private javax.swing.JTextField jtDato;
    private javax.swing.JTable jtInmueble;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        jcbOpcion.addItem("Direccion");
        jcbOpcion.addItem("Zona");
        jcbOpcion.addItem("Propietario");
        jcbOpcion.addItem("Codigo");

    }

    private void cabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Zona");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ambientes");
        modelo.addColumn("Superficie");
        modelo.addColumn("Garage");
        modelo.addColumn("Baños");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha Construccion");
        modelo.addColumn("Propietario");
        modelo.addColumn("Estado");
        modelo.addColumn("Condiociones Contrato");
        jtInmueble.setModel(modelo);
        TableRowSorter<DefaultTableModel> ordenar = new TableRowSorter<>(modelo);
        jtInmueble.setRowSorter(ordenar);
    }

    private void cargarTabla() {
        for (Inmueble inmueble : MVendedor.controlInm.listarInmueble()) {
            Persona propietario = MVendedor.controlPer.encontrarPersonaXId(inmueble.getIdPropietario());
            modelo.addRow(new Object[]{
                inmueble.getId(),
                inmueble.getZona(),
                inmueble.getDireccion(),
                inmueble.getCantAmbientes(),
                inmueble.getSuperficie(),
                inmueble.getGarage(),
                inmueble.getCanBaños(),
                inmueble.getCondicionesContrato(),
                inmueble.getFechaConstruccion(),
                propietario.getApellido().concat(", ").concat(propietario.getNombre()),
                inmueble.getEstadoInmueble(),
                inmueble.getTipo()
            });
        }

    }

    private void limpiarFila() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void ajustarAnchoColumnas() {
        for (int column = 0; column < jtInmueble.getColumnCount(); column++) {
            TableColumn tableColumn = jtInmueble.getColumnModel().getColumn(column);
            int anchoPreferido = tableColumn.getMinWidth();
            int anchoMaximo = tableColumn.getMaxWidth();

            for (int row = 0; row < jtInmueble.getRowCount(); row++) {
                TableCellRenderer cellRenderer = jtInmueble.getCellRenderer(row, column);
                Component c = jtInmueble.prepareRenderer(cellRenderer, row, column);
                int ancho = c.getPreferredSize().width + jtInmueble.getIntercellSpacing().width;
                anchoPreferido = Math.max(anchoPreferido, ancho);

                // Ajuste para evitar que el ancho de la columna supere el ancho máximo establecido.
                if (anchoPreferido >= anchoMaximo) {
                    anchoPreferido = anchoMaximo;
                    break;
                }
            }
            tableColumn.setPreferredWidth(anchoPreferido);
        }
    }

    private void cambiarInfo() {
        String opcion = jcbOpcion.getSelectedItem().toString();

        switch (opcion) {
            case "Direccion":
                jtDato.setText("Ingrese la direccion del Inmueble");

                break;
            case "Zona":
                jtDato.setText("Ingrese la Zona");
                break;
            case "Propietario":
                jtDato.setText("Ingrese el DNI del propietario");
                break;

            case "Codigo":
                jtDato.setText("Ingrese el numero de Codigo de la propiedad");
                break;

        }

    }

    private void buscar() {
        String opcion = jcbOpcion.getSelectedItem().toString();
        switch (opcion) {
            case "Direccion":
                buscarXDireccion();
                break;
            case "Zona":
                buscarXZona();
                break;
            case "Propietario":
                buscarXPropietario();
                break;

            case "Codigo":
                buscarXCodigo();
                break;
        }
    }

    private void buscarXDireccion() {
        for (Inmueble inmueble : MVendedor.controlInm.listarInmueble()) {
            if (inmueble.getDireccion().toLowerCase().startsWith(jtDato.getText().toLowerCase())) {
                Persona propietario = MVendedor.controlPer.encontrarPersonaXId(inmueble.getIdPropietario());
                modelo.addRow(new Object[]{
                    inmueble.getId(),
                    inmueble.getZona(),
                    inmueble.getDireccion(),
                    inmueble.getCantAmbientes(),
                    inmueble.getSuperficie(),
                    inmueble.getGarage(),
                    inmueble.getCanBaños(),
                    inmueble.getCondicionesContrato(),
                    inmueble.getFechaConstruccion(),
                    propietario.getApellido().concat(", ").concat(propietario.getNombre()),
                    inmueble.getEstadoInmueble(),
                    inmueble.getTipo()
                });
            }
        }
    }

    private void buscarXZona() {
        for (Inmueble inmueble : MVendedor.controlInm.listarInmueble()) {
            if (inmueble.getZona().toLowerCase().startsWith(jtDato.getText().toLowerCase())) {
                Persona propietario = MVendedor.controlPer.encontrarPersonaXId(inmueble.getIdPropietario());
                modelo.addRow(new Object[]{
                    inmueble.getId(),
                    inmueble.getZona(),
                    inmueble.getDireccion(),
                    inmueble.getCantAmbientes(),
                    inmueble.getSuperficie(),
                    inmueble.getGarage(),
                    inmueble.getCanBaños(),
                    inmueble.getCondicionesContrato(),
                    inmueble.getFechaConstruccion(),
                    propietario.getApellido().concat(", ").concat(propietario.getNombre()),
                    inmueble.getEstadoInmueble(),
                    inmueble.getTipo()
                });
            }
        }

    }

    private void buscarXCodigo() {
        for (Inmueble inmueble : MVendedor.controlInm.listarInmueble()) {
            if (inmueble.getId() == Integer.parseInt(jtDato.getText())) {
                Persona propietario = MVendedor.controlPer.encontrarPersonaXId(inmueble.getIdPropietario());
                modelo.addRow(new Object[]{
                    inmueble.getId(),
                    inmueble.getZona(),
                    inmueble.getDireccion(),
                    inmueble.getCantAmbientes(),
                    inmueble.getSuperficie(),
                    inmueble.getGarage(),
                    inmueble.getCanBaños(),
                    inmueble.getCondicionesContrato(),
                    inmueble.getFechaConstruccion(),
                    propietario.getApellido().concat(", ").concat(propietario.getNombre()),
                    inmueble.getEstadoInmueble(),
                    inmueble.getTipo()
                });
            }
        }
    }

    private void buscarXPropietario() {

        for (Persona propietario : MVendedor.controlPer.listarPropietarios()) {
            String dni = propietario.getDni() + "";

            if (dni.startsWith(jtDato.getText())) {
                Inmueble inmueble = MVendedor.controlInm.buscarInmueble(propietario.getId());
                modelo.addRow(new Object[]{
                    inmueble.getId(),
                    inmueble.getZona(),
                    inmueble.getDireccion(),
                    inmueble.getCantAmbientes(),
                    inmueble.getSuperficie(),
                    inmueble.getGarage(),
                    inmueble.getCanBaños(),
                    inmueble.getCondicionesContrato(),
                    inmueble.getFechaConstruccion(),
                    propietario.getApellido().concat(", ").concat(propietario.getNombre()),
                    inmueble.getEstadoInmueble(),
                    inmueble.getTipo()
                });
            }
        }
    }

    private void compruebaUsuario() {

        if (usuario.getTipo().equals("I")) {
            jbContratar.setEnabled(false);
            jbInspeccionar.setEnabled(true);
            jbEditar.setEnabled(false);
        } else if (usuario.getTipo().equals("V")) {
            jbContratar.setEnabled(true);
            jbInspeccionar.setEnabled(false);
        }
    }

    private boolean isVendedor() {
        if (usuario.getTipo().equals("V")) {
            return true;
        } else {
            return false;
        }

    }

}
