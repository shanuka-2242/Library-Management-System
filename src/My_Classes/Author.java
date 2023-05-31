package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Author {
            
    My_Classes.funcClass func = new funcClass();

    private int id;    
    private String firstName;
    private String lastName;
    private String fieldOfExpertise;  
    private String about;

    public Author(int _id, String _fname, String _lname, String _expertise, String _about){
        
        this.id = _id;       
        this.firstName = _fname;
        this.lastName = _lname;
        this.fieldOfExpertise = _expertise;
        this.about = _about;

    }

    public Author() {
    }

    //getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public String getAbout() {
        return about;
    }
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    //function to insert new author
    public void addAuthor(String _fname, String _lname, String _expertise, String _about){
        
        String insertQuery = "INSERT INTO `authors`(`firstName`, `lastName`, `expertise`, `about`) VALUES (?, ?, ?, ?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);         
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);

            
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Author Added.", "Add Author",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Author Not Added.", "Add Author",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //function to edit author by id
    public void editAuthor(int _id, String _fname, String _lname, String _expertise, String _about){
        
        String editQuery = "UPDATE `authors` SET `firstName`=?, `lastName`=?, `expertise`=?, `about`=? WHERE `id` = ?";
         
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
                
            ps.setString(1, _fname);         
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);          
            ps.setInt(5, _id);    
  
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Author Edited.", "Edit Author",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Author Not Edited.", "Edit Author",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to remove author by id
    public void removeAuthor(int _id){
        
        String removeQuery = "DELETE FROM `authors` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
                       
            ps.setInt(1, _id);       
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Author Removed.", "Remove Author",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Invalid Author ID.", "Remove Author",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //fuction to populate an arraylist with authors
    public  ArrayList<Author> authorList(){
        
        ArrayList<Author> aList = new ArrayList<>();
                
        try {
            
            ResultSet rs = func.getData("SELECT * FROM `authors` ");
            Author author;
            
            while (rs.next()) {

                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"),  rs.getString("about"));
                aList.add(author);
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;
    }
    
    //create a function to get author by id
    public Author getAuthorById(Integer id){
        
            ResultSet rs = func.getData("SELECT * FROM `authors` WHERE `id` = "+id);
            Author author = null;
            
        try {
            
            if (rs.next()) {

                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), 
                        rs.getString("expertise"),  rs.getString("about"));
                
            }
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            return author;
    }
}
