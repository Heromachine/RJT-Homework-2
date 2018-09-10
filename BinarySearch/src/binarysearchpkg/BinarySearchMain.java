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
//}
//	private static void binarySearch( int[] array,  int s)
//	{
//		 boolean found = false; 
//		 
//		 int first = 0;
//		 int last = array.length - 1;
//		 int middle = (first + last)/2;
//		 
//		 while (first <= last)
//		 {
//			 if(array[middle]< s)
//			 {
//				 first = middle + 1;
//			 }
//			 else if (array[middle] == s)
//			 {			 
//				 
//				 found = true;  
//				 break; 
//			 }
//			 else 
//			 {
//				 last = middle -1;
//				 
//			 }
//			 
//			 middle = (first + last )/2; 
//		 }
//		 
//		 if (!found)
//		 {
//			 System.out.print("NOT FOUND:  " + s);
//		 }
//		 else 
//		 {
//			 System.out.print("FOUND:  " + s);
//		 }
//		 
//	}
//}
