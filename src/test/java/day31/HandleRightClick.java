package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandleRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rightclick/contextclick
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");	
		driver.manage().window().maximize();		
		WebElement righclickele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copyele=driver.findElement(By.xpath("//span[text()='Copy']"));
	
		Actions act=new Actions(driver);
		act.contextClick(righclickele).perform();
		copyele.click();
		driver.switchTo().alert().accept();
		
	
		
		}

}
