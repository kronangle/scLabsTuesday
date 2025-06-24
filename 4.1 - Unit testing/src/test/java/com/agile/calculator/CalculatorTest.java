//package com.agile.calculator;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import junit.framework.Assert;
//
//public class CalculatorTest {
//	
//	
//
//	@Test
//	public void subtractionTest(){
////		Setup
//		Calculator calc = new Calculator();
//		String testNumbers = "10,7";
//		
//
////		Act
//		int result = calc.subtract(testNumbers);
//				
////		Assert
//		assertEquals(3, result);
//				
//	}
//	
//	@Test
//	public void multiplyTest(){
////		Setup
//		Calculator calc = new Calculator();
//		String testNumbers = "10,7";
//		
//		
////		Act
//		int result = calc.multiply(testNumbers);
//		
////		Assert
//		assertEquals(70, result);
//		
//	}
//	
//	@Test
//	public void divideTest(){
////		Setup
//		Calculator calc = new Calculator();
//		String testNumbers = "21,7";
//		
//		
////		Act
//		int result = calc.divide(testNumbers);
//		
////		Assert
//		assertEquals(3, result);
//		
//	}
//	
//	@Test(expected = ArithmeticException.class)
//	public void divideByZeroTest(){
////		Setup
//		Calculator calc = new Calculator();
//		String testNumbers = "21,0";
//		
//		
////		Act
//		int result = calc.divide(testNumbers);
//	}
//	
//	@Test
//	public void subtractionWithLetterTest(){
////		Setup
//		Calculator calc = new Calculator();
//		String testNumbers = "20,a";
//		
//		
////		Act
//		int result = calc.subtract(testNumbers);
//		
////		Assert
//		assertEquals(-9999, result);
//	}
//}

package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.agile.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
		calculator = null;
	}
	

	@Test
	public void subtractTest() {
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtractByNegative() {
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtractByMiddleNumbers() {
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide() {
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divideByNegative() {
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiplySmallNumber() {
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiplyBigNumber() {
//		Arrange
		int expected = 600;
		
//		Act
		int actual = calculator.multiply("150,4");
		
//		Assert
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator.divide("10,0");
	}

}

