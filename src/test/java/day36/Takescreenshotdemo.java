package day36;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotdemo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		File targetloc=new File(System.getProperty("user.dir")+"\\screenshots\\amz.png");
//		FileUtils.copyFile(source, targetloc);	
		
		
		WebElement element=driver.findElement(By.xpath("xx"));
		File source=element.getScreenshotAs(OutputType.FILE);
		File targetloc=new File(System.getProperty("user.dir")+"\\screenshots\\amz.png");
		FileUtils.copyFile(source, targetloc);

	}

}
