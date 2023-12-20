package day38.pack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tc01 {

	//@BeforeTest- which is executed everytime before Test classes are executed in the suite
	//@AfterTest - which is exeucted everytime after test classes are executed in the suite
	
	//@BeforeSuite
	//@AfterSuite
	
	//Suite>Test>Class>Method
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	void afterSuite()
	{
		System.out.println("After suite");
	}
	
	@Test(enabled=false)// this method will be skipped
	void testLogin1()
	{
		System.out.println("Login to the application1");
	}
	
	@Test(priority=20)
	void testLogin2()
	{
		System.out.println("Login to the application2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	
}
