package factorialnumberpkg;
import java.util.*;

public class FactorialNumberMain {

	public static void main(String[] args) 
	{	
		int n; 
		
		Scanner sc = new Scanner (System.in); 		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		FactorialNumberClass FNC = new  FactorialNumberClass(); 
		
		int answer = FNC.makeFactorialNumber(n);
		
		System.out.println( "Factorial of " + n + " = "+ answer );
	}
}
