package fibonacciseriespkg;


public class FibonacciSeriesClass {
	
	public static String makeFibSereis(int number)
	{
		int f1=0;
		int f2 =1;
		int f3= 0;
		
		String S = "1, " ;	 
		
		 for (int i=1; i < number; i++)
		 {
			 f3= f1 + f2;
			 f1 = f2;
			 f2 =f3;
			 S += (f3 + ", ");			 
		 }
		
		return S; 		
	}
}
