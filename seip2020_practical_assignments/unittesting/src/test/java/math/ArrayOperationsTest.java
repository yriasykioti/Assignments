package math;

import org.junit.Test;
import org.junit.Assert;
import io.FileIO;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

	ArrayOperations arop = new ArrayOperations();
	public static String resourcesPath = "src/test/resources/";

	@Test
	public void test_findPrimesInFile_Mocking() {
		MyMath mymath = mock(MyMath.class);

		when(mymath.isPrime(15)).thenReturn(false);
		when(mymath.isPrime(7)).thenReturn(true);
		when(mymath.isPrime(8)).thenReturn(false);
		when(mymath.isPrime(5)).thenReturn(true);
		when(mymath.isPrime(9)).thenReturn(false);
		when(mymath.isPrime(17)).thenReturn(true);
		when(mymath.isPrime(26)).thenReturn(false);
		when(mymath.isPrime(29)).thenReturn(true);

		String validInputFilepath = resourcesPath.concat("numbers.txt");
		int[] validnumbers = { 15, 7, 8, 5, 9, 17, 26, 29 };

		FileIO fileio = mock(FileIO.class);
		when(fileio.readFile(validInputFilepath)).thenReturn(validnumbers);

		String primeFilePath = resourcesPath.concat("numbers.txt");

		Assert.assertArrayEquals(new int[] { 7, 5, 17, 29 }, arop.findPrimesInFile(fileio, primeFilePath, mymath));

	}

}
