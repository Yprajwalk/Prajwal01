package Selenium_New.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;

public class ReportGenerate extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		// 3 classes are responsible to generate the report
		//1.ExtentSparkReport ,2.ExtentReport ,3.ExtentTest we create object of all thease.
		
       String projectpath = System.getProperty("user.dir");
       System.out.println(projectpath);
       
       //ExtentSparkReport using we can set name,title and theme to report for look good
       ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\reports\\report1");
        
       report.config().setTheme(Theme.DARK);
       report.config().setDocumentTitle("Automation FT Report");
       report.config().setReportName("Function Testing Report");
       
       //ExtentReport using for which system info like our designation name which browser and window we use 
       ExtentReports e = new ExtentReports();
       e.attachReporter(report); // use for connection with ExtentSparkReporter class
       
       e.setSystemInfo("OS","Window" );
       e.setSystemInfo("Browser", "Chrome");
       e.setSystemInfo("QA", "Prajwal k");
       
       //ExtentTest use for which testing we are doing
       ExtentTest test = e.createTest("Login Functionality");
       test.log(Status.INFO, "Chrome Browser Launch");
       test.addScreenCaptureFromPath(projectpath +"\\TestingReports\\EnterUserPassword.png");
       
       launch_browser("chrome");
       hiturl("https://practicetestautomation.com/practice-test-login/");
     
      
       Thread.sleep(5000);
    //   test.addScreenCaptureFromPath(projectpath +"\\ReportScreenshot\\FT_Hit_Url.png") ;
       
       driver.findElement(By.cssSelector("input#username")).sendKeys("PrajwalK1@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input#password")).sendKeys("Y@prajwal12");
      take_screenshot("usernamepss");
       
      
      
       
       e.flush();
     
       

	}

}
