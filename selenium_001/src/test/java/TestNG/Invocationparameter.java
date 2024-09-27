package TestNG;

import org.testng.annotations.Test;
//InvocationCount with help of this parameter we can run method multiple time(InvocationCount=3)
//All methods run alphabetically
public class Invocationparameter {
  @Test(invocationCount = 2)
  public void thl() {
	 System.out.println("thl method"); 
  }
  @Test(invocationCount = 3)
  public void ert() {
	  System.out.println("ert3 method"); 
  }
  @Test
  public void asd() {
	  System.out.println("asd method");  
  }
  @Test(invocationCount = 2)
  public void nmn() {
	  System.out.println("nmn2 method"); 
  }
}
