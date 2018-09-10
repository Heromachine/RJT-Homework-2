package binarysearchpkg;
import java.util.Scanner;
import java.util.Scanner; 

public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchClass BSC = new BinarySearchClass();
		int n;
		int intarray[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Seach Number: ");
		 n = sc.nextInt();
		 
		 if (BSC.isBinarySearch(intarray, n))
		 {
			 System.out.println("FOUND: " + n);
		 }
		 else 
		 {
			 System.out.println("NOT FOUND: " + n);
		 }				 
	}
}

