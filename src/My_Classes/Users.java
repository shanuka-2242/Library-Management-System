package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    
    private int id;    
    private String firstname;    
    private String lastname;
    private String username;   
    private String password;    
    private String userType; //admin or normal user

    My_Classes.funcClass func = new funcClass(); 
    
    //getters
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    //constructor
    public Users() {}

    public Users(int _id, String _firstname, String _lastname, String _username, String _password, String _usertype) {
        
        this.id = _id;
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.username = _username;
        this.password = _password;      
        this.userType = _usertype;

    }
    
    //function to insert new user
    public void addUser(String _fname, String _lname, String _username, String _password, String _usertype){
        
        String insertQuery = "INSERT INTO `users_table`(`firstName`, `lastName`, `username`, `password`, `user_type`) VALUES (?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);         
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password); 
            ps.setString(5, _usertype);

            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "User Added.", "Add User",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "User Not Added.", "Add User",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //create a function to check if the username already exists
    public boolean checkUsernameExists(String username){
        
            ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `username` = '" + username + "'");
            boolean exists = false;
            
        try {
            
            while (rs.next()) {

                exists = true;
                
            }
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            return exists;
            
    }
    
    //fuction to populate an arraylist with users
    public  ArrayList<Users> usersList(){
        
        ArrayList<Users> uList = new ArrayList<>();
                
        try {
            
            //dont show the owner data
            ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `user_type` <> 'Owner' ");
            Users users;
            
            while (rs.next()) {

                users = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), 
                        rs.getString("username"), rs.getString("password"), rs.getString("user_type"));
                
                uList.add(users);
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uList;
    }
    
    //function to edit user by id
    public void editUser(int _id, String _fname, String _lname, String _username, String _password, String _usertype){
        
        String editQuery = "UPDATE `users_table` SET `firstName`= ?, `lastName`=?, `username`=?, `password`=?, `user_type`=? WHERE `id` = ?";
         
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
                
            ps.setString(1, _fname);         
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);    
            ps.setString(5, _usertype);          
            ps.setInt(6, _id);    
  
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "User Edited.", "Edit User",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "User Not Edited.", "Edit User",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to remove user by id
    public void removeUser(int _id){
        
        String removeQuery = "DELETE FROM `users_table` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
                       
            ps.setInt(1, _id);       
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "User Removed.", "Remove User",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Invalid User ID.", "Remove User",0);

            }
     
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    //function to allow users to login 
    public  Users tryLogin(String _username, String _password){
        
        
        ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `username` = '"+_username+"' AND `password` = '"+_password+"' ");
            
        Users users = null;
            
        try {
            if (rs.next()) {
                
                users = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), 
                        rs.getString("username"),  rs.getString("password"), rs.getString("user_type"));
                
            }
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            

        return users;
        
    }
   
}
