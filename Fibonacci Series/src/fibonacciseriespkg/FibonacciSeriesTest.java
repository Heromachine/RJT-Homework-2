package fibonacciseriespkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciSeriesTest {
	
	@Test
	public void fibonacciSeries()
	{
		FibonacciSeriesClass FSC = new  FibonacciSeriesClass();
		
		int input = 10;
		String expected = "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ";
		String result = FSC.makeFibSeries(input);
		assertEquals (expected, result);
		
	}

}
