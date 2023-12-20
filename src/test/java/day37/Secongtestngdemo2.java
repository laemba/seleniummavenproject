package day37;

import org.testng.annotations.Test;

/*
 * Open application
 * Login
 * Logout
 */
public class Secongtestngdemo2 
{
	@Test(priority=10)
	void openApp()
	{
		System.out.println("Opening the application");
	}
	
	@Test(priority=20)
	void testLogin()
	{
		System.out.println("Login to the application");
	}
	
	@Test(priority=50)
	void closeApp()
	{
		System.out.println("Logout application");
	}
	
}
