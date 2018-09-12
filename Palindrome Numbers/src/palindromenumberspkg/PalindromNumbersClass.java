package palindromenumberspkg;

public class PalindromNumbersClass {
	
	public static boolean isPanindrom(int number)
	{			
		int r;
		int sum = 0;
		int temp = number;
		int num = number; 
		
		while(num > 0)
		{
			r = num%10; 
			sum = (sum*10)+r;
			num = num/10;			
		}
		if (temp==sum)
		return true;
		else return false;
	}
}
