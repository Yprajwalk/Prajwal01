package TestNG;

import org.testng.annotations.Test;
//we declear 0 priority only 1 or multiple method then all method run alphabetically
//we declear priority 2or1 method. it will execute last by their priority and remaining will alphabeticall
//we declear 0,1,2,3 priority to 5methods then 0 and remaining 2 methods run alphabetically.and other will by their priority  
public class PriorityParameter {
  @Test (priority=3)
  public void akl() {
	 System.out.println("akl method"); 
  }
  @Test (priority=0)                 
  public void fap() {     
	  System.out.println("fap method"); 
  }  
  @Test (priority=1)
  public void rst() {
	  System.out.println("rst method"); 
  }
  @Test //(priority=2)
  public void est() {
	  System.out.println("est method"); 
  }
  @Test //(priority=2)
  public void ghi() {
	  System.out.println("ghi method"); 
  }
}
