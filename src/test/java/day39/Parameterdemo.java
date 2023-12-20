package day39;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo {

	
	@Test
	@Parameters({"browser"})
	public void loginByGmail(String br)
	{
		if(br.equals("chrome"))
		{
			Assert.assertTrue(true);
			System.out.println("launch chrome");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("launch edge");
		}
		
		
	}
//	
//	@Test
//	@Parameters({"browser"})
//	public void launchEdgd(String br)	
//	{
//			
//		if(br.equals("edge"))
//		{
//			Assert.a
//			System.out.println("launch edge");
//		}
//		
//	}
//	
	
}
