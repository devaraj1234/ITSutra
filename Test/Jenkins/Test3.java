package Jenkins;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {

	@BeforeMethod
	public void beforeTest() {
		System.out.println("before test");
	}

	@Test(groups = "regression")
	public void test3() {
		System.out.println("Running from t3.xml");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("After Test");
	}

}
