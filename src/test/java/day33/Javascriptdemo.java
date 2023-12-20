package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptdemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//When you see the exceptions like,element is not interactable,element is not intercepted
		
		WebElement name=driver.findElement(By.xpath("//*[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','testing')", name); // to send the text to input field
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id='male']"));
		js.executeScript("arguments[0].click()",radiobutton);// to click on radio button/ any button
		
		js.executeScript("document.body.style.zoom='50%'");//zoom out if <100
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='150%'");//zoom in if>100
		
		
		
	
		
	}

}
