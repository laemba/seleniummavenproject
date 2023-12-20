package day28;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);//new tab
		//driver.switchTo().newWindow(WindowType.WINDOW);//new window
		driver.get("http://www.deadlinkcity.com/");
		
		
		
		
	}

}
