package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
		
		System.out.println(slider.getLocation());//59 250
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 100, 250).perform();
	}

}
