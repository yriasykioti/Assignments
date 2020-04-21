package math;

import org.junit.Test;
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
}
