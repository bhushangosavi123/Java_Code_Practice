package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class D37_Swap_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		// Swapping direct Array

		System.out.println("Before Swap:");
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));

		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;

		System.out.println("\nAfter Swap:");
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));

		System.out.println("****************************");

		// Swapping Every element of array

	}

	@Test
	public static void swapbyelement() {
		int[] arr3 = { 1, 2, 3 };
		int[] arr4 = { 4, 5, 6 };

		for (int i = 0; i < arr3.length; i++) {
			int temp1 = arr3[i];
			arr3[i] = arr4[i];
			arr4[i] = temp1;
		}

		
		
		
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("narr4: " + Arrays.toString(arr4) );
		
		
	}

}
