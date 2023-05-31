package My_Forms;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class AuthorsListForm extends javax.swing.JFrame {
       
    My_Classes.Author author = new My_Classes.Author();  
    My_Classes.funcClass func = new My_Classes.funcClass();
    public static String formType = "";

    public AuthorsListForm() {
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
        
        //logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/skills.png"));
        Image image = imageicon .getImage().getScaledInstance(manageAuthors_logo.getWidth(), manageAuthors_logo.getHeight(), Image.SCALE_SMOOTH);
        manageAuthors_logo.setIcon(new ImageIcon (image));
        
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
        manageAuthors_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Authors = new javax.swing.JTable();
        btn_SelectAuthor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Authors List");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Authors List");
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
                .addComponent(manageAuthors_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(manageAuthors_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        btn_SelectAuthor.setBackground(new java.awt.Color(184, 232, 252));
        btn_SelectAuthor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_SelectAuthor.setText("SELECT AUTHOR");
        btn_SelectAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(btn_SelectAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SelectAuthor)
                .addGap(17, 17, 17))
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

    private void table_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_AuthorsMouseClicked

        

    }//GEN-LAST:event_table_AuthorsMouseClicked

    private void btn_SelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectAuthorActionPerformed

        //display the selected author
        
        //get the selected row index
        int index = table_Authors.getSelectedRow();
        
        //get values
        //get the selected row index
        //int index = authorsListForm.table_Authors.getSelectedRow();
        
        //get values
        int id = Integer.parseInt(table_Authors.getValueAt(index, 0).toString());         
        String fname = table_Authors.getValueAt(index, 1).toString();   
        String lname = table_Authors.getValueAt(index, 2).toString();
        
        String fullName = fname+ " " +lname;
        
        
        if(formType.equals("edit"))
        EditBookForm.displayAuthorData(id, fullName);

        else
        AddBookForm.displayAuthorData(id, fullName);

        
        this.dispose();

    }//GEN-LAST:event_btn_SelectAuthorActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

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
                new AuthorsListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JButton btn_SelectAuthor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageAuthors_logo;
    public javax.swing.JTable table_Authors;
    // End of variables declaration//GEN-END:variables
}
