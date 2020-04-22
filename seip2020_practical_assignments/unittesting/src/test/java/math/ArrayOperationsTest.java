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
		FileIO fileio = mock(FileIO.class);
		
		String validInputFilepath = resourcesPath.concat("numbers_valid.txt");
		int [] validnumbers= {5, 7 , 3, 4 , 5 , 6 , 2, 91};
		                  
		when(mymath.isPrime(2)).thenReturn(true);
		when(mymath.isPrime(7)).thenReturn(true);
		when(mymath.isPrime(25)).thenReturn(false);
		when(fileio.readFile(validInputFilepath)).thenReturn(validnumbers);
		
		String primeFilePath= resourcesPath.concat("numbers.txt");
		
		
		Assert.assertArrayEquals(new int[]{7 , 5 ,17, 29}, arop.findPrimesInFile(fileio, primeFilePath, mymath));
		
		
	}

}
