package day37;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptiondemo {

	public static void main(String[] args) {		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.addArguments("--headless=new");//head less execution
		//head less execution is useful for multitasking
		//execution speed is very fast
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println("I am navigated");
	}

}
