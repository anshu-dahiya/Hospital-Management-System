package Hospital;

import java.sql.*;

public class ConnectionClassHMS 
{
    Connection con;
    Statement stm;
    
    ConnectionClassHMS()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Anshu@123");
           stm=con.createStatement();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        new ConnectionClassHMS();
    }
}
