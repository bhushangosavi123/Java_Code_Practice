package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Reverse_The_String {

	// **************Method 1: Using a for loop*****************************

	@Test
	public void reverseString() {

		String input = "I am the Best";
		// String input = "2345";
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
			// reverse += input.charAt(i);

		}

		System.out.println(reverse);

		// System.out.println(reverse.equals(input) ? "Palindrome" : "Not Palindrome");
		// System.out.println(input.equals(reverse) ? "Palindrome" : "Not Palindrome");

	}

	// ***************************Method 2: Using
	// StringBuilder*******************************************************

	@Test
	public void reverse_use_stringbuilder() {
		String input = "I am the Smartest person";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);

	}

	// ******************************************Reverse Words in a Sentence*********************************
	@Test
	public void ReverseWordsinaSentence() {
		String sentence = "I love testing";
		String[] words = sentence.split(" ");
		String reversed = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reversed = reversed + words[i] + " ";
		}

		System.out.println(reversed.trim());
		// System.out.println(reversed);
	}

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
