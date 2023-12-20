package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch the browser
//Maximize the browser
//wait
//Navigate to url(demoblaze.com)
//Click on Login(User should be registered)
//Enter Username
//Enter Password
//Click on Login button
//wait
//Validate logout/Welcome user button 


public class LoginTest2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("lauch the broswer");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/index.html");	
		driver.findElement(By.id("login2")).click();
		Thread.sleep(5000);
//		WebElement login_link=driver.findElement(By.id("login2"));
//		login_link.click();
		driver.findElement(By.id("loginusername")).click();
		driver.findElement(By.id("loginusername")).sendKeys("emba");
		driver.findElement(By.id("loginpassword")).click();
		driver.findElement(By.id("loginpassword")).sendKeys("123");
		System.out.println("Click on login");
		driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
		System.out.println("clicked on login successfully");
		Thread.sleep(5000);		
		
		String actual_user="Welcome emba";
		WebElement user=driver.findElement(By.id("nameofuser"));
		String nameofuser=user.getText();
		
		if(nameofuser.equals(actual_user))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close();
		
		
		
	}

}
