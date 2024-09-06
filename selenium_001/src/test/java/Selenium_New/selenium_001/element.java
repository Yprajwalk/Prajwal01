package Selenium_New.selenium_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element {
    	  
  public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	System.out.println(driver.getTitle());
	WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	Searchbox.click();
	Searchbox.sendKeys("Mobiles");
	System.out.println(Searchbox.getAttribute("value"));
	
}
	
}
