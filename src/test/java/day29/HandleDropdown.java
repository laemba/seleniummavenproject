package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
		driver.get("https://testautomationpractice.blogspot.com/");		
		WebElement drpcountryele=driver.findElement(By.id("country"));		
		Select country=new Select(drpcountryele);			
		
	//	country.selectByVisibleText("Canada");
	//	country.selectByValue("australia");
	//	country.selectByIndex(2);		
		List<WebElement> options=country.getOptions();		
		System.out.println("Size of the drpdownlist :"+options.size());	
		
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//			
//		}		
		for(WebElement option:options)
		{
			String actual=option.getText();
			
			if(actual.equals("Canada"))
			{
				option.click();
			}
		}
				
	}

}
