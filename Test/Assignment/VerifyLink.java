package Assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLink {

	WebDriver driver;

	@Before
	public void startBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://automationpractice.itsutra.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test
	public void verifyLink() throws InterruptedException {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i=0; i<links.size(); i++) {
			String urlAddress = links.get(i).getAttribute("href");
			System.out.println(urlAddress);

			try {
				HttpURLConnection httpConnection = (HttpURLConnection) new URL(urlAddress).openConnection();
				int responseCode = httpConnection.getResponseCode();
				System.out.println(responseCode);
				if (responseCode < 400) {
					System.out.println("Working Link : :" + urlAddress);
				} else {
					System.out.println("Broken Link : :" + urlAddress);
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
