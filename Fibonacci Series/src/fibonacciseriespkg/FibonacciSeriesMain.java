package fibonacciseriespkg;
import java.util.Scanner; 

public class FibonacciSeriesMain {

	public static void main(String[] args) 
	{		

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the range: ");		 
		 int n = sc.nextInt();
		 		 
		 FibonacciSeriesClass FSC = new FibonacciSeriesClass();
	 
		 System.out.print("She seris are: " + FSC.makeFibSeries(n)); 
	}
}
