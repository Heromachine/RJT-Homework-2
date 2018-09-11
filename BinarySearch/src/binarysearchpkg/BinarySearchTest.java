package binarysearchpkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
	
	
	@Test 
	public void binarySearchTestPass()
	{
		
		BinarySearchClass BSC = new  BinarySearchClass();
		
		int inputArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int input = 7;
		boolean expected = true; 
		boolean result  = BSC.isBinarySearch(inputArray, input);
		assertEquals(expected, result); 
		
	}
	
	@Test 
	public void binarySearchTestFail()
	{
		
		BinarySearchClass BSC = new  BinarySearchClass();
		
		int inputArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int input = 11;
		boolean expected = false; 
		boolean result  = BSC.isBinarySearch(inputArray, input);
		assertEquals(expected, result); 
		
	}
}

