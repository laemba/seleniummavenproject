package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rightclick/contextclick
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.manage().window().maximize();	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");	
		driver.switchTo().frame("iframeResult");
		WebElement doubleclickele=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions act=new Actions(driver);	
		act.doubleClick(doubleclickele).perform();
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		System.out.println(f2.getAttribute("value"));
		}

}
