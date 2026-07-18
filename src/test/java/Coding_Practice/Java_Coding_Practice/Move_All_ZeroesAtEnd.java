package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Move_All_ZeroesAtEnd {

	@Test
	public void MoveallzeroestoEnd() {
		int array[] = { 1, 0, 2, 0, 3, 0 ,8,0,0};

		int nonzerovalues = 0;

		int temp;

		for (int current_i = 0; current_i < array.length; current_i++) {

			if (array[current_i] != 0) {

				temp = array[nonzerovalues];
				array[nonzerovalues] = array[current_i];
				array[current_i] = temp;
				nonzerovalues++;

			}
		}

		
		
		for (int n : array) {

			System.out.print(n + " ");

		}
	}
}