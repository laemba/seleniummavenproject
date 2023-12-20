package day20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

//Launch brower
//Navigate to url(your wish site)
//Validate title
//close browser

public class FirstTC {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String actual_title="Your Store";
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		Thread.sleep(5000);
		driver.get("https:\\demo.opencart.com");
		String expected_title=driver.getTitle();
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("Test is passed");
			
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close();
		

	}

}
