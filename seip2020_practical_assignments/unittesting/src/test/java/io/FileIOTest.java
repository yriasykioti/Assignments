package io;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;

public class FileIOTest {

	FileIO fileio=new FileIO();
	
	public static String resourcesPath = "src/test/resources/";
	
	@Test
	public void testReadFileValidInput() {
		int[] expectedNumbers = new int[] {
				5,7,3,4,5,6,2,91};
		String validInputFilepath = resourcesPath.concat("numbers_valid.txt");
		Assert.assertArrayEquals(expectedNumbers,fileio.readFile(validInputFilepath));

	}
	
	@Test (expected = IOException.class)
	public void testReadFileContainsInvalidEntries() {
		String notvalidInputFilepath = resourcesPath.concat("numbers_invalid.txt");
		fileio.readFile(notvalidInputFilepath);
	}
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void test_readFile_nonexistingfile() {
		thrown.expectMessage("Input file does not exist");
		String nonExistingFilePath = resourcesPath.concat("file.txt");
		fileio.readFile(nonExistingFilePath);
	}
	
	@Test
	public void test_readFile_emptyfile() {
		thrown.expectMessage("Given file is empty");
		String emptyFilePath = resourcesPath.concat("emptyfile.txt");
		fileio.readFile(emptyFilePath);
		
	}
	
	

}
