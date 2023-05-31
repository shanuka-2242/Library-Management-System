package My_Forms;

import My_Classes.Member;
import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EditMember extends javax.swing.JFrame {
       
    My_Classes.Member member = new My_Classes.Member();  

    public EditMember() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //to get the logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/profile.png"));
        Image image = imageicon .getImage().getScaledInstance(editMemeber_logo.getWidth(), editMemeber_logo.getHeight(), Image.SCALE_SMOOTH);
        editMemeber_logo.setIcon(new ImageIcon (image));
        
        //close
        ImageIcon imageicon1 = new ImageIcon(getClass().getResource("/My_Images/close.png"));
        Image image1 = imageicon1 .getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        Close.setIcon(new ImageIcon (image1));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        editMemeber_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Edit = new javax.swing.JButton();
        EditMember_Fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EditMember_Lname = new javax.swing.JTextField();
        EditMember_Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EditMember_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EditMember_Gender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        EditMember_ID = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Member");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Edit Memebr");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editMemeber_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editMemeber_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("First Name    :");

        btn_Edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Edit.setText("EDIT");
        btn_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        EditMember_Fname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Last Name    :");

        EditMember_Lname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        EditMember_Phone.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Phone            :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Email              :");

        EditMember_Email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Gender          :");

        EditMember_Gender.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        EditMember_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Member ID   :");

        EditMember_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        btn_Search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Search.setText("SEARCH");
        btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EditMember_Gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditMember_Fname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditMember_Lname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditMember_Phone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditMember_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addComponent(EditMember_ID)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EditMember_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditMember_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditMember_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditMember_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditMember_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditMember_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_Edit)
                .addGap(44, 44, 44))
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

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed

        //add new author
        String txtid = EditMember_ID.getText();
        String fname = EditMember_Fname.getText();
        String lname = EditMember_Lname.getText();
        String phone = EditMember_Phone.getText();       
        String email = EditMember_Email.getText();
        String gender = EditMember_Gender.getSelectedItem().toString();

//        ID
//        ID cannot be empty
        if(txtid.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Search by Member ID first.", "Empty Fields",0);
        }
        
        //firstname
        //firstname cannot be empty
        else if(fname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "First Name cannot be empty.", "Empty Fields",0);
        }
        
        //firstname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", fname)){

            JOptionPane.showMessageDialog(null, "First Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //lastname
        //lastname cannot be empty
        else if(lname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Last Name cannot be empty.", "Empty Fields",0);
        }

        //lastname cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", lname)){

            JOptionPane.showMessageDialog(null, "Last Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //phone number
        //phonenumber cannot be empty
        else if(phone.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Phone Field cannot be empty.", "Empty Fields",0);
        }
        
        //phonenumber cannot have letters
        else if(!Pattern.matches("[0-9]+", phone)){

            JOptionPane.showMessageDialog(null, "Phone number should only contains numbers.", "Wrong Inputs",0);
        }
         //email
        //email cannot be empty
        else if(email.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Email Field cannot be empty.", "Empty Fields",0);
        }
        
        //correct email sketch
        else if(!Pattern.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", email)){

            JOptionPane.showMessageDialog(null, "Invalid E-mail pattern.", "Wrong Inputs",0);
        }
      
        //check if textfield is not empty
        else{
            

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm editing the member?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
         
            int id = Integer.parseInt(EditMember_ID.getText());        

            member.editMember(id, fname, lname, phone, email, gender);
           
            //clear text boxes
            EditMember_Fname.setText(""); 
            EditMember_ID.setText("Auto Generate");
            EditMember_Lname.setText("");
            EditMember_Phone.setText("");    
            EditMember_Email.setText("");
            }
                            
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        String txtid = EditMember_ID.getText();
        
        if(txtid.trim().isEmpty()){
                    
            JOptionPane.showMessageDialog(null, "Member ID cannot be empty.", "Wrong Inputs",0);

        }
        
        else if(!Pattern.matches("[0-9]+", txtid)){

            JOptionPane.showMessageDialog(null, "Member ID can only contains numbers.", "Wrong Inputs",0);
        }
        
        else{
            //get the member data
        Member SelectedMember;
        
        try {
            
            //search member by ID and display the data
            Integer id = Integer.valueOf(EditMember_ID.getText());
    
            SelectedMember = member.getMemberById(id);
            
            EditMember_ID.setText(String.valueOf(SelectedMember.getId()));        
            EditMember_Fname.setText(SelectedMember.getFirstName());
            EditMember_Lname.setText(SelectedMember.getLastName());
            EditMember_Phone.setText(SelectedMember.getPhone());
            EditMember_Email.setText(SelectedMember.getEmail());
            EditMember_Gender.setSelectedItem(SelectedMember.getGender());
        }
        
        catch (SQLException | NullPointerException ex) {
            
                JOptionPane.showMessageDialog(null, "Member not existed in records.", "Invalid ID",0);
        }
             
        }
 
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField EditMember_Email;
    private javax.swing.JTextField EditMember_Fname;
    private javax.swing.JComboBox<String> EditMember_Gender;
    private javax.swing.JTextField EditMember_ID;
    private javax.swing.JTextField EditMember_Lname;
    private javax.swing.JTextField EditMember_Phone;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Search;
    private javax.swing.JLabel editMemeber_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
