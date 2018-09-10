package factorialnumberpkg;

public class FactorialNumberClass {
	
	public static int makeFactorialNumber(int number) 
	{
		int fact = 1; 
		for (int i = 1; i <= number; i++ )
		{
			fact = fact * i; 
		}
		
		return fact;
	}

}
