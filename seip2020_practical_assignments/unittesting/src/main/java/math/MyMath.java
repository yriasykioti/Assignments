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
	 * 
	 * @param n the number of the operation
	 * @return the result of the factorial of the number n
	 * @exception IllegalArgumentException when parameter n is a negative number or when n>12
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

	/**
	 * Checks if a number is prime or not.
	 * @param n the number to be tested if it is prime or not
	 * @return true if the number n is prime and false if the number n is not prime
	 * @exception IllegalArgumentException when parameter n is below 2
	 */

	public boolean isPrime(int n) {
		if (n < 2) {
			throw new IllegalArgumentException("The input number should be >=2");
		} else {
			boolean flag = true;
			for (int i = 2; i <= n / 2; ++i) {
				// condition for nonprime number
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}

}
