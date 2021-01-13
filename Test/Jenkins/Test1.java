package Jenkins;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeMethod
	public void beforeTest() {
		System.out.println("before test");
	}

	@Test(groups = "regression")
	public void test1() {
		System.out.println("Running from t1.xml in resorces folder");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("After Test");
	}

}
