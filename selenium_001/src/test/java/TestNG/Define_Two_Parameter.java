package TestNG;

import org.testng.annotations.Test;

public class Define_Two_Parameter {
  @Test
  public void def() {
	  System.out.println("def method");
  }
  @Test (priority = 1 , description = "Ghi Method from Two Parameter class")
  public void ghi() {
	  System.out.println("ghi method");
  }
  @Test //(invocationCount = 3 , description = "abc method from two parameter class")
  public void abc() {
	  System.out.println("abc method");
  }
  @Test (priority = 2 , description = "Ghi Method from Two Parameter class")
  public void klm() {
	  System.out.println("klm method");
  }
}
