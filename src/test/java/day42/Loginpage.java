package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{

	//without pagefactory
	WebDriver driver;
	
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//button[@type='submit']");
	
	public void setUsername()
	{
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("admin123");
	}
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}

	

}
