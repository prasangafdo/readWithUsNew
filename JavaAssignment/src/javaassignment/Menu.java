/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author Prasanga Fernando
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btnExit = new javax.swing.JButton();
        btnBookReserve = new javax.swing.JButton();
        btnBookBorrow = new javax.swing.JButton();
        btnBookReg = new javax.swing.JButton();
        btnMemberReg = new javax.swing.JButton();
        btnBookReturn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(474, 370));
        getContentPane().setLayout(null);

        btnExit.setBackground(new java.awt.Color(159, 67, 67));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(320, 260, 120, 20);

        btnBookReserve.setBackground(new java.awt.Color(209, 198, 27));
        btnBookReserve.setText("Book Reservation");
        btnBookReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookReserveActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookReserve);
        btnBookReserve.setBounds(10, 190, 170, 30);

        btnBookBorrow.setBackground(new java.awt.Color(209, 198, 27));
        btnBookBorrow.setText("Book Borrowing");
        btnBookBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookBorrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookBorrow);
        btnBookBorrow.setBounds(10, 160, 170, 30);

        btnBookReg.setBackground(new java.awt.Color(209, 198, 27));
        btnBookReg.setText("Book Registration");
        btnBookReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookReg);
        btnBookReg.setBounds(10, 130, 170, 30);

        btnMemberReg.setBackground(new java.awt.Color(209, 198, 27));
        btnMemberReg.setText("Member Registration");
        btnMemberReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberReg);
        btnMemberReg.setBounds(10, 100, 170, 30);

        btnBookReturn.setBackground(new java.awt.Color(209, 198, 27));
        btnBookReturn.setText("Book Return");
        btnBookReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookReturn);
        btnBookReturn.setBounds(10, 220, 170, 30);

        jPanel2.setBackground(new java.awt.Color(180, 144, 63));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Menu");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment/men head.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       setVisible(false); //you can't see me!
       dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMemberRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberRegActionPerformed
        MemberReg mReg = new MemberReg();
        mReg.show();
    }//GEN-LAST:event_btnMemberRegActionPerformed

    private void btnBookReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookReserveActionPerformed
      BookReservation brs = new BookReservation();
      brs.show();
    }//GEN-LAST:event_btnBookReserveActionPerformed

    private void btnBookBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookBorrowActionPerformed
       BookBorrow bb = new BookBorrow();
       bb.show();
    }//GEN-LAST:event_btnBookBorrowActionPerformed

    private void btnBookRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookRegActionPerformed
         BookReg br = new BookReg();
         br.show();
    }//GEN-LAST:event_btnBookRegActionPerformed

    private void btnBookReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookReturnActionPerformed
       BookReturn brt = new BookReturn();
       brt.show();
    }//GEN-LAST:event_btnBookReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookBorrow;
    private javax.swing.JButton btnBookReg;
    private javax.swing.JButton btnBookReserve;
    private javax.swing.JButton btnBookReturn;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMemberReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}