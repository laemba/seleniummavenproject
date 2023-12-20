package day33;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleScrollingJS {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//coverting the driver object to js object
		//scroll down to specific element
		//WebElement element=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//scroll down till the end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}
