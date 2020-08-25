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
public class NewUserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form NewUserRegistration
     */
    String query = null;
    ResultSet rs = null;
    int rowcount = 0;
    private void FillCombo()
    {
        txtnewusertype.addItem("Select");
        txtnewusertype.addItem("Admin");
        txtnewusertype.addItem("Student");
        txtnewusertype.addItem("Staff");
    }
    public NewUserRegistration() {
        initComponents();
        try
        {
            DatabaseQuery.GetConnection();
            txtnewfirstname.requestFocus();
            FillCombo();
            txtnewuserid.setText(Integer.toString(AutoGenerateuserid()));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnewuserid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnewfirstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnewusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnewlastname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        txtnewusertype = new javax.swing.JComboBox();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtnewpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("New User Registration Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("UserID");

        txtnewuserid.setEditable(false);
        txtnewuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewuseridActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("User Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Password");

        btncreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncreate.setText("Submit");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnewfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewusername, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnewusertype, 0, 108, Short.MAX_VALUE)
                    .addComponent(txtnewlastname, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(txtnewpassword))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnewuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtnewusertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnewlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnewfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnewusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_btnexitActionPerformed

    public void clearForm() throws SQLException
    {
        txtnewfirstname.setText("");
        txtnewlastname.setText("");
        txtnewusername.setText("");
        txtnewpassword.setText("");
        txtnewusertype.setSelectedIndex(0);
        txtnewuserid.setText(Integer.toString(AutoGenerateuserid()));
    }   
        
       
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        try
        {
            clearForm();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnclearActionPerformed

    public String convertString(int a)
    {
        String b = new Integer(a).toString();
        return b;
    }
    public int AutoGenerateuserid() throws SQLException
    {
        int userid = 0;
        try
        {
            DatabaseQuery.GetConnection();
            query = "select isnull(max(userid),0) uid from tablelogin";
            rs = DatabaseQuery.ExecuteQuery(query);
            if(rs.next())
            {
                if(rs.getInt("uid") == 0)
                {
                    userid = 1;
                }
                else
                {
                    userid = rs.getInt("uid")+1;
                }
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            return userid;
        }
    }
    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
       
        
        String newfirstname = txtnewfirstname.getText();
        String newlastname =txtnewlastname.getText();
        String newusername = txtnewusername.getText();
        String newpassword = txtnewpassword.getText();
        int newusertype = txtnewusertype.getSelectedIndex();
        String newuserid = txtnewuserid.getText();
         if(newfirstname.equals("") || newlastname.equals("") || newusername.equals("")||newpassword.equals("")||newusertype == 0||newuserid.equals(""))
         {
            JOptionPane.showMessageDialog(null,"Some Fields are Empty", "Error",1);
        }
         
          
         else
         {
             try
             {
                   if(newusertype == 1){
                         String input = JOptionPane.showInputDialog(null,"Enter the Admin Password:");
                         query = null;
           try
             {
                query = "select Password from tablelogin where userID = 101"  + " and Password = '" + input + "'";
                rs = DatabaseQuery.ExecuteQuery(query);
                if (rs.next())
                {
                   if(rs.getString("Password").equals(input))
                   {
                        query = "insert into tablelogin values("+newuserid+",'"+newfirstname+"','"+newlastname+"','"+newusername+"','"+newpassword+"','"+newusertype+"')";
                        rowcount = DatabaseQuery.ExecuteUpdate(query);
                        JOptionPane.showMessageDialog(null, "Saved Successfully","Save", 1);
                        clearForm();
                   }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Admin Password");
                }
                  
             }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }  
        }
                   else{
                       
                //
                query = "insert into tablelogin values("+newuserid+",'"+newfirstname+"','"+newlastname+"','"+newusername+"','"+newpassword+"','"+newusertype+"')";
                rowcount = DatabaseQuery.ExecuteUpdate(query);
                  JOptionPane.showMessageDialog(null, "Saved Successfully","Save", 1);
                  clearForm();
                   }
             }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
    
         }
    }//GEN-LAST:event_btncreateActionPerformed

    private void txtnewuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewuseridActionPerformed

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
            java.util.logging.Logger.getLogger(NewUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtnewfirstname;
    private javax.swing.JTextField txtnewlastname;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JTextField txtnewuserid;
    private javax.swing.JTextField txtnewusername;
    private javax.swing.JComboBox txtnewusertype;
    // End of variables declaration//GEN-END:variables
}
