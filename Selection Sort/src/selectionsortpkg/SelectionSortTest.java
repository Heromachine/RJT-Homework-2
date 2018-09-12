package selectionsortpkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	void test() {
		SelectionSortClass SSC = new SelectionSortClass();
		
		int intarray[] = {9, 3, 7, 2, 1};
		int expected[] = {1, 2, 3, 7, 9};
		int result [] = SSC.selectionsort(intarray);
		assertEquals(expected, result);		
	}
}
