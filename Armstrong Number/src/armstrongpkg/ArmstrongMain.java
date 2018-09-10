package armstrongpkg;
import java.util.*;


public class ArmstrongMain {

	public static void main(String[] args) 
	{
		ArmstrongClass AS = new ArmstrongClass();
		
		Scanner sc = new Scanner (System.in); 
		
		int n;		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		
		
		if (AS.isArmstrong(n))
		{
			System.out.print("IS ARMSTRONG");
		}
		else 
		{
			System.out.println("NOT ARMTRONG");
		}
		
		
	}

}
