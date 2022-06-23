package selenium_learnAutomation;

import org.testng.annotations.Test;

public class ExceptedException {
 
  @Test(expectedExceptions=ArithmeticException.class)
  public void f() {
	  
	  int i=10/0;
	  System.out.println("arthimetic exception catched");
	  System.out.println("hmm");
	  System.out.println("but still am executing");
	  
  }

@Test(dependsOnMethods={"f"})
public void skip(){
	
	System.out.println("am not skipped");
	
}
}
