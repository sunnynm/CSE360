package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign2.OrderedIntList;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator alpha = new Calculator();
		assertNotNull(alpha);
	}

	@Test
	public void testGetTotal() {
		Calculator alpha = new Calculator();
		assertEquals(0,alpha.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator alpha = new Calculator();
		alpha.add(5);
		assertEquals(5,alpha.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator alpha = new Calculator();
		alpha.subtract(5);
		assertEquals(-5,alpha.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator alpha = new Calculator();
		alpha.add(5);
		alpha.multiply(5);
		assertEquals(25,alpha.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator alpha = new Calculator();
		alpha.add(5);
		alpha.divide(5);
		assertEquals(1,alpha.getTotal());
		alpha.divide(0);
		assertEquals(0,alpha.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator alpha = new Calculator();
		alpha.add(5);
		alpha.multiply(5);
		alpha.divide(5);
		alpha.subtract(3);
		assertEquals("0 + 5 * 5 / 5 - 3",alpha.getHistory());
	}

}
