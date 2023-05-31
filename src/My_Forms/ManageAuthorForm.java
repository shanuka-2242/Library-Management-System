package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageAuthorForm extends javax.swing.JFrame {
       
    My_Classes.Author author = new My_Classes.Author();  
    My_Classes.funcClass func = new My_Classes.funcClass();


    public ManageAuthorForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //customJTable
        func.customTable(table_Authors);
        
        //populate JTable
        populateJtableWithAuthors();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //to get the logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/writer.png"));
        Image image = imageicon .getImage().getScaledInstance(manageAuthors_logo.getWidth(), manageAuthors_logo.getHeight(), Image.SCALE_SMOOTH);
        manageAuthors_logo.setIcon(new ImageIcon (image));
        
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
        manageAuthors_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Authors = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ManageAuthor_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ManageAuthor_Fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ManageAuthor_Lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ManageAuthor_expertise = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ManageAuthor_about = new javax.swing.JTextArea();
        btn_Delete = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();

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
        jLabel1.setText("Manage Authors");
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
                .addComponent(manageAuthors_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(manageAuthors_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(253, 253, 189));

        table_Authors.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Authors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_AuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Authors);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("ID                    :");

        ManageAuthor_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ManageAuthor_ID.setText("Auto Generate");
        ManageAuthor_ID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("First Name    :");

        ManageAuthor_Fname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Last Name    :");

        ManageAuthor_Lname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Expertise       :");

        ManageAuthor_expertise.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("About             :");

        ManageAuthor_about.setColumns(20);
        ManageAuthor_about.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ManageAuthor_about.setRows(5);
        jScrollPane2.setViewportView(ManageAuthor_about);

        btn_Delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Delete.setText("DELETE");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
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

        btn_Add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Add.setText("ADD");
        btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel2)
                    .addComponent(ManageAuthor_Fname)
                    .addComponent(ManageAuthor_Lname)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ManageAuthor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ManageAuthor_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Delete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ManageAuthor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManageAuthor_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManageAuthor_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManageAuthor_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        //delete the selcted genre
        try {

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm deleting the author?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                int id = Integer.parseInt(ManageAuthor_ID.getText());
                author.removeAuthor(id);
                populateJtableWithAuthors();

                //clear text boxes
                ManageAuthor_ID.setText("Auto Generate");
                ManageAuthor_Fname.setText("");
                ManageAuthor_Lname.setText("");
                ManageAuthor_expertise.setText("");
                ManageAuthor_about.setText("");

            }

        }
        catch (NullPointerException exception) {

            JOptionPane.showMessageDialog(null, "Invalid Author ID.", "Error",0);

        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed

        //edit the selected author
        String id = ManageAuthor_ID.getText();
        String fname = ManageAuthor_Fname.getText();
        String lname = ManageAuthor_Lname.getText();
        String expertise = ManageAuthor_expertise.getText();
        String about = ManageAuthor_about.getText();

        if(id.equals("Auto Generate")){
            
            JOptionPane.showMessageDialog(null, "Select an Author from the table first.", "Alert",0);
        }
        //first name
        //check if firstname is empty
        else if(fname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "First Name cannot be empty.", "Empty Fields",0);
        }

        //first name only can have chracters
        else if(!Pattern.matches("^[a-zA-Z]+$", fname)){

            JOptionPane.showMessageDialog(null, "First Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //last name
        //check if lastname is empty
        else if(lname.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Last Name cannot be empty.", "Empty Fields",0);
        }

        //lastname name only can have chracters
        else if(!Pattern.matches("^[a-zA-Z]+$", lname)){

            JOptionPane.showMessageDialog(null, "Last Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //expertise
        else if(expertise.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Expertise Field cannot be empty.", "Empty Fields",0);
        }

        //about
        else if(about.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "About Field cannot be empty.", "Empty Fields",0);
        }

        //check if textfield is not empty
        else{

            try {

                //show the confirmation message before delete
                int confirm = JOptionPane.showConfirmDialog(null, "Confirm editing the author?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if(confirm == JOptionPane.YES_OPTION){

                    int idr = Integer.parseInt(ManageAuthor_ID.getText());
                    author.editAuthor(idr, fname, lname, expertise, about);
                    populateJtableWithAuthors();

                    //clear text boxes
                    ManageAuthor_ID.setText("Auto Generate");
                    ManageAuthor_Fname.setText("");
                    ManageAuthor_Lname.setText("");
                    ManageAuthor_expertise.setText("");
                    ManageAuthor_about.setText("");

                }

            }
            catch (NullPointerException exception) {

                JOptionPane.showMessageDialog(null, "Invalid Author ID.", "Error",0);

            }

        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        //add new author
        String fname = ManageAuthor_Fname.getText();
        String lname = ManageAuthor_Lname.getText();
        String expertise = ManageAuthor_expertise.getText();
        String about = ManageAuthor_about.getText();

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

        //expertise
        else if(expertise.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Expertise Field cannot be empty.", "Empty Fields",0);
        }

        //about
        else if(about.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "About Field cannot be empty.", "Empty Fields",0);
        }

        //check if textfield is not empty
        else{

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm adding the author?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                author.addAuthor(fname, lname, expertise, about);
                populateJtableWithAuthors();

                //clear text boxes
                ManageAuthor_ID.setText("Auto Generate");
                ManageAuthor_Fname.setText("");
                ManageAuthor_Lname.setText("");
                ManageAuthor_expertise.setText("");
                ManageAuthor_about.setText("");

            }

        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void table_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_AuthorsMouseClicked

        //display the selected genre

        //get the selected row index
        int index = table_Authors.getSelectedRow();

        //get values
        String id = table_Authors.getValueAt(index, 0).toString();
        String fname = table_Authors.getValueAt(index, 1).toString();
        String lname = table_Authors.getValueAt(index, 2).toString();
        String expertise = table_Authors.getValueAt(index, 3).toString();
        String about = table_Authors.getValueAt(index, 4).toString();

        //show data in the textfields
        ManageAuthor_ID.setText(id);
        ManageAuthor_Fname.setText(fname);
        ManageAuthor_Lname.setText(lname);
        ManageAuthor_expertise.setText(expertise);
        ManageAuthor_about.setText(about);
    }//GEN-LAST:event_table_AuthorsMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        

        try {
            
            table_Authors.print();
            
        } 
        
        catch (PrinterException ex) {
            
            java.util.logging.Logger.getLogger(ManageAuthorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }
    
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    //create a function to populate the Jtable with authors
    public void populateJtableWithAuthors(){
        
        ArrayList<My_Classes.Author> arrayList = author.authorList();
        
        //JTable columns
        String[] colNames = {"ID", "FIRST NAME", "LAST NAME", "EXPERTISE", "ABOUT"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getId();    
            rows[i][1] = arrayList.get(i).getFirstName();      
            rows[i][2] = arrayList.get(i).getLastName();
            rows[i][3] = arrayList.get(i).getFieldOfExpertise();
            rows[i][4] = arrayList.get(i).getAbout();

        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_Authors.setModel(defaultTableModel);
        
    }
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAuthorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField ManageAuthor_Fname;
    private javax.swing.JTextField ManageAuthor_ID;
    private javax.swing.JTextField ManageAuthor_Lname;
    private javax.swing.JTextArea ManageAuthor_about;
    private javax.swing.JTextField ManageAuthor_expertise;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageAuthors_logo;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_Authors;
    // End of variables declaration//GEN-END:variables
}
