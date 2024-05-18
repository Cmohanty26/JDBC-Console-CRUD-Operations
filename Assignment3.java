package Class19.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palletech", "root", "Chandan@123");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select * from patient");
			while(r.next()==true) {
				System.out.println(r.getInt(1));
				System.out.println(r.getString(2));
				System.out.println(r.getString(3));
				System.out.println(r.getInt(4));
				System.out.println(r.getString(5));
				
			}
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
