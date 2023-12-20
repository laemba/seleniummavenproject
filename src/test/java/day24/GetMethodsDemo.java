package day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current url of the page:"+currenturl);
		Thread.sleep(3000);
	//	String pagesource=driver.getPageSource();
	//	System.out.println("Pagesource:"+pagesource);
		String winid=driver.getWindowHandle();
		System.out.println("Windowid:"+winid);//window id is randomly chagning
				
		//Set<String> ids=driver.getWindowHandles();
		

	}

}
