/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;

/**
 *
 * @author azval
 */
public class Lunch extends javax.swing.JFrame {

    /**
     * Creates new form Lunch
     */
    public Lunch() {
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

        jPanel2 = new javax.swing.JPanel();
        LunchDescription = new javax.swing.JTextField();
        LunchHowTo = new javax.swing.JTextField();
        LunchIngredients = new javax.swing.JTextField();
        LunchCookTimes = new javax.swing.JTextField();
        lunchDropDown = new javax.swing.JComboBox<>();
        lunchReturnButton = new javax.swing.JButton();
        lunch = new javax.swing.JLabel();
        lunchimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        LunchDescription.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                LunchDescriptionComponentHidden(evt);
            }
        });
        jPanel2.add(LunchDescription);
        LunchDescription.setBounds(26, 120, 376, 153);
        jPanel2.add(LunchHowTo);
        LunchHowTo.setBounds(420, 120, 365, 153);
        jPanel2.add(LunchIngredients);
        LunchIngredients.setBounds(420, 291, 365, 153);

        LunchCookTimes.setForeground(new java.awt.Color(255, 255, 255));
        LunchCookTimes.setBorder(null);
        jPanel2.add(LunchCookTimes);
        LunchCookTimes.setBounds(26, 291, 376, 153);

        lunchDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(lunchDropDown);
        lunchDropDown.setBounds(174, 79, 228, 22);

        lunchReturnButton.setText("Return");
        lunchReturnButton.setName("lunchReturnButton"); // NOI18N
        lunchReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunchReturnButtonActionPerformed(evt);
            }
        });
        jPanel2.add(lunchReturnButton);
        lunchReturnButton.setBounds(461, 79, 92, 23);

        lunch.setBackground(new java.awt.Color(0, 0, 0));
        lunch.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lunch.setForeground(new java.awt.Color(255, 0, 255));
        lunch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunch.setText("Lunch Recipes");
        jPanel2.add(lunch);
        lunch.setBounds(250, 0, 280, 70);

        lunchimage.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\Lunch Image.png"));
        jPanel2.add(lunchimage);
        lunchimage.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LunchDescriptionComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_LunchDescriptionComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_LunchDescriptionComponentHidden

    private void lunchReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunchReturnButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AllRecipes a = new AllRecipes();
        a.setVisible(true);
    }//GEN-LAST:event_lunchReturnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Lunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lunch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LunchCookTimes;
    private javax.swing.JTextField LunchDescription;
    private javax.swing.JTextField LunchHowTo;
    private javax.swing.JTextField LunchIngredients;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lunch;
    private javax.swing.JComboBox<String> lunchDropDown;
    private javax.swing.JButton lunchReturnButton;
    private javax.swing.JLabel lunchimage;
    // End of variables declaration//GEN-END:variables
}
