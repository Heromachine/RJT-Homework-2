package selectionsortpkg;

public class SelectionSortMain {

	public static void main(String[] args) {

		
		int intarray[] = {9, 3, 7, 2, 1};
		SelectionSortClass SSC = new SelectionSortClass();
		System.out.println("\tBefore Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------------\n ");
		SSC.selectionsort(intarray);
		
		System.out.println("\tAfter Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}		
	}	
}
