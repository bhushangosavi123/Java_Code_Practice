package Coding_Practice.Java_Coding_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import org.testng.annotations.Test;

public class Second_largestValue_From_Array {

	public static void main(String[] args) {

		int[] array = { 1, 3, 80, 999, 6, 5 };

		// 1,3,5,6,80,999

		Arrays.sort(array);

		// array.length = 6
		// array.length - 2 = 4

		System.out.println("Second Largest is " + array[array.length - 2]);

		System.out.println("*****************************************");

	}

	@Test
	public static void second_Largest_Number_withoutSOrt() {
		int[] Array = { 1, 3, 5, 88,88, 4, 99, 3,3, 4 };

		int LargestNo = Integer.MIN_VALUE;
		int SecondLargestNo = Integer.MIN_VALUE;

		for (int Num : Array) {
			if (Num > LargestNo)

			{
				SecondLargestNo = LargestNo;
				LargestNo = Num;
				

			} else if (Num > SecondLargestNo && Num != LargestNo)

			{
				SecondLargestNo = Num;
		
			}

		}

		System.out.println("SecondLargestNo " + SecondLargestNo);
		System.out.println("LargestNo "+LargestNo);

	}

}
