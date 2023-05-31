package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Genre {
    
    My_Classes.funcClass func = new funcClass();

    private int id;
    private String name;
    
    //constructor
    public Genre(){}
    
    public Genre(int _id, String _name){
        
        this.id = _id;
        this.name = _name;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //function to insert new book genre
    public void addGenre(String _name){
        
        String insertQuery = "INSERT INTO `book_geners`(`name`) VALUES (?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _name);
            
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Genre Added.", "Add Genre",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Genre Not Added.", "Add Genre",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to edit book genre by id
    public void editGenre(int _id, String _name){
        
        String editQuery = "UPDATE `book_geners` SET `name` = ? WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
          
                       
            ps.setString(1, _name);
            ps.setInt(2, _id);       
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Genre Edited.", "Edit Genre",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Genre Not Edited.", "Edit Genre",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to remove book genre by id
    public void removeGenre(int _id){
        
        String removeQuery = "DELETE FROM `book_geners` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
                       
            ps.setInt(1, _id);       
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Genre Removed.", "Remove Genre",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Invalid Genre ID.", "Remove Genre",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //fuction to populate an arraylist with genres
    public  ArrayList<Genre> genreList(){
        
        ArrayList<Genre> gList = new ArrayList<>();
        
        try {
            
            ResultSet rs = func.getData("SELECT * FROM `book_geners`");
            Genre genre;
            
            while (rs.next()) {

                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gList;
    }
    
    //create a function to return a hashmap
    //string is the key
    //integer is the value
    
    public HashMap<String, Integer> getGenresMap(){
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        try {
            
            ResultSet rs = func.getData("SELECT * FROM `book_geners`");
            Genre genre;
            
            while (rs.next()) {

                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                hashMap.put(genre.getName(), genre.getId());
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hashMap;
    }
    
    //create a function to get genre by id
    public Genre getGenreById(Integer id){
        
            ResultSet rs = func.getData("SELECT * FROM `book_geners` WHERE `id` = "+id);
            Genre genre = null;
            
        try {
            if (rs.next()) {

                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                
            }
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            return genre;
    }
    
}
