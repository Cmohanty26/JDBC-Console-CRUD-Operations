package Class19.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2 {

	public static void main(String[] args) {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/jdbcproject", "root", "Chandan@123");
		String query="insert into employee(eno,ename,esal) values (?,?,?)";
		PreparedStatement s=con.prepareStatement(query);
		s.setInt(1, 26);
		s.setString(2, "chandan");
		s.setInt(3, 30000);
		ResultSet r=s.executeQuery("select *from employee");
		while(r.next()==true) {
			System.out.println(r.getInt(1));
			System.out.println(r.getString(2));
			System.out.println(r.getInt(3));
		}
		s.close();
		con.close();
		System.out.println("success");
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
