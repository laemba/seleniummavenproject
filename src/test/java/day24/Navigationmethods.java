package day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
