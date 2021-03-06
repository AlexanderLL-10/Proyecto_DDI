/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_DD1;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin-Alex
 */
public class verReservas extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form verReservas
     */
    public verReservas() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(iconoPropio);
        setVisible(true);
        inicializarTabla();
    }
    
    public void inicializarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre","Apellidos","Fecha Reserva", "Oficina","Mesa"});
        jTable_reservas.setModel(dtm);
    }
    
    public void añadirReserva(Reserva reserva){
        DefaultTableModel dtm = (DefaultTableModel)jTable_reservas.getModel();
        dtm.addRow(reserva.toArrayString());
    }
    public void eliminarReserva(){
        DefaultTableModel dtm = (DefaultTableModel)jTable_reservas.getModel();
        int filaseleccionada = jTable_reservas.getSelectedRow();
        if (filaseleccionada>=0) {
            dtm.removeRow(filaseleccionada);
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona la reserva que quieres eliminar");
        }
    }
    
    public void modificarReserva(){
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_añadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_reservas = new javax.swing.JTable();
        jButton_atras = new javax.swing.JButton();
        jButton_eliminar_reserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        jButton_añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir.png"))); // NOI18N
        jButton_añadir.setText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jButton_añadir.text")); // NOI18N
        jButton_añadir.setToolTipText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jButton_añadir.toolTipText")); // NOI18N
        jButton_añadir.setBorder(null);
        jButton_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_añadirActionPerformed(evt);
            }
        });

        jTable_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable_reservas);
        if (jTable_reservas.getColumnModel().getColumnCount() > 0) {
            jTable_reservas.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jTable_reservas.columnModel.title0")); // NOI18N
            jTable_reservas.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jTable_reservas.columnModel.title1")); // NOI18N
            jTable_reservas.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jTable_reservas.columnModel.title2")); // NOI18N
            jTable_reservas.getColumnModel().getColumn(3).setHeaderValue(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jTable_reservas.columnModel.title3")); // NOI18N
            jTable_reservas.getColumnModel().getColumn(4).setHeaderValue(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jTable_reservas.columnModel.title4")); // NOI18N
        }

        jButton_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        jButton_atras.setText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jButton_atras.text")); // NOI18N
        jButton_atras.setBorder(null);
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        jButton_eliminar_reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jButton_eliminar_reserva.setText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jButton_eliminar_reserva.text")); // NOI18N
        jButton_eliminar_reserva.setBorder(null);
        jButton_eliminar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_reservaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jLabel1.text")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(verReservas.class, "verReservas.jButton1.text")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_eliminar_reserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_añadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_eliminar_reserva, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton_atras, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_añadirActionPerformed
        hacerReserva Reserva = new hacerReserva(this, true);
        Reserva.setVisible(true);
    }//GEN-LAST:event_jButton_añadirActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        inicio abrir = new inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jButton_eliminar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_reservaActionPerformed

            int response = JOptionPane.showConfirmDialog(this, "Quieres eliminar esta reserva", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                eliminarReserva();
            } else if (response == JOptionPane.NO_OPTION) {
                
            }
       
    }//GEN-LAST:event_jButton_eliminar_reservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(verReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_añadir;
    private javax.swing.JButton jButton_eliminar_reserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_reservas;
    // End of variables declaration//GEN-END:variables
}
