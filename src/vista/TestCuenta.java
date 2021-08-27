/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Cuenta;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author STEVEN
 */
public class TestCuenta extends javax.swing.JFrame {

    ButtonGroup grupo = new ButtonGroup();
    DefaultTableModel model = new DefaultTableModel(); 
    Cuenta cuentas;
     ArrayList<Cuenta> c = new ArrayList<>();
    
    public TestCuenta() {
        initComponents();
        grupo.add(rbDepositar);
        grupo.add(rbRetirar);
        grupo.add(rbEliminar); 
        
        model.addColumn("Código");
        model.addColumn("Nombres");
        model.addColumn("Saldo");
        jTablaDatos.setModel(model);
       
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cajaAhorroEspe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtSaldoInicial = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDatos = new javax.swing.JTable();
        rbDepositar = new javax.swing.JRadioButton();
        rbRetirar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotalBanco = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajaAhorroEspe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cajaAhorroEspe.setText("CAJA AHORRO ESPE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CODIGO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NOMBRES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SALDO INICIAL");

        txtCodigo.setColumns(10);
        txtCodigo.setText("Automático");
        txtCodigo.setEnabled(false);

        txtNombres.setColumns(10);

        txtSaldoInicial.setColumns(10);

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jTablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaDatos);

        rbDepositar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDepositar.setText("DEPOSITAR");
        rbDepositar.setEnabled(false);
        rbDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDepositarActionPerformed(evt);
            }
        });

        rbRetirar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbRetirar.setText("RETIRAR");
        rbRetirar.setEnabled(false);
        rbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRetirarActionPerformed(evt);
            }
        });

        rbEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEliminar.setText("ELIMINAR");
        rbEliminar.setEnabled(false);
        rbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("VALOR");

        txtOperacion.setColumns(10);

        btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.setEnabled(false);
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TOTAL BANCO");

        txtTotalBanco.setColumns(10);
        txtTotalBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajaAhorroEspe)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnInsertar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbDepositar)
                                    .addComponent(rbRetirar)
                                    .addComponent(rbEliminar))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnProcesar))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajaAhorroEspe)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDepositar)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRetirar)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEliminar)
                    .addComponent(btnProcesar)
                    .addComponent(txtTotalBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        double saldo = Double.parseDouble(txtSaldoInicial.getText());
        cuentas = new Cuenta(txtNombres.getText(), saldo);
        c.add(cuentas);
        String numeroC = String.valueOf(cuentas.getCodigo());
        String[] cuentasT = new String[3];
        cuentasT[0] = numeroC;
        cuentasT[1] = txtNombres.getText();
        cuentasT[2] = txtSaldoInicial.getText();
        model.addRow(cuentasT);
        txtNombres.setText("");
        txtSaldoInicial.setText("");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void jTablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaDatosMouseClicked
        // TODO add your handling code here:
        rbDepositar.setEnabled(true);
        rbRetirar.setEnabled(true);
        rbEliminar.setEnabled(true);
    }//GEN-LAST:event_jTablaDatosMouseClicked

    private void rbDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDepositarActionPerformed
        // TODO add your handling code here:
        btnProcesar.setEnabled(true);
        txtOperacion.setEditable(true);
    }//GEN-LAST:event_rbDepositarActionPerformed

    private void rbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRetirarActionPerformed
        // TODO add your handling code here:
        btnProcesar.setEnabled(true);
        txtOperacion.setEditable(true);
    }//GEN-LAST:event_rbRetirarActionPerformed

    private void rbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEliminarActionPerformed
        // TODO add your handling code here:
        btnProcesar.setEnabled(true);
    }//GEN-LAST:event_rbEliminarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        double total = 0;
         if (rbDepositar.isSelected()) {
//            total = txtSaldoInicial.getText() + txtOperacion.getText();
            
        }

        if (rbRetirar.isSelected()) {
//            total = txtSaldoInicial.getText() - txtOperacion.getText();   
        }

        if (rbEliminar.isSelected()) {
            txtSaldoInicial.remove(WIDTH);
        }
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtTotalBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalBancoActionPerformed
        // TODO add your handling code here:
        txtTotalBanco.setText(String.valueOf(txtSaldoInicial.getText()));
    }//GEN-LAST:event_txtTotalBancoActionPerformed

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
            java.util.logging.Logger.getLogger(TestCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel cajaAhorroEspe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaDatos;
    private javax.swing.JRadioButton rbDepositar;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.JRadioButton rbRetirar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtSaldoInicial;
    private javax.swing.JTextField txtTotalBanco;
    // End of variables declaration//GEN-END:variables
}