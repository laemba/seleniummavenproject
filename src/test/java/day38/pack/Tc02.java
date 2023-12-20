package day38.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc02 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}
	
	

	@Test(priority=20)
	void testLogin3()
	{
		System.out.println("Login to the application3");
	}
	
	@Test(priority=20)
	void testLogin4()
	{
		System.out.println("Login to the application4");
	}
}
