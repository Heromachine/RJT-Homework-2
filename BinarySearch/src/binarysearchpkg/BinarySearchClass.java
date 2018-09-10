package binarysearchpkg;

public class BinarySearchClass {
	
	public static boolean isBinarySearch( int[] array,  int s)
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
			found = false;
		 }
		 else 
		 {
			 found = true;
		 }
			
		 return found;
	}
	

	

}
