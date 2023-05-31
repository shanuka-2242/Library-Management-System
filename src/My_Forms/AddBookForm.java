package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddBookForm extends javax.swing.JFrame {
       
    My_Classes.Genre genre = new My_Classes.Genre();  
    My_Classes.Book book = new My_Classes.Book();

    HashMap<String, Integer> hashMap = genre.getGenresMap();

    public AddBookForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //populate jcombobox with genres
        fillJcomboboxWithGenres();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/add-book.png"));
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
        Addbook_isbn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Addbook_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Addbook_author = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo_genre = new javax.swing.JComboBox<>();
        btn_Add = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_SelectAuthor = new javax.swing.JButton();
        lbl_authorId = new javax.swing.JLabel();
        lbl_genreId = new javax.swing.JLabel();
        btn_Clear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Addbook_publisher = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Addbook_price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Addbook_qty = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Addbook_description = new javax.swing.JTextArea();
        Addbook_date = new com.toedter.calendar.JDateChooser();

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
        jLabel1.setText("Add New Book");
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
        jLabel2.setText("ISBN                 :");

        Addbook_isbn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Name             :");

        Addbook_name.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Author             :");

        Addbook_author.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Addbook_author.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Genre             :");

        combo_genre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_genreActionPerformed(evt);
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

        btn_Cancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Cancel.setText("CANCEL");
        btn_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_SelectAuthor.setBackground(new java.awt.Color(184, 232, 252));
        btn_SelectAuthor.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btn_SelectAuthor.setText("SELECT AUTHOR");
        btn_SelectAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectAuthorActionPerformed(evt);
            }
        });

        lbl_authorId.setBackground(new java.awt.Color(255, 255, 255));
        lbl_authorId.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_authorId.setForeground(new java.awt.Color(255, 100, 100));
        lbl_authorId.setText("Author ID");

        lbl_genreId.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_genreId.setForeground(new java.awt.Color(255, 100, 100));
        lbl_genreId.setText("Genre ID");

        btn_Clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Clear.setText("CLEAR");
        btn_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Addbook_author, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Addbook_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Addbook_isbn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_authorId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btn_SelectAuthor))
                    .addComponent(combo_genre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addComponent(lbl_genreId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SelectAuthor)
                    .addComponent(lbl_authorId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_genreId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_Add)
                .addGap(12, 12, 12)
                .addComponent(btn_Cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Clear)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(253, 253, 189));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Quantity                     :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Publisher                    :");

        Addbook_publisher.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Price (LKR)                :");

        Addbook_price.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Date Received        :");

        Addbook_qty.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Addbook_qty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Addbook_qty.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Description               :");

        Addbook_description.setColumns(20);
        Addbook_description.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Addbook_description.setRows(5);
        jScrollPane2.setViewportView(Addbook_description);

        Addbook_date.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(Addbook_publisher)
                    .addComponent(jLabel9)
                    .addComponent(Addbook_price)
                    .addComponent(jLabel10)
                    .addComponent(Addbook_qty)
                    .addComponent(jLabel11)
                    .addComponent(Addbook_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbook_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_SelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectAuthorActionPerformed

        //show a form 
        //ths form will have a jTaable populated with authors
        //the user can select an author from the table and will be displayed in the j textfield
       
        AuthorsListForm authorsListForm = new AuthorsListForm();
        
        //view author list form
        authorsListForm.setVisible(true);
   
    }//GEN-LAST:event_btn_SelectAuthorActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        //add a new book
        
        //get values
        String isbn = Addbook_isbn.getText();        
        String name = Addbook_name.getText();
        String author = Addbook_author.getText();
        String publisher = Addbook_publisher.getText();    
        String Bookprice = Addbook_price.getText();
        String description = Addbook_description.getText();    
        
        //VALIDATIONS 
        //isbn
        //ISBN already exists.
        if(book.isISBNexists(isbn)){
                          
            JOptionPane.showMessageDialog(null, "This ISBN already exists.", "Error",0);

        }
        
        //ISBN cannot be empty
        else if(isbn.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "ISBN cannot be empty.", "Empty Fields",0);
        }
          
        //book-name cannot be empty
        else if(name.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Name cannot be empty.", "Empty Fields",0);
        }
        
        //author cant be empty
        else if(author.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Select an author.", "Empty Fields",0);
        }
        
        //publisher cant be empty
        else if(publisher.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Publisher cannot be empty.", "Empty Fields",0);
        }
        
        //price cant be empty
        else if(Bookprice.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Price cannot be empty.", "Empty Fields",0);
        }
        
        //price cannot have letters
        else if(!Pattern.matches("^-?(?:0|[1-9]\\d{0,2}(?:,?\\d{3})*)(?:\\.\\d+)?$", Bookprice)){

            JOptionPane.showMessageDialog(null, "Price should only contains numbers \n \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t or \n \t \t \t \t \t \t \t \t \t \t \t \t Invalid format.", "Wrong Inputs",0);
        }
        
        //description cant be empty
        else if(description.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Description cannot be empty.", "Empty Fields",0);
        }
        
        else{
              
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm adding the book?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){

                 try{
                
                        Integer author_id = Integer.valueOf(lbl_authorId.getText()); //get the author id        
                        Integer genre_id = Integer.valueOf(lbl_genreId.getText()); //get the genre id 

                        Integer quantity = Integer.valueOf(Addbook_qty.getValue().toString());

                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String received_date = dateFormat.format(Addbook_date.getDate());
                        Double price = Double.valueOf(Addbook_price.getText());

                        book.addBook(isbn, name, author_id, genre_id, quantity, publisher, received_date, price, description);

            }
            
            catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null, "Date cannot be empty.", "Empty Fields",0);

            }
            
            catch(NumberFormatException e){
                
                                
                JOptionPane.showMessageDialog(null, "Unsupported inputs, Check your inputs again.", "Error",0);

            }
                 
            }
           
        }

        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed

        //close the form
        this.dispose();
        
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void combo_genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_genreActionPerformed
               
        // display the selected genre id
        //if the jcombo is empty an error will be thrown 
        //to avoid that we will add an empty catch just in case

        try{
            
            int genreId = hashMap.get(combo_genre.getSelectedItem().toString());
            lbl_genreId.setText(String.valueOf(genreId));
        
        }
        
        catch(Exception e){
            
            System.out.println("Erro from combo_genreActionPerformed");
        }
        
        
    }//GEN-LAST:event_combo_genreActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(null, "Confirm clear the fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
                
                // clear all the fields
                Addbook_isbn.setText("");        
                Addbook_name.setText("");
                Addbook_publisher.setText("");
                Addbook_price.setText("");
                Addbook_name.setText("");
                Addbook_isbn.setText("");
                Addbook_description.setText("");
                Addbook_qty.setValue(1);
                Addbook_date.setCalendar(null);
                Addbook_author.setText("");
                combo_genre.setSelectedIndex(0);
                lbl_authorId.setText("Author ID");      
                lbl_genreId.setText("Genre ID");    
            
            }
        
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

       this.dispose();

    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    //display the selected author data
    public static void displayAuthorData(int id, String fullName){
        
        Addbook_author.setText(fullName);
        lbl_authorId.setText(String.valueOf(id));
        
    }
    
    //create a function to populte the Genre combobox with the genre name and id using hashmap
    public void fillJcomboboxWithGenres(){
        
        for(String genreName : hashMap.keySet()){
            
            combo_genre.addItem(genreName);
        }
    }
    
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField Addbook_author;
    private com.toedter.calendar.JDateChooser Addbook_date;
    private javax.swing.JTextArea Addbook_description;
    private javax.swing.JTextField Addbook_isbn;
    private javax.swing.JTextField Addbook_name;
    private javax.swing.JTextField Addbook_price;
    private javax.swing.JTextField Addbook_publisher;
    private javax.swing.JSpinner Addbook_qty;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel addBook_logo;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_SelectAuthor;
    private javax.swing.JComboBox<String> combo_genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel lbl_authorId;
    private javax.swing.JLabel lbl_genreId;
    // End of variables declaration//GEN-END:variables
}
