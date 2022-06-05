package jdbcall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;



public class ConState 
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
				
				
				//Create/Insertion
				
				
/*				String sql = "insert into tuition values(6,'happy@.c','king')";
				int row = st.executeUpdate(sql);
				if(row>0)
				{
					System.out.println(row+"insertion successfull");
				}
				else {
					System.out.println("not successfull");
				}
*/
				
				
				//Retrieve
				
				
/*				String sql = "select * from tuition";
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) 
				{
					System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
				}
				st.close();
				con.close();
*/
				
				
				
				
			
			
	}

}
