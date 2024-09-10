package Selenium_New.selenium_001;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHM extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
         hiturl("https://demoqa.com/alerts");

                 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]")).click();
                 Thread.sleep(3000);
                 Alert simpleAlert = driver.switchTo().alert();
                 simpleAlert.accept();
                 Thread.sleep(3000);
                
                 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[2]")).click();
                 Alert alert123 = driver.switchTo().alert();
                 alert123.accept();
                 System.out.println("2 clickBox ");
              
                 
                 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]")).click();
                 Thread.sleep(3000);
                 Alert ConfirmationAlert = driver.switchTo().alert();
                 Thread.sleep(3000);
                 ConfirmationAlert.dismiss();
               //  Ok_Cancle.accept();
                 
                 Thread.sleep(3000);
                 
                 WebElement ConfrmAlert = driver.findElement(By.id("confirmResult"));
                 System.out.println("confirm:  "+ConfrmAlert.getText());
                 
                 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[4]")).click();
                 Thread.sleep(3000);
                 Alert PromptAlert = driver.switchTo().alert();
                 PromptAlert.sendKeys(" STP Batch ");
                 Thread.sleep(3000);
                 PromptAlert.accept();
                 
                 Thread.sleep(3000);
                 
                 WebElement PromptText = driver.findElement(By.id("promptResult"));
                 System.out.println("prompt:  "+PromptText.getText());
                 
              
                 
                 
	}

}
