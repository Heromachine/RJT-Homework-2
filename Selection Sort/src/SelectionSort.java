
public class SelectionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intarray[] = {9, 3, 7, 2, 1};
		
		System.out.println("\tBefore Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println("\n--------------\n ");
		selectionsort(intarray);
		
		System.out.println("\tAfter Sort: ");
		for (int i: intarray)
		{
			System.out.print(i + ", ");
		}
		
	}
	
	public static void selectionsort(int[] A)
	{
		for(int i = 0; i < A.length - 1; i++)
		{
			int minIndex = i; 
			
			for(int j = i+1; j < A.length; j++)
			{
				if(A[j] < A[minIndex])
				{
					minIndex = j;
				}
			}
			
			int temp = A[minIndex];
			A[minIndex]= A[i];
			A[i] = temp;
		}
		
		
	}

}
