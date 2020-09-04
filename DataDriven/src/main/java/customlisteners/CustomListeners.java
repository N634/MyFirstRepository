package customlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +" Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ " failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
