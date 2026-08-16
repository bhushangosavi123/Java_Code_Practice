package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

public class D36_Largest_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int currentSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			System.out.println("arr[i] is " + arr[i]);
			
			System.out.println(" csum " + (currentSum + arr[i]));
			
			
			
		
			
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			
			
			
			System.out.println("currentSum is "+currentSum);
			
			maxSum = Math.max(maxSum, currentSum);
			
			System.out.println("maxSum is "+maxSum);
			System.out.println("***********");
		}

		System.out.println("Largest Sum = " + maxSum);
		
		System.out.println("***********");
	}

}
