import java.util.Scanner; 

public class PalindromNumbersMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Range: ");
		int r = sc.nextInt();
		
		for (int i = 0; i <= r; i++)
		{	
			int n = i; 			
			int temp = n, reverse = 0;
			
			while (temp != 0)
			{
				reverse = reverse * 10; 
				reverse = reverse + temp%10;
				temp = temp/10; 
			}
			
			if (n == reverse)
				System.out.println(n + ", "); 
		}
	}

}
