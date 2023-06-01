/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;


/**
 *
 * @author ethan
 */
public class AllRecipes extends javax.swing.JFrame {
    //private String GlobalUser;
    //private String GlobalPass;
    /**
     * Creates new form AllRecipes
     */
    public AllRecipes() {
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

        jPanel1 = new javax.swing.JPanel();
        allRecipesLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        appetizersButton2 = new javax.swing.JButton();
        appetizersButton1 = new javax.swing.JButton();
        appetizersButton = new javax.swing.JButton();
        background4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        allRecipesLabel.setBackground(new java.awt.Color(255, 255, 255));
        allRecipesLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        allRecipesLabel.setForeground(new java.awt.Color(255, 255, 204));
        allRecipesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allRecipesLabel.setText("All Recipes");
        jPanel1.add(allRecipesLabel);
        allRecipesLabel.setBounds(300, 10, 180, 60);

        homeButton.setBackground(new java.awt.Color(153, 51, 0));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeButton.setLabel("Home");
        homeButton.setName("homeButton"); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(110, 20, 110, 40);

        appetizersButton2.setBackground(new java.awt.Color(255, 153, 102));
        appetizersButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appetizersButton2.setText("Breakfast");
        appetizersButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizersButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(appetizersButton2);
        appetizersButton2.setBounds(150, 110, 200, 110);

        appetizersButton1.setBackground(new java.awt.Color(204, 153, 0));
        appetizersButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appetizersButton1.setText("Dinner");
        appetizersButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizersButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(appetizersButton1);
        appetizersButton1.setBounds(300, 260, 200, 110);

        appetizersButton.setBackground(new java.awt.Color(255, 153, 51));
        appetizersButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appetizersButton.setText("Lunch");
        appetizersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizersButtonActionPerformed(evt);
            }
        });
        jPanel1.add(appetizersButton);
        appetizersButton.setBounds(440, 110, 200, 110);

        background4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\background4.png"));
        jPanel1.add(background4);
        background4.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        if(Login.GlobalUser.equals("admin") && Login.GlobalPass.equals("1234")){
                dispose();
                AdminControlPanel AdminPage = new AdminControlPanel();
                AdminPage.setVisible(true);

            }
            else if(Login.GlobalUser.equals("user") && Login.GlobalPass.equals("1234")){
                dispose();
                UserMain UserPage = new UserMain();
                UserPage.setVisible(true);

            }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void appetizersButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizersButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        Breakfast b = new Breakfast();
        b.setVisible(true);
    }//GEN-LAST:event_appetizersButton2ActionPerformed

    private void appetizersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizersButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        Lunch l = new Lunch();
        l.setVisible(true);
    }//GEN-LAST:event_appetizersButtonActionPerformed

    private void appetizersButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizersButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Dinner d = new Dinner();
        d.setVisible(true);
    }//GEN-LAST:event_appetizersButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AllRecipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllRecipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllRecipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllRecipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllRecipes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allRecipesLabel;
    private javax.swing.JButton appetizersButton;
    private javax.swing.JButton appetizersButton1;
    private javax.swing.JButton appetizersButton2;
    private javax.swing.JLabel background4;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
