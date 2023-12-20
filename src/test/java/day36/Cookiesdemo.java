package day36;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Cookie;

public class Cookiesdemo {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().deleteAllCookies();		
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies are loaded");
		}
		else
		{
			System.out.println("cookes are not loaded");
		}
		
		Set<Cookie> cookies=driver.manage().getCookies();
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+";"+cookie.getDomain()+";"+cookie.isSecure());
		}
	}

}
