package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A2_Reverse_The_String {

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

	// ***************************Method 2: Using StringBuilder******************************

	@Test
	public void reverse_use_stringbuilder() {
		String input = "I am the Smartest person";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);

	}

	
	
}
