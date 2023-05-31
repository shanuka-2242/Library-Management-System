package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MembersListForm extends javax.swing.JFrame {
       
    My_Classes.Member member = new My_Classes.Member();  
    My_Classes.funcClass func = new My_Classes.funcClass();


    public MembersListForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
               
        //customJTable
        func.customTable(table_MembersList);
        
        //populate members to a table
        populateJtableWithMembers("");
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //to get the logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/team.png"));
        Image image = imageicon .getImage().getScaledInstance(deleteMember_logo.getWidth(), deleteMember_logo.getHeight(), Image.SCALE_SMOOTH);
        deleteMember_logo.setIcon(new ImageIcon (image));
        
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
        deleteMember_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Refresh = new javax.swing.JButton();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JButton();
        MemberListSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_MembersList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbl_fullname = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Members List");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Members List");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btn_Refresh.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Refresh.setText("REFRESH");
        btn_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });

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
                .addComponent(deleteMember_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteMember_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Value to search    : ");

        btn_Search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Search.setText("SEARCH");
        btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        MemberListSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        table_MembersList.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_MembersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_MembersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_MembersListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_MembersList);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Selected member details :");

        lbl_fullname.setBackground(new java.awt.Color(255, 255, 255));
        lbl_fullname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_fullname.setForeground(new java.awt.Color(102, 102, 255));
        lbl_fullname.setText("Full name");

        lbl_phone.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(102, 102, 255));
        lbl_phone.setText("Phone");

        lbl_email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(102, 102, 255));
        lbl_email.setText("Email");

        lbl_gender.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_gender.setForeground(new java.awt.Color(102, 102, 255));
        lbl_gender.setText("Gender");

        lbl_id.setBackground(new java.awt.Color(255, 255, 255));
        lbl_id.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(102, 102, 255));
        lbl_id.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberListSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(lbl_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btn_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberListSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE)))
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

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        String search = MemberListSearch.getText();
        
        if(search.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Search field is empty.", "Empty Field",0);
            
        }
        
        else{
 
        //search members with firstname, lastname, phone or email 
        String query = "SELECT * FROM `members` WHERE `firstName` LIKE '%"+search+"%' OR `lastName` LIKE '%"+search+"%' OR `phone` LIKE '%"+search+"%' OR `email` LIKE '%"+search+"%'";
     
        //populate table with search values
        populateJtableWithMembers(query);
        
        //set labels texts
        lbl_id.setText("ID");
        lbl_fullname.setText("Full Name");   
        lbl_phone.setText("Phone");
        lbl_email.setText("Email");
        lbl_gender.setText("Gender");
        
        }
      
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void table_MembersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_MembersListMouseClicked

        //display the selcted member details 
        
        My_Classes.Member SelectedMember;
        
        try {
            
            //search member by ID and display the data
            
            //get the selected Jtable row index
            Integer rowIndex = table_MembersList.getSelectedRow();
            
            //get the member id of selcted row
            Integer id = Integer.valueOf(table_MembersList.getModel().getValueAt(rowIndex, 0).toString());
    
            SelectedMember = member.getMemberById(id);
            
            lbl_id.setText(String.valueOf(SelectedMember.getId()));        
            lbl_fullname.setText(SelectedMember.getFirstName() +" "+ SelectedMember.getLastName());
            lbl_phone.setText(SelectedMember.getPhone());
            lbl_email.setText(SelectedMember.getEmail());
            lbl_gender.setText(SelectedMember.getGender());
        }
        
        catch (SQLException | NullPointerException ex) {
            
                JOptionPane.showMessageDialog(null, "Enter a valid Member ID.", "Invalid ID",0);
        }
     
    }//GEN-LAST:event_table_MembersListMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        populateJtableWithMembers ("SELECT * FROM `members`");
        MemberListSearch.setText("");
        
        //set labels texts
        lbl_id.setText("ID");
        lbl_fullname.setText("Full Name");   
        lbl_phone.setText("Phone");
        lbl_email.setText("Email");
        lbl_gender.setText("Gender");

    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        
        try {
            table_MembersList.print();
        } catch (PrinterException ex) {
            Logger.getLogger(MembersListForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

      //create a function to populate the Jtable with members
    public void populateJtableWithMembers(String query){
        
       
        ArrayList<My_Classes.Member> arrayList = member.memberList(query);
        
        //JTable columns
        String[] colNames = {"ID", "FIRST NAME", "LAST NAME", "PHONE", "EMAIL", "GENDER"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getId();    
            rows[i][1] = arrayList.get(i).getFirstName();      
            rows[i][2] = arrayList.get(i).getLastName();
            rows[i][3] = arrayList.get(i).getPhone();
            rows[i][4] = arrayList.get(i).getEmail();       
            rows[i][5] = arrayList.get(i).getGender();
            
        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_MembersList.setModel(defaultTableModel);
        
    }
    
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField MemberListSearch;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Search;
    private javax.swing.JLabel deleteMember_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_fullname;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_MembersList;
    // End of variables declaration//GEN-END:variables
}
