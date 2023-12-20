package day27;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Three types of alerts
		//Normal alert,Confirmation alert and prompt alert
		//accept,dismiss,getText,sendkeys
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert=driver.switchTo().alert();
		//driver.switchTo().alert().accept();// this is also correct
		//normal alert
		
		alert.accept();
		
		//confirmation alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().dismiss();
		alert.dismiss();
		
		//customized alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String txt=alert.getText();
		System.out.println("alert text:"+ txt);
		alert.sendKeys("Selenium");
		//alert.accept();
		alert.dismiss();
		
		//driver.close();
		
		//Assignement
		//https://testautomationpractice.blogspot.com/
		//handle normal,confirm,prompt alets
		
		
		
		
		
		
		
		
	
	}

}
