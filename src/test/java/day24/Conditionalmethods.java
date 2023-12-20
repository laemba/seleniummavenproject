package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) throws InterruptedException {
		//isDisplayed
		//isEnabled
		//isSelected
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		
//		WebElement image=driver.findElement(By.xpath("//div[@class='header-logo']"));
//		boolean bo=image.isDisplayed();
//		System.out.println(bo);
		
//		System.out.println(driver.findElement(By.xpath("//div[@class='header-logo']")).isDisplayed());
		
		
//		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		boolean bo=searchbox.isEnabled();
//		System.out.println(bo);
//		searchbox.sendKeys("Tshirt");
		
		driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']")).click();
		WebElement maleradio=driver.findElement(By.id("gender-male"));
		maleradio.click();
		System.out.println(maleradio.isSelected());	
		
		WebElement femaleradio=driver.findElement(By.id("gender-female"));
		femaleradio.click();
		System.out.println(femaleradio.isSelected());
		
		System.out.println(maleradio.isSelected());		
	
		driver.close();
			
		
	}

}
