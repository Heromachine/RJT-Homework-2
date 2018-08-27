
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intarray[] = {9, 3, 7, 2, 1};
		
		System.out.println("\tBefore Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------------\n ");
		insertionsort(intarray);
		
		System.out.println("\tAfter Sort: ");
		for (int i: intarray)
		{
			System.out.println(i + ", ");
		}

		
	}
	
	public static void insertionsort(int[] A)
	{
		for(int i = 1; i < A.length; i++) 
		{
			int key = A[i];
			int j = i -1;
			
			while(j>=0 && A[j] > key)
			{
				A[j+1] = A[j];
				j--;
			}
			
			A[j+1] = key; 
		}
		
	}
	
}
