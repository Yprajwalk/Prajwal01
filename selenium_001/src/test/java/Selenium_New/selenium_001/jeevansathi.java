package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class jeevansathi extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		 launch_browser("chrome");
		 hiturl("https://www.jeevansathi.com/");
	
		WebElement AboutUs = driver.findElement(By.linkText("About Us"));
		AboutUs.click();
		
            take_screenshot("AboutUs");
            Thread.sleep(4000);
            
        back();
        take_screenshot("After Going Back to webpage");
        forward();
        take_screenshot("after going forward to webpage");
        
        
            
	}

}
