/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project_2.UI;

import com.mycompany.project_2.users.usersInfo;

/**
 *
 * @author hamme
 */
public class usersList extends javax.swing.JFrame {

    usersInfo user = new usersInfo();

    /**
     * Creates new form usersList
     */
    public usersList() {
        initComponents();
        this.setLocationRelativeTo(null);

        if (user.getName(1) == null) {
            userOneLabel.setText("Usuario Disponible");
        } else {
            userOneLabel.setText(user.getName(1));
        }

        if (user.getName(2) == null) {
            userTwoLabel.setText("Usuario Disponible");
        } else {
            userTwoLabel.setText(user.getName(2));
        }

        if (user.getName(3) == null) {
            userThreeLabel.setText("Usuario Disponible");
        } else {
            userThreeLabel.setText(user.getName(3));
        }

        if (user.getName(4) == null) {
            userFourLabel.setText("Usuario Disponible");
        } else {
            userFourLabel.setText(user.getName(4));
        }

        if (user.getName(5) == null) {
            userFiveLabel.setText("Usuario Disponible");
        } else {
            userFiveLabel.setText(user.getName(5));
        }
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
        returnButton = new javax.swing.JButton();
        userOneButton = new javax.swing.JButton();
        userOneLabel = new javax.swing.JLabel();
        userTwoButton = new javax.swing.JButton();
        userTwoLabel = new javax.swing.JLabel();
        userThreeButton = new javax.swing.JButton();
        userThreeLabel = new javax.swing.JLabel();
        userFourButton = new javax.swing.JButton();
        userFourLabel = new javax.swing.JLabel();
        userFiveButton = new javax.swing.JButton();
        userFiveLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Usuarios");

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-backspace-64.png"))); // NOI18N
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        userOneButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userOneButton.setText("Usuario Uno");
        userOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userOneButtonActionPerformed(evt);
            }
        });

        userOneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userOneLabel.setText("user1");

        userTwoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTwoButton.setText("Usuario Dos");
        userTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTwoButtonActionPerformed(evt);
            }
        });

        userTwoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTwoLabel.setText("user2");

        userThreeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userThreeButton.setText("Usuario Tres");
        userThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userThreeButtonActionPerformed(evt);
            }
        });

        userThreeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userThreeLabel.setText("user3");
        userThreeLabel.setToolTipText("");

        userFourButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userFourButton.setText("Usuario Cuatro");
        userFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFourButtonActionPerformed(evt);
            }
        });

        userFourLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userFourLabel.setText("user4");

        userFiveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userFiveButton.setText("Usuario Cinco");
        userFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFiveButtonActionPerformed(evt);
            }
        });

        userFiveLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userFiveLabel.setText("user5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userOneButton)
                            .addComponent(userOneLabel)
                            .addComponent(userTwoButton)
                            .addComponent(userTwoLabel)
                            .addComponent(userThreeButton)
                            .addComponent(userThreeLabel)
                            .addComponent(userFourButton)
                            .addComponent(userFourLabel)
                            .addComponent(userFiveButton)
                            .addComponent(userFiveLabel))
                        .addGap(242, 242, 242))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addComponent(userOneButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userOneLabel)
                .addGap(18, 18, 18)
                .addComponent(userTwoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTwoLabel)
                .addGap(18, 18, 18)
                .addComponent(userThreeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userThreeLabel)
                .addGap(18, 18, 18)
                .addComponent(userFourButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userFourLabel)
                .addGap(18, 18, 18)
                .addComponent(userFiveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userFiveLabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        accesScreen accessFrame = new accesScreen();
        accessFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void userOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userOneButtonActionPerformed
        // TODO add your handling code here:
        if (user.getName(1) == null) {
            return;
        } else {
            user.setOption(1);
            Home homeFrame = new Home();
            homeFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userOneButtonActionPerformed

    private void userTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTwoButtonActionPerformed
        // TODO add your handling code here:
        if (user.getName(2) == null) {
            return;
        } else {
            user.setOption(2);
            Home homeFrame = new Home();
            homeFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userTwoButtonActionPerformed

    private void userThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userThreeButtonActionPerformed
        // TODO add your handling code here:
        if (user.getName(3) == null) {
            return;
        } else {
            user.setOption(3);
            Home homeFrame = new Home();
            homeFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userThreeButtonActionPerformed

    private void userFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFourButtonActionPerformed
        // TODO add your handling code here:
        if (user.getName(4) == null) {
            return;
        } else {
            user.setOption(4);
            Home homeFrame = new Home();
            homeFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userFourButtonActionPerformed

    private void userFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFiveButtonActionPerformed
        // TODO add your handling code here:
        if (user.getName(5) == null) {
            return;
        } else {
            user.setOption(5);
            Home homeFrame = new Home();
            homeFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_userFiveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(usersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton userFiveButton;
    private javax.swing.JLabel userFiveLabel;
    private javax.swing.JButton userFourButton;
    private javax.swing.JLabel userFourLabel;
    private javax.swing.JButton userOneButton;
    private javax.swing.JLabel userOneLabel;
    private javax.swing.JButton userThreeButton;
    private javax.swing.JLabel userThreeLabel;
    private javax.swing.JButton userTwoButton;
    private javax.swing.JLabel userTwoLabel;
    // End of variables declaration//GEN-END:variables
}
