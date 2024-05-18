package Class19.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root","Chandan@123");
			String query="update employee set ename= ? where eno= ?";
			PreparedStatement s=con.prepareStatement(query);
		s.setString(1,"bijay");
		s.setInt(2, 26);
		s.executeUpdate();
		s.close();
		con.close();
		System.out.println("success");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
