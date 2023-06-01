/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;

/**
 *
 * @author ethan
 */
public class Breakfast extends javax.swing.JFrame {
            
    /**
     * Creates new form Breakfast
     */
    public Breakfast() {
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
        BreakfastHowTo = new javax.swing.JTextField();
        BreakfastIngredients = new javax.swing.JTextField();
        BreakfastReturnButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BreakfastCookTimes = new javax.swing.JTextField();
        BreakfastDescription = new javax.swing.JTextField();
        breakfastDropDown = new javax.swing.JComboBox<>();
        breakfastimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);
        jPanel2.add(BreakfastHowTo);
        BreakfastHowTo.setBounds(420, 120, 365, 153);
        jPanel2.add(BreakfastIngredients);
        BreakfastIngredients.setBounds(420, 291, 365, 153);

        BreakfastReturnButton.setText("Return");
        BreakfastReturnButton.setName("BreakfastReturnButton"); // NOI18N
        BreakfastReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakfastReturnButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BreakfastReturnButton);
        BreakfastReturnButton.setBounds(461, 79, 92, 23);

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Breakfast");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(300, 0, 200, 60);

        BreakfastCookTimes.setForeground(new java.awt.Color(255, 255, 255));
        BreakfastCookTimes.setBorder(null);
        jPanel2.add(BreakfastCookTimes);
        BreakfastCookTimes.setBounds(26, 291, 376, 153);

        BreakfastDescription.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BreakfastDescriptionComponentHidden(evt);
            }
        });
        jPanel2.add(BreakfastDescription);
        BreakfastDescription.setBounds(26, 120, 376, 153);

        breakfastDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(breakfastDropDown);
        breakfastDropDown.setBounds(174, 79, 228, 22);

        breakfastimage.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\Breakfast Image.png"));
        jPanel2.add(breakfastimage);
        breakfastimage.setBounds(0, 0, 800, 500);

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

    private void BreakfastReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakfastReturnButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AllRecipes a = new AllRecipes();
        a.setVisible(true);
    }//GEN-LAST:event_BreakfastReturnButtonActionPerformed

    private void BreakfastDescriptionComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BreakfastDescriptionComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BreakfastDescriptionComponentHidden

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
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Breakfast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BreakfastCookTimes;
    private javax.swing.JTextField BreakfastDescription;
    private javax.swing.JTextField BreakfastHowTo;
    private javax.swing.JTextField BreakfastIngredients;
    private javax.swing.JButton BreakfastReturnButton;
    private javax.swing.JComboBox<String> breakfastDropDown;
    private javax.swing.JLabel breakfastimage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
