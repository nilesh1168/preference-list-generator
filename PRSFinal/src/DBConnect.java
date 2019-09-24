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
 * @author nilesh
 */
public class DBConnect 
{
    public static Connection con=null;
    public static Connection Connect() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prs?useSSL=false","root","nilesh@8101998");  
            return con;
        } catch (ClassNotFoundException|SQLException ex) 
        {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }     
    }
    public static boolean chkconn(Connection con){
        return con != null;
    }
}
