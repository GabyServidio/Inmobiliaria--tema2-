/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import AccesoADatos.UsuarioData;
import Entidades.Contrato;
import Entidades.Inmueble;
import Entidades.Persona;
import Entidades.Usuario;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ferna
 */
public class ListarContratos extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private UsuarioData controlUsuario = new UsuarioData();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ListarContratos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Listar Contratos");
        initComponents();
        jMes.addPropertyChangeListener("month", e -> buscar());
        jAnio.addPropertyChangeListener("year", e -> buscar());
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
        jMes = new com.toedter.calendar.JMonthChooser();
        jAnio = new com.toedter.calendar.JYearChooser();
        jcbEstado = new javax.swing.JComboBox<>();
        jtDato = new javax.swing.JTextField();
        jcbOpcion = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbRenovar = new javax.swing.JButton();
        jbRescindir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtContratos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));
        jPanel1.add(jAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jcbEstado.setBorder(null);
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDatoKeyTyped(evt);
            }
        });
        jPanel1.add(jtDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 26));

        jcbOpcion.setBorder(null);
        jcbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcbOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jbBuscar.setText("BUSCAR");
        jbBuscar.setBorder(null);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jbRenovar.setText("RENOVAR");
        jbRenovar.setBorder(null);
        jbRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenovarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRenovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jbRescindir.setText("RESCINDIR");
        jbRescindir.setBorder(null);
        jbRescindir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRescindirActionPerformed(evt);
            }
        });
        jPanel1.add(jbRescindir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jbSalir.setText("SALIR");
        jbSalir.setBorder(null);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jtContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtContratos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1000, 310));

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

    private void jtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDatoActionPerformed
        jtDato.setText("");
    }//GEN-LAST:event_jtDatoActionPerformed

    private void jtDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDatoKeyTyped
        char c = evt.getKeyChar();
        switch (jcbOpcion.getSelectedItem().toString()) {
            case "Propietario":
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                    evt.consume(); // Consumir el evento si no es una letra o espacio
                    JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");
                } else if (c == KeyEvent.VK_ENTER) {
                    limpiarFila();
                    buscar();
                }
                break;
            case "Inmueble":
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                    evt.consume(); // Consumir el evento si no es una letra o espacio
                    JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");
                } else if (c == KeyEvent.VK_ENTER) {
                    limpiarFila();
                    buscar();
                }
                break;
            case "Vendedor":
                if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
                    evt.consume(); // Consumir el evento = hace que la tecla apretada no se refleje en el textField
                } else if (c == KeyEvent.VK_ENTER) {
                    limpiarFila();
                    buscar();
                }
                break;
            case "Inquilino":
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER) {
                    evt.consume(); // Consumir el evento si no es una letra o espacio
                    JOptionPane.showMessageDialog(null, "Solo se pueden poner Numeros");
                } else if (c == KeyEvent.VK_ENTER) {
                    limpiarFila();
                    buscar();
                }
                break;

            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jtDatoKeyTyped

    private void jcbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionActionPerformed
        cambiarInfo();
        buscar();
    }//GEN-LAST:event_jcbOpcionActionPerformed

    private void jtDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatoMouseClicked
        jtDato.setText("");
    }//GEN-LAST:event_jtDatoMouseClicked

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        limpiarFila();
        buscar();
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenovarActionPerformed
        renovar();
    }//GEN-LAST:event_jbRenovarActionPerformed

    private void jbRescindirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRescindirActionPerformed
       rescindir();
    }//GEN-LAST:event_jbRescindirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        limpiarFila();
        if (jtDato.getText().isEmpty()) {
            cargarTabla();
        } else {
            buscar();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ListarContratos dialog = new ListarContratos(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JYearChooser jAnio;
    private com.toedter.calendar.JMonthChooser jMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbRenovar;
    private javax.swing.JButton jbRescindir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbOpcion;
    private javax.swing.JTable jtContratos;
    private javax.swing.JTextField jtDato;
    // End of variables declaration//GEN-END:variables
    private void renovar() {
        try{
        int fila = jtContratos.getSelectedRow();
        int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        MVendedor.contratoSeleccionado = MVendedor.controlContrato.encontrarContrato(id);
        AdmContratos renueva = new AdmContratos(null, rootPaneCheckingEnabled);
        renueva.setLocationRelativeTo(null);
        renueva.setVisible(true);
         } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila primero");

        }
    }
    
    private void rescindir() {
        try{
        
            int fila = jtContratos.getSelectedRow();
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            MVendedor.contratoSeleccionado = MVendedor.controlContrato.encontrarContrato(id);
            AdmContratos rescinde = new AdmContratos(null, rootPaneCheckingEnabled);
            rescinde.setLocationRelativeTo(null);
            rescinde.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila primero");

        }
    }

    private void llenarCombo() {
        jcbOpcion.addItem("Estado");
        jcbOpcion.addItem("Finalizacion");
        jcbOpcion.addItem("Inicio");
        jcbOpcion.addItem("Propietario");
        jcbOpcion.addItem("Inquilino");
        jcbOpcion.addItem("Vendedor");
        jcbOpcion.addItem("Inmueble");

    }

    private void cambiarInfo() {
        String opcion = jcbOpcion.getSelectedItem().toString();

        switch (opcion) {
            case "Estado":
                jMes.setVisible(false);
                jAnio.setVisible(false);
                jtDato.setVisible(false);
                jcbEstado.setVisible(true);
                jcbEstado.addItem("VIGENTE");
                jcbEstado.addItem("NO VIGENTE");
                jcbEstado.addItem("RENOVADO");
                break;
            case "Finalizacion":
                jMes.setVisible(true);
                jAnio.setVisible(true);
                jtDato.setVisible(false);
                jcbEstado.setVisible(false);
                break;
            case "Inicio":
                jMes.setVisible(true);
                jAnio.setVisible(true);
                jtDato.setVisible(false);
                jcbEstado.setVisible(false);
                break;

            case "Propietario":
                jMes.setVisible(false);
                jAnio.setVisible(false);
                jtDato.setVisible(true);
                jcbEstado.setVisible(false);
                jtDato.setText("ingrese el DNI del propietario");
                break;
            case "Inquilino":
                jMes.setVisible(false);
                jAnio.setVisible(false);
                jtDato.setVisible(true);
                jcbEstado.setVisible(false);
                jtDato.setText("ingrese el DNI del Inquilino");
                break;
            case "Vendedor":
                jMes.setVisible(false);
                jAnio.setVisible(false);
                jtDato.setVisible(true);
                jcbEstado.setVisible(false);
                jtDato.setText("Ingrese el nombre de usuario del vendedor");
                break;
            case "Inmueble":
                jMes.setVisible(false);
                jAnio.setVisible(false);
                jtDato.setVisible(true);
                jcbEstado.setVisible(false);
                jtDato.setText("Ingrese el numero de Codigo de la propiedad");
                break;
        }

    }

    private void buscar() {
        String opcion = jcbOpcion.getSelectedItem().toString();
        switch (opcion) {

            case "Estado":
                buscarXEstado();
                break;
            case "Finalizacion":
                buscarXFinalizacion();
                break;
            case "Inicio":
                buscarXInicio();
                break;

            case "Propietario":
                buscarXPropietario();
                break;
            case "Inquilino":
                buscarXInquilino();
                break;
            case "Vendedor":
                buscarXVendedor();
            case "Inmueble":
                buscarXInmueble();
                break;
        }
    }

    private void buscarXEstado() {
        limpiarFila();
        for (Contrato encontrado : MVendedor.controlContrato.listarContratos()) {
            if (encontrado.getEstado().equalsIgnoreCase((String) jcbEstado.getSelectedItem())) {
                cargarFila(encontrado);
            }
        }

    }

    private void buscarXFinalizacion() {
        limpiarFila();
        int año = jAnio.getYear();
        int mes = jMes.getMonth() + 1;

        for (Contrato encontrado : MVendedor.controlContrato.listarContratos()) {
            System.out.println("DATO: " + encontrado.getFechaFinalizacion().toString());
            if (encontrado.getFechaFinalizacion().getMonthValue() == mes && encontrado.getFechaFinalizacion().getYear() == año) {
                cargarFila(encontrado);
            }
        }
    }

    private void buscarXInicio() {
        limpiarFila();
        int año = jAnio.getYear();
        int mes = jMes.getMonth() + 1;

        for (Contrato encontrado : MVendedor.controlContrato.listarContratos()) {
            System.out.println("DATO: " + encontrado.getFechaFinalizacion().toString());
            if (encontrado.getFechaInicio().getMonthValue() == mes && encontrado.getFechaInicio().getYear() == año) {
                cargarFila(encontrado);
            }
        }

    }

    private void buscarXPropietario() {
        limpiarFila();
        int dni = Integer.parseInt(jtDato.getText());
        for (Contrato encontrado : MVendedor.controlContrato.listarContratosXPropietario(dni)) {
            cargarFila(encontrado);

        }

    }

    private void buscarXInquilino() {
        limpiarFila();
        int dni = Integer.parseInt(jtDato.getText());
        for (Contrato encontrado : MVendedor.controlContrato.listarContratosXInquilno(dni)) {
            cargarFila(encontrado);

        }

    }

    private void buscarXVendedor() {
        limpiarFila();
        for (Contrato encontrado : MVendedor.controlContrato.listarContratosXnombreUSuario(jtDato.getText())) {
            cargarFila(encontrado);
        }
    }

    private void buscarXInmueble() {
        limpiarFila();
        for (Contrato encontrado : MVendedor.controlContrato.listarContratosXInmueble(Integer.parseInt(jtDato.getText()))) {
            cargarFila(encontrado);
        }

    }

    private void cargarFila(Contrato contrato) {
        int codigo = contrato.getId();
        Inmueble alquilado = MVendedor.controlInm.buscarInmuebleXId(contrato.getIdInmueble());
        Persona inquilino = MVendedor.controlPer.encontrarPersonaXId(contrato.getIdInquilino());
        Persona propietario = MVendedor.controlPer.encontrarPersonaXId(alquilado.getIdPropietario());
        Usuario vendedor = controlUsuario.buscarUsuario(contrato.getIdVendedor());
        LocalDate fechaFirma = contrato.getFecha();
        LocalDate fechaInicio = contrato.getFechaInicio();
        LocalDate fechaFinaliza = contrato.getFechaFinalizacion();
        int precio = contrato.getPrecio();
        String estado = contrato.getEstado();
        String descripcion = contrato.getDescripcion();
        modelo.addRow(new Object[]{
            codigo,
            estado,
            alquilado.getId() + ", " + alquilado.getDireccion(),
            fechaInicio.format(format),
            fechaFinaliza.format(format),
            precio,
            inquilino.getApellido() + ", " + inquilino.getNombre(),
            propietario.getApellido() + ", " + propietario.getNombre(),
            descripcion,
            vendedor.getUsuario()
        });
    }

    private void cabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Estado");
        modelo.addColumn("Propiedad");
        modelo.addColumn("Inicio");
        modelo.addColumn("Finalizacion");
        modelo.addColumn("Precio");
        modelo.addColumn("Inquilino");
        modelo.addColumn("Propietario");
        modelo.addColumn("Condiciones Contrato");
        modelo.addColumn("Vendedor");
        jtContratos.setModel(modelo);
        TableRowSorter<DefaultTableModel> ordenar = new TableRowSorter<>(modelo);
        jtContratos.setRowSorter(ordenar);
    }

    private void limpiarFila() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarTabla() {
        limpiarFila();
        for (Contrato contrato : MVendedor.controlContrato.listarContratos()) {
            cargarFila(contrato);
        }

    }

    private void ajustarAnchoColumnas() {
        for (int column = 0; column < jtContratos.getColumnCount(); column++) {
            TableColumn tableColumn = jtContratos.getColumnModel().getColumn(column);
            int anchoPreferido = tableColumn.getMinWidth();
            int anchoMaximo = tableColumn.getMaxWidth();

            for (int row = 0; row < jtContratos.getRowCount(); row++) {
                TableCellRenderer cellRenderer = jtContratos.getCellRenderer(row, column);
                Component c = jtContratos.prepareRenderer(cellRenderer, row, column);
                int ancho = c.getPreferredSize().width + jtContratos.getIntercellSpacing().width;
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

//    private void ajustarAnchoColumnasCabecera() {
//        JTableHeader header = jtContratos.getTableHeader();
//        TableCellRenderer defaultRenderer = header.getDefaultRenderer();
//
//        for (int i = 0; i < jtContratos.getColumnCount(); i++) {
//            TableColumn column = jtContratos.getColumnModel().getColumn(i);
//            Component comp = defaultRenderer.getTableCellRendererComponent(jtContratos, column.getHeaderValue(), false, false, 0, 0);
//            int width = comp.getPreferredSize().width;
//            column.setPreferredWidth(width);
//        }
//    }
}
