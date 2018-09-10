package fibonacciseriespkg;
import java.util.Scanner; 

public class FibonacciSeriesMain {

	public static void main(String[] args) 
	{		
		 int n, f1=0, f2 =1, f3= 0;
		 String S = "1, " ; 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the range: ");		 
		 n = sc.nextInt();
		 		 
		 FibonacciSeriesClass FSC = new FibonacciSeriesClass();
	 
		 System.out.print("She seris are: " + FSC.makeFibSereis(n)); 
	}
}
