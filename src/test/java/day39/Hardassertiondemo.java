package day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertiondemo 
{
	String str="Welcome";
	
	@Test
	public void test()
	{
		
		Assert.assertEquals(str, "abc");// false
		Assert.assertEquals(1, 1);
		System.out.println("Assertion is passed");
		
		
	}
	
	

}
