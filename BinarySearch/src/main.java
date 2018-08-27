import java.util.Scanner;
import java.util.Scanner; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int intarray[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Seach Number: ");
		 n = sc.nextInt();
		 
		 binarySearch(intarray, n);
	}

	private static void binarySearch( int[] array,  int s)
	{
		 boolean found = false; 
		 
		 int first = 0;
		 int last = array.length - 1;
		 int middle = (first + last)/2;
		 
		 while (first <= last)
		 {
			 if(array[middle]< s)
			 {
				 first = middle + 1;
			 }
			 else if (array[middle] == s)
			 {			 
				 
				 found = true;  
				 break; 
			 }
			 else 
			 {
				 last = middle -1;
				 
			 }
			 
			 middle = (first + last )/2; 
		 }
		 
		 if (!found)
		 {
			 System.out.print("NOT FOUND:  " + s);
		 }
		 else 
		 {
			 System.out.print("FOUND:  " + s);
		 }
		 
	}
}
