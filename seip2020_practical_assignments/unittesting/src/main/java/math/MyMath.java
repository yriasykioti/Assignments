package math;

/**
 * The MathOperations provides simple arithmetic operations that serve as
 * hands-on practice on Unit Testing.
 *
 * @author kyriakisykioti
 * @version 1.0
 * @since 2020-04-20
 */

public class MyMath {

	/**
	 * Performs the basic arithmetic operation of factorial
	 * @param n the number of the operation
	 * @return the result of the factorial of the number n
	 * @exception IllegalArgumentException
	 *                when parameter n is a negative number or when n>12
	 */
	public int factorial(int n) {
		int factorial = 1;
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("The input number should be >0 and <12");
		} else {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}
	}

}
