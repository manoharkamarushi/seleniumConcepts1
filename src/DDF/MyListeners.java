package DDF;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
			Reporter.log("test started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test Failed: "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
