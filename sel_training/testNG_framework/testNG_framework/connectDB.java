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

		String displayData = "select * from WebEmp";
		// String AlterQuery= "ALTER TABLE seleniumusers ADD Profile Char(10)";
		// String UpdateQuery= "UPDATE seleniumusers SET Salary = '55000.00',
		// Profile= 'QA Lead' WHERE id = 4";
		// String deleteQuesry= "delete from seleniumusers where id=2";
		// String createtables= "CREATE TABLE WebEmp (ID int,FirstName
		// varchar(255),Profile varchar(255),Project varchar(255), Salary
		// float(20))";
		// String distintquery= "Select * from WebEmp group by FirstName";
		// smt.executeQuery(distintquery);
		// smt.executeQuery(displayData);
		String Casestatment = "SELECT FirstName, CASE Profile WHEN 'QA' THEN Salary *.5 WHEN 'Dev' THEN Salary * 1.5 ELSE Salary END NewSalary, Project FROM WebEmp";

		ResultSet rslt = smt.executeQuery(Casestatment);
		//ResultSet rslt1 = smt.executeQuery(displayData);

		while (rslt.next()) {
			String firstname = rslt.getString("Firstname");
			String salary = rslt.getString("NewSalary");
			System.out.println(firstname + "              " + salary);

		}

	}

}
