package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String actual_title="OrangeHRM HR Software | OrangeHRM";
		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> winids=driver.getWindowHandles();
		
		for(String winid:winids)
		{
			String expected_title=driver.switchTo().window(winid).getTitle();
			
			if(expected_title.equals(actual_title))
			{
				driver.close();
			}
		}
		
	}

}
