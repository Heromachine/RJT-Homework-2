package palindromenumberspkg;

public class PalindromNumbersClass {
	
	public static boolean isPanindrom(int number)
	{
		boolean ispal = false;
		int n = 1; 
		int temp = n;	
		int reverse = 0;
			
		while (temp != 0)
		{
			reverse = reverse * 10; 
			reverse = reverse + temp%10;
			temp = temp/10; 
		}

		if (0 == reverse)
		{
			ispal = true;
		}
		else 
		{
			ispal = false; 
		}
			return ispal; 

	}
}
