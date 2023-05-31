package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IssueBook {
    
    private int book_id;    
    private int member_id;
    private String status; //issued - retun - lost
    private String issue_date;
    private String retun_date;    
    private String note;

    Book book = new Book();
    My_Classes.funcClass c = new funcClass();
    
    //constructor
    public IssueBook() {}

    public IssueBook(int _book_id, int _member_id, String _status, String _issue_date, String _retun_date, String _note) {
        this.book_id = _book_id;
        this.member_id = _member_id;
        this.status = _status;
        this.issue_date = _issue_date;
        this.retun_date = _retun_date;
        this.note = _note;
    }
    
    
    //Getters
    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getRetun_date() {
        return retun_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }
    
    //setters
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public void setRetun_date(String retun_date) {
        this.retun_date = retun_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    //add a new issue
    public void addIssue(int _book_id, int _member_id, String _status, String _issue_date, String _retun_date, String _note){
    
    String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (? ,?, ?, ?, ?, ?)";
    try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setInt(1, _book_id);         
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);    
            ps.setString(5, _retun_date);
            ps.setString(6, _note);  
    
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Record Added.", "Add Record",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Record Not Added.", "Add Record",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //function to check book availability
    //check the book qty from the book table and compare it to
    //the number of books issued in the issue_book table
    public boolean checkAvailability(int _book_id){
        
        boolean availability  = false;
        
        try {
            //first get the book qty
            Book selectedBook = book.getBookById(_book_id);
            int qty = selectedBook.getQuantity();
            
            //get the number of books issued (the same book)
            int issued_book_count = countData(_book_id);
            
            if(qty > issued_book_count){
                
                availability = true;
            }
            
            else{
                
                availability = false;
            }
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
       return availability; 
    }
    
    //create a function to count the number of issued book
    public int countData(int _book_id){
        
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try {
            
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) AS total FROM `issue_book` WHERE `book_id` = ? AND `status` = 'issued'");
            ps.setInt(1, _book_id);
            rs = ps.executeQuery();
            
        
        if(rs.next()){
            
            total = rs.getInt("total");
        }
        
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return total;
    }

    //fuction to populate an arraylist with issued/returned/lost books
    public  ArrayList<IssueBook> IssuedBookList(String _status){
        
        //create a list
        ArrayList<IssueBook> issuedBookList = new ArrayList<>();
        String query;
        
        if(_status.equals("")){ //if the status is empty > ahow all data
            
            query = "SELECT * FROM `issue_book`";
            
        }
        
        else{ //show data depending on selected status
            
            query = "SELECT * FROM `issue_book` WHERE `status` = '" + _status + "'";
            
        }
        
        
        try {

            ResultSet rs = c.getData(query);
            IssueBook issueBook;
            
            while (rs.next()) {

                issueBook = new IssueBook(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getString(6));
                issuedBookList.add(issueBook);
                
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return issuedBookList;
    }

        //update issue status
    public void updateIssue(int _book_id, int _member_id, String _status, String _issue_date, String _retun_date, String _note){
    
    String updateQuery = "UPDATE `issue_book` SET `status`= ?, `return_date`= ?, `note`= ? WHERE `book_id` = ? AND `member_id` = ? AND `issue_date` = ?";
    try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            
            ps.setString(1, _status);  
            ps.setString(2, _retun_date);
            ps.setString(3, _note);         
            ps.setInt(4, _book_id);         
            ps.setInt(5, _member_id);
            ps.setString(6, _issue_date);

            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Record Updated.", "Update Record",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Record Not Updated.", "Update Record",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    //function to remove issued book using the book id - member id - issued date
    public void removeFromIssuedTable(int _book_id, int _memebr_id, String _issued_date){
        
        String removeQuery = "DELETE FROM `issue_book` WHERE `book_id` = ? AND `member_id` = ? AND `issue_date` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
                       
            ps.setInt(1, _book_id);    
            ps.setInt(2, _memebr_id);       
            ps.setString(3, _issued_date);       
     
 
            if(ps.executeUpdate() != 0){
                
               JOptionPane.showMessageDialog(null, "Record Removed.", "Remove Record",1);

            }
            
            else{
                           
                JOptionPane.showMessageDialog(null, "Record Did Not Removed.", "Error",0);

            }
     
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
}
 