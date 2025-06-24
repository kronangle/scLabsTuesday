package com.agile.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	

	@Test
	public void subtractionTest(){
//		Setup
		Calculator calc = new Calculator();
		String testNumbers = "10,7";
		

//		Act
		int result = calc.subtract(testNumbers);
				
//		Assert
		assertEquals(3, result);
				
	}
	
	@Test
	public void multiplyTest(){
//		Setup
		Calculator calc = new Calculator();
		String testNumbers = "10,7";
		
		
//		Act
		int result = calc.multiply(testNumbers);
		
//		Assert
		assertEquals(70, result);
		
	}
	
	@Test
	public void divideTest(){
//		Setup
		Calculator calc = new Calculator();
		String testNumbers = "21,7";
		
		
//		Act
		int result = calc.divide(testNumbers);
		
//		Assert
		assertEquals(3, result);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideByZeroTest(){
//		Setup
		Calculator calc = new Calculator();
		String testNumbers = "21,0";
		
		
//		Act
		int result = calc.divide(testNumbers);
	}
	
	@Test
	public void subtractionWithLetterTest(){
//		Setup
		Calculator calc = new Calculator();
		String testNumbers = "20,a";
		
		
//		Act
		int result = calc.subtract(testNumbers);
		
//		Assert
		assertEquals(-9999, result);
	}
}
