package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtabledemo {

	public static void main(String[] args) {
		
		String author="";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");		
		WebElement webtable=driver.findElement(By.xpath("//table[@name='BookTable']"));
		
		//when there is singe table on webpage use tag name to find number of rows and cloums
		//other wise use specific xpath of the table to identify number of rows and colums
		
		//for specific element text
		
		WebElement book=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td[1]"));
		System.out.println(book.getText());
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(cols);
		
		for(int r=2;r<=rows;r++)
		{
			
			for(int c=1;c<=cols;c++)
			{
				
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();//its dynamic xpath
				System.out.print(value + "\t");
				
//				if(value.equals("Learn Java"))
//				{
//					author=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[2]")).getText();
//					
//				}
				
			}
			
			System.out.println();
			
		}
		
//		System.out.println();
//		System.out.println("author name "+ author);
	}

}
