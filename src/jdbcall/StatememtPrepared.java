package jdbcall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StatememtPrepared {
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
					
					
					//Prepared Statement
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the ID");
					int sid = sc.nextInt();
					/*System.out.println("Enter the email address");
					String semail = sc.next();
					System.out.println("Enter the Name");
					String sname = sc.next();
					*/
					
					//insertion
					//String sql = "insert into tuition values(?,?,?)";
					
					//retrieve
					//String sql = "select * from tuition";
					//PreparedStatement ps = con.prepareStatement(sql);
					/*ResultSet rs = ps.executeQuery(sql);
					while(rs.next()) 
					{
						System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
					}
					*/
					
					
					//Update
					//String sql = "update tuition set semail=?,sname=? where sid=?";
					
					//String sql="delete from tuition where sid=?";
					//PreparedStatement ps = con.prepareStatement(sql);
					//ps.setInt(1,sid);
					//ps.setString(1,semail);
					//ps.setString(2,sname);
					
					int i=ps.executeUpdate();
					if(i>0)
					{
						System.out.println("yes");
					}
					else
					{
						System.out.println("noh");
					}
					
					ps.close();
					con.close();
	}

}
