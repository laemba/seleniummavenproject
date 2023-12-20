package day43Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo 
{
	
	@Test(dataProvider ="testdata")
	public void logintest(String uname ,String pswd)
	{
		System.out.println("Launchbrowsr");
		System.out.println(uname);
		System.out.println(pswd);
		System.out.println("Login");
	}
	
	
	@DataProvider(name="testdata")
	public String[][] logintestdata()
	{
		String[][] data= {{"username1","password1"},{"username2","passwrod2"}};
		return data;
		
	}

}
