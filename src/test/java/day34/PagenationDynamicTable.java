package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagenationDynamicTable {

	public static void main(String[] args) throws InterruptedException {		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.xpath("//*[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id='form-login']/div[3]/button")).click();
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		//customers main
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		//Customers sub menu
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.body.style.zoom='80%'");			
		//capture number of pages..
		//String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		//int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		// click on customer and click on customer again
		//String text="Showing 1 to 10 of 16328 (555 Pages)";
		//System.out.println(text.substring(26,36));	
		//String Numberofpage=text.substring(text.indexOf("(")+1,text.indexOf("P")-1);
		//convert the String to integer
		//int totalpages=Integer.parseInt(Numberofpage);
		for(int p=2;p<=5;p++)
		{
			WebElement page=driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()="+p+"]"));
			System.out.println(page.getText());
			js.executeScript("arguments[0].scrollIntoView();",page);
			Thread.sleep(5000);
			page.click();
			Thread.sleep(3000);			
//			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
//			
//			for(int r=1;r<=noOfRows;r++)
//			{
//				String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
//				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
//				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[5]")).getText();
//				System.out.println(customername+"     "+email+"     "+status);
//			}
		
	}
	
		

	}

}
