package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args)
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Testing");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/center/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//*[@id='i8']/div[3]/div")).click();
		
	}

}
