package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Query {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			//query
			PreparedStatement psmt=con.prepareStatement("insert into user(username,password) values(?,?)");
			psmt.setString(1, "test");
			psmt.setString(2, "1234");
			psmt.setString(1, "teeewwst");
			psmt.setString(2, "2234");
			
			
			psmt.executeUpdate();			
					
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//load sql server
	}
}