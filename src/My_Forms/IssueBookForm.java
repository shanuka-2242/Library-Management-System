package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IssueBookForm extends javax.swing.JFrame {
       
    My_Classes.Book book = new My_Classes.Book();   
    My_Classes.Member member = new My_Classes.Member();  
    My_Classes.IssueBook issueBook = new My_Classes.IssueBook();


    public IssueBookForm() {
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
        
        //logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/education.png"));
        Image image = imageicon .getImage().getScaledInstance(addBook_logo.getWidth(), addBook_logo.getHeight(), Image.SCALE_SMOOTH);
        addBook_logo.setIcon(new ImageIcon (image));
        
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
        addBook_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_BookId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_MemberID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Issue = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_SearchBook = new javax.swing.JButton();
        lbl_MemberName = new javax.swing.JLabel();
        btn_Clear = new javax.swing.JButton();
        btn_SearchMember = new javax.swing.JButton();
        lbl_bookName = new javax.swing.JLabel();
        lbl_Availability = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date_IssueDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        date_ReturnDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_note = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Book");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Issue Book");
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
                .addComponent(addBook_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(253, 253, 189));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Enter Book ID           :");

        txt_BookId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Enter Member ID    :");

        txt_MemberID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Availability              :");

        btn_Issue.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Issue.setText("ISSUE");
        btn_Issue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IssueActionPerformed(evt);
            }
        });

        btn_Cancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Cancel.setText("CANCEL");
        btn_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_SearchBook.setBackground(new java.awt.Color(184, 232, 252));
        btn_SearchBook.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btn_SearchBook.setText("SEARCH BOOK");
        btn_SearchBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchBookActionPerformed(evt);
            }
        });

        lbl_MemberName.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_MemberName.setForeground(new java.awt.Color(255, 100, 100));
        lbl_MemberName.setText("Member Full - Name");
        lbl_MemberName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_MemberName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MemberNameMouseClicked(evt);
            }
        });

        btn_Clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Clear.setText("CLEAR");
        btn_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_SearchMember.setBackground(new java.awt.Color(184, 232, 252));
        btn_SearchMember.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btn_SearchMember.setText("SEARCH MEMBER");
        btn_SearchMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchMemberActionPerformed(evt);
            }
        });

        lbl_bookName.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(255, 100, 100));
        lbl_bookName.setText("Book Name");
        lbl_bookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_bookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_bookNameMouseClicked(evt);
            }
        });

        lbl_Availability.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lbl_Availability.setForeground(new java.awt.Color(255, 100, 100));
        lbl_Availability.setText("Yes / No");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Issue Date                 :");

        date_IssueDate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Return Date               :");

        date_ReturnDate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Note                            :");

        txt_note.setColumns(20);
        txt_note.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_note.setRows(5);
        jScrollPane1.setViewportView(txt_note);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Issue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_Availability, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_SearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_MemberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SearchBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SearchMember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_Availability))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(date_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(date_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btn_Issue)
                .addGap(12, 12, 12)
                .addComponent(btn_Cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Clear)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_SearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchBookActionPerformed
     
        //get values
        String bookID = txt_BookId.getText(); 
        
        //VALIDATIONS 
        //Book id cannot be empty
         if(bookID.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Book ID cannot be empty.", "Empty Fields",0);
            
        }
         
        //bookID cannot have letters
        else if(!Pattern.matches("[0-9]+", bookID)){

            JOptionPane.showMessageDialog(null, "Book ID should only contains numbers.", "Wrong Inputs",0);
            
        }
         
        else{
            
            try {
                
                //get the book by id
                Integer _bookID = Integer.valueOf(bookID);
                My_Classes.Book selectedBook = book.getBookById(_bookID);
                
                //display the book name
                lbl_bookName.setText(selectedBook.getName());
                
                if(issueBook.checkAvailability(_bookID)){
                    
                    lbl_Availability.setText("Yes");
                    lbl_Availability.setForeground(new Color(0, 205, 0));
                    
                }
                
                else{
                                        
                    lbl_Availability.setText("No");
                    lbl_Availability.setForeground(Color.RED);

                }
                
            } 
            
            catch(NullPointerException exception){
                
                JOptionPane.showMessageDialog(null, "Book doesn't exist in records.", "Doesn't Exist",0);
                
            }
            
            catch (SQLException ex) {
                
                Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_SearchBookActionPerformed

    private void btn_IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IssueActionPerformed

        //add a new issue
        
        //get values
        String bookID = txt_BookId.getText();        
        String memberID = txt_MemberID.getText();
        String bookName = lbl_bookName.getText();      
        String memberName = lbl_MemberName.getText();   
        String availability = lbl_Availability.getText();

        //VALIDATIONS 
        //Book id cannot be empty
         if(bookID.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Search Book by ID first.", "Empty Fields",0);
        }
         
        //bookID cannot have letters
        else if(!Pattern.matches("[0-9]+", bookID)){

            JOptionPane.showMessageDialog(null, "Book ID should only contains numbers.", "Wrong Inputs",0);
        }
        
        //if a valid book didnt select
        else if(bookName.contentEquals("Book Name")){
            
            JOptionPane.showMessageDialog(null, "Search a valid Book.", "Invalid Book",0);
        }
        
        //if book isnt available
        else if(availability.contentEquals("No")){
            
            JOptionPane.showMessageDialog(null, "Book is not available right now.", "Book Unavailable",0);
        }
          
        //memberID cannot be empty
        else if(memberID.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Search Member by ID first.", "Empty Fields",0);
        }

        //MemberID cannot have letters
        else if(!Pattern.matches("[0-9]+", memberID)){

            JOptionPane.showMessageDialog(null, "Member ID should only contains numbers.", "Wrong Inputs",0);
        }
        
         //if a valid member didnt select
        else if(memberName.contentEquals("Member Full - Name")){
            
            JOptionPane.showMessageDialog(null, "Search a valid Member.", "Invalid Member",0);
        }
        
        else{
            
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm adding the record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){

                 try{
                
                        //issue book
                        Integer _bookID = Integer.valueOf(bookID);     
                        Integer _memberID = Integer.valueOf(memberID);
                        String _note = txt_note.getText();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String _issue_date = dateFormat.format(date_IssueDate.getDate()); 
                        String _return_date = dateFormat.format(date_ReturnDate.getDate());
                        
                     try {
                         //before issuing the book we need to check
                         //if the retun date is after the issue date
                         Date IssueDate = dateFormat.parse(_issue_date);
                         Date ReturnDate = dateFormat.parse(_return_date);
                         
                         if(ReturnDate.before(IssueDate)){
                             
                             JOptionPane.showMessageDialog(null, "Return date must be after Issue date.", "Wrong Inputs",0);
                             
                         }
                         
                         else{
                             
                            issueBook.addIssue(_bookID, _memberID, "Issued", _issue_date, _return_date, _note);
                             
                             // clear all the fields
                            txt_BookId.setText("");        
                            txt_MemberID.setText("");
                            date_IssueDate.setCalendar(null);       
                            date_ReturnDate.setCalendar(null);
                            lbl_bookName.setText("Book Name");    
                            lbl_MemberName.setText("Member Full - Name");  
                            lbl_Availability.setText("Yes / No");
                            lbl_Availability.setForeground(new Color(255,100,100) );
                            txt_note.setText("");
                         }
                         
                     } 
                     
                     catch (ParseException ex) {
                         
                         Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
                         
                     }
                        
            }
            
            catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null, "Issue & Retun dates cannot be empty.", "Empty Fields",0);

            }
            
            catch(NumberFormatException e){
                
                                
                JOptionPane.showMessageDialog(null, "Unsupported inputs, Check your inputs again.", "Error",0);

            }
                 
            }
           
        }

        
    }//GEN-LAST:event_btn_IssueActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed

        //close the form
        this.dispose();
        
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(null, "Confirm clear the fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
                
                // clear all the fields
                txt_BookId.setText("");        
                txt_MemberID.setText("");
                date_IssueDate.setCalendar(null);       
                date_ReturnDate.setCalendar(null);
                lbl_bookName.setText("Book Name");    
                lbl_MemberName.setText("Member Full - Name");  
                lbl_Availability.setText("Yes / No");
                lbl_Availability.setForeground(new Color(255,100,100) );
                txt_note.setText("");
            
            }
        
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

       this.dispose();

    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void btn_SearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchMemberActionPerformed

        String memberID = txt_MemberID.getText();
        
        //memberID cannot be empty
        if(memberID.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Member by ID cannot be empty.", "Empty Fields",0);
        }

        //MemberID cannot have letters
        else if(!Pattern.matches("[0-9]+", memberID)){

            JOptionPane.showMessageDialog(null, "Member ID should only contains numbers.", "Wrong Inputs",0);
        }
        
        else{
            
            try {
                
                //get member by ID
                Integer _memberID = Integer.valueOf(memberID);
                My_Classes.Member selectedMember = member.getMemberById(_memberID);
                
                //display the member full name
                lbl_MemberName.setText(selectedMember.getFirstName() +" "+ selectedMember.getLastName());
                
            } 
            
            catch(NullPointerException exception){
                
                JOptionPane.showMessageDialog(null, "Member doesn't exist in records.", "Doesn't Exist",0);
                
            }
            
            catch (SQLException ex) {
                
                Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
    }//GEN-LAST:event_btn_SearchMemberActionPerformed

    private void lbl_bookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_bookNameMouseClicked
        
        if(lbl_bookName.getText().contentEquals("Book Name")){
            
            JOptionPane.showMessageDialog(null, "Search Book by ID first.", "Empty Fields",0);
            
        }
        
        else{
            
            //display the book info card  
            int book_id = Integer.parseInt(txt_BookId.getText());
            BookInfoCardForm bookInfoCardForm = new BookInfoCardForm(book_id);  
            bookInfoCardForm.setVisible(true);
        
        }

    }//GEN-LAST:event_lbl_bookNameMouseClicked

    private void lbl_MemberNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MemberNameMouseClicked
        
        if(lbl_MemberName.getText().contentEquals("Member Full - Name")){
            
            JOptionPane.showMessageDialog(null, "Search Member by ID first.", "Empty Fields",0);
            
        }
        
        else{
            
            //display the member info card  
            int member_id = Integer.parseInt(txt_MemberID.getText());
            MemberInfoCardForm memberInfoCardForm = new MemberInfoCardForm(member_id);  
            memberInfoCardForm.setVisible(true);
        
        }
        
    }//GEN-LAST:event_lbl_MemberNameMouseClicked

    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel addBook_logo;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Issue;
    private javax.swing.JButton btn_SearchBook;
    private javax.swing.JButton btn_SearchMember;
    private com.toedter.calendar.JDateChooser date_IssueDate;
    private com.toedter.calendar.JDateChooser date_ReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Availability;
    private javax.swing.JLabel lbl_MemberName;
    private javax.swing.JLabel lbl_bookName;
    private javax.swing.JTextField txt_BookId;
    private javax.swing.JTextField txt_MemberID;
    private javax.swing.JTextArea txt_note;
    // End of variables declaration//GEN-END:variables
}
