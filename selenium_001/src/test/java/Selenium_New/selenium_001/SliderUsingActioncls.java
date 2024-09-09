package Selenium_New.selenium_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderUsingActioncls {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/slider/");
		System.out.println("Get title of url: "+driver.getTitle());
		
		Actions act = new Actions(driver);
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]")); //tagname[text()="text of webelement"] ex.<a>Draggable</a>"
		
//	    act.moveToElement(Draggable).click().build().perform();
//	    System.out.println("After click on draggable: "+driver.getTitle());
	   
	 // WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
	 // act.moveToElement(Themes).contextClick().build().perform(); //contextClick() use for right click
     // act.moveToElement(Themes).click().build().perform();
	
      	WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame")); //tagname.classValue
        driver.switchTo().frame(frame); // to enter in frame for move to slider
	   
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]")); //tagname[@attribute="attribute value"]
	//	act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform(); // To move slider 
		Thread.sleep(2000);
	//	act.dragAndDropBy(slider, -300, 0).perform();  //to move slider on its 1st position
		
		driver.switchTo().defaultContent(); //to switch control from frame
		
		WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		act.moveToElement(Droppable).click().perform();
		System.out.println("After click on Droppable: "+driver.getTitle());
		
		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);
		
		WebElement Drag = driver.findElement(By.cssSelector("div#draggable")); //tagname#idvalue
		WebElement Drop = driver.findElement(By.cssSelector("div#droppable")); 
		
		//act.moveToElement(Drag).clickAndHold().moveToElement(Drop).release().perform();
		//act.clickAndHold(Drag).moveToElement(Drop).release().build().perform(); // alternative way to Drag and Drop
		//act.clickAndHold(Drag).release(Drop).build().perform();
		//act.dragAndDrop(Drag, Drop).build().perform(); //one more way to drag and drop
	
		
		
	}

}
