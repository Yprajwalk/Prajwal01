package Selenium_New.selenium_001;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollPage {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jeevansathi.com/");
        System.out.println("Get Title : "+driver.getTitle());
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)"); //scrollBy certain offset
        Thread.sleep(3000);
        
        
        js.executeScript("window.scrollBy(0,-700)");
        Thread.sleep(3000);
        
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scroll direct on bottom
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("About Us")).click();
       
        //for backward
        js.executeScript("window.history.back()");
        System.out.println("back: "+driver.getTitle());
       
        //for forward
        js.executeScript("window.history.forward()");
        System.out.println("forward: "+driver.getTitle());
        Thread.sleep(2000);
        
        // for refresh
        js.executeScript("window.history.go(0)");
        System.out.println("refresh: ");
       
        driver.close();
        
        
        
		
	}

}
