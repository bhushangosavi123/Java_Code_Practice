package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Reverse_Only_Letters_In_String {

	@Test
	public void Reverse_Only_Letters() {

		String input = "123abc456";

		char[] array = input.toCharArray();

		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			// Move left pointer until it finds a letter
			if (!Character.isLetter(array[left])) {
				left++;

			}

			else if (!Character.isLetter(array[right])) {
				right--;
			}

			else {
				char temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;

			}

		}

		// String result = new String(array);
		System.out.println("Output: " + new String(array));

	}

}
