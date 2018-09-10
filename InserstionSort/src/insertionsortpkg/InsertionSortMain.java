package insertionsortpkg;

public class InsertionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intarray[] = {9, 3, 7, 2, 1};
		InsertionSortClass ISC = new InsertionSortClass();
		
		
		System.out.println("\tBefore Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------------\n ");
		
		
		System.out.println("\tAfter Sort: ");
		for (int i: ISC.insertionsort(intarray))
		{
			System.out.print(i + ", ");
		}

		
	}
	
}
