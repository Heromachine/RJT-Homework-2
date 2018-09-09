
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
		bubblesort(intarray);
		
		System.out.println("\tAfter Sort: ");
		for (int i: intarray)
		{
			System.out.println(i + ", ");
		}
	
	}
	
	
	
	private static void bubblesort(int[] intarray)
	{
		int temp = 0;
		
		for (int i = 0; i < intarray.length; i++)
		{
			
			for (int j =1; j < (intarray.length)-i; j++)
			{
				
				if (intarray[j - 1] > intarray[j])
				{
					temp = intarray[j-1];
					intarray[j-1]= intarray[j]; 
					intarray[j] = temp;
					
					for (int x: intarray)
					{
						System.out.print(x + ", ");
					}
					
					System.out.println("\n-------------- ");
				}
			}
		}
		
	}
}
