package bubblesortpkg;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int intarray[] = {9, 3, 7, 2, 1};
		
		System.out.println("\tBefore Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------------\n ");

		
		BubbleSortClass BS = new BubbleSortClass(); 
		
		
		int [] newArray = BS.bubblesort(intarray);
		
		System.out.println("\tAfter Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
	
	}
}
	
	
	
