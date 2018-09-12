package primeseriespkg;

import java.util.Scanner;

public class PrimeSeriesMain 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Range: ");
		int num = sc.nextInt();
		
		PrimeNumber PN = new PrimeNumber();
		if (PN.isPrime(num))
		{
			System.out.println(num + "IS PRIME");
		}
		else 
			System.out.println(num + "IS NOT PRIME");
			
	}
		
		
}
