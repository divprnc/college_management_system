/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PRINCE
 */
public class EmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePage
     */
    String query = null;
    ResultSet rs = null;
    int rowcount = 0;
    void setuname()
    {
       try{
               
            query = "select * from tablelogin where Username = '" + LoginPanel.txtusername.getText() + "' and Password = '" + LoginPanel.txtpassword.getText() + "'";
            rs = DatabaseQuery.ExecuteQuery(query);
        
        while(rs.next())
        {
             empname.setText(rs.getString("FirstName") +  " "+rs.getString("LastName"));
            
        }
       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public EmployeePage() {
        initComponents();
        setuname();
        passpanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        empname = new javax.swing.JLabel();
        logoutclick = new javax.swing.JLabel();
        setresult = new javax.swing.JToggleButton();
        empname1 = new javax.swing.JLabel();
        passpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        empname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        logoutclick.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logoutclick.setText("LogOut");
        logoutclick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutclickMouseClicked(evt);
            }
        });

        setresult.setBackground(new java.awt.Color(0, 204, 204));
        setresult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/icons8-diff-files-32.png"))); // NOI18N
        setresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setresultActionPerformed(evt);
            }
        });

        empname1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        empname1.setText("Logged As");

        passpanel.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Passcode");

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passpanelLayout = new javax.swing.GroupLayout(passpanel);
        passpanel.setLayout(passpanelLayout);
        passpanelLayout.setHorizontalGroup(
            passpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passpanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass)
                .addContainerGap())
            .addGroup(passpanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnok)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        passpanelLayout.setVerticalGroup(
            passpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passpanelLayout.createSequentialGroup()
                .addGroup(passpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnok))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(empname1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutclick, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutclick, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empname1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(setresult, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setresultActionPerformed
         
        query = null;
        rs = null;
        passpanel.setVisible(true);
        
    }//GEN-LAST:event_setresultActionPerformed

    private void logoutclickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutclickMouseClicked
        // TODO add your handling code here:
        LoginPanel lp = new LoginPanel();
        lp.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_logoutclickMouseClicked

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        String passcode = txtpass.getText();
        if(passcode.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Passcode");
        }
        else
        {
            try{
            query = "select TeacherPasscode from TeacherSubPermission where TeacherPasscode = '" + passcode + "' and TeacherName = '" + empname.getText() + "'";
            rs = DatabaseQuery.ExecuteQuery(query);
            if(rs.next())
            {
                if(passcode.equals(rs.getString("TeacherPasscode")))
                {
                    StudentResultManagement srm = new StudentResultManagement();
                    srm.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Your Passcode is Incorrect","Error",1);
                }
            }
            else
                {
                    JOptionPane.showMessageDialog(null, "Your Passcode is Incorrect","Error",1);
                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        }
            
    }//GEN-LAST:event_btnokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws SQLException {
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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        DatabaseQuery.GetConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JLabel empname;
    private javax.swing.JLabel empname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutclick;
    private javax.swing.JPanel passpanel;
    private javax.swing.JToggleButton setresult;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
