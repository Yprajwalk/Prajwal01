package Selenium_New.selenium_001;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamic_code02 {
	public static WebDriver driver;
  
	   public static void launch_browser(String browser) {
		   if(browser.equalsIgnoreCase("chrome")) {
			   driver = new ChromeDriver();
		   }else if(browser.equalsIgnoreCase("firefox")) {
			    driver = new FirefoxDriver();
		   }else if(browser.equalsIgnoreCase("edge")) {
			    driver = new EdgeDriver();
		   }
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   System.out.println("Launch Browser Is: " +browser);
	   }
	   public static void HitUrl(String Url) {
		   driver.get(Url);
		   System.out.println(driver.getTitle());
	   }
}
