package day26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelmentsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			String url=link.getAttribute("href");
			System.out.println(url);
							
		}
		
		
		
		

	}

}
