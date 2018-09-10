

public class Carmstrong {
	
	
	public boolean isArmstrong(int num) 
	{
		boolean armstrong = false; 	
		int result;
		
		int n = num; 
		int temp = n; 
		
		int r;
		
		int sum = 0; 
		
		while (n > 0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r; 
		}
		
		if (temp == sum)
		{
			armstrong = true;
		}
		else 
		{
			armstrong = false;
		}
		
		return armstrong;
	}

}
