package day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo 
{
	String str="Welcome";
	
	//You have to use assertions along with control statements
	//do not alone use control statements 
	
	@Test
	public void test()
	{			
		/*if(str.equals("abc"))
		{
			Assert.assertTrue(true);
			System.out.println("Test is passed");
		}
		else
		{
			Assert.assertFalse(false);
			System.out.println("Test is failed");
		}*/
		
		Assert.assertEquals(str, "Welcome");
		
				
	}
	
	/*@Test
	public void test1 ()
	{
		if(str.equals("Welcome"))
		{
			
			System.out.println("test1 passed");
		}
	}*/

}
