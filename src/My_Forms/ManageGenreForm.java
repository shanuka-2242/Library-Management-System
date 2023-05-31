package My_Forms;

import java.awt.Color;
import java.awt.Font;
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

public class ManageGenreForm extends javax.swing.JFrame {
       
    My_Classes.Genre genre = new My_Classes.Genre();
    My_Classes.funcClass func = new My_Classes.funcClass();


    public ManageGenreForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //display Image
        displayImage();
        
        //customJTable
        func.customTable(table_BookGeners);
        
        //populate JTable
        populateJtableWithGenres();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
               
    }
    
    //create a function to display the login image
    public void displayImage(){
        
        //to get the logo image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/diagram.png"));
        Image image = imageicon .getImage().getScaledInstance(manageBooksGeners_logo.getWidth(), manageBooksGeners_logo.getHeight(), Image.SCALE_SMOOTH);
        manageBooksGeners_logo.setIcon(new ImageIcon (image));
        
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
        manageBooksGeners_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ManageBookGenere_ID = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_BookGeners = new javax.swing.JTable();
        ManageBookGenere_Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Books Geners");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Manage Books Geners");
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
                .addComponent(manageBooksGeners_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(manageBooksGeners_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Name    :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("ID            :");

        ManageBookGenere_ID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ManageBookGenere_ID.setText("Auto Generate");
        ManageBookGenere_ID.setEnabled(false);

        btn_Add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Add.setText("ADD");
        btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
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

        btn_Edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Edit.setText("EDIT");
        btn_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        table_BookGeners.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_BookGeners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_BookGeners.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_BookGenersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_BookGeners);

        ManageBookGenere_Name.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ManageBookGenere_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageBookGenere_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ManageBookGenere_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ManageBookGenere_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btn_Add)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Edit)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Delete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void table_BookGenersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_BookGenersMouseClicked

        //display the selected genre
        
        //get the selected row index
        int index = table_BookGeners.getSelectedRow();
        
        //get values
        String idr = table_BookGeners.getValueAt(index, 0).toString();       
        String name = table_BookGeners.getValueAt(index, 1).toString();
        
        //show data in the textfields
        ManageBookGenere_ID.setText(idr);       
        ManageBookGenere_Name.setText(name);

    }//GEN-LAST:event_table_BookGenersMouseClicked

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed

        //edit the selected genre
        String name = ManageBookGenere_Name.getText();     
        String idr = ManageBookGenere_ID.getText();

        if(idr.equals("Auto Generate")){
            
            JOptionPane.showMessageDialog(null, "Select a Genre from the table first.", "Alert",0);
        }
        
        //check if textfield is empty
        else if(!Pattern.matches("[0-9]+", idr)){

            JOptionPane.showMessageDialog(null, "ID cannot have letters.", "Wrong Inputs",0);
        }
        
        else if(name.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Name cannot be empty.", "Empty Fields",0);
        }

        //genrename cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", name)){

            JOptionPane.showMessageDialog(null, "Genere Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }
        
        //check if textfield is not empty
        else{
 
            try {
                
                //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm editing the book genre?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
                           
                int id = Integer.parseInt(ManageBookGenere_ID.getText());        
                genre.editGenre(id, name);
                populateJtableWithGenres();
                            
                ManageBookGenere_Name.setText("");  
                ManageBookGenere_ID.setText("Auto Generate");

            }

            } 
            catch (NullPointerException exception) {
                             
                JOptionPane.showMessageDialog(null, "Invalid Genre ID.", "Error",0);

            }
                    
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        //edit the selected genre
        String idr = ManageBookGenere_ID.getText();

        //check if textfield is empty
        if(idr.equals("Auto Generate")){

            JOptionPane.showMessageDialog(null, "Select a Genre from the table first.", "Alert",0);
        }

        //check if textfield is not empty
        else{
         //delete the selcted genre
        try {

            int id = Integer.parseInt(ManageBookGenere_ID.getText());        

            int confirm = JOptionPane.showConfirmDialog(null, "Confirm removing the book genre?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
                           
                genre.removeGenre(id);
                populateJtableWithGenres();
                
                ManageBookGenere_Name.setText("");        
                ManageBookGenere_ID.setText("Auto Generate");
            }
   
            }
        
            catch (NullPointerException exception) {
                             
                JOptionPane.showMessageDialog(null, "Invalid Genre ID.", "Error",0);

            } 
        
        }
       
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        //add new genre
        String name = ManageBookGenere_Name.getText();

        //check if textfield is empty
        if(name.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Name cannot be empty.", "Empty Fields",0);
        }
        
        //genrename cannot have numbers
        else if(!Pattern.matches("^[a-zA-Z]+$", name)){

            JOptionPane.showMessageDialog(null, "Genere Name cannot have numbers or symbols.", "Wrong Inputs",0);
        }

        //check if textfield is not empty
        else{

            //show the confirmation message before delete
            int confirm = JOptionPane.showConfirmDialog(null, "Confirm adding the book genre?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
            
            genre.addGenre(name);
            populateJtableWithGenres();
            
            ManageBookGenere_Name.setText("");   
            ManageBookGenere_ID.setText("Auto Generate");

            }
 
        }

    }//GEN-LAST:event_btn_AddActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

        
        try {
            
            table_BookGeners.print();
            
        } 
        
        catch (PrinterException ex) {
            
            Logger.getLogger(ManageGenreForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    //create a function to populate the Jtable with genres
    public void populateJtableWithGenres(){
        
        ArrayList<My_Classes.Genre> arrayList = genre.genreList();
        
        //JTable columns
        String[] colNames = {"ID", "NAME"};
        
        //JTable row
        Object [][] rows = new Object[arrayList.size()][colNames.length];
        
        for(int i=0; i<arrayList.size(); i++){
            
            rows[i][0] = arrayList.get(i).getId();    
            rows[i][1] = arrayList.get(i).getName();

        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(rows, colNames);
        table_BookGeners.setModel(defaultTableModel);
        
    }
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageGenreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField ManageBookGenere_ID;
    private javax.swing.JTextField ManageBookGenere_Name;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageBooksGeners_logo;
    private javax.swing.JLabel print;
    private javax.swing.JTable table_BookGeners;
    // End of variables declaration//GEN-END:variables
}
