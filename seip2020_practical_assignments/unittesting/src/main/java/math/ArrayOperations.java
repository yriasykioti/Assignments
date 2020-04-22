package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import io.FileIO;

/**
 * The ArrayOperations provides simple array and math operations that serve as
 * hands-on practice on Unit Testing.
 *
 * @author kyriakisykioti
 * @version 1.0
 * @since 2020-04-21
 */

public class ArrayOperations {

	/**
	 * Reads a file that contains numbers(both primes and non primes) line by line 
	 * and returns an array only of the prime numbers found in the file.
	 * @param fileio an object of FileIO class
	 * @param filepath the path of the file that contains the numbers
	 * @param myMath an object of MyMath class
	 * @return an array of prime numbers
	 */
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		List<Integer> primeNumbers = new ArrayList<>();
		int[] numbersoffile = fileIo.readFile(filepath);
		for (int i = 0; i < numbersoffile.length; i++) {
			if (myMath.isPrime(numbersoffile[i])) {
				primeNumbers.add(numbersoffile[i]);
			}
		}
		// Convert a List to an array using
		return primeNumbers.stream().mapToInt(i -> i).toArray();
	}

}
