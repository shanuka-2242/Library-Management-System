package My_Forms;

import My_Classes.funcClass;
import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReturnBookForm extends javax.swing.JFrame {
       
    My_Classes.Book book = new My_Classes.Book();   
    My_Classes.Member member = new My_Classes.Member();  
    My_Classes.IssueBook issueBook = new My_Classes.IssueBook();
    My_Classes.funcClass c = new funcClass();


    public ReturnBookForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        
        //customJTable
        c.customTable(table_IssuedBooks);
        
        //pupolate table with issued books
        populateJtableWithIssuedBooks("");
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/delivering.png"));
        Image image = imageicon .getImage().getScaledInstance(addBook_logo.getWidth(), addBook_logo.getHeight(), Image.SCALE_SMOOTH);
        addBook_logo.setIcon(new ImageIcon (image));
        
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
        addBook_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_BookId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_MemberID = new javax.swing.JTextField();
        btn_Return = new javax.swing.JButton();
        btn_Lost = new javax.swing.JButton();
        lbl_MemberName = new javax.swing.JLabel();
        btn_Clear = new javax.swing.JButton();
        lbl_bookName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date_IssueDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        date_ReturnDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_note = new javax.swing.JTextArea();
        btn_Delete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_bookStatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_IssuedBooks = new javax.swing.JTable();

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
        jLabel1.setText("Return Book");
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
                .addComponent(addBook_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(addBook_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(253, 253, 189));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Enter Book ID           :");

        txt_BookId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_BookId.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Enter Member ID    :");

        txt_MemberID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_MemberID.setEnabled(false);

        btn_Return.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Return.setText("RETURN");
        btn_Return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnActionPerformed(evt);
            }
        });

        btn_Lost.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Lost.setText("LOST");
        btn_Lost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LostActionPerformed(evt);
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

        lbl_bookName.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(255, 100, 100));
        lbl_bookName.setText("Book Name");
        lbl_bookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_bookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_bookNameMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Issue Date                 :");

        date_IssueDate.setEnabled(false);
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

        btn_Delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Delete.setText("DELETE");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_ReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_IssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_MemberID))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_bookName, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                            .addComponent(txt_BookId)))))
                            .addComponent(btn_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_Lost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Return)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Lost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Clear)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(253, 253, 189));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Select Book Status      :");

        combo_bookStatus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_bookStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Issued", "Returned", "Lost" }));
        combo_bookStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_bookStatusActionPerformed(evt);
            }
        });

        table_IssuedBooks.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_IssuedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_IssuedBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_IssuedBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_IssuedBooks);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_bookStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_bookStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed

        //add a new return
        //we will update the return date, the note, the status to "returned"
        
        //get values
        String bookID = txt_BookId.getText();        
        String memberID = txt_MemberID.getText();
        String bookName = lbl_bookName.getText();      
        String memberName = lbl_MemberName.getText();   
 
        //VALIDATIONS 
        //if a valid book didnt select
        if(bookName.contentEquals("Book Name") || memberName.contentEquals("Member Full - Name")){
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
            
        }

        else{
            
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm updating the record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
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
                         
                         Date IssueDate = dateFormat.parse(_issue_date);
                         Date ReturnDate = dateFormat.parse(_return_date);
                         
                         if(ReturnDate.before(IssueDate)){
                             
                             JOptionPane.showMessageDialog(null, "Return date must be after Issue date.", "Wrong Inputs",0);
                             
                         }
                         
                         else{
                             
                             issueBook.updateIssue(_bookID, _memberID, "Returned", _issue_date, _return_date, _note);
                             

                            //update the book qty from the books table
                            int qty = new My_Classes.Book().getBookById(_bookID).getQuantity(); //get the book qty
                            book.setQty_Minus_One(_bookID, qty + 1); //update the new book qty
                            
                            populateJtableWithIssuedBooks("");
                             
                             // clear all the fields
                            txt_BookId.setText("");        
                            txt_MemberID.setText("");
                            date_IssueDate.setCalendar(null);       
                            date_ReturnDate.setCalendar(null);
                            lbl_bookName.setText("Book Name");    
                            lbl_MemberName.setText("Member Full - Name");                       
                            txt_note.setText("");
                         }
                         
                     } 
                     
                     catch (ParseException | SQLException ex) {
                         
                         Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
                         
                     }
                        
            }
            
            catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null, "Retun date cannot be empty.", "Empty Fields",0);

            }
            
            catch(NumberFormatException e){
                
                                
                JOptionPane.showMessageDialog(null, "Unsupported inputs, Check your inputs again.", "Error",0);

            }
                 
            }
           
        }

        
    }//GEN-LAST:event_btn_ReturnActionPerformed

    private void btn_LostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LostActionPerformed

        //the book is lost
        //update book status to be lost
        //update book qty
        //even if yhe book is lost we wont change the return date

        //get values
        String bookID = txt_BookId.getText();        
        String memberID = txt_MemberID.getText();
        String bookName = lbl_bookName.getText();      
        String memberName = lbl_MemberName.getText();   
 
        //VALIDATIONS 
        //if a valid book didnt select
        if(bookName.contentEquals("Book Name") || memberName.contentEquals("Member Full - Name")){
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
        }

        else{
            
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm updating the record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){

                 try{
                
                        //issue book
                        Integer _bookID = Integer.valueOf(bookID);     
                        Integer _memberID = Integer.valueOf(memberID);
                        String _note = txt_note.getText();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String _issue_date = dateFormat.format(date_IssueDate.getDate()); 
                        String _return_date = dateFormat.format(date_ReturnDate.getDate());
                       
                        issueBook.updateIssue(_bookID, _memberID, "Lost", _issue_date, _return_date, _note);
                        
                        //update the book qty from the books table
                        int qty = new My_Classes.Book().getBookById(_bookID).getQuantity(); //get the book qty
                        book.setQty_Minus_One(_bookID, qty - 1); //update the new book qty
                             
                        populateJtableWithIssuedBooks("");
                             
                        // clear all the fields
                        txt_BookId.setText("");        
                        txt_MemberID.setText("");
                        date_IssueDate.setCalendar(null);       
                        date_ReturnDate.setCalendar(null);
                        lbl_bookName.setText("Book Name");    
                        lbl_MemberName.setText("Member Full - Name");                       
                        txt_note.setText("");
                        
            }
            
            catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null, "Retun date cannot be empty.", "Empty Fields",0);

            }
            
            catch(NumberFormatException e){
                
                                
                JOptionPane.showMessageDialog(null, "Unsupported inputs, Check your inputs again.", "Error",0);

            }   
                 catch (SQLException ex) {
                     
                    Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
                 
            }
           
        }
        
        
    }//GEN-LAST:event_btn_LostActionPerformed

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
                txt_note.setText("");
            
            }
        
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

       this.dispose();

    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void lbl_bookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_bookNameMouseClicked
        
        if(lbl_bookName.getText().contentEquals("Book Name")){
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
            
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
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
            
        }
        
        else{
            
            //display the member info card  
            int member_id = Integer.parseInt(txt_MemberID.getText());
            MemberInfoCardForm memberInfoCardForm = new MemberInfoCardForm(member_id);  
            memberInfoCardForm.setVisible(true);
        
        }
        
    }//GEN-LAST:event_lbl_MemberNameMouseClicked

    private void table_IssuedBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_IssuedBooksMouseClicked

            //display the selected row data
            //get the selected row index
            int index = table_IssuedBooks.getSelectedRow();
            
            int book_id = Integer.parseInt(table_IssuedBooks.getValueAt(index, 0).toString());
            int member_id = Integer.parseInt(table_IssuedBooks.getValueAt(index, 1).toString());
            
        try {
            
            My_Classes.Book selectedBook = book.getBookById(book_id);
            My_Classes.Member selectedMember = member.getMemberById(member_id);

            //display the book name & ID
            txt_BookId.setText(String.valueOf(selectedBook.getId()));
            lbl_bookName.setText(selectedBook.getName());
            
            //display the member full name & ID
            txt_MemberID.setText(String.valueOf(selectedMember.getId()));
            lbl_MemberName.setText(selectedMember.getFirstName() +" "+ selectedMember.getLastName());
            
            String status = table_IssuedBooks.getValueAt(index, 2).toString();           
            String issued_date = table_IssuedBooks.getValueAt(index, 3).toString();
            String returned_date = table_IssuedBooks.getValueAt(index, 4).toString();  
            String note = table_IssuedBooks.getValueAt(index, 5).toString();

            
            //display the issued date
            Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issued_date);
            date_IssueDate.setDate(issDate);
            
            //display the returned date
            Date retDate = new SimpleDateFormat("yyyy-MM-dd").parse(returned_date);
            date_ReturnDate.setDate(retDate);
            
            //display note
            txt_note.setText(note);
            
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
        
        catch (ParseException ex) {
            
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
           
    }//GEN-LAST:event_table_IssuedBooksMouseClicked

    private void combo_bookStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_bookStatusActionPerformed
        
        //display data on the table depending on the combobox selected value
        String status = combo_bookStatus.getSelectedItem().toString();
        
        if(status.equals("All")){
            
            status = "";
        }
        
        populateJtableWithIssuedBooks(status);
        
    }//GEN-LAST:event_combo_bookStatusActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        //get values
        String bookName = lbl_bookName.getText();      
        String memberName = lbl_MemberName.getText();   
 
        //VALIDATIONS 
        //if a valid book didnt select
        if(bookName.contentEquals("Book Name") || memberName.contentEquals("Member Full - Name")){
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
        }
        
        else if(bookName.equals("") || memberName.equals("")){
            
            JOptionPane.showMessageDialog(null, "Select valid record from the table.", "Invalid Record",0);
        }

        else{
            
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm updating the record?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){

                
                        //delete the selected item from database
                        int index = table_IssuedBooks.getSelectedRow();

                        int _book_id = Integer.parseInt(table_IssuedBooks.getValueAt(index, 0).toString()); 
                        int _member_id = Integer.parseInt(table_IssuedBooks.getValueAt(index, 1).toString());
                        String _issued_date = table_IssuedBooks.getValueAt(index, 3).toString();

                        issueBook.removeFromIssuedTable(_book_id, _member_id, _issued_date);

                        populateJtableWithIssuedBooks("");
                             
                        // clear all the fields
                        txt_BookId.setText("");        
                        txt_MemberID.setText("");
                        date_IssueDate.setCalendar(null);       
                        date_ReturnDate.setCalendar(null);
                        lbl_bookName.setText("Book Name");    
                        lbl_MemberName.setText("Member Full - Name");                       
                        txt_note.setText("");

            }
           
        }

    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

       
        try {
            table_IssuedBooks.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    //create a function to populate the Jtable with issued books
    public void populateJtableWithIssuedBooks(String _status){
        
        ArrayList<My_Classes.IssueBook> arrayList = issueBook.IssuedBookList(_status);
        
        //JTable columns
        String[] colNames = {"BOOK", "MEMBER", "STATUS", "ISSUED DATE", "RETURNED DATE", "NOTE"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getBook_id();    
            rows[i][1] = arrayList.get(i).getMember_id();      
            rows[i][2] = arrayList.get(i).getStatus();
            rows[i][3] = arrayList.get(i).getIssue_date();
            rows[i][4] = arrayList.get(i).getRetun_date();  
            rows[i][5] = arrayList.get(i).getNote();

        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_IssuedBooks.setModel(defaultTableModel);
        
    }
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel addBook_logo;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Lost;
    private javax.swing.JButton btn_Return;
    private javax.swing.JComboBox<String> combo_bookStatus;
    private com.toedter.calendar.JDateChooser date_IssueDate;
    private com.toedter.calendar.JDateChooser date_ReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_MemberName;
    private javax.swing.JLabel lbl_bookName;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_IssuedBooks;
    private javax.swing.JTextField txt_BookId;
    private javax.swing.JTextField txt_MemberID;
    private javax.swing.JTextArea txt_note;
    // End of variables declaration//GEN-END:variables
}
