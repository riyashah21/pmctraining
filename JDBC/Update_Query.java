package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Query {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			//query
			PreparedStatement psmt=con.prepareStatement("update user set username=?, password=? where id=?");
			psmt.setString(1, "tssest");
			psmt.setString(2, "1234");
			psmt.setInt(3, 1);
			
			
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
