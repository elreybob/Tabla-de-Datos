/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author peter
 */
public class Administrativos extends javax.swing.JFrame {

    /**
     * Creates new form Administrativos
     */
    public Administrativos() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnInicio = new javax.swing.JMenu();
        btnRegresarADMIN = new javax.swing.JMenuItem();
        mnCargar = new javax.swing.JMenu();
        btMostrarDatos = new javax.swing.JMenuItem();
        MnInsertar = new javax.swing.JMenu();
        MniGuardar = new javax.swing.JMenuItem();
        MnSuprimir = new javax.swing.JMenu();
        MniEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(693, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Administrativos");

        MnInicio.setText("Inicio");

        btnRegresarADMIN.setText("Regresar");
        btnRegresarADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarADMINActionPerformed(evt);
            }
        });
        MnInicio.add(btnRegresarADMIN);

        jMenuBar1.add(MnInicio);

        mnCargar.setText("Cargar");

        btMostrarDatos.setText("Mostrar Datos");
        mnCargar.add(btMostrarDatos);

        jMenuBar1.add(mnCargar);

        MnInsertar.setText("Nuevo");

        MniGuardar.setText("Guardar");
        MnInsertar.add(MniGuardar);

        jMenuBar1.add(MnInsertar);

        MnSuprimir.setText("Suprimir");

        MniEliminar.setText("Eliminar");
        MnSuprimir.add(MniEliminar);

        jMenuBar1.add(MnSuprimir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarADMINActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu articulo = new Menu();
        articulo.setVisible(true);
    }//GEN-LAST:event_btnRegresarADMINActionPerformed

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
            java.util.logging.Logger.getLogger(Administrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrativos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnInicio;
    private javax.swing.JMenu MnInsertar;
    private javax.swing.JMenu MnSuprimir;
    private javax.swing.JMenuItem MniEliminar;
    private javax.swing.JMenuItem MniGuardar;
    private javax.swing.JMenuItem btMostrarDatos;
    private javax.swing.JMenuItem btnRegresarADMIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnCargar;
    // End of variables declaration//GEN-END:variables
}
