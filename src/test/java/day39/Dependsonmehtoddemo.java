package day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmehtoddemo {

	@Test(priority = 1)
	public void launchbrowser()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test(priority=2, dependsOnMethods ={"launchbrowser"})
	public void navigate()
	{
		System.out.println("navigate to url");
	}
	
	
}
