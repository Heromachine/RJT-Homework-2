package linearsearchpkg;
import java.util.Scanner; 
public class LinearSearchMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int intarray[] = {9, 3, 7, 2, 1};
		int n;
		
		System.out.println("CURRENT ARRAY: ");
		for (int i = 0; i <intarray.length; i++ )
		{
			System.out.print(intarray[i]+ ", ");
		}
		
		LinearSearchClass LSC = new LinearSearchClass ();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number to Search: ");
		 
		n = sc.nextInt();
		 
		if ( LSC.foundLinearSearch(n, intarray))
		{
			System.out.println("Found: " + n);			 
		}
		else 
		{
			System.out.println("Not Found: " + n);
		}		 
	}	
}
