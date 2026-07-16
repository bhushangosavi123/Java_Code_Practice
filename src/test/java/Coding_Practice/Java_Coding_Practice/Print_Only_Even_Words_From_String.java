package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Print_Only_Even_Words_From_String {

	@Test
	public static void Evenwords() {

		String input = "the sky is Blue and vast";

		String[] inputarray = input.split(" ");

		for (String word : inputarray) {
			if (word.length() % 2 == 0) {

				System.out.println(word);

			}

		}

	}

}
