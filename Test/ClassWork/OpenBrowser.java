package ClassWork;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	
	
	
	 WebDriver driver;
	 
	
	@Before
	public void openBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void loginToEmail() throws InterruptedException {
		
		
		WebElement emailElement = driver.findElement(By.xpath("//*[@id='identifierId']"));
		emailElement.sendKeys("qatesting00567@gmail.com");
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		
	}
	
	
	/*
	 @Test
	public void openFirefoxBrowser() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.facebook.com");
		wd.manage().window().maximize();
		System.out.println(wd.getTitle());
		Thread.sleep(5000);
		wd.close();
	}
	
	
	@Test
	public void openFirefoxBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://automationpractice.itsutra.com/");

		String expecedTitle = "Home Page - Contoso University";
		Assert.assertEquals(expecedTitle, wd.getTitle());
		Thread.sleep(5000);
		wd.close();
	}
	*/

}
