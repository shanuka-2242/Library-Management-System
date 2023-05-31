package My_Classes;

import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class funcClass {
    
    //create a function to return a resultset
    public ResultSet getData(String query){
        
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

        }
        
        catch (SQLException ex) {
            Logger.getLogger(funcClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    //create a function to custom JTable
    public void customTable(JTable jTable){
        
        jTable.setRowHeight(25);     
        jTable.setBackground(new Color(204,204,255));
        jTable.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));     
    }
    
    //create a function to count the number of data
    public int countData(String tableName){
        
        int total = 0;
        ResultSet rs;
        Statement st;
        
        try {
            
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS total FROM `"+tableName+"`");
        
        if(rs.next()){
            
            total = rs.getInt("total");
        }
        
        } 
        
        catch (SQLException ex) {
            
            Logger.getLogger(funcClass.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return total;
    }
   
}
