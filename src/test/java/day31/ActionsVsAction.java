package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");	
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement macbook=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Action desk=act.moveToElement(desktop).build();
		Action mac=act.moveToElement(macbook).build();
		
		desk.perform();
		mac.perform();
		macbook.click();
				
		}

}
