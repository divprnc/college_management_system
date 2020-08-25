package college;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;



public class DatabaseQuery 
{
    static Connection con = null;
    static int rowcount;
    static Statement stmt = null;
    static ResultSet rs = null;
    static SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy");
    static String FillingDate = format.format(new Date());
    public static void GetConnection() throws SQLException
    {
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-LH22I5EJ;databaseName=CollegeManagementDatabase", "sa", "");
        //JOptionPane.showMessageDialog(null,"Connected to SQL Server");
    }
    
    public static void CloseConnection() throws SQLException
    {
        if(rs != null)
        {
            rs.close();
        }
        if(stmt != null)
        {
            stmt.close();
        }
        con.close();
    }
    
    public static int ExecuteUpdate(String query) throws SQLException
    {
        stmt = null;
        rs = null;
        rowcount = 0;
        stmt = con.createStatement();
        rowcount = stmt.executeUpdate(query);
        return rowcount;
    }
    
    public static  ResultSet ExecuteQuery(String query) throws SQLException
    {
        stmt = null;
        rs = null;
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
       // JOptionPane.showMessageDialog(null, "Delevired");
        return rs;
    }

    
    public static String GetDate(Date d)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        return dateFormat.format(d);
    }
}

