package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_class extends DynamicCode03 {

	public static void main(String[] args) {
		
       launch_browser("Chrome");
       hiturl("https://www.jeevansathi.com/");
//       WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
//       
//       Actions act = new Actions(driver);
//       
//       act.moveToElement(Draggable).click().build().perform();
//     System.out.println("After click on draggable :" + driver.getTitle());
//       
       
	}

}
