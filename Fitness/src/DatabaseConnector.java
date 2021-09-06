/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author admin
 */
public class DatabaseConnector {
     public static Connection connectDB(){
        try{
        Connection con=null;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/fitness", "yash", "yash"); 
        return con;
              }
        catch(SQLException sqe){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,sqe);
        }
        return null;
    }
    
}
 
