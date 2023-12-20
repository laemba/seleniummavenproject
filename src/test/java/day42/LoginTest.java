package day42;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void loginTest()
	{
		Loginpage2 lg=new Loginpage2(driver);
		lg.setUsername();
		lg.enterPassword();
		lg.clickLogin();
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	
}
