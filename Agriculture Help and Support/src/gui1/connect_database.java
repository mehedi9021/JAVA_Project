package gui1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class connect_database {

    static Connection ConnecrDb() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    public Connection con;
    public Statement stat;
    public ResultSet res;
     
    public connect_database()
    {
        systemConnection();
    }
    public void systemConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/agriculture?zeroDateTimeBehavior=convertToNull","root","");
            stat = (Statement)con.createStatement();
            //JOptionPane.showMessageDialog(null, "cool");
        }
        catch(Exception e)
        {
            ///JOptionPane.showMessageDialog(null, "cool");
        }
    }
    }


