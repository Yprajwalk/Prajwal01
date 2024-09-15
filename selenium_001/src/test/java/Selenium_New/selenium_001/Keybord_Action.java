package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keybord_Action extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
         launch_browser("chrome");
         hiturl("https://www.jeevansathi.com/");
         
		Actions act = new Actions(driver);
				
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		act.moveToElement(email).click().sendKeys("prajwal12@gmail.com").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform(); //to scroll page to down
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyUp(Keys.PAGE_UP).build().perform(); // to scroll page to upside
		Thread.sleep(3000);
		act.keyUp(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyUp(Keys.PAGE_UP).build().perform();
		
		driver.close();
	}

}
