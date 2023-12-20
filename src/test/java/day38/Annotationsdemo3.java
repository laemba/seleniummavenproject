package day38;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationsdemo3
{
	//@BeforeClass--which is executed before all @Test methods execution
	//@AfterClass-- which is executed after all @Test methods execution

	
	
	@Test(priority=20)
	void testLogin1()
	{
		System.out.println("Login to the application");
	}
	
	@Test(priority=20)
	void testLogin2()
	{
		System.out.println("Login to the application");
	}
	@Test(priority=20)
	void testLogin0()
	{
		System.out.println("Login to the application");
	}
	
	
}
