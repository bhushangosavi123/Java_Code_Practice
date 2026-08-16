package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class A5_Reverse_Every_char_of_Word_but_keep_the_OrderofSentence {
	
	// ********************************Reverse every char of word but keep order of sentence********************************************
		// Problem:
		// Input: "Hello World from Pune"
		// Output: "olleH dlroW morf enuP"

		@Test
		public void reverse_Word_in_Sentence_Order() {
			String input1 = "Hello World from Pune";

			String[] words = input1.split(" "); // Splits based on Spaces
			StringBuilder Result = new StringBuilder();

			for (int i = 0; i < words.length; i++) {

				StringBuilder reverseword = new StringBuilder(words[i]);
				Result.append(reverseword.reverse().append(" "));

			}

			System.out.println(Result.toString().trim());

		}

}
