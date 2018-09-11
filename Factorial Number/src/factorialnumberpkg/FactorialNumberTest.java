package factorialnumberpkg;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialNumberTest {
	
	@Test
	public void factorialNumber()
	{
		FactorialNumberClass FNC = new  FactorialNumberClass ();
		int input = 5; 
		int expected = 120;
		int result = FNC.makeFactorialNumber(input);
		assertEquals(input, expected);
	}	

}
