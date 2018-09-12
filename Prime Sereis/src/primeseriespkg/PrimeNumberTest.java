package primeseriespkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@Test
	void primeNumberTest() {
		PrimeNumber PN = new PrimeNumber();
		int input = 17;
		boolean expected = true;
		boolean result = PN.isPrime(input);
		assertEquals(expected, result);
		
	}

}
