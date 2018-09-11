package insertionsortpkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {
	@Test
	public void insertionSort()
	{
		InsertionSortClass ISC = new InsertionSortClass();
		int input[] = {9, 3, 7, 2, 1};
		int expected[] = {1, 2, 3, 7, 9};
		int result[] = ISC.insertionsort(input);
		
		assertEquals(result, expected);
		
	}
}
