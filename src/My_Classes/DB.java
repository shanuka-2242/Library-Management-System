package My_Classes;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    
    //create a connection between the project and my SQL database
    
    private static String servername = "localhost";     
    private static String username = "root";    
    private static String dbname = "java_library_system";
    private static Integer portnumber = 3306;
    private static String password = ""; //no password
   
    //create a function to create & return the connection
    
    public static Connection getConnection(){
        
        Connection connection = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        
        dataSource.setServerName(servername);  
        dataSource.setUser(username);        
        dataSource.setDatabaseName(dbname);
        dataSource.setPortNumber(portnumber);
        dataSource.setPassword(password);

        try {
            connection = (Connection) dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
    
}
