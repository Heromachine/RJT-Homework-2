package palindromenumberspkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromNumberTest {

	@Test
	void palindromtestFalse() {
		
		PalindromNumbersClass PNC = new  PalindromNumbersClass();
		int input = 105; 
		boolean expected  =  false;
		boolean result = PNC.isPanindrom(input);
		assertEquals(result, expected);
	}
	@Test
	void palindromtestTrue() {
		
		PalindromNumbersClass PNC = new  PalindromNumbersClass();
		int input = 101; 
		boolean expected  =  true;
		boolean result = PNC.isPanindrom(input);
		assertEquals(result, expected);		
	}
}
