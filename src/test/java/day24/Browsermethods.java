package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
	
		//launch browser
		//navigate to url
		//click on any link which opens in new tab
		//close
		//quit		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//driver.close();
				
		WebElement hrmlink=driver.findElement(By.linkText("OrangeHRM, Inc"));
		hrmlink.click();
		Thread.sleep(10000);
			
	//	WebElement element=driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'OrangeHRM API')]"));
	
		driver.close();
		driver.quit();

	}

}
