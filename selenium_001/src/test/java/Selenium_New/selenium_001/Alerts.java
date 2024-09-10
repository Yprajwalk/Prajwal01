package Selenium_New.selenium_001;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Dynamic_code {

	public static void main(String[] args) throws Throwable {

           launch_browser("chrome"); 
           hiturl("https://demo.automationtesting.in/Alerts.html");
           
           // ok = accept();
           // cancle = dismiss();
           // text = sendkeys();
           // getTitle();
           
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        Alert Simple_Alert = driver.switchTo().alert();
        Thread.sleep(3000);
        
        Simple_Alert.accept();
        
        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(3000);
    
	    Alert okCancleAlert = driver.switchTo().alert();
	    Thread.sleep(3000);
	    
	    okCancleAlert.dismiss();
	    //okCancleAlert.accept();
	  
	    WebElement confirm_Message = driver.findElement(By.cssSelector("p#demo"));
        System.out.println(""+ confirm_Message.getText());
        
        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn.btn-info")).click();
        Thread.sleep(3000);
        
        //p#demo1
        Alert PromptAlert = driver.switchTo().alert();
        Thread.sleep(3000);
        PromptAlert.sendKeys("Automation Batch Of STP");
        PromptAlert.accept();
        Thread.sleep(3000);
        
        WebElement TextBox = driver.findElement(By.cssSelector("p#demo1"));
        System.out.println(""+TextBox.getText());
        
        
        
	}

}
