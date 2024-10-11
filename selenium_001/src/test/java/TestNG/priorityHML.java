package TestNG;

import org.testng.annotations.Test;

public class priorityHML {
  @Test(groups = {"high"})
  public void xbc() {
	System.out.println("xbc method");  
  }
  @Test(groups = {"low"})
  public void abc() {
	  System.out.println("abc method");
  }
  @Test(groups = {"high"})
  public void jkl() {
	  System.out.println("jkl method");
  }
  @Test(groups = {"medium"})
  public void ind() {
	  System.out.println("ind method");
	  
  }
 
}
