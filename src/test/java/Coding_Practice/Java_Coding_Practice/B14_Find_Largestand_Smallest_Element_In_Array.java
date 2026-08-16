package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class B14_Find_Largestand_Smallest_Element_In_Array {

	@Test
	public void LargestandSmallestElement() {
		int[] arr = { 45, 34, 6, 2, 78, 34, 84 };

		int smallest = arr[0];
		int Largest = arr[0];
		
		

		for (int i = 1; i < arr.length; i++)

		{
			if (arr[i] < smallest)

			{
				smallest = arr[i];
			}

			if (arr[i] > Largest) {
				
			
				Largest = arr[i];

			}

		}

		System.out.println(Largest);
		System.out.println(smallest);
		

	}

}
