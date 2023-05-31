package My_Forms;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

   
    public LoginForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);

        //button_login.setBorder(new );
        //display Image
        displayImage();
        
        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
   
    }

    //create a function to display the login image
    public void displayImage(){
        
        //to get the image
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/My_Images/Library management system.png"));
        Image image = imageicon .getImage().getScaledInstance(login_logo.getWidth(), login_logo.getHeight(), Image.SCALE_SMOOTH);
        login_logo.setIcon(new ImageIcon (image));
        
        //close
        ImageIcon imageicon1 = new ImageIcon(getClass().getResource("/My_Images/close.png"));
        Image image1 = imageicon1 .getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        Close.setIcon(new ImageIcon (image1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        button_login = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        login_logo.setBackground(new java.awt.Color(255, 255, 255));
        login_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_logo.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Password  :");

        login_username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        button_login.setBackground(new java.awt.Color(204, 255, 255));
        button_login.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        button_login.setForeground(new java.awt.Color(51, 51, 255));
        button_login.setText("Login");
        button_login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        button_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_loginMouseExited(evt);
            }
        });
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        login_password.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login_password, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(login_username))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //login button
    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed

        //get the username & password
        //we will do the uysertype later
        String username = login_username.getText();       
        String password = String.valueOf(login_password.getPassword());

        
        //check if the fields are empty
        if(username.trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Username cannot be empty.", "Empty Fields",0);
            
        }
        
        else if (password.trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Password cannot be empty.", "Empty Fields",0);

        }
        
        else{
  
                My_Classes.Users users = new My_Classes.Users().tryLogin(username, password);
                                
                //check if the user exist
                //if the user exists
                if(users != null){
                    
                    //if the user type = Owner show all the elements         
                    //if the user type = admin dont show the manage users elements  
                    //if the user type = Simple hide the circulation + mnage users

                    //display the dashboard
                    DashboardForm dashboardForm = new DashboardForm();
                    
                    if(users.getUserType().equals("Admin")){
                        
                        dashboardForm.ManageUsers_BTN.setVisible(false);
                        
                    }
                    
                    else if(users.getUserType().equals("User")){
                        
                        dashboardForm.ManageUsers_BTN.setVisible(false);        
                        
                        dashboardForm.IssueBook_BTN.setVisible(false);
                        dashboardForm.ReturnBook_BTN.setVisible(false);
                        dashboardForm.jLabel11.setVisible(false);

                    }
                    
                    dashboardForm.Username_lbl.setText(users.getFirstname() +" "+ users.getLastname() +",");
                    //visible the dashboard form
                    dashboardForm.setVisible(true);
                    
                    //close the login form
                    this.dispose();
                    
                }
                
                //if not
                else{
                     
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password.", "Invalid Inputs",0);
                    
                }

        }
        
        
    }//GEN-LAST:event_button_loginActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

        
    }//GEN-LAST:event_CloseMouseEntered

    private void button_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseEntered
       
        //change the back ground
        button_login.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_button_loginMouseEntered

    private void button_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseExited
        //change the back ground
        button_login.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_button_loginMouseExited

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    public javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login_logo;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_username;
    // End of variables declaration//GEN-END:variables
}
