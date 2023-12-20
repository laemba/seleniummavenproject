package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args)
	{		
		//findelement inclusive
		//explicit works based on condition,next it will consider time
		//you mention webdriverwait mulitple times
		//increase the performance of the application

		WebDriver driver=new ChromeDriver();
		//declaration
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ccc")));
		username.sendKeys("Admin");
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		
		
		
	}
}
