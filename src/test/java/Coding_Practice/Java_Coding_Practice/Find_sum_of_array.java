package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Find_sum_of_array {

	@Test
	public void sumofarray() {

		int[] array = { 1, 24, 44, 55 };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}

		System.out.println("Sum of array = " + sum);

	}

}
