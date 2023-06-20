/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guis;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.ImageIcon;
/**
 *
 * @author azval
 */
public class CreateRecipe extends javax.swing.JFrame {
    
    byte[] imageBytes = null;
    
    /**
     * Creates new form CreateRecipe
     */
    public CreateRecipe() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        RecipeCatComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        HowToCookTextBox = new javax.swing.JTextField();
        CookTimesTextBox = new javax.swing.JTextField();
        RecipePhoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RecipeName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        IngredientsTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DescriptionTextBox = new javax.swing.JTextField();
        background6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Recipe");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 30, 260, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 204));
        jLabel7.setText("Image Upload:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 540, 100, 20);

        ExitButton.setBackground(new java.awt.Color(255, 51, 51));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitButton.setText("Return");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);
        ExitButton.setBounds(570, 590, 90, 30);

        SubmitButton.setBackground(new java.awt.Color(153, 255, 153));
        SubmitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitButton);
        SubmitButton.setBounds(360, 590, 90, 30);

        RecipeCatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Catagory", "Breakfast", "Lunch", "Dinner" }));
        RecipeCatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipeCatComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(RecipeCatComboBox);
        RecipeCatComboBox.setBounds(430, 110, 140, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("Ingredients:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 260, 79, 25);

        HowToCookTextBox.setMinimumSize(new java.awt.Dimension(60, 20));
        jPanel1.add(HowToCookTextBox);
        HowToCookTextBox.setBounds(130, 370, 790, 47);

        CookTimesTextBox.setMinimumSize(new java.awt.Dimension(60, 20));
        jPanel1.add(CookTimesTextBox);
        CookTimesTextBox.setBounds(130, 310, 790, 40);

        RecipePhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RecipePhoto.setMaximumSize(new java.awt.Dimension(280, 140));
        RecipePhoto.setMinimumSize(new java.awt.Dimension(280, 140));
        RecipePhoto.setPreferredSize(new java.awt.Dimension(280, 140));
        jPanel1.add(RecipePhoto);
        RecipePhoto.setBounds(380, 430, 280, 140);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("How to cook:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 380, 100, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Cook Times:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 320, 90, 25);
        jPanel1.add(RecipeName);
        RecipeName.setBounds(130, 150, 160, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 204));
        jLabel8.setText("Recipe Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 150, 100, 20);

        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 540, 90, 23);

        IngredientsTextBox.setMinimumSize(new java.awt.Dimension(60, 20));
        IngredientsTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngredientsTextBoxActionPerformed(evt);
            }
        });
        jPanel1.add(IngredientsTextBox);
        IngredientsTextBox.setBounds(130, 260, 790, 40);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Description:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 210, 80, 20);

        DescriptionTextBox.setMinimumSize(new java.awt.Dimension(60, 20));
        DescriptionTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextBoxActionPerformed(evt);
            }
        });
        jPanel1.add(DescriptionTextBox);
        DescriptionTextBox.setBounds(130, 200, 790, 40);

        background6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\Guis\\images\\background4.png"));
        jPanel1.add(background6);
        background6.setBounds(10, 0, 950, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(976, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IngredientsTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngredientsTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngredientsTextBoxActionPerformed

    private void DescriptionTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextBoxActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // saves created recipe to recipe database
        //database connection details
        String host = "jdbc:mysql://csi2999.mysql.database.azure.com:3306/login";
        int port = 3306;
        String DatabaseUsername = "csi2999";
        String DatabasePassword = "bhl7^W0O#qq2";
        String Database = "login";
        
        //inputs
        String desc = DescriptionTextBox.getText();
        String ing = IngredientsTextBox.getText();
        String cookTimes = CookTimesTextBox.getText();
        String howTo = HowToCookTextBox.getText();
        String recipeName = RecipeName.getText();
        
        try{
            Connection conn = DriverManager.getConnection(host, DatabaseUsername, DatabasePassword);
            
            String selected = (String)RecipeCatComboBox.getSelectedItem();
            
            switch (selected) {
                case "Breakfast":
                    {
                        PreparedStatement pst = conn.prepareStatement("INSERT INTO recipes.breakfast (recipe_image , recipe_name , description , ingredients , cook_time , how_to_cook) VALUES (?,?,?,?,?,?)");
                        pst.setBytes(1, imageBytes);
                        pst.setString(2, recipeName);
                        pst.setString(3, desc);
                        pst.setString(4, ing);
                        pst.setString(5, cookTimes);
                        pst.setString(6, howTo);
                        pst.execute();
                        break;
                    }
                case "Lunch":
                    {
                        PreparedStatement pst = conn.prepareStatement("INSERT INTO recipes.lunch (recipe_image , recipe_name , description , ingredients , cook_time , how_to_cook) VALUES (?,?,?,?,?,?)");
                        pst.setBytes(1, imageBytes);
                        pst.setString(2, recipeName);
                        pst.setString(3, desc);
                        pst.setString(4, ing);
                        pst.setString(5, cookTimes);
                        pst.setString(6, howTo);
                        pst.execute();
                        break;
                    }
                case "Dinner":
                    {
                        PreparedStatement pst = conn.prepareStatement("INSERT INTO recipes.dinner (recipe_image , recipe_name , description , ingredients , cook_time , how_to_cook) VALUES (?,?,?,?,?,?)");
                        pst.setBytes(1, imageBytes);
                        pst.setString(2, recipeName);
                        pst.setString(3, desc);
                        pst.setString(4, ing);
                        pst.setString(5, cookTimes);
                        pst.setString(6, howTo);
                        pst.execute();
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(rootPane, "error");
                    break;
            }
            JOptionPane.showMessageDialog(rootPane, "Recipe Created Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AdminControlPanel admin = new AdminControlPanel();
        admin.setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void RecipeCatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipeCatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecipeCatComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try {
            BufferedImage originalImage = ImageIO.read(f);
            int newWidth = 280;
            int newHeight = 140;
            //resize image
            Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            BufferedImage resizedBufferedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            resizedBufferedImage.getGraphics().drawImage(resizedImage, 0, 0, null);
            //overwrite the original file with resized file
            File resizedFile = new File(path);
            ImageIO.write(resizedBufferedImage, "jpg", resizedFile);
            //set the icon in create recipe gui
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(280, 140, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            RecipePhoto.setIcon(icon);
            //convert the image into byte data for sql insertion
            InputStream inputStream = new FileInputStream(resizedFile);
            ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byteOutputStream.write(buffer, 0, bytesRead);
            }
            imageBytes = byteOutputStream.toByteArray();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateRecipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CookTimesTextBox;
    private javax.swing.JTextField DescriptionTextBox;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField HowToCookTextBox;
    private javax.swing.JTextField IngredientsTextBox;
    private javax.swing.JComboBox<String> RecipeCatComboBox;
    private javax.swing.JTextField RecipeName;
    private javax.swing.JLabel RecipePhoto;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel background6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
