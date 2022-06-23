package Retry_Failed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer{
	int min=0,max=3;

@Override
public boolean retry(ITestResult tr) {
	
	/*
	 * 
	 * boolean retry(ITestResult result)
	Returns true if the test method has to be retried, false otherwise.
	
	*/
	
	
	if(min>=max){
		
	  System.out.println("following test is failing"+tr.getName());	
		
	  System.out.println("retrying the test count =="+(min+1));
				
		min++;
		return true;
	}
	
	return false;
}
}
