package iTtestListener;

import org.testng.annotations.Test;

public class MyTest {
  
  @Test()
  public void sample_success() {
	  
//	  System.out.println(getClass().getSimpleName());
//	  System.out.println(Thread.currentThread().getId());
	  System.out.println(Thread.currentThread().getName());
//	  System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	  System.out.println("am in success method...test1");
  }
  
  @Test(enabled=false)//(expectedExceptions=ArithmeticException.class)
  public void raiseException(){
	  int i=10/0;
	  System.out.println("arthimetic exception raised...test2");
	  
  }
  @Test(enabled=false)//(dependsOnMethods="raiseException")
  public void sample_skip(){
	  System.out.println("am in skipped method....test3");
	  
  }
  @Test(enabled=false)
  public void sample1(){
	  System.out.println("smaple1 ");
  }
@Test(enabled=false)
public void sample2(){
	
	System.out.println("sample2");
}


}
