package selectionsortpkg;

public class SelectionSortClass {
	
	public static int [] selectionsort(int[] A)
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
		
		return A;
	}
}
