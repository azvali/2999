/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author azval
 */
public class Login extends javax.swing.JFrame {
    public static boolean IfAdmin;
    /**
     * Creates new form Login
     */
    public Login() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        EnterPassword = new javax.swing.JLabel();
        PasswordTextBox = new javax.swing.JPasswordField();
        LoginIntro = new javax.swing.JLabel();
        EnterUsername = new javax.swing.JLabel();
        CreateANewAccount = new javax.swing.JButton();
        EnterButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        UsernameTextBox = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        EnterPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnterPassword.setText("Enter Password:");
        jPanel1.add(EnterPassword);
        EnterPassword.setBounds(277, 204, 110, 20);
        jPanel1.add(PasswordTextBox);
        PasswordTextBox.setBounds(408, 204, 119, 22);

        LoginIntro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginIntro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginIntro.setText("LOGIN");
        jPanel1.add(LoginIntro);
        LoginIntro.setBounds(270, 80, 240, 40);

        EnterUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnterUsername.setText("Enter Username:");
        jPanel1.add(EnterUsername);
        EnterUsername.setBounds(277, 169, 101, 20);

        CreateANewAccount.setBackground(new java.awt.Color(255, 255, 153));
        CreateANewAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CreateANewAccount.setText("Create a New Account");
        CreateANewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateANewAccountActionPerformed(evt);
            }
        });
        jPanel1.add(CreateANewAccount);
        CreateANewAccount.setBounds(277, 265, 220, 32);

        EnterButton.setBackground(new java.awt.Color(0, 204, 0));
        EnterButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EnterButton);
        EnterButton.setBounds(155, 265, 80, 32);

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(534, 265, 80, 30);

        welcome.setBackground(new java.awt.Color(102, 51, 255));
        welcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("WELCOME TO CULINARY CREATIONS!");
        jPanel1.add(welcome);
        welcome.setBounds(150, 0, 520, 90);
        jPanel1.add(UsernameTextBox);
        UsernameTextBox.setBounds(410, 170, 120, 22);

        background.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\background.png"));
        jPanel1.add(background);
        background.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateANewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateANewAccountActionPerformed
        // TODO add your handling code here:
        dispose();
        CreateAccount create = new CreateAccount();
        create.setVisible(true);
    }//GEN-LAST:event_CreateANewAccountActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed

        String userEntry = UsernameTextBox.getText();
        String passEntry = PasswordTextBox.getText();
        
        //database connection details
        String host = "jdbc:mysql://csi2999.mysql.database.azure.com:3306/login";
        int port = 3306;
        String DatabaseUsername = "csi2999";
        String DatabasePassword = "bhl7^W0O#qq2";
        String Database = "login";
        
        try{
            Connection conn = DriverManager.getConnection(host, DatabaseUsername, DatabasePassword);
         
            //check if username exists
            String checkQuery = "SELECT * FROM user WHERE username = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, userEntry);
            ResultSet resultSet = checkStmt.executeQuery();
            
            //if username exists
            if(resultSet.next()){
               if(resultSet.getString("password").equals(passEntry) && resultSet.getInt("admin") == 1){
                   dispose();
                   AdminControlPanel a = new AdminControlPanel();
                   a.setVisible(true);
                   IfAdmin = true;
                }
               else if(resultSet.getString("password").equals(passEntry) && resultSet.getInt("admin") == 0){
                   dispose();
                   UserMain u = new UserMain();
                   u.setVisible(true);
                   IfAdmin = false;
               }
               else{
                   JOptionPane.showMessageDialog(null,"Invalid Username/Password.");
               }
            }
            else{
                // username doesnt exist
                JOptionPane.showMessageDialog(null,"Invalid Username/Password.");
            }
            //close resources
                resultSet.close();
                checkStmt.close();
                conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateANewAccount;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel EnterPassword;
    private javax.swing.JLabel EnterUsername;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel LoginIntro;
    private javax.swing.JPasswordField PasswordTextBox;
    private javax.swing.JTextField UsernameTextBox;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
