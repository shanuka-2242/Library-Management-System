package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageUsersForm extends javax.swing.JFrame {
       
    My_Classes.Users users = new My_Classes.Users();  
    My_Classes.funcClass func = new My_Classes.funcClass();


    public ManageUsersForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //customJTable
        func.customTable(table_Users);
        
        //populate JTable
        populateJtableWithUsers();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //to get the logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/man.png"));
        Image image = imageicon .getImage().getScaledInstance(ManageUser_logo.getWidth(), ManageUser_logo.getHeight(), Image.SCALE_SMOOTH);
        ManageUser_logo.setIcon(new ImageIcon (image));
        
        //close
        ImageIcon imageicon1 = new ImageIcon(getClass().getResource("/My_Images/close.png"));
        Image image1 = imageicon1 .getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        Close.setIcon(new ImageIcon (image1));

        //print
        ImageIcon imageicon4 = new ImageIcon(getClass().getResource("/My_Images/printer.png"));
        Image image4 = imageicon4 .getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        print.setIcon(new ImageIcon (image4));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ManageUser_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ManageUser_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ManageUser_Fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ManageUser_Lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ManageUser_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ManageUser_Pword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        ManageUser_Cpassword = new javax.swing.JPasswordField();
        check_Admin = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Users = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Authors");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Manage Users");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Close.setBackground(new java.awt.Color(255, 255, 255));
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManageUser_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ManageUser_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(253, 253, 189));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("ID                    :");

        ManageUser_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ManageUser_ID.setText("Auto Generated");
        ManageUser_ID.setEnabled(false);
        ManageUser_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUser_IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("First Name    :");

        ManageUser_Fname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Last Name    :");

        ManageUser_Lname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("User Name       :");

        ManageUser_Username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Password             :");

        ManageUser_Pword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Confirm Password             :");

        ManageUser_Cpassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        check_Admin.setBackground(new java.awt.Color(253, 253, 189));
        check_Admin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        check_Admin.setText("Make this User as an Admin");
        check_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(ManageUser_Fname)
                            .addComponent(ManageUser_Lname)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ManageUser_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ManageUser_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(ManageUser_Pword)
                    .addComponent(ManageUser_Cpassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(check_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ManageUser_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUser_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUser_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUser_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUser_Pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageUser_Cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_Admin)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(253, 253, 189));

        table_Users.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Users);

        btn_Add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Add.setText("ADD");
        btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Edit.setText("EDIT");
        btn_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Delete.setText("DELETE");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        String id = ManageUser_ID.getText();
        
        if(id.equals("Auto Generated")){
            
            JOptionPane.showMessageDialog(null, "Select a User from the table first.", "Alert",0);
            
        }
        else{
            
        //delete the selcted genre
        try {

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm deleting the user?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                int idr = Integer.parseInt(ManageUser_ID.getText());
                
                users.removeUser(idr);
                
                populateJtableWithUsers();

                //clear text boxes
                    ManageUser_ID.setText("Auto Generate");
                    ManageUser_Fname.setText("");
                    ManageUser_Lname.setText("");
                    ManageUser_Username.setText("");       
                    ManageUser_Pword.setText("");
                    ManageUser_Cpassword.setText("");
                    check_Admin.setSelected(false);

            }

        }
        catch (NullPointerException exception) {

            JOptionPane.showMessageDialog(null, "Invalid User ID.", "Error",0);

        }
        }
        
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed

        //edit user
        String id = ManageUser_ID.getText();
        String fname = ManageUser_Fname.getText();
        String lname = ManageUser_Lname.getText();
        String username = ManageUser_Username.getText();     
        String password = String.valueOf(ManageUser_Pword.getPassword()); 
        String Cpassword = String.valueOf(ManageUser_Cpassword.getPassword());    
        String userType = "User";
        
        if(check_Admin.isSelected()){
            
            userType = "Admin";
            
        }

        if(id.equals("Auto Generated")){
            
            JOptionPane.showMessageDialog(null, "Select a User from the table first.", "Alert",0);
            
        }
        //firstname
        //check if firstname is empty
        else if(fname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "First Name cannot be empty.", "Empty Fields",0);
        }

        //firstname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", fname)){

            JOptionPane.showMessageDialog(null, "First Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //lastname
        //check if lastname is empty
        else if(lname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Last Name cannot be empty.", "Empty Fields",0);
        }

        //lastname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", lname)){

            JOptionPane.showMessageDialog(null, "Last Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //username
        else if(username.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "User Name cannot be empty.", "Empty Fields",0);
        }
 
        //password
        else if(password.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Password cannot be empty.", "Empty Fields",0);
        }
        
        //password must have atlest 5 chracters
        else if(password.length() < 5){

            JOptionPane.showMessageDialog(null, "Password must have atleast 5 chracters.", "No enough length",0);
        }
        
        //confirm password
        else if(Cpassword.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Confirm the Password.", "Empty Fields",0);
        }
        
        //password = confirm password
        else if(!Cpassword.equals(password)){

            JOptionPane.showMessageDialog(null, "Confirm password is not the same as Password.", "Unmatched",0);
        }

        //check if textfield is not empty
        else{

            try {

                //show the confirmation message before delete
                int confirm = JOptionPane.showConfirmDialog(null, "Confirm editing the author?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if(confirm == JOptionPane.YES_OPTION){

                    int idU = Integer.parseInt(ManageUser_ID.getText());
                    users.editUser(idU, fname, lname, username, Cpassword, userType);
                    populateJtableWithUsers();

                    //clear text boxes
                    ManageUser_ID.setText("Auto Generate");
                    ManageUser_Fname.setText("");
                    ManageUser_Lname.setText("");
                    ManageUser_Username.setText("");       
                    ManageUser_Pword.setText("");
                    ManageUser_Cpassword.setText("");
                    check_Admin.setSelected(false);

                }

            }
            catch (NullPointerException exception) {

                JOptionPane.showMessageDialog(null, "Invalid User ID.", "Error",0);

            }

        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        //add new user
        String fname = ManageUser_Fname.getText();
        String lname = ManageUser_Lname.getText();
        String username = ManageUser_Username.getText();     
        String password = String.valueOf(ManageUser_Pword.getPassword()); 
        String Cpassword = String.valueOf(ManageUser_Cpassword.getPassword());    
        String userType = "User";
        
        if(check_Admin.isSelected()){
            
            userType = "Admin";
            
        }

        //firstname
        //check if firstname is empty
        if(fname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "First Name cannot be empty.", "Empty Fields",0);
        }

        //firstname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", fname)){

            JOptionPane.showMessageDialog(null, "First Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //lastname
        //check if lastname is empty
        else if(lname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Last Name cannot be empty.", "Empty Fields",0);
        }

        //lastname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", lname)){

            JOptionPane.showMessageDialog(null, "Last Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //username
        else if(username.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "User Name cannot be empty.", "Empty Fields",0);
        }
        
        //check if user is already exists
        else if(users.checkUsernameExists(username)){

            JOptionPane.showMessageDialog(null, "This username already exists.", "Already Exists",0);
            ManageUser_Username.setText("");  
        }
        
        //password
        else if(password.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Password cannot be empty.", "Empty Fields",0);
        }
        
        //password must have atlest 5 chracters
        else if(password.length() < 5){

            JOptionPane.showMessageDialog(null, "Password must have atleast 5 chracters.", "No enough length",0);
        }
        
        //confirm password
        else if(Cpassword.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Confirm the Password.", "Empty Fields",0);
        }
        
        //password = confirm password
        else if(!Cpassword.equals(password)){

            JOptionPane.showMessageDialog(null, "Confirm password is not the same as Password.", "Unmatched",0);
        }

        else{

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm adding the member?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                users.addUser(fname, lname, username, Cpassword, userType);
                
                populateJtableWithUsers();

                //clear text boxes
                ManageUser_ID.setText("Auto Generate");
                ManageUser_Fname.setText("");
                ManageUser_Lname.setText("");
                ManageUser_Username.setText("");       
                ManageUser_Pword.setText("");
                ManageUser_Cpassword.setText("");
                check_Admin.setSelected(false);

            }

        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void table_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_UsersMouseClicked

        //display the selected genre

        //get the selected row index
        int index = table_Users.getSelectedRow();

        //get values
        String id = table_Users.getValueAt(index, 0).toString();
        String fname = table_Users.getValueAt(index, 1).toString();
        String lname = table_Users.getValueAt(index, 2).toString();
        String username = table_Users.getValueAt(index, 3).toString();
        String password = table_Users.getValueAt(index, 4).toString();    
        String usertype = table_Users.getValueAt(index, 5).toString();


        //show data in the textfields
        ManageUser_ID.setText(id);
        ManageUser_Fname.setText(fname);
        ManageUser_Lname.setText(lname);
        ManageUser_Username.setText(username);
        ManageUser_Pword.setText(password);
        
        if(usertype.equals("Admin")){
            
            check_Admin.setSelected(true);
        }
        
        else{
            
            check_Admin.setSelected(false);
        }

        
    }//GEN-LAST:event_table_UsersMouseClicked

    private void check_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_AdminActionPerformed

    private void ManageUser_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUser_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageUser_IDActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

        try {
            table_Users.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ManageUsersForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    //create a function to populate the Jtable with users
    public void populateJtableWithUsers(){
        
        ArrayList<My_Classes.Users> arrayList = users.usersList();
        
        //JTable columns
        String[] colNames = {"ID", "FIRST NAME", "LAST NAME", "USERNAME", "PASSWORD", "USER TYPE"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getId();    
            rows[i][1] = arrayList.get(i).getFirstname();      
            rows[i][2] = arrayList.get(i).getLastname();  
            rows[i][3] = arrayList.get(i).getUsername();
            rows[i][4] = arrayList.get(i).getPassword();
            rows[i][5] = arrayList.get(i).getUserType();

        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_Users.setModel(defaultTableModel);
        
    }
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JPasswordField ManageUser_Cpassword;
    private javax.swing.JTextField ManageUser_Fname;
    private javax.swing.JTextField ManageUser_ID;
    private javax.swing.JTextField ManageUser_Lname;
    private javax.swing.JPasswordField ManageUser_Pword;
    private javax.swing.JTextField ManageUser_Username;
    private javax.swing.JLabel ManageUser_logo;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JCheckBox check_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_Users;
    // End of variables declaration//GEN-END:variables
}
