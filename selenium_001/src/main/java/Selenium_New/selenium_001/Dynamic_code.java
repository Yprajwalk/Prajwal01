package Selenium_New.selenium_001;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_code {
	public static WebDriver driver;
	//static Actions act = new Actions(driver);
	
	public static void launch_browser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Launched Browser is: " +browser);
	}

	//For Hit URL
	public static void hiturl(String url) {
		driver.get(url);
		System.out.println("Url Title: "+driver.getTitle());
	}

	//ForScreenshot
	public static void take_screenshot(String screenshot_name) throws Throwable  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File Source1 = ts.getScreenshotAs(OutputType.FILE);
        File target1 = new File("./GReport/"+screenshot_name+".png");
		FileHandler.copy(Source1, target1);
	}
	
	//Screenshot Using ProjectPath
	public static void ScreenshotFromPath(String screenshot_Name) throws Throwable {
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts2.getScreenshotAs(OutputType.FILE);
	    File target2 = new File(projectpath+"\\Evidences\\"+screenshot_Name+".png");
		FileHandler.copy(Source2, target2);
	}
	
	//JavaScriptExecutor interface
	//1 Refresh Method WORKED
	public static void refresh() {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.history.go(0)");
	}
	
	//2 for go to forward on webpage WORKED
	    public static void forward() {
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("window.history.forward()");
		}
		
	//3 for go to backward on webpage WORKED
		public static void back() {
			JavascriptExecutor js4 = (JavascriptExecutor) driver; 
			js4.executeScript("window.history.back()");
		}
		
	//4 for scroll page to bottom
		public static void ScrollToBottom() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
	//5.To scroll webpage by certain offset
		public static void ScrollByOffset(int x, int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.scrollBy" + "("+ x + ","+ y + ")"); 
			}
}
	/*	
	Action Class
		//1 To enter text
		public static void enter_text(WebElement webelement, String text) {
		    act.moveToElement(webelement).click().sendKeys(text).build().perform();
		}
		
		//2 To Copy text
		public static void Select_Copy_text() {
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		}
		
		//3 To right click
		public static void right_click(WebElement element) {
	     act.contextClick(element).build().perform();
		
		}
		//4 for double click
        public static void double_click(WebElement wb) {
        act.doubleClick(wb).build().perform();
      }
        
      //5 To Drag and Drop 
    	public static void DragAndDrop(WebElement Source,WebElement Target) {
    		 act.dragAndDrop(Source, Target).build().perform();
       }

    	//6 for moving slider by offset
   public static void drag_n_drop_by_offsets(WebElement element1, int x, int y) {
        act.moveToElement(element1).dragAndDropBy(element1, x, y).build().perform();
   }  	
    
      //7 switch to frame
   public static void Switch_to_frame(WebElement element2) {
            driver.switchTo().frame(element2);
   }   	
    	
    //8 To get back to window
 	public static void Back_to_window() {
        driver.switchTo().defaultContent();
 	}
 	
 	//9 page down
      public static void Pagedown() {
 		act.keyDown(Keys.PAGE_DOWN).build().perform();
 	}
 	
    //10 To page up
      public static void Pageup() {
	act.keyDown(Keys.PAGE_UP).build().perform();
      }	
}

*/