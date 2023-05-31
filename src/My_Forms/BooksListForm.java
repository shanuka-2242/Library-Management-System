package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BooksListForm extends javax.swing.JFrame {
       
    My_Classes.Book book = new My_Classes.Book();  
    My_Classes.funcClass func = new My_Classes.funcClass();
    My_Classes.Author author = new My_Classes. Author();   
    My_Classes.Genre genre = new My_Classes. Genre();

    public BooksListForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
               
        //customJTable
        func.customTable(table_BooksList);
        
        //populate books to a table
        populateJtableWithBooks("");
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/books-list.png"));
        Image image = imageicon .getImage().getScaledInstance(booklist_logo.getWidth(), booklist_logo.getHeight(), Image.SCALE_SMOOTH);
        booklist_logo.setIcon(new ImageIcon (image));
        
        //search lable icon 1
        ImageIcon imageicon1 = new ImageIcon(getClass().getResource("/My_Images/search.png"));
        Image image1 = imageicon1 .getImage().getScaledInstance(SearchIconOne.getWidth(), SearchIconOne.getHeight(), Image.SCALE_SMOOTH);
        SearchIconOne.setIcon(new ImageIcon (image1));
        
        //search lable icon 2
        ImageIcon imageicon2 = new ImageIcon(getClass().getResource("/My_Images/search.png"));
        Image image2 = imageicon2 .getImage().getScaledInstance(SearchIconTwo.getWidth(), SearchIconTwo.getHeight(), Image.SCALE_SMOOTH);
        SearchIconTwo.setIcon(new ImageIcon (image2));
        
        //close
        ImageIcon imageicon3 = new ImageIcon(getClass().getResource("/My_Images/close.png"));
        Image image3 = imageicon3 .getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        Close.setIcon(new ImageIcon (image3));
        
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
        booklist_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Refresh = new javax.swing.JButton();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_BooksList = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_searchbyinputs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SearchIconOne = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateOne = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dateTwo = new com.toedter.calendar.JDateChooser();
        SearchIconTwo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_isbn = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_genre = new javax.swing.JLabel();
        lbl_qty = new javax.swing.JLabel();
        lbl_publisher = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Books List");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Books List");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btn_Refresh.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Refresh.setText("REFRESH");
        btn_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Refresh.setPreferredSize(new java.awt.Dimension(86, 26));
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
                .addComponent(booklist_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(booklist_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        table_BooksList.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_BooksList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_BooksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_BooksListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_BooksList);

        jPanel4.setBackground(new java.awt.Color(253, 253, 189));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 50, 75));
        jLabel2.setText("Search By Book Name/ Author ID/ Genre ID/ Publisher ");

        txt_searchbyinputs.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Value to search :");

        SearchIconOne.setBackground(new java.awt.Color(255, 255, 255));
        SearchIconOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchIconOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchIconOneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchIconOneMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_searchbyinputs, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchIconOne, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_searchbyinputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SearchIconOne, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(253, 253, 189));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 50, 75));
        jLabel5.setText("Search Book Between Two Dates");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("and");

        dateOne.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Value to search :");

        dateTwo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        SearchIconTwo.setBackground(new java.awt.Color(255, 255, 255));
        SearchIconTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchIconTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchIconTwoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOne, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchIconTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchIconTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Selected book details :");

        lbl_isbn.setBackground(new java.awt.Color(255, 255, 255));
        lbl_isbn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_isbn.setForeground(new java.awt.Color(102, 102, 255));
        lbl_isbn.setText("ISBN");

        lbl_name.setBackground(new java.awt.Color(255, 255, 255));
        lbl_name.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(102, 102, 255));
        lbl_name.setText("Name");

        lbl_author.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(102, 102, 255));
        lbl_author.setText("Author");

        lbl_genre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_genre.setForeground(new java.awt.Color(102, 102, 255));
        lbl_genre.setText("Genre");

        lbl_qty.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_qty.setForeground(new java.awt.Color(102, 102, 255));
        lbl_qty.setText("Qty");

        lbl_publisher.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_publisher.setForeground(new java.awt.Color(102, 102, 255));
        lbl_publisher.setText("Publisher");

        lbl_date.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(102, 102, 255));
        lbl_date.setText("Date Received");

        lbl_price.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(102, 102, 255));
        lbl_price.setText("Price (LKR)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_genre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_qty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(lbl_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(337, 337, 337))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_BooksListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_BooksListMouseClicked

        //display the selcted member details 
        
        My_Classes.Book SelectedBook = null;
        
        try {
            
            //search member by ID and display the data
            
            //get the selected Jtable row index
            Integer rowIndex = table_BooksList.getSelectedRow();
            
            //get the member id of selcted row
            Integer id = Integer.valueOf(table_BooksList.getModel().getValueAt(rowIndex, 0).toString());
    
            SelectedBook = book.getBookById(id);
            
            lbl_isbn.setText(String.valueOf(SelectedBook.getIsbn()));        
            lbl_name.setText(SelectedBook.getName());
            lbl_author.setText( author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() +" "+ author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());
            lbl_genre.setText(genre.getGenreById(SelectedBook.getGenre_id()).getName());
            lbl_qty.setText(String.valueOf(SelectedBook.getQuantity()));
            lbl_publisher.setText(SelectedBook.getPublisher());            
            lbl_date.setText(SelectedBook.getDate_received());
            lbl_price.setText(String.valueOf(SelectedBook.getPrice()));

        }
        
        catch (SQLException | NullPointerException ex) {
            
                JOptionPane.showMessageDialog(null, "Enter a valid Member ID.", "Invalid ID",0);
        }
     
    }//GEN-LAST:event_table_BooksListMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        populateJtableWithBooks ("SELECT * FROM `books`");
        txt_searchbyinputs.setText("");

        //set labels texts
        lbl_isbn.setText("ISBN");
        lbl_name.setText("Name");
        lbl_author.setText("Author");
        lbl_genre.setText("Genre");
        lbl_qty.setText("Qty");
        lbl_publisher.setText("Publisher");
        lbl_date.setText("Date Received");
        lbl_price.setText("Price (LKR)");
        txt_searchbyinputs.setText("");
        dateOne.setCalendar(null);       
        dateTwo.setCalendar(null);

        
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void SearchIconOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIconOneMouseClicked
        
        //search and display the data in Jtable
        String value = txt_searchbyinputs.getText();
                
        if(value.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Search field is empty.", "Empty Field",0);
            
        }
        
        else{
        
           //search by name, authorId, genreId, publisher
           String query = "SELECT * FROM `books` WHERE `name` LIKE '%"+value+"%' OR `author_id` LIKE '%"+value+"%' OR `genre_id` LIKE '%"+value+"%' OR `publisher` LIKE '%"+value+"%'";

           //populate the table with search results
           populateJtableWithBooks(query);
        
        }
        
       
    }//GEN-LAST:event_SearchIconOneMouseClicked

    private void SearchIconOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIconOneMouseEntered
      
    }//GEN-LAST:event_SearchIconOneMouseEntered

    private void SearchIconTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchIconTwoMouseClicked
        
        try{
            //search and display the data in Jtable
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = dateFormat.format(dateOne.getDate()); //get date1
        String date2 = dateFormat.format(dateTwo.getDate()); //getdate2

        
         //search book between two dates
        String query = "SELECT * FROM `books` WHERE `date_received` BETWEEN '"+date1+"' AND '"+date2+"'";

        //populate the table with search results
        populateJtableWithBooks(query);
        
        }
        
        catch(NullPointerException exception){
            
            JOptionPane.showMessageDialog(null, "Select both dates.", "Empty Field",0);
            
        }
    }//GEN-LAST:event_SearchIconTwoMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        try {
            
            table_BooksList.print();
            
        } 
        
        catch (PrinterException ex) {
            
            Logger.getLogger(BooksListForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

      //create a function to populate the Jtable with members
    public void populateJtableWithBooks(String query){
        
       
        ArrayList<My_Classes.Book> arrayList = book.bookList(query);
        
        //JTable columns
        String[] colNames = {"ID", "ISBN", "NAME", "AUTHOR ID", "GENRE ID", "QTY", "PUBLISHER", "DATE RECEIVED", "PRICE"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getId();    
            rows[i][1] = arrayList.get(i).getIsbn();      
            rows[i][2] = arrayList.get(i).getName();
            rows[i][3] = arrayList.get(i).getAuthor_id();
            rows[i][4] = arrayList.get(i).getGenre_id();       
            rows[i][5] = arrayList.get(i).getQuantity();   
            rows[i][6] = arrayList.get(i).getPublisher();
            rows[i][7] = arrayList.get(i).getDate_received();    
            rows[i][8] = arrayList.get(i).getPrice();
            
        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_BooksList.setModel(defaultTableModel);
        
    }
    

    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel SearchIconOne;
    private javax.swing.JLabel SearchIconTwo;
    private javax.swing.JLabel booklist_logo;
    private javax.swing.JButton btn_Refresh;
    private com.toedter.calendar.JDateChooser dateOne;
    private com.toedter.calendar.JDateChooser dateTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_genre;
    private javax.swing.JLabel lbl_isbn;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_publisher;
    private javax.swing.JLabel lbl_qty;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_BooksList;
    private javax.swing.JTextField txt_searchbyinputs;
    // End of variables declaration//GEN-END:variables
}
