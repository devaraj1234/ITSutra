package TestCalculator;

import org.junit.Assert;
import org.junit.Test;

import CalculatorProject.Calculator;

public class TestCalculator {
	
	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		int result = c.add(2, 5);
		Assert.assertEquals(7, result);
	}
	
	@Test
	public void testSub() {
		int result = c.sub(10, 5);
		Assert.assertEquals(5, result);
	}
	
	@Test
	public void testMultiply() {
		int result = c.multiply(13, 3);
		Assert.assertEquals(39, result);
	}
	
	@Test
	public void testDivide() {
		int result = c.divide(40, 10);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void testNumbers() {
		int[] arrayNumbers = {30, 40, 50, 60};
		boolean result = c.valuePresent(arrayNumbers, 50);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testNumber() {
		int[] arrayNumbers = {30, 40, 50, 60};
		boolean result = c.valuePresent(arrayNumbers, 31);
		Assert.assertEquals(false, result);
	}
}
