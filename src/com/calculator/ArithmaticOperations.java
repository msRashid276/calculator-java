package com.calculator;

public class ArithmaticOperations  implements CalculatorService{

	@Override
	public double additionService(double a, double c) {
		double result = a+c;
		return result;
	}

	@Override
	public double substractionService(double a, double c) {
		double result = a-c;
		
		return c;
	}

}
