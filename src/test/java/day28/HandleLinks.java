package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.manage().window().maximize();
		
		obj.get("https://testautomationpractice.blogspot.com/");
		obj.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("testing");
		obj.findElement(By.className("wikipedia-search-button")).click();
		
		List<WebElement>links=obj.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			link.click();		
			
		}

	}

}
