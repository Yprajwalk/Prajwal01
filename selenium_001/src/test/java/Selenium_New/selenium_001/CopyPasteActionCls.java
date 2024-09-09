package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteActionCls extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/");
		
		Actions act = new Actions(driver);
		
		WebElement gmail = driver.findElement(By.cssSelector("input#email"));
		Thread.sleep(2000);
		 
		act.moveToElement(gmail).click().sendKeys("Khobragade.prajwal123@gmail.com");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();//keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		 //Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		// Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		 //Thread.sleep(2000);
		 
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//Thread.sleep(2000);
		
	    WebElement eye = driver.findElement(By.cssSelector("div#eye"));
		act.moveToElement(eye).click().build().perform();
		
		
		
		
		

	}

}
