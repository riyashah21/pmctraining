package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Select_query {

		public static void main(String[] args) {
			try {
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				//query
				PreparedStatement psmt=con.prepareStatement("select * from user where username=? and password=?");
				Scanner scn=new Scanner(System.in);
				System.out.println("enter username");
				String uname=scn.next();
				psmt.setString(1, uname);
				System.out.println("enter a pwd");
				String upass=scn.next();
				psmt.setString(2, upass);
				
				ResultSet rs=psmt.executeQuery();
				boolean b=rs.next();
				if(b== true) {
					System.out.println("Done!!");
					
				}else {
					System.out.println("try again!");
				}
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