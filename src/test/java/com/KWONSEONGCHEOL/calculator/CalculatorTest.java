package com.KWONSEONGCHEOL.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3));
	}

	@Test
	public void testSub() {
		assertEquals(1, calculator.sub(3,2));
	}

	@Test 
	public void testmul() {
		assertEquals(6, calculator.mul(3,2));
	}

	@Test
	public void testdiv() {
		assertEquals(2, calculator.div(4,2));
	}
}
