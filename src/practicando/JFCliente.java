/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public final class JFCliente extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form JFCliente
     */
    public JFCliente() {
        initComponents();
        cargarCliente();
        this.setLocationRelativeTo(null);
    }
    
    
    void cargarCliente(){
        
       ArrayList<Object> nombreColumna = new ArrayList<Object>();
        nombreColumna.add("Num Identidad");
        nombreColumna.add("Nombre Completo");
        nombreColumna.add("Dirección");
        
        for (Object columna : nombreColumna){
            modelo.addColumn(columna);
        }  
        this.jTbClientes.setModel(modelo);
        
        ArrayList<Object> clientes = new ArrayList<Object>();
        Object[] cliente1= new Object[]{"18032000", "Marvin Pineda", "Res. Villareal"};
        Object[] cliente2= new Object[]{"06011999", "Juan Barahona", "B. Las Colinas"};
        Object[] cliente3= new Object[]{"07892000", "Julio Pavon", "B. Las Vegas"};
        Object[] cliente4= new Object[]{"07201980", "Maria Calix", "Col. Unidas"};
        Object[] cliente5= new Object[]{"15011990", "Jorge Mendieta", "B. Las Brisas"};
        Object[] cliente6= new Object[]{"06031970", "Brayan Casstro", "Res. Palmeras"};
        Object[] cliente7= new Object[]{"01021995", "Marlen Paz", "B. Las Colinas"};
        Object[] cliente8= new Object[]{"1708", "Jacob Carrasco", "Col. El Estruendo"};
        Object[] cliente9= new Object[]{"07081980", "Lilian Vargas", "B. Suyapa"};
        Object[] cliente10= new Object[]{"0910", "Alex Ponce", "B. Morazan"};        
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        clientes.add(cliente8);
        clientes.add(cliente9);
        clientes.add(cliente10);
        
        clientes.forEach((Object clienteDato) -> {
            modelo.addRow((Object[]) clienteDato);
        });
        
        this.jTbClientes.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbClientes = new javax.swing.JTable();
        jBtnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de clientes:");

        jTbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTbClientes);

        jBtnSeleccionar.setText("Seleccionar");
        jBtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSeleccionar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSeleccionar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeleccionarActionPerformed
        // TODO add your handling code here:
        
        filaSeleccionada();
    }//GEN-LAST:event_jBtnSeleccionarActionPerformed

    private void filaSeleccionada(){
        
        String codCliente, nombCliente, dirCliente;
        
        if (this.jTbClientes.getSelectedRow() != -1 ){
            int filaSeleccionada;

            filaSeleccionada = this.jTbClientes.getSelectedRow();

            codCliente = this.jTbClientes.getValueAt(filaSeleccionada, 0).toString();
            nombCliente = this.jTbClientes.getValueAt(filaSeleccionada, 1).toString();
            dirCliente = this.jTbClientes.getValueAt(filaSeleccionada, 2).toString();
            
            JFFactura.jTFCodCliente.setText(codCliente);
            JFFactura.jTFNombreCliente.setText(nombCliente);
            JFFactura.jTFDireccion.setText(dirCliente);
            
            dispose();
        }
        
    }
    
        
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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbClientes;
    // End of variables declaration//GEN-END:variables
}
