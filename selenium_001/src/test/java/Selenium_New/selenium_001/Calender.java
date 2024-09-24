package Selenium_New.selenium_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Calender extends Dynamic_code {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.railyatri.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
	 WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
	 calender.click();
	 
	 WebElement date = driver.findElement(By.xpath("(//td[text()=\"27\"])[2]"));
	 date.click();
	 System.out.println("date: "+date.getText());
	 
		 
	}

}
