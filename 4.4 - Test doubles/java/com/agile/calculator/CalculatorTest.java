////package com.agile.calculator;
////
////import static org.junit.Assert.*;
////
////import org.junit.Test;
////
////import junit.framework.Assert;
////
////public class CalculatorTest {
////	
////	
////
////	@Test
////	public void subtractionTest(){
//////		Setup
////		Calculator calc = new Calculator();
////		String testNumbers = "10,7";
////		
////
//////		Act
////		int result = calc.subtract(testNumbers);
////				
//////		Assert
////		assertEquals(3, result);
////				
////	}
////	
////	@Test
////	public void multiplyTest(){
//////		Setup
////		Calculator calc = new Calculator();
////		String testNumbers = "10,7";
////		
////		
//////		Act
////		int result = calc.multiply(testNumbers);
////		
//////		Assert
////		assertEquals(70, result);
////		
////	}
////	
////	@Test
////	public void divideTest(){
//////		Setup
////		Calculator calc = new Calculator();
////		String testNumbers = "21,7";
////		
////		
//////		Act
////		int result = calc.divide(testNumbers);
////		
//////		Assert
////		assertEquals(3, result);
////		
////	}
////	
////	@Test(expected = ArithmeticException.class)
////	public void divideByZeroTest(){
//////		Setup
////		Calculator calc = new Calculator();
////		String testNumbers = "21,0";
////		
////		
//////		Act
////		int result = calc.divide(testNumbers);
////	}
////	
////	@Test
////	public void subtractionWithLetterTest(){
//////		Setup
////		Calculator calc = new Calculator();
////		String testNumbers = "20,a";
////		
////		
//////		Act
////		int result = calc.subtract(testNumbers);
////		
//////		Assert
////		assertEquals(-9999, result);
////	}
////}
//
//package com.agile.calculator;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.agile.calculator.Calculator;
//
//public class CalculatorTest {
//
//	private Calculator calculator;
//	
//	@Before
//	public void setUp() {
//		calculator = new Calculator();
//	}
//	
//	@After
//	public void tearDown() {
//		calculator = null;
//	}
//	
//
//	@Test
//	public void subtractTest() {
//		int expected = 2;
//		int actual = calculator.subtract("5,3");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	public void subtractByNegative() {
//		int expected = -8;
//		int actual = calculator.subtract("-5,3");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	public void subtractByMiddleNumbers() {
//		int expected = 2;
//		int actual = calculator.subtract("4,2");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	public void divide() {
//		int expected = 5;
//		int actual = calculator.divide("10,2");
//		assertEquals(expected, actual);
//	}
//	@Test
//	public void divideByNegative() {
//		int expected = -5;
//		int actual = calculator.divide("10,-2");
//		assertEquals(expected, actual);
//	}
//	@Test
//	public void multiplySmallNumber() {
//		int expected = 50;
//		int actual = calculator.multiply("25,2");
//		assertEquals(expected, actual);
//	}
//	@Test
//	public void multiplyBigNumber() {
////		Arrange
//		int expected = 600;
//		
////		Act
//		int actual = calculator.multiply("150,4");
//		
////		Assert
//		assertEquals(expected, actual);
//	}
//	
//	@Test(expected = java.lang.ArithmeticException.class)
//	public void dividewithsomeexception() {
//		calculator.divide("10,0");
//	}
//
//}
//

package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.agile.calculator.Calculator;
import com.agile.utils.Utils;

public class CalculatorTest {

	private Calculator calculator;

	@Test
	public void subtractTest() {
		calculator = new Calculator();
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract2Test() {
		calculator = new Calculator();
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3Test() {
		calculator = new Calculator();
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide() {
		calculator = new Calculator();
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divide2() {
		calculator = new Calculator();
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply() {
		calculator = new Calculator();
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply2() {
		calculator = new Calculator();
		int expected = 600;
		int actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator = new Calculator();
		calculator.divide("10,0");
	}
	
	
	@Test
	public void validSeperatorTest() {
		char expected = '+';
		char actual = Utils.validSeperator("1+5");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void multiplyWithNoSeperator() {
		calculator = new Calculator();
		int expected = -9999;
		int actual = calculator.multiply("150*5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void subtractWithNonNumeric() {
		calculator = new Calculator();
		int expected = -9999;
		int actual = calculator.subtract("a,b");
		assertEquals(expected, actual);
	}
	@Test
	public void divideWithNonNumeric() {
		calculator = new Calculator();
		int expected = -9999;
		int actual = calculator.divide("a,b");
		assertEquals(expected, actual);
	}
	@Test
	public void divideWithNoComma() {
		calculator = new Calculator();
		int expected = -9999;
		int actual = calculator.divide("a/b");
		assertEquals(expected, actual);
	}

	

	@Test(expected = InterruptedException.class)
	public void validSeperatorExceptionCheck() {
		Utils.validSeperator("1+5");
		Utils.validSeperator("1+5");
		Utils.validSeperator("1+5");
		
	}
	
}

