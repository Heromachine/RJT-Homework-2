import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) 
	{
		
		 int n, f1=0, f2 =1, f3= 0;
		 String S = "1, " ; 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the range: ");
		 
		 n = sc.nextInt();
		 
		 for (int i=1; i < n; i++)
		 {
			 f3= f1 + f2;
			 f1 = f2;
			 f2 =f3;
			 S += (f3 + ", ");
			 
		 }
		 
		 System.out.print("the seris are: " + S);
	}

}
