package Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}


}
