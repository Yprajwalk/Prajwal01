package TestNG;

import org.testng.annotations.Test;
//in dependsonmethod paramter we pass any method it will execute 1st of 2nd
//which method we assing dependsonmethod parameter it will wxecute last
public class DependsOnMethdParameter {
  @Test(dependsOnMethods = {"bdf"})
  public void mfg() {
	System.out.println("mfg method");  
  }
  @Test
  public void tgg() {
	  System.out.println("tgg method");  
  }
  @Test
  public void aer() {
	  System.out.println("aer method");  
  }
  @Test
  public void bdf() {
	  System.out.println("bdf method");  
  }
  @Test
  public void klm() {
	  System.out.println("klm method");  
  }
}
