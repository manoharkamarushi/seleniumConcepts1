package reportNG;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reportNG_Sample {
	
  @Test(dependsOnMethods="f2")
  public void f1() {
	  System.out.println("from f1");
	  Reporter.log("from f1",true);
  }
  
  @Test(priority=0)
  public void f2() {
	  System.out.println("from f2");
	  Reporter.log("from f2",true);
	  Assert.assertTrue(false);
  }
}
