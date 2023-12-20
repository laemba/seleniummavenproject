package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");	
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement macbook=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(desktop).build().perform();//build is for creating action and perform is used for completing the action
//		act.moveToElement(macbook).click().build().perform();
		
		//act.moveToElement(desktop).moveToElement(macbook).click().build().perform();
		act.moveToElement(desktop).moveToElement(macbook).click().perform();
		
		}

}
