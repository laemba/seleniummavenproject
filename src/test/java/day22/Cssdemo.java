package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssdemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		
		//driver.findElement(By.name("q")).sendKeys("Tshirts");
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
			
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Tshirts");
		
		
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Tshirts");
		
		driver.findElement(By.cssSelector("[type=text].search-box-text")).sendKeys("Tshirts");
	}
}
