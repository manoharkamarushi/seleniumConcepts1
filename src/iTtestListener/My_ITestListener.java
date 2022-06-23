package iTtestListener;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class My_ITestListener implements ITestListener{
    
 /*public void onTestStart(ITestContext tr) {
		System.out.println("Test Started");
		
	}

 public void onTestSuccess(ITestResult tr){
//	 log("............................");
//	 log("From class:"+tr.getInstanceName()); 
	 log("Test:"+tr.getName()+"---Passed");
	  
//	  log(tr.getName().toString().trim());
//	 log("className:"+tr.getTestClass());//This will print the class name in which the method is present
	  log("priority of this method is "+tr.getMethod().getPriority());// prints priority too
	  log("............................");
   }
  
public void onTestFail(ITestResult tr){
//	System.out.println("............................");
	System.out.println("Test:"+tr.getName()+"----Failed");
	System.out.println("className:"+tr.getTestClass());
	System.out.println("priority of this method is "+tr.getMethod().getPriority());
	System.out.println("............................");
}  
public void onTestSkipped(ITestResult tr){
//	System.out.println("............................");
	System.out.println("Test:"+tr.getName()+"---Skipped");
	System.out.println("className:"+tr.getTestClass());
	System.out.println("priority of this method is "+tr.getMethod().getPriority());
	System.out.println("............................");
	
}  
  public void onTestFinish(ITestResult tr){
	  
System.out.println("test finished");
	  
  }
  
  */
private void log(String methodname) {
System.out.println(methodname);
	
}
/*private void log(IClass testclass){
	System.out.println(testclass);
} */

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("on test start::"+result.getStatus());
	
}

@Override
public void onTestFailure(ITestResult result) {
	
	System.out.println("ontestfailure ::"+result.getClass().getName());
	System.out.println(result.getMethod().getMethodName());
	
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	System.out.println("on start::"+context.getName());

	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("On finish::"+context.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println();
//	 log("............................");
//	 log("From class:"+tr.getInstanceName()); 
	 log("Test success::"+result.getName());
	  
//	  log(tr.getName().toString().trim());
//	 log("className:"+tr.getTestClass());//This will print the class name in which the method is present
//	  log("priority of this method is "+result.getMethod().getPriority());// prints priority too
//	  log("............................");
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("test skipped::"+result.getName()+":"+result.getStatus());
} 
  
}
