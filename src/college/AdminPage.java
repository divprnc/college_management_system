/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PRINCE
 */
public class AdminPage extends javax.swing.JFrame {

    String query = null;
    ResultSet rs = null;
    int rowcount = 0;
    public AdminPage() {
        initComponents();
        homepanel.setVisible(true);
        staffpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursespanel.setVisible(false);
        resultspanel.setVisible(false);
        usermanagepanel.setVisible(false);
        adminpanel.setVisible(false);
        setuname();
    }

    private void setuname()
    {
         try{
             
            query = "select * from tablelogin where Username = '" + LoginPanel.txtusername.getText() + "' and Password = '" + LoginPanel.txtpassword.getText() + "'";
            rs = DatabaseQuery.ExecuteQuery(query);
        
        while(rs.next())
        {
             adminname.setText("Logged As "+rs.getString("FirstName") +  " "+rs.getString("LastName"));
            
        }
       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnstudent = new javax.swing.JButton();
        btnstaff = new javax.swing.JButton();
        btncourses = new javax.swing.JButton();
        btnresults = new javax.swing.JButton();
        btnsettings = new javax.swing.JButton();
        btnadministration = new javax.swing.JButton();
        upper = new javax.swing.JPanel();
        adminname = new javax.swing.JLabel();
        btnlogout = new javax.swing.JLabel();
        studentpanel = new javax.swing.JPanel();
        btnadmission = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnadmission1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnadmission2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnadmission3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        staffpanel = new javax.swing.JPanel();
        btnadmission4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnadmission5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnsalary = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnadmission7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnadmission8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        subpermission = new javax.swing.JButton();
        coursespanel = new javax.swing.JPanel();
        btnadmission9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnadmission10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnadmission11 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnadmission12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        resultspanel = new javax.swing.JPanel();
        btnresult = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        usermanagepanel = new javax.swing.JPanel();
        btnmanage = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        adminpanel = new javax.swing.JPanel();
        btnadmission15 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        btnadmission17 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        bg.setBackground(new java.awt.Color(204, 0, 204));

        side.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/avatar.png"))); // NOI18N
        jLabel1.setText("     Admin Dashboard");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        btnhome.setBackground(new java.awt.Color(153, 0, 153));
        btnhome.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/house-outline.png"))); // NOI18N
        btnhome.setText("    Home");
        btnhome.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnhome.setMaximumSize(new java.awt.Dimension(179, 32));
        btnhome.setMinimumSize(new java.awt.Dimension(179, 32));
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnstudent.setBackground(new java.awt.Color(153, 0, 153));
        btnstudent.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnstudent.setForeground(new java.awt.Color(255, 255, 255));
        btnstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/student.png"))); // NOI18N
        btnstudent.setText("    Student");
        btnstudent.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnstudent.setMaximumSize(new java.awt.Dimension(179, 32));
        btnstudent.setMinimumSize(new java.awt.Dimension(179, 32));
        btnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentActionPerformed(evt);
            }
        });

        btnstaff.setBackground(new java.awt.Color(153, 0, 153));
        btnstaff.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnstaff.setForeground(new java.awt.Color(255, 255, 255));
        btnstaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/employee.png"))); // NOI18N
        btnstaff.setText("    Staff");
        btnstaff.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnstaff.setMaximumSize(new java.awt.Dimension(179, 32));
        btnstaff.setMinimumSize(new java.awt.Dimension(179, 32));
        btnstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstaffActionPerformed(evt);
            }
        });

        btncourses.setBackground(new java.awt.Color(153, 0, 153));
        btncourses.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btncourses.setForeground(new java.awt.Color(255, 255, 255));
        btncourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/open-book.png"))); // NOI18N
        btncourses.setText("    Courses");
        btncourses.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btncourses.setMaximumSize(new java.awt.Dimension(179, 32));
        btncourses.setMinimumSize(new java.awt.Dimension(179, 32));
        btncourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoursesActionPerformed(evt);
            }
        });

        btnresults.setBackground(new java.awt.Color(153, 0, 153));
        btnresults.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnresults.setForeground(new java.awt.Color(255, 255, 255));
        btnresults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/file.png"))); // NOI18N
        btnresults.setText("    Results and Reports");
        btnresults.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnresults.setMaximumSize(new java.awt.Dimension(179, 32));
        btnresults.setMinimumSize(new java.awt.Dimension(179, 32));
        btnresults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultsActionPerformed(evt);
            }
        });

        btnsettings.setBackground(new java.awt.Color(153, 0, 153));
        btnsettings.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnsettings.setForeground(new java.awt.Color(255, 255, 255));
        btnsettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/settings.png"))); // NOI18N
        btnsettings.setText("    Settings");
        btnsettings.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnsettings.setMaximumSize(new java.awt.Dimension(179, 32));
        btnsettings.setMinimumSize(new java.awt.Dimension(179, 32));
        btnsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsettingsActionPerformed(evt);
            }
        });

        btnadministration.setBackground(new java.awt.Color(153, 0, 153));
        btnadministration.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnadministration.setForeground(new java.awt.Color(255, 255, 255));
        btnadministration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/icons8-diff-files-32.png"))); // NOI18N
        btnadministration.setText("    Users");
        btnadministration.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnadministration.setMaximumSize(new java.awt.Dimension(179, 32));
        btnadministration.setMinimumSize(new java.awt.Dimension(179, 32));
        btnadministration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadministrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnstaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btncourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnresults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnsettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnadministration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncourses, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnresults, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadministration, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(798, Short.MAX_VALUE))
        );

        upper.setBackground(new java.awt.Color(153, 0, 153));

        adminname.setBackground(new java.awt.Color(255, 255, 255));
        adminname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminname.setForeground(new java.awt.Color(255, 255, 255));

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("LogOut");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout upperLayout = new javax.swing.GroupLayout(upper);
        upper.setLayout(upperLayout);
        upperLayout.setHorizontalGroup(
            upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        upperLayout.setVerticalGroup(
            upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        studentpanel.setBackground(new java.awt.Color(204, 0, 204));

        btnadmission.setBackground(new java.awt.Color(102, 0, 102));
        btnadmission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/pencil.png"))); // NOI18N
        btnadmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmissionActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admission");

        btnadmission1.setBackground(new java.awt.Color(102, 0, 102));
        btnadmission1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/resume.png"))); // NOI18N
        btnadmission1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmission1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Details");

        btnadmission2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Card");

        btnadmission3.setBackground(new java.awt.Color(102, 0, 102));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fees ");

        javax.swing.GroupLayout studentpanelLayout = new javax.swing.GroupLayout(studentpanel);
        studentpanel.setLayout(studentpanelLayout);
        studentpanelLayout.setHorizontalGroup(
            studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentpanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        studentpanelLayout.setVerticalGroup(
            studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(studentpanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentpanelLayout.createSequentialGroup()
                        .addGroup(studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnadmission2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentpanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        staffpanel.setBackground(new java.awt.Color(204, 0, 204));

        btnadmission4.setBackground(new java.awt.Color(102, 0, 102));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registration");

        btnadmission5.setBackground(new java.awt.Color(102, 0, 102));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Details");

        btnsalary.setBackground(new java.awt.Color(102, 0, 102));
        btnsalary.setForeground(new java.awt.Color(204, 0, 204));
        btnsalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/salary.png"))); // NOI18N
        btnsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalaryActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Card");

        btnadmission7.setBackground(new java.awt.Color(102, 0, 102));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary");

        btnadmission8.setBackground(new java.awt.Color(102, 0, 102));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Attendence");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Subjects Permission");

        subpermission.setBackground(new java.awt.Color(102, 0, 102));
        subpermission.setForeground(new java.awt.Color(204, 0, 204));
        subpermission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/open-book.png"))); // NOI18N
        subpermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subpermissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffpanelLayout = new javax.swing.GroupLayout(staffpanel);
        staffpanel.setLayout(staffpanelLayout);
        staffpanelLayout.setHorizontalGroup(
            staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadmission4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadmission5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadmission7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadmission8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(subpermission, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staffpanelLayout.setVerticalGroup(
            staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnadmission8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(staffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staffpanelLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subpermission, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        coursespanel.setBackground(new java.awt.Color(204, 0, 204));

        btnadmission9.setBackground(new java.awt.Color(102, 0, 102));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CSE");

        btnadmission10.setBackground(new java.awt.Color(102, 0, 102));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mechanical");

        btnadmission11.setBackground(new java.awt.Color(102, 0, 102));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Civil");

        btnadmission12.setBackground(new java.awt.Color(102, 0, 102));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("IS");

        javax.swing.GroupLayout coursespanelLayout = new javax.swing.GroupLayout(coursespanel);
        coursespanel.setLayout(coursespanelLayout);
        coursespanelLayout.setHorizontalGroup(
            coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursespanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        coursespanelLayout.setVerticalGroup(
            coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursespanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(coursespanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(coursespanelLayout.createSequentialGroup()
                        .addGroup(coursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnadmission11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(coursespanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadmission10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultspanel.setBackground(new java.awt.Color(204, 0, 204));

        btnresult.setBackground(new java.awt.Color(102, 0, 102));
        btnresult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/analysis.png"))); // NOI18N
        btnresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Results and Attendence");

        javax.swing.GroupLayout resultspanelLayout = new javax.swing.GroupLayout(resultspanel);
        resultspanel.setLayout(resultspanelLayout);
        resultspanelLayout.setHorizontalGroup(
            resultspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultspanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(resultspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        resultspanelLayout.setVerticalGroup(
            resultspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultspanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        usermanagepanel.setBackground(new java.awt.Color(204, 0, 204));

        btnmanage.setBackground(new java.awt.Color(102, 0, 102));
        btnmanage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/work-team.png"))); // NOI18N
        btnmanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Users Management");

        btnnew.setBackground(new java.awt.Color(102, 0, 102));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/Icons/new-user.png"))); // NOI18N
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("New User Registration");

        javax.swing.GroupLayout usermanagepanelLayout = new javax.swing.GroupLayout(usermanagepanel);
        usermanagepanel.setLayout(usermanagepanelLayout);
        usermanagepanelLayout.setHorizontalGroup(
            usermanagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usermanagepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(usermanagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmanage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usermanagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(usermanagepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        usermanagepanelLayout.setVerticalGroup(
            usermanagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usermanagepanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(usermanagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(usermanagepanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usermanagepanelLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmanage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        adminpanel.setBackground(new java.awt.Color(204, 0, 204));

        btnadmission15.setBackground(new java.awt.Color(102, 0, 102));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Change Password");

        javax.swing.GroupLayout adminpanelLayout = new javax.swing.GroupLayout(adminpanel);
        adminpanel.setLayout(adminpanelLayout);
        adminpanelLayout.setHorizontalGroup(
            adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        adminpanelLayout.setVerticalGroup(
            adminpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadmission15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homepanel.setBackground(new java.awt.Color(204, 0, 204));

        btnadmission17.setBackground(new java.awt.Color(102, 0, 102));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Home");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadmission17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadmission17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(staffpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coursespanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usermanagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                .addComponent(upper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(resultspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usermanagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(coursespanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staffpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        homepanel.setVisible(true);
        staffpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursespanel.setVisible(false);
        resultspanel.setVisible(false);
        usermanagepanel.setVisible(false);
        adminpanel.setVisible(false);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        // TODO add your handling code here:
        homepanel.setVisible(false);
        usermanagepanel.setVisible(false);
        resultspanel.setVisible(false);
        coursespanel.setVisible(false);
        staffpanel.setVisible(false);
        adminpanel.setVisible(false);
        studentpanel.setVisible(true);
        
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btnstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstaffActionPerformed
        // TODO add your handling code here:
        usermanagepanel.setVisible(false);
        resultspanel.setVisible(false);
        coursespanel.setVisible(false);
        adminpanel.setVisible(false);
        homepanel.setVisible(false);
        studentpanel.setVisible(false);
        staffpanel.setVisible(true);
        
    }//GEN-LAST:event_btnstaffActionPerformed

    private void btncoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoursesActionPerformed
        // TODO add your handling code here:
        usermanagepanel.setVisible(false);
        resultspanel.setVisible(false);
        homepanel.setVisible(false);
        staffpanel.setVisible(false);
        adminpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursespanel.setVisible(true);
        
    }//GEN-LAST:event_btncoursesActionPerformed

    private void btnresultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultsActionPerformed
        // TODO add your handling code here:
        staffpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursespanel.setVisible(false);
        usermanagepanel.setVisible(false);
        homepanel.setVisible(false);
        resultspanel.setVisible(true);
        adminpanel.setVisible(false);
    }//GEN-LAST:event_btnresultsActionPerformed

    private void btnsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsettingsActionPerformed
        // TODO add your handling code here:
        staffpanel.setVisible(false);
        studentpanel.setVisible(false);
        homepanel.setVisible(false);
        coursespanel.setVisible(false);
        resultspanel.setVisible(false);
        usermanagepanel.setVisible(false);
        adminpanel.setVisible(true);
    }//GEN-LAST:event_btnsettingsActionPerformed

    private void btnadministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadministrationActionPerformed
        // TODO add your handling code here:
        staffpanel.setVisible(false);
        adminpanel.setVisible(false);
        homepanel.setVisible(false);
        studentpanel.setVisible(false);
        coursespanel.setVisible(false);
        resultspanel.setVisible(false);
        usermanagepanel.setVisible(true);
        
    }//GEN-LAST:event_btnadministrationActionPerformed

    private void btnresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultActionPerformed
        // TODO add your handling code here:
        AdminResultSeen ars = new AdminResultSeen();
        String usn = JOptionPane.showInputDialog(null,"Enter USN ");
        query = null;
        rs = null;
        try{
             
             query = "select USN,Name,Usn,Branch,Semester from Results";
             rs = DatabaseQuery.ExecuteQuery(query);
             if(rs.next())
             {
                 
                 if(rs.getString("USN").equalsIgnoreCase(usn))
                 {
                         ars.txtname.setText(rs.getString("Name"));
                         ars.txtusn.setText(rs.getString("Usn"));
                         ars.txtsem.setText(rs.getString("Semester"));
                        // ars.txtbranch.setText(Integer.toString(rs.getInt("Branch")));
                         if(rs.getInt("Branch") == 1)
                         {
                             ars.txtbranch.setText("CS");
                         }
                         if(rs.getInt("Branch") == 2)
                         {
                             ars.txtbranch.setText("IS");
                         }
                         if(rs.getInt("Branch") == 3)
                         {
                             ars.txtbranch.setText("ME");
                         }
                         if(rs.getInt("Branch") == 4)
                         {
                             ars.txtbranch.setText("CV");
                         }
                         
                        query = "Select SubjectCode, CIE1, Att1, CIE2, Att2, CIE3, Att3, Assignment, FinalCIE, SemesterGrade from Results where USN = '" + usn + "'";                
                        rs = DatabaseQuery.ExecuteQuery(query); 
                        ResultSetMetaData rsmd = rs.getMetaData();
                        DefaultTableModel model = (DefaultTableModel)ars.ResultTable.getModel();
                        
                        int colCount = rsmd.getColumnCount();
                        model.setRowCount(0);
                        Object[] row = new Object[colCount];
                        while (rs.next())
                        {
                            for (int i = 1; i <= colCount; i++)
                            {
                                row[i - 1] = rs.getString(rsmd.getColumnName(i));
                            }
                            model.addRow(row);
                        }
                        ars.setVisible(true);
                  }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Invalid USN","Error",1);
                 }
             }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnresultActionPerformed

    private void btnmanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageActionPerformed
        // TODO add your handling code here: 
        UserAdministration udm = new UserAdministration();
        udm.setVisible(true);
        
    }//GEN-LAST:event_btnmanageActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        NewUserRegistration nur = new NewUserRegistration();
        nur.setVisible(true);
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        LoginPanel lp = new LoginPanel();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnadmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmissionActionPerformed
        // TODO add your handling code here:
        StudentAdmissionUG sa = new StudentAdmissionUG();
        sa.setVisible(true);
    }//GEN-LAST:event_btnadmissionActionPerformed

    private void btnsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalaryActionPerformed
        // TODO add your handling code here:
        StaffSalaryManagement ssm = new StaffSalaryManagement();
        ssm.setVisible(true);
    }//GEN-LAST:event_btnsalaryActionPerformed

    private void btnadmission1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmission1ActionPerformed
        // TODO add your handling code here:
        StudentDetailsTable sdt = new StudentDetailsTable();
        sdt.setVisible(true);
        
    }//GEN-LAST:event_btnadmission1ActionPerformed

    private void subpermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subpermissionActionPerformed
        // TODO add your handling code here:
        TeacherStudentResultManagement  tsrm = new TeacherStudentResultManagement();
        tsrm.setVisible(true);

    }//GEN-LAST:event_subpermissionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        DatabaseQuery.GetConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminname;
    private javax.swing.JPanel adminpanel;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnadministration;
    private javax.swing.JButton btnadmission;
    private javax.swing.JButton btnadmission1;
    private javax.swing.JButton btnadmission10;
    private javax.swing.JButton btnadmission11;
    private javax.swing.JButton btnadmission12;
    private javax.swing.JButton btnadmission15;
    private javax.swing.JButton btnadmission17;
    private javax.swing.JButton btnadmission2;
    private javax.swing.JButton btnadmission3;
    private javax.swing.JButton btnadmission4;
    private javax.swing.JButton btnadmission5;
    private javax.swing.JButton btnadmission7;
    private javax.swing.JButton btnadmission8;
    private javax.swing.JButton btnadmission9;
    private javax.swing.JButton btncourses;
    private javax.swing.JButton btnhome;
    private javax.swing.JLabel btnlogout;
    private javax.swing.JButton btnmanage;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnresult;
    private javax.swing.JButton btnresults;
    private javax.swing.JButton btnsalary;
    private javax.swing.JButton btnsettings;
    private javax.swing.JButton btnstaff;
    private javax.swing.JButton btnstudent;
    private javax.swing.JPanel coursespanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel resultspanel;
    private javax.swing.JPanel side;
    private javax.swing.JPanel staffpanel;
    private javax.swing.JPanel studentpanel;
    private javax.swing.JButton subpermission;
    private javax.swing.JPanel upper;
    private javax.swing.JPanel usermanagepanel;
    // End of variables declaration//GEN-END:variables
}
