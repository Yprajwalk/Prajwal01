package Selenium_New.selenium_001;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automade_chrome {

	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.amazon.in/"); // use to hit url
		System.out.println(driver.getTitle());
		
		 // driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		//System.out.println(driver.getTitle());
	  
		//System.out.println(driver.getCurrentUrl()); // this will capture current url of webpage
		//driver.close(); // it is use to close webpage  //quite() for close multiple tab 
		
		
		

//		WebDriver drive = new FirefoxDriver();
//		drive.get("https://www.amazon.in/");
		
//		   WebDriver driver = new EdgeDriver();
//		   driver.get("https://www.amazon.in/");
	}

}
