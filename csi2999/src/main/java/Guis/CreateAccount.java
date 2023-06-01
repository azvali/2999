/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;

/**
 *
 * @author masta
 */
public class CreateAccount extends javax.swing.JFrame {

	/**
	 * Creates new form CreateAccount
	 */
	public CreateAccount() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reenter_field = new javax.swing.JPasswordField();
        password_tfield = new javax.swing.JPasswordField();
        createaccount_label = new javax.swing.JLabel();
        reenter_label = new javax.swing.JLabel();
        username_tfield = new javax.swing.JTextField();
        createaccount_button = new javax.swing.JButton();
        password_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        createaccount_button1 = new javax.swing.JButton();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        reenter_field.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(reenter_field);
        reenter_field.setBounds(428, 241, 150, 21);

        password_tfield.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(password_tfield);
        password_tfield.setBounds(428, 205, 150, 23);

        createaccount_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        createaccount_label.setForeground(new java.awt.Color(255, 153, 153));
        createaccount_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createaccount_label.setText("CREATE ACCOUNT");
        jPanel1.add(createaccount_label);
        createaccount_label.setBounds(291, 100, 231, 34);

        reenter_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reenter_label.setText("Re-enter Password:");
        jPanel1.add(reenter_label);
        reenter_label.setBounds(264, 239, 127, 20);

        username_tfield.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(username_tfield);
        username_tfield.setBounds(428, 172, 150, 21);

        createaccount_button.setBackground(new java.awt.Color(153, 153, 153));
        createaccount_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createaccount_button.setText("Return");
        createaccount_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccount_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(createaccount_button);
        createaccount_button.setBounds(213, 305, 178, 51);

        password_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_label.setText("Password:");
        jPanel1.add(password_label);
        password_label.setBounds(264, 206, 100, 22);

        username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label.setText("Username:");
        jPanel1.add(username_label);
        username_label.setBounds(264, 170, 100, 20);

        createaccount_button1.setBackground(new java.awt.Color(153, 153, 153));
        createaccount_button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createaccount_button1.setText("Create Account");
        createaccount_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccount_button1ActionPerformed(evt);
            }
        });
        jPanel1.add(createaccount_button1);
        createaccount_button1.setBounds(410, 306, 178, 51);

        background2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\background2.png"));
        jPanel1.add(background2);
        background2.setBounds(0, 0, 800, 500);

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

    private void createaccount_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccount_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_createaccount_buttonActionPerformed

    private void createaccount_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccount_button1ActionPerformed
        // creates a new account and store it in account database
        // can use this to create success! box "JOptionPane.showMessageDialog(null,"Success!");"
    }//GEN-LAST:event_createaccount_button1ActionPerformed

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
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CreateAccount().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background2;
    private javax.swing.JButton createaccount_button;
    private javax.swing.JButton createaccount_button1;
    private javax.swing.JLabel createaccount_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_tfield;
    private javax.swing.JPasswordField reenter_field;
    private javax.swing.JLabel reenter_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_tfield;
    // End of variables declaration//GEN-END:variables
}
