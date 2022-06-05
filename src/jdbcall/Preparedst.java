package jdbcall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Preparedst 
{
final static String DB_URL="jdbc:mysql://localhost:3306/practice";
final static String USER_NAME="root";
final static String PASSWORD="root";

public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	// register the driver
			Class.forName("com.mysql.jdbc.Driver");
			//connection creation
			Connection con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			
			if(con!=null)
			{
				System.out.println("established");
			}
			else
			{
				System.out.println("not");
			}
			Statement st =con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id");
			int sid = sc.nextInt();
			System.out.println("Enter the email address");
			String semail = sc.next();
			System.out.println("Enter the Name");
			String sname = sc.next();
			
			
			// for insertion
			//String sql = "insert into tuition values("+sid+",'"+semail+"','"+sname+"')";
			
			//for update
			String sql = "update tuition set semail='"+semail+"', sname='"+sname+"' where sid="+sid+"";
			
			//for delete
			//String sql = "delete from tuition where sid = "+sid+"";
			//System.out.println(sql);
			
			
			
			int row = st.executeUpdate(sql);
			if(row>0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("noh");
			}
	}
}




