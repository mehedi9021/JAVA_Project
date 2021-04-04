package gui1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diba
 */
public class farmer_information extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Adminlogin
     */
    public farmer_information(){
        initComponents();
        setResizable(false);  
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
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        division = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        problem_topic = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        problem_details = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(name);
        name.setBounds(140, 90, 140, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 90, 70, 22);

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(address);
        address.setBounds(140, 130, 140, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 130, 80, 22);

        division.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        division.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barishal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rajshahi", "Sylhet", "Rangpur" }));
        jPanel1.add(division);
        division.setBounds(140, 170, 140, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("District :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 80, 22);

        district.setBackground(new java.awt.Color(255, 255, 255));
        district.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        district.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(district);
        district.setBounds(140, 210, 140, 30);

        month.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(month);
        month.setBounds(650, 90, 140, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Month :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 90, 80, 30);

        problem_topic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        problem_topic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mango", "Rice", "Potato" }));
        jPanel1.add(problem_topic);
        problem_topic.setBounds(650, 130, 140, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Problem Topic :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 130, 150, 22);

        problem_details.setBackground(new java.awt.Color(255, 255, 255));
        problem_details.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        problem_details.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(problem_details);
        problem_details.setBounds(650, 170, 140, 30);

        duration.setBackground(new java.awt.Color(255, 255, 255));
        duration.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        duration.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(duration);
        duration.setBounds(720, 210, 60, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Days");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(789, 210, 50, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time Duration of problem :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 210, 215, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Problem Details :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(490, 170, 140, 22);

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Sign-up info");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 270, 170, 40);

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(phone);
        phone.setBounds(380, 330, 140, 30);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 330, 100, 30);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(password);
        password.setBounds(380, 370, 140, 30);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(270, 370, 100, 30);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Skip");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(540, 430, 90, 50);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 430, 87, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(452, 430, 80, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(260, 430, 80, 50);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(761, 10, 80, 50);

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Farmer Information");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 20, 430, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Division :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 170, 80, 22);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/farmer_information.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 850, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new farmer_login().setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Name = name.getText();
        String Address = address.getText();
        String Division = division.getSelectedItem().toString();
        String District = district.getText();
        String Month = month.getSelectedItem().toString();
        String Problem_Topic = problem_topic.getSelectedItem().toString();
        String Problem_Name = problem_details.getText();
        String Duration = duration.getText();
        String Phone = phone.getText();
        String Password = password.getText();

        Connection conn = null;
        PreparedStatement pst = null;
        if (name.getText().isEmpty()||address.getText().isEmpty()||district.getText().isEmpty()||problem_details.getText().isEmpty()||duration.getText().isEmpty()||phone.getText().isEmpty()||password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill up all option!!");
        }
        else
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agriculture?zeroDateTimeBehavior=convertToNull", "root", "");
                pst = conn.prepareStatement("Insert into farmer_information values(?,?,?,?,?,?,?,?,?,?)");
                //pst.setString(1, FirstName);
                pst.setString(1, Name);
                pst.setString(2, Address);
                pst.setString(3, Division);
                pst.setString(4, District);
                pst.setString(5, Month);
                pst.setString(6, Problem_Topic);
                pst.setString(7, Problem_Name);
                pst.setString(8, Duration);
                pst.setString(9, Phone);
                pst.setString(10, Password);

                int i = pst.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Your information successfully saved to our database!!");
                    new farmer_login().setVisible(true);
                    this.setVisible(false);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error");
                }

            }
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        name.setText(null);
        address.setText(null);
        //di.getSelectedItem().toString();
        district.setText(null);
        //mo.getSelectedItem().toString();
        //pt.getSelectedItem().toString();
        problem_details.setText(null);
        duration.setText(null);
        phone.setText(null);
        password.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new homepage().setVisible(true);
        this.setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(farmer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmer_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmer_information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField district;
    private javax.swing.JComboBox<String> division;
    private javax.swing.JTextField duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField problem_details;
    private javax.swing.JComboBox<String> problem_topic;
    // End of variables declaration//GEN-END:variables
}