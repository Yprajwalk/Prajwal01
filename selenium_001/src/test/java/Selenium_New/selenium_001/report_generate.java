package Selenium_New.selenium_001;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class report_generate extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		ExtentSparkReporter ex = new ExtentSparkReporter(projectpath+"\\Sreport\\reporta1");
		ex.config().setDocumentTitle("Automation Report");
		ex.config().setReportName("Amazon Report");
		ex.config().setTheme(Theme.DARK);
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(ex);
		
		ext.setSystemInfo("Testing", "Automation");
        ext.setSystemInfo("OS", "Window");
        ext.setSystemInfo("QA", "Prajwal k");
        
       ExtentTest test1 = ext.createTest("Amazone Url");
        test1.log(Status.INFO, "Hit Amazon Url");
        test1.addScreenCaptureFromPath(projectpath+"\\GReport\\Amazon_Webpage.png");
        
        ExtentTest test2 = ext.createTest("SerchBox");
        test2.log(Status.FAIL, "Click On Serchbox");
        
        ExtentTest test3 = ext.createTest("sendkeys mobiles");
        test3.log(Status.PASS, "success send keys");
        test3.addScreenCaptureFromPath(projectpath+"\\GReport\\serchproduct.png");
        
        ExtentTest test4 = ext.createTest("select option");
        test4.log(Status.SKIP, "no option selected");
        test4.addScreenCaptureFromPath(projectpath+"\\GReport\\selected_Option");
        
        launch_browser("chrome");
        hiturl("https://www.amazon.in/");
        take_screenshot("Amazone Webpage");
        
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobiles");
        take_screenshot("serch product");
        
        ext.flush();
        
        
        
        
	}

}
