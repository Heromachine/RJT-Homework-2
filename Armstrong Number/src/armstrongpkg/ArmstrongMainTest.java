package armstrongpkg;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class ArmstrongMainTest {


	@Test	
	public void armstrongTestTrue()
	{
		ArmstrongClass AC = new ArmstrongClass();
		int input = 371;
		
		boolean expected = true;
		
		boolean result = AC.isArmstrong(input); 
		
		assertEquals(expected, result); 
		
		
	}

	@Test	
	public void armstrongTestFalse()
	{
		ArmstrongClass AC = new ArmstrongClass();
		int input = 55;
		
		boolean expected = false;
		
		boolean result = AC.isArmstrong(input); 
		
		assertEquals(expected, result); 		
		
	}


		
		
		
	

}
