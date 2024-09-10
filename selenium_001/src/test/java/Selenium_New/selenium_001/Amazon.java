package Selenium_New.selenium_001;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class Amazon {
    	  
  public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.amazon.in/");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//a[text()=\"Fashion\"]")).click();
	
	/*
	WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	
	Searchbox.click();
	Searchbox.sendKeys("Mobiles");
	System.out.println("title usig get attribute: " +driver.getTitle());
	
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./screeshot1/serchbox.png");
	FileHandler.copy(source, target);
	
	System.out.println("here we use getAttribute method: "+Searchbox.getAttribute("value"));
	Thread.sleep(5000);
	
	Searchbox.clear();
	*/
	//    Electronics 
	
//	WebElement fashion = driver.findElement(By.xpath("//a[text()=\"Fashion\"]"));
//	fashion.click();
	
	
	}
	
}
