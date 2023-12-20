package day38;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day38.pack.Tc02;

public class Annotationsdemo
{
	//@BeforeMetho-- Which is executed everytime before execution of @Test annotated methods
	//@AfterMethod --Which is executee everytime after execution of @Test annotated methods

	@BeforeMethod
	void openApp()
	{
		System.out.println("Opening the application");
		
			}
	
	@Test(priority=20)
	void testLogin1()
	{
		System.out.println("Login to the application");
		Tc02 obj=new Tc02();
		
	}
	
	@Test(priority=20)
	void testLogin2()
	{
		System.out.println("Login to the application");
	}
	
	@AfterMethod
	void closeApp()
	{
		System.out.println("Logout application");
	}
	
}
