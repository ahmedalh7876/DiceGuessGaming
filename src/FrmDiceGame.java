/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahalh7876
 */
public class FrmDiceGame extends javax.swing.JFrame {

    /**
     * Creates new form FrmDiceGame
     */
    public FrmDiceGame() {
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

        bgPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        instLbl1 = new javax.swing.JLabel();
        instLbl2 = new javax.swing.JLabel();
        guessLbl = new javax.swing.JLabel();
        nmbrOfGuessLbl = new javax.swing.JLabel();
        nmbrOfGuessOutPut = new javax.swing.JLabel();
        guessTxtFld = new javax.swing.JTextField();
        rollBtn = new javax.swing.JButton();
        rngRollLbl = new javax.swing.JLabel();
        rngRollOutPut = new javax.swing.JLabel();
        nmbrOfCrctGuessOutPut = new javax.swing.JLabel();
        nmbrOfCrctGuessLbl = new javax.swing.JLabel();
        nmbrOfIncrctGuessOutPut = new javax.swing.JLabel();
        nmbrOfIncrctGuessLbl = new javax.swing.JLabel();
        PrcntLbl = new javax.swing.JLabel();
        PrcntOutPut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPnl.setBackground(new java.awt.Color(0, 97, 102));
        bgPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("BankGothic Md BT", 1, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("RNG Machine");
        bgPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        instLbl1.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        instLbl1.setForeground(new java.awt.Color(255, 255, 255));
        instLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instLbl1.setText("Enter a number between 1 and");
        instLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(instLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        instLbl2.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        instLbl2.setForeground(new java.awt.Color(255, 255, 255));
        instLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instLbl2.setText("9 then click the roll button");
        instLbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(instLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        guessLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        guessLbl.setForeground(new java.awt.Color(255, 255, 255));
        guessLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guessLbl.setText("Your guess:");
        guessLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(guessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        nmbrOfGuessLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        nmbrOfGuessLbl.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfGuessLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nmbrOfGuessLbl.setText("# of guesses:");
        nmbrOfGuessLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfGuessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        nmbrOfGuessOutPut.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        nmbrOfGuessOutPut.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfGuessOutPut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nmbrOfGuessOutPut.setText("0");
        nmbrOfGuessOutPut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfGuessOutPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, -1));

        guessTxtFld.setBackground(new java.awt.Color(0, 97, 102));
        guessTxtFld.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        guessTxtFld.setForeground(new java.awt.Color(255, 255, 255));
        guessTxtFld.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        guessTxtFld.setText("0");
        guessTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTxtFldActionPerformed(evt);
            }
        });
        bgPnl.add(guessTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        rollBtn.setBackground(new java.awt.Color(255, 255, 255));
        rollBtn.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        rollBtn.setForeground(new java.awt.Color(0, 97, 102));
        rollBtn.setText("rng roll");
        rollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollBtnActionPerformed(evt);
            }
        });
        bgPnl.add(rollBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        rngRollLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        rngRollLbl.setForeground(new java.awt.Color(255, 255, 255));
        rngRollLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rngRollLbl.setText("rng roll:");
        rngRollLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(rngRollLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        rngRollOutPut.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        rngRollOutPut.setForeground(new java.awt.Color(255, 255, 255));
        rngRollOutPut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rngRollOutPut.setText("0");
        rngRollOutPut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(rngRollOutPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 170, 100, -1));

        nmbrOfCrctGuessOutPut.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        nmbrOfCrctGuessOutPut.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfCrctGuessOutPut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nmbrOfCrctGuessOutPut.setText("0");
        nmbrOfCrctGuessOutPut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfCrctGuessOutPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 100, -1));

        nmbrOfCrctGuessLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        nmbrOfCrctGuessLbl.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfCrctGuessLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nmbrOfCrctGuessLbl.setText("# of correct guesses:");
        nmbrOfCrctGuessLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfCrctGuessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        nmbrOfIncrctGuessOutPut.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        nmbrOfIncrctGuessOutPut.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfIncrctGuessOutPut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nmbrOfIncrctGuessOutPut.setText("0");
        nmbrOfIncrctGuessOutPut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfIncrctGuessOutPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 100, -1));

        nmbrOfIncrctGuessLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        nmbrOfIncrctGuessLbl.setForeground(new java.awt.Color(255, 255, 255));
        nmbrOfIncrctGuessLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nmbrOfIncrctGuessLbl.setText("# of incorrect guesses:");
        nmbrOfIncrctGuessLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(nmbrOfIncrctGuessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        PrcntLbl.setFont(new java.awt.Font("BankGothic Md BT", 0, 20)); // NOI18N
        PrcntLbl.setForeground(new java.awt.Color(255, 255, 255));
        PrcntLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrcntLbl.setText("Correct guesses %:");
        PrcntLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(PrcntLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        PrcntOutPut.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
        PrcntOutPut.setForeground(new java.awt.Color(255, 255, 255));
        PrcntOutPut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrcntOutPut.setText("0");
        PrcntOutPut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgPnl.add(PrcntOutPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, -1));

        getContentPane().add(bgPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guessTxtFldActionPerformed

    private void rollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollBtnActionPerformed
        
        
        
    }//GEN-LAST:event_rollBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrcntLbl;
    private javax.swing.JLabel PrcntOutPut;
    private javax.swing.JPanel bgPnl;
    private javax.swing.JLabel guessLbl;
    private javax.swing.JTextField guessTxtFld;
    private javax.swing.JLabel instLbl1;
    private javax.swing.JLabel instLbl2;
    private javax.swing.JLabel nmbrOfCrctGuessLbl;
    private javax.swing.JLabel nmbrOfCrctGuessOutPut;
    private javax.swing.JLabel nmbrOfGuessLbl;
    private javax.swing.JLabel nmbrOfGuessOutPut;
    private javax.swing.JLabel nmbrOfIncrctGuessLbl;
    private javax.swing.JLabel nmbrOfIncrctGuessOutPut;
    private javax.swing.JLabel rngRollLbl;
    private javax.swing.JLabel rngRollOutPut;
    private javax.swing.JButton rollBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
