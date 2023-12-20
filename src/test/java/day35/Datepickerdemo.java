package day35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo 
{

	public static void main(String[] args) 
	{
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("11/15/2023");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		String month="January";
		String year="2024";
		String date="1";
		
		
		
		
		
		
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();
			System.out.println(currentmonth);
			System.out.println(currentyear);			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
		
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for(WebElement dt:dates)
		{
			
			if(dt.getText().equals(date))
			{
				dt.click();
			}
		}
	}

}
