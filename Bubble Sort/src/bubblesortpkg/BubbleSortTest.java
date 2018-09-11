package bubblesortpkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
	
	@Test
	public void bubbleSort()
	{
		BubbleSortClass BSC = new  BubbleSortClass();
		
		int input[] = {9, 3, 7, 2, 1};		
		int expected [] = {1, 2, 3, 7, 9};
		int result [] = BSC.bubblesort(input);
		
		for(Integer E: result)
		{
			System.out.print(E + ", ");
		}
		System.out.println(" ");
		for(Integer E: expected)
		{
			System.out.print(E + ", ");
		}
		
		assertEquals(result, expected);		
		
	}

}
