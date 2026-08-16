package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class A4_ReverseWords_in_Sentence {

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

}
