package linearsearchpkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LinearSearchTest {

	@Test
	public void linearSearch()
	{
		LinearSearchClass LSC = new  LinearSearchClass();
		int inputArray[] = {9, 3, 7, 2, 1};
		int input = 3;
		boolean expected = true;
		boolean result = LSC.foundLinearSearch(input, inputArray);
		assertEquals(expected, result);		
	}
}
