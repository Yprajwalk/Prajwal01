package Selenium_New.selenium_001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicCode03 {

		public static WebDriver driver;
		static Actions act = new Actions(driver);
		
		public static void launch_browser(String browser) {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				 driver = new ChromeDriver();
				}else if(browser.equalsIgnoreCase("edge")) {
				 driver = new EdgeDriver();
				}else if(browser.equalsIgnoreCase("firefox")) {
				 driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			System.out.println("Launched Browser is: " +browser);
		}

		//For Hit URL
		public static void hiturl(String url) {
			driver.get(url);
			System.out.println(driver.getTitle());
		}
}
		