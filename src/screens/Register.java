/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import classes.Database;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.UnsupportedLookAndFeelException;
import screens.Main;
import utils.FontLoader;


/**
 *
 * @author john michael
 */
public class Register extends javax.swing.JFrame {

    FontLoader fontLoader = new FontLoader();
    Font inter;
    Font puritanBold;

    /**
     * Creates new form LoginPage
     */
    public Register() {
        setFonts();
        initComponents();
        setFrameIcon();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        adminUsernameField = new classes.JTextFieldWithPrompt("Admin Username");
        adminPasswordField = new classes.JPasswordFieldWithPrompt("Admin Password");
        createAccountButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(244, 244, 244));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 128, 64, 128));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(puritanBold);
        jLabel2.setForeground(new java.awt.Color(35, 35, 35));
        jLabel2.setText("LATH'S AUTO-ELECTRICAL SHOP");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 128, 64, 128));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 0, 0, 0));

        adminUsernameField.setBackground(new java.awt.Color(248, 248, 248));
        adminUsernameField.setFont(inter);
        adminUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 218, 218)));
        adminUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameFieldActionPerformed(evt);
            }
        });

        adminPasswordField.setBackground(new java.awt.Color(248, 248, 248));
        adminPasswordField.setFont(inter);
        adminPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 218, 218)));
        adminPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordFieldActionPerformed(evt);
            }
        });

        createAccountButton.setBackground(new java.awt.Color(40, 40, 40));
        createAccountButton.setFont(inter);
        createAccountButton.setForeground(new java.awt.Color(248, 248, 248));
        createAccountButton.setText("Create account");
        createAccountButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        createAccountButton.setBorderPainted(false);
        createAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountButton.setFocusPainted(false);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(adminUsernameField))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(adminUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createAccountButton)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 380, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 0, 64, 0));

        jLabel3.setFont(inter);
        jLabel3.setForeground(new java.awt.Color(129, 129, 129));
        jLabel3.setText("Already have an account?");

        jLabel4.setFont(inter);
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("Copyright 2023. All rights reserved.");

        loginLabel.setFont(inter);
        loginLabel.setForeground(new java.awt.Color(35, 35, 35));
        loginLabel.setText("Log in");
        loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginLabel)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loginLabel))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameFieldActionPerformed

    private void adminPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPasswordFieldActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        String username = adminUsernameField.getText();
        String password = adminPasswordField.getText();
        
        try {
            var searchQuery = "SELECT * FROM laes.users WHERE username = ?";
            var searchStatement = Database.sqlConnection.prepareStatement(searchQuery);
            searchStatement.setString(1, username);
            var result = searchStatement.executeQuery();
            
            if (result.next()) {
                /// There was already a user with username.
                System.out.println("DEBUG: There is already a user with username '" + username +"'.");
                return;
            }
            
            var addQuery = "INSERT INTO laes.users (username, password) VALUES (?, ?)";
            var addStatement = Database.sqlConnection.prepareStatement(addQuery);
            addStatement.setString(1, username);
            addStatement.setString(2, password);
            addStatement.executeUpdate();
            
            System.out.println("User with username '" + username + "' was added successfully.");
            
            
            this.setVisible(false);

            new Main().setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            System.out.print("The query went wrong. The error was: " + e.toString());
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        this.setVisible(false);

        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginLabelMouseClicked

    private void setFonts() {
        inter = fontLoader.interRegular(12);
        puritanBold = fontLoader.puritanBold(48);
    }
    
    private void setFrameIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/logo.png")));
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
        //</editor-fold>

        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("UIManager Exception : " + e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminPasswordField;
    private javax.swing.JTextField adminUsernameField;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginLabel;
    // End of variables declaration//GEN-END:variables
}
