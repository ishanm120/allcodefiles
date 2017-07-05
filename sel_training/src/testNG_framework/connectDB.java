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
		

	
	//String displayData= "select * from seleniumusers";
     //String AlterQuery= "ALTER TABLE seleniumusers ADD Profile Char(10)";
     //String UpdateQuery= "UPDATE seleniumusers SET Salary = '55000.00', Profile= 'QA Lead' WHERE id = 4";
	// String deleteQuesry= "delete from seleniumusers where id=2";
     String createtables= "CREATE TABLE WebEmp (ID int,FirstName varchar(255),Profile varchar(255),Project varchar(255), Salary float(20))";
     
     
     
        smt.executeUpdate(createtables);
    //    smt.executeQuery(displayData);
		
		
		
		
		
		
		
		
		
		/*while (rslt1.next()) {
			String firstname = rslt1.getString("firstname");
			String mail = rslt1.getString("email");
			System.out.println(firstname+"  "+mail);

			
			
		}*/

	}

}
