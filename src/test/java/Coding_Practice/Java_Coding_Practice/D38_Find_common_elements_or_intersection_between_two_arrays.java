package Coding_Practice.Java_Coding_Practice;

import java.util.HashSet;

import org.testng.annotations.Test;

public class D38_Find_common_elements_or_intersection_between_two_arrays {

	public static void main(String[] args) {

		// Method 1: Using HashSet

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		HashSet<Integer> set = new HashSet<>();

		for (int a : arr1) {
			set.add(a);
		}

		System.out.print("Common Elements: ");
		for (int b : arr2)

		{
			if (set.contains(b)) {
				System.out.print(b + " ");
			}
		}

	}

	@Test
	public static void main2() {

		// Method 2: Without Using HashSet

		int[] arr3 = { 1, 2, 3, 4, 5 ,5};
		int[] arr4 = { 3, 4, 5, 6, 7 };
		
		
		  System.out.print("Common Elements: ");
		for(int i = 0;i<arr3.length;i++)
		{
			for(int j= 0;j<arr4.length;j++)
			{
				
				if(arr3[i]==arr4[j])
				{
					System.out.print(arr3[i] + " ");
					
				}
			}
		}
		System.out.println();

	}

}
