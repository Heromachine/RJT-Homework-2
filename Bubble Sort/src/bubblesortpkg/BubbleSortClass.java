package bubblesortpkg;

public class BubbleSortClass {
	
	public static int[] bubblesort(int[] intarray)
	{
		int temp = 0;
		int [] array = intarray;
		
		for (int i = 0; i < array.length; i++)
		{
			
			for (int j =1; j < (array.length)-i; j++)
			{
				
				if (array[j - 1] > array[j])
				{
					temp = array[j-1];
					array[j-1]= array[j]; 
					array[j] = temp;

				}
			}
			
		}
		return array; 
	}

}
