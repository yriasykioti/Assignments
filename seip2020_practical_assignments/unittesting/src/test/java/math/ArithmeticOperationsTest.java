package math;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Rule;


public class ArithmeticOperationsTest {
	
	ArithmeticOperations arop=new ArithmeticOperations();
	
	@Test (expected = ArithmeticException.class)
	public void test_divide_zero_exception() {
		arop.divide(10, 0);
	}
	
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void test_multiply_negativenumbers() {
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(-8, 7);
	}
	
	@Test
	public void test_multiply_zero() {
		thrown.expectMessage("y shouldn't be zero");
		arop.multiply(8, 0);
	}
	@Test
	public void test_multiply_integer() {
		thrown.expectMessage("The product does not fit in an Integer variable");
		arop.multiply(10000000, 100000000);
	}
	
	
	
	
}
