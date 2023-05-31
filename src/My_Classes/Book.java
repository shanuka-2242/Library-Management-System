package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Book {
    
    private Integer id;
    private String isbn;    
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private String date_received;
    private double price;
    private String description;

public Book(Integer _id, String _isbn, String _name, Integer _author_id, Integer _genre_id, 
        Integer _quantity, String _publisher, String _date_received, double _price, String _description){
    
    this.id = _id;
    this.isbn = _isbn;   
    this.name = _name;
    this.author_id = _author_id;
    this.genre_id = _genre_id;
    this.quantity = _quantity;
    this.publisher = _publisher;
    this.date_received = _date_received;
    this.price = _price;    
    this.description = _description;

}

public Book(){}

//getters

    public Integer getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDate_received() {
        return date_received;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //setters
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    funcClass c = new funcClass();


//function to insert new book
    public void addBook(String _isbn, String _name, Integer _author_id, Integer _genre_id, 
        Integer _quantity, String _publisher, String _date_received, double _price, String _description){
        
        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quantity`, `publisher`, `date_received`, `price`, `description`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _isbn);         
            ps.setString(2, _name);
            ps.setInt(3, _author_id);
            ps.setInt(4, _genre_id);    
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);  
            ps.setString(7, _date_received);    
            ps.setDouble(8,_price);   
            ps.setString(9,_description);
    
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Book Added.", "Add Book",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Book Not Added.", "Add Book",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //create a function to check if ISBN already exists
    public boolean isISBNexists(String _isbn){
        
        String query = "SELECT * FROM `books` WHERE `isbn` = '"+_isbn+"'";
        ResultSet rs = c.getData(query);
        
        try {
            return rs.next();
        }
        
        catch (SQLException ex) {
            
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                      
        return true;

    }
    
    public Book searchByID_Isbn(int _id, String _isbn){
        
        String query = "SELECT * FROM `books` WHERE `id` = '"+_id+"' OR `isbn` = '"+_isbn+"'";
        
        ResultSet rs = c.getData(query);
        Book book = null;
        
        try {
            
            if(rs.next()){
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), 
                        rs.getInt(5), rs.getInt(6), rs.getString(7), 
                        rs.getString(8), rs.getDouble(9), rs.getString(10));
            }
            
            else{
                
                return book;
            }
        }
        
        catch (SQLException ex) {
            
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return book;
                      
    }
    
    //function to edit book
    public void editBook(int _id, String _name, Integer _author_id, Integer _genre_id, 
        Integer _quantity, String _publisher, String _date_received, double _price, String _description){
        
        String updateQuery = "UPDATE `books` SET `name`=? ,`author_id`=? ,`genre_id`=? ,`quantity`=? ,`publisher`=? ,`date_received`=? ,`price`=? ,`description`=?  WHERE `ID` =?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            //ps.setString(1, _isbn);         
            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);    
            ps.setInt(4, _quantity);
            ps.setString(5, _publisher);  
            ps.setString(6, _date_received);    
            ps.setDouble(7,_price);   
            ps.setString(8,_description);
            ps.setInt(9, _id);    

    
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Book Edited.", "Edit Book",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Book Not Edited.", "Edit Book",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //function to remove book by id
    public void removeBook(int _id){
        
        String removeQuery = "DELETE FROM `books` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
                       
            ps.setInt(1, _id);       
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Book Removed.", "Remove Book",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Book does not exists in records.", "Error",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //fuction to populate an arraylist with books
    public  ArrayList<Book> bookList(String query){
        
        ArrayList<Book> bList = new ArrayList<>();
                
        try {
            
            if(query.equals("")){
                
                query = "SELECT * FROM `books`";
                                
            }
            
            ResultSet rs = c.getData(query);
            Book book;
            
            while (rs.next()) {

                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), 
                        rs.getInt(5), rs.getInt(6), rs.getString(7), 
                        rs.getString(8), rs.getDouble(9), rs.getString(10));
                bList.add(book);
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bList;
    }
    
    //get book by id
    public Book getBookById(Integer _id) throws SQLException{
        
        funcClass func = new funcClass();
        
        //query to get the book by id
        String query = "SELECT * FROM `books` WHERE `id` = "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next()){
            
            return new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), 
                        rs.getInt(5), rs.getInt(6), rs.getString(7), 
                        rs.getString(8), rs.getDouble(9), rs.getString(10));
        }
       
        else{
            
            return null;
        }
    }

    public void setQty_Minus_One(int book_id, int qty) {
        
        String updateQtyQuery = "UPDATE `books` SET `quantity`=? WHERE `ID` =?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQtyQuery);

            ps.setInt(1, qty); 
            ps.setInt(2, book_id);    

            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Book Quantity Edited.", "Alert",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Book Quantity Not Edited.", "Alert",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setQty_Plus_One(int book_id, int qty) {
        
        String updateQtyQuery = "UPDATE `books` SET `quantity`=? WHERE `ID` =?";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQtyQuery);

            ps.setInt(1, qty); 
            ps.setInt(2, book_id);    

            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Book Quantity Edited.", "Alert",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Book Quantity Not Edited.", "Alert",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
