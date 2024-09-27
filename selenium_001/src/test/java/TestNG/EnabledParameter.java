package TestNG;

import org.testng.annotations.Test;
// in enabled method false will not execute
public class EnabledParameter {
  @Test(enabled = false)
  public void fgt() {
	 System.out.println("fgt method"); 
  }
  @Test(enabled = true)
  public void eft() {
	  System.out.println("eft method"); 
  }
  @Test(enabled = true)
  public void bff() {
	  System.out.println("bff method"); 
  }
}
