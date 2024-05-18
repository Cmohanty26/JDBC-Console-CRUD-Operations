package Class19.com;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment1 {

	public static void main(String[] args) {
		

		

		
				try {
					//Step1 : load the driver
				Class.forName("com.mysql.jdbc.Driver");
				//step2:open the connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/jdbcproject", "root", "Chandan@123");
				//step3:prepare sql statement
				Statement s=con.createStatement();
				//step4:we have to send sql to query to mysql
				s.executeUpdate("create table employee(eno int primary key,ename varchar(50),esal int)");
				//step5:close the all connection
				s.close();
				con.close();
				System.out.println("success");
				}
					
				
				catch (ClassNotFoundException e) {
					System.out.println("you forget to attach the driver class");
				} catch (SQLException e) {
					System.out.println("something wrong with sql");
					e.printStackTrace();
				} 
				
			}

		


	

}
