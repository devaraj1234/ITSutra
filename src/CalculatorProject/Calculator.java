package CalculatorProject;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public boolean valuePresent(int[] numbers, int a) {
		
		boolean isValuePresent = false;
		
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] == a) {
				isValuePresent = true;
			}
		}
		return isValuePresent;
		
		
//		boolean test = Arrays.asList(numbers).contains(a);
//		return test;
	}

}
