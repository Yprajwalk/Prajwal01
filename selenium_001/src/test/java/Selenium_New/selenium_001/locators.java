package Selenium_New.selenium_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
		
		driver.get("https://www.flipkart.com/");
		System.out.println("current url: "+driver.getCurrentUrl());
		Thread.sleep(4000);
		
		//input[@class="Pke_EE"]
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).click(); //serchbox :- "//tagnme[@atrbute=\"atrbt value\"]"
		System.out.println("done");
		Thread.sleep(4000);
		
		WebElement ThreeDots = driver.findElement(By.cssSelector("img[class=\"-dOa_b\"]")); //tagname[attribute=\"attribute value\"]
		ThreeDots.click();
		System.out.println("done 2: " );
		
		WebElement becameAseller = driver.findElement(By.linkText("Become a Seller"));
		becameAseller.click();
		System.out.println("done 3");
		
		driver.close();

	}

}
