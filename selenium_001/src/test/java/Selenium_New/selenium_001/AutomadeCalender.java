package Selenium_New.selenium_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomadeCalender extends Dynamic_code {

	public static void main(String[] args) {
		
		launch_browser("chrome");
        hiturl("https://www.goibibo.com/");
        
        driver.findElement(By.cssSelector("span.logSprite.icClose")).click();
        
       WebElement calender = driver.findElement(By.xpath("(//div[@class=\"sc-12foipm-2 eTBlJr fswFld \"])[3]"));
      calender.click();
      
      //driver.findElement(By.xpath("(//p[text()=\"26\"])[1]")).click();
      
      int date = 15;
      while(true) {
    	  
    	    String month_year = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[2]")).getText();
    	  System.out.println("Month And Year: "+month_year);
    	  
    	  if(!(month_year.equalsIgnoreCase("December 2024"))) {
    		  driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
    	  }else {
    		  break;
    	  }
     }
      driver.findElement(By.xpath("(//p[text()=\"17\"])[2]")).click();
      System.out.println("Today Is : "+calender.getText());
      
       
        
		
		
		
		
	}

}
