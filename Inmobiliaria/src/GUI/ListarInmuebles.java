/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import Entidades.Inmueble;
import Entidades.Persona;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

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

    public ListarInmuebles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Listar Inmuebles");
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
        jLabel1 = new javax.swing.JLabel();
        jtDato = new javax.swing.JTextField();
        jcbOpcion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmueble = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Seleccione por que desea listar:");

        jtDato.setText("Ingrese la direccion del inmueble");

        jcbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        jScrollPane1.setViewportView(jtInmueble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                ListarInmuebles dialog = new ListarInmuebles(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbOpcion;
    private javax.swing.JTextField jtDato;
    private javax.swing.JTable jtInmueble;
    // End of variables declaration//GEN-END:variables
    private void llenarCombo() {
        jcbOpcion.addItem("Direccion");
        jcbOpcion.addItem("Zona");
        jcbOpcion.addItem("Propietario");
    }

    private void cabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Zona");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ambientes");
        modelo.addColumn("Superficie");
        modelo.addColumn("Garage");
        modelo.addColumn("Baños");
        modelo.addColumn("Condiociones Contrato");
        modelo.addColumn("Fecha Construccion");
        modelo.addColumn("Propietario");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado");
        jtInmueble.setModel(modelo);
    }

    private void cargarTabla() {
        for (Inmueble inmueble : MVendedor.controlInm.listarInmueble()) {
            Persona propietario = MVendedor.controlPer.encontrarPersona(inmueble.getIdPropietario());
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

}
