package Class19.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palletech", "root", "Chandan@123");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select fname from patient where fname like 'm%'");
//			ResultSet r=s.executeQuery("select age from patient where age>45");
			
			while(r.next()==true) {
				System.out.println(r.getInt(1));
			}
			s.close();
			con.close();
			System.out.println("Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
