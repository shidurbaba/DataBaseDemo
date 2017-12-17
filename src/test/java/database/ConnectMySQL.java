package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	@Test
	public void TestDB() throws ClassNotFoundException, SQLException {
		//Create connection to Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		//Create connection to Driver url.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","toor");
		System.out.println("Connected to MySQl DB");
		
		//Statement is an interface in Java that will execute any queries
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumuser;");
		//rs.next() will move the cursor forward from one row from its the current position
		//.next() returns a boolean type
			while(rs.next()) {
			String firstname = rs.getString("firstname");
			String email = rs.getString("email");
			System.out.println("Print FirstName : " + firstname + "Print Email : " + email);
		}
	}
}
