package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class DBconnect {
    
    public static Connection connect()
    {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sliit","root","");
            
            
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            
        }
 
       
        
        
        return con;
    }
}
