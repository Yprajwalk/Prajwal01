package TestNG;

import org.testng.annotations.Test;
//description parameter will describe the information about method
public class DescriptionParameter {
  @Test(description = "Here we using description method") //it visible in PASSED: 
  public void efg() {
	  System.out.println("efg method");
  }
  @Test
  public void cdg() {
	  System.out.println("cdg method"); 
  }
  @Test
  public void asd() {
	  System.out.println("asd method");
  }
}
