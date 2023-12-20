package day28;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinkDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenlinks = 0;
		for (WebElement link : links) {

			String hrefatvalue = link.getAttribute("href");

			if (hrefatvalue == null || hrefatvalue.isEmpty()) {
				System.out.println(hrefatvalue + "Not possible to verify the link");
			}

			try {

				URL linkurl = new URL(hrefatvalue);
				HttpURLConnection connection = (HttpURLConnection) linkurl.openConnection();
				connection.connect();

				if (connection.getResponseCode() >= 400) {
					System.out.println(hrefatvalue + "==========>Broken link");
					brokenlinks++;
				} else {
					System.out.println(hrefatvalue + "==========> Not Broken link");
				}
			}

			catch (Exception e) {

				System.out.println(hrefatvalue +":"+ e.getMessage());
			}

		}
		System.out.println("Number of broken links:" + brokenlinks);
	}

}
