package linearsearchpkg;

public class LinearSearchClass {	
	
	public static boolean foundLinearSearch (int s, int[] intarray)
	{
		boolean found = false; 
		
		for (int i = 0; i < intarray.length; i++)
		{
			if (intarray[i] == s )
			{
				found = true; 
				break;
			}			
		}
		
		return found; 		
	}
}
