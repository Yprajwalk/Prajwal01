package TestNG;

import org.testng.annotations.Test;

public class SetPriorityHMLparameter {
  @Test(groups = {"high"})
  public void bcp() {
	 System.out.println("bcp method"); 
  }
  @Test (groups = {"low"})
  public void cgt() {
	  System.out.println("cgt method"); 
  }
  @Test(groups = {"low"})
  public void ejk() {
	  System.out.println("ejk method"); 
  }
  @Test
  public void asd() {
	  System.out.println("asd method");
  }
  @Test(groups = {"low"})
  public void dgt() {
	  System.out.println("dgt method");
  }
  @Test(groups = {"high"})
  public void fgt() {
	  System.out.println("fgt method");
  }
  @Test(groups = {"high"})
  public void ggt() {
	  System.out.println("ggt method");
  }
}
