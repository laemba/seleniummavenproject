package day41;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;

public class MyListner implements ITestListener
{

	
	public void onTestStart(ITestResult result) {
		   System.out.println("Test started....");
		  }
	 
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test passed....");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed....");
		  }

	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test skipped....");
		  }
	 
	 public void onStart(ITestContext context) {
		 System.out.println("Tests are started....");
		  }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("Tests are finished....");
		  }
}
