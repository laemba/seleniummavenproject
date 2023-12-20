package day39;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertiondemo 
{
	String str="Welcome";
	
	@Test
	public void test()
	{
		SoftAssert softassert=new SoftAssert();		
		softassert.assertEquals(str, "abc");// false
		softassert.assertEquals(1, 1);
		System.out.println("Assertion is passed");	
		
	}
	
	

}
