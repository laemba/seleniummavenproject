package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impwait {

	public static void main(String[] args) {
		//Waits 
		
		//Implicit and explicit
		//Implicit wait--One time declaration is enough
		//applicable for every statements
		//if the element identified within specified time rest of the time will be elpased
		//it will max time 10 , then throw the exception if element is not identified
		//This performance of the application during automation
		//Whenever element needed during that time itself, this implicit wait mechanisam applied
		//it depends on time
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.findElement(By.name("username")).sendKeys("Admin");	
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}

}
