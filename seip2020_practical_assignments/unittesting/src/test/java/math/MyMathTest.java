package math;

import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class MyMathTest {
	
	MyMath mymath=new MyMath();
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void test_factorial_negative() {
		thrown.expectMessage("The input number should be >0 and <12");
		mymath.factorial(-5);
	}

	@Test
	public void test_factorial_largerthan12() {
		thrown.expectMessage("The input number should be >0 and <12");
		mymath.factorial(13);
	}
	
	@Test
	public void test_isPrime_above2() {
		thrown.expectMessage("The input number should be >=2");
		mymath.isPrime(1);
	}
	
	@Test
	public void test_isPrime() {
		Assert.assertEquals(true, mymath.isPrime(7));
	}
}
