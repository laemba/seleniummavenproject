package day20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

// you need to download gecko driver to download firefox driver to launch firefox
public class Firsttest {

	
	public static void main(String[] args)
	{
		 	
	//	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "edgedriverpath");
		EdgeDriver edriver=new EdgeDriver();
		
		
		
	}
}

