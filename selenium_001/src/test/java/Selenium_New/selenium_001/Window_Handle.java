package Selenium_New.selenium_001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Window_Handle extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		hiturl("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()=\"About us\"]"));
		System.out.println("about us  : ="+AboutUs.getText());
		AboutUs.click();
		
		Set<String> window = driver.getWindowHandles();  //for capture both window id. set collection
		Iterator<String> it = window.iterator();  // for use both window .its root interface of set collection
		
		String parent_window_id = it.next(); // generating window id for switch the control
		String child_window_id = it.next();
		
		driver.switchTo().window(child_window_id); //shift the driver control on child window
		
		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		driver.navigate().back(); // for get back to privious window
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent(); 

		driver.findElement(By.xpath("//a[text()=\"Help center\"]")).click();
		System.out.println("we are on parent window");
		
		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		
	    driver.switchTo().window(parent_window_id); //for switch the driver control on parent window
	}
}
