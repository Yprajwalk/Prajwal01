package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hiturl("https://eudyogaadhaar.org/");
	//	type_of_organisation
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(4000);
		
		WebElement organization = driver.findElement(By.cssSelector("select#type_of_organisation"));
		organization.click();
		
	    Select select = new Select(organization);
        select.selectByVisibleText("Trust");
       // System.out.println("done");

        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(4000);
        
        WebElement activity = driver.findElement(By.xpath("(//select[@class=\"form-control\"])[9]"));
        activity.click();
        Select sl = new Select(activity);
        sl.selectByVisibleText("Traders");
        
        
        
	}

}
