package iTtestListener;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest2 {
  @Test
  public void m1() {
//	  Assert.assertTrue(false);	
	  System.out.println("m1");
  
  }
  @Test(dependsOnMethods="m1", enabled=false)
  public void m2() {
	  System.out.println("m2");
  }
  @Test(enabled=false)
  public void m3() {
	  System.out.println("m3");
  }
  @Test(enabled=false)
  public void m4() {
	  System.out.println("m4");
  }



}
