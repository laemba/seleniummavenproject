package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDrpdwn {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		WebElement drpdown=driver.findElement(By.xpath("//button[contains(@class,'multiselect')]//span"));
		drpdown.click();
		//driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		//driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		List<WebElement> drplist=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		for(WebElement drpitem:drplist)
		{
			System.out.println(drpitem.getText());
		}
		

	}

}
