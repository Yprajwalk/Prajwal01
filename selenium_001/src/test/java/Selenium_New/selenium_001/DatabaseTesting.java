package Selenium_New.selenium_001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

public class DatabaseTesting extends Dynamic_code {

	public static void main(String[] args) throws SQLException, Throwable {
		
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/");
		
		String host = "localhost";
		String portnumber = "3306";
		
		//jdbc-connection: for develope connection beween database and eclipse
		//url-"jdbc:mysql://host:portnumber/databasename"
		//user root
		//password
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/july","root","y@prajwal98"); // for develope connection betwn database and eclips
		
		Statement cs = connect.createStatement(); // for fetch the data from that database 
		 
		ResultSet query = cs.executeQuery("select username , password from jeevansathi where sr_no = 3;"); //to fetch the information from that table
		
		//in eclipse index start from 0 and in sql start from 1 thats why we use next() method coz after 0 ,1 comes .
		query.next(); 
		
		System.out.println(query.getString("username"));
		System.out.println(query.getString("password"));
		
		driver.findElement(By.cssSelector("input#email")).sendKeys(query.getString("username"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys(query.getString("password"));
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#eye")).click();
		
}

}
