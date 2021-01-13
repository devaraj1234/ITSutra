package Assignment;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePandaSearch {

	WebDriver driver;

	@Before
	public void startBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test
	public void search() throws InterruptedException {

		WebElement wb = driver.findElement(By.xpath("//*[@name='q']"));
		wb.sendKeys("panda");
		wb.submit();
		Thread.sleep(5000);

		int noOfLinkWithPipe = 0;

		By xpathSelector = By.xpath("//span[contains(text(), '|')]");
		List<WebElement> links = driver.findElements(xpathSelector);
		Iterator<WebElement> itr = links.iterator();

		while (itr.hasNext()) {
			noOfLinkWithPipe++;
			System.out.println(itr.next().getText());
		}
		
		List<WebElement> pandaLink = driver.findElements(By.tagName("a"));
		for (int i = 0; i < pandaLink.size(); i++) {
			String linkText = pandaLink.get(i).getText();
			if (linkText.contains("|")) {
				noOfLinkWithPipe++;
				System.out.println(linkText);
			}
		}
		
		Assert.assertEquals(5, noOfLinkWithPipe);
	}
}
