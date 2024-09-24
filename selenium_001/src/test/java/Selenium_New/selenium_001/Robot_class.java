package Selenium_New.selenium_001;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Robot_class extends Dynamic_code {

	public static void main(String[] args) throws AWTException {
		
		launch_browser("chrome");
		hiturl("https://www.ilovepdf.com/");
		
		driver.findElement(By.xpath("//h3[text()=\"Merge PDF\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Select PDF files\"]")).click();
		
		// "D:\document\My Resume Engg.pdf"
		
		StringSelection ss = new StringSelection("\"D:\\document\\My Resume Engg.pdf\"");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r = new Robot();
		
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
//		
//		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
