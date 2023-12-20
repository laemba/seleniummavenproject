package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@class='YacQv']/following::textarea[1]")).sendKeys("selenium");
		
//		driver.findElement(By.xpath("//*[@class='dRYYxd']/preceding::textarea")).sendKeys("java");
//		
//		driver.findElement(By.xpath("//div[@class='a4bIc']/child::textarea")).sendKeys("python");
	}

}
