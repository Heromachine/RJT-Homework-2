import java.util.*;

public class FactorialNumberMain {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner (System.in); 
		
		int n, i; 
		int fact = 1; 
		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++ )
		{
			fact = fact * i; 
		}
			
		System.out.print("Factorial of "+ n +" is " + fact);
	}

}
