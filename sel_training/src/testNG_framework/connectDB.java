package testNG_framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class connectDB {

	@Test
	public void databaseconnection() throws ClassNotFoundException, SQLException {

		// Load the database driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		// make a connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "root");

		System.out.println("Connected to Db");

		// statement generation
		Statement smt = con.createStatement();

		/*
		 * display all data ResultSet rslt= smt.executeQuery(
		 * "select * from seleniumusers");
		 */

		// delete data

		int rslt = smt.executeUpdate("delete from seleniumusers where id=1");

		System.out.println(rslt);

		// display remaining all data
		ResultSet rslt1 = smt.executeQuery("select * from seleniumusers");
		while (rslt1.next()) {
			String firstname = rslt1.getString("firstname");
			System.out.println(firstname);

			String mail = rslt1.getString("email");
			System.out.println(mail);
		}

	}

}
