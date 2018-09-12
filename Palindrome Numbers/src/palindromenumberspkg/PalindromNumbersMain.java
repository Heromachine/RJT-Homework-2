package palindromenumberspkg;
import java.util.Scanner; 

public class PalindromNumbersMain {

	public static void main(String[] args)
	{
		PalindromNumbersClass PNC = new PalindromNumbersClass();
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Range: ");
		int r = sc.nextInt();		
		
		if (PNC.isPanindrom(r))
		{
			System.out.println(r + " IS PALINDROM"); 
		}
		else
		{
			System.out.println(r + " IS NOT PALINDROM"); 
		}		
	}
}
