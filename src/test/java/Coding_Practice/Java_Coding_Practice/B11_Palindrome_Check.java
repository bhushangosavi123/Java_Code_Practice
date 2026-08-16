package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class B11_Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str = "321madam123";

		boolean ispalindrome = true;

		for (int i = 0; i < Str.length(); i++) {

			if (Str.charAt(i) != Str.charAt(Str.length() - 1 - i)) {

				ispalindrome = false;
				break;
			}

		}

		System.out.println(ispalindrome ? "Palindrome" : "Not Palindrome");

	}

//**********************      Method 2     *************************//
	@Test
	public static void StringBuilder() {
		String s = "madam";
		String rev = new StringBuilder(s).reverse().toString();
		System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
	}

//**********************      Method 3     *************************//

	@Test
	public void usingforloop() {
		String inp = "jimadamij";

		String rvs = "";

		for (int i = inp.length() - 1; i >= 0; i--) {

			rvs = rvs + inp.charAt(i);
		}

		System.out.println(rvs);

		if (inp.equals(rvs)) {
			System.out.println("Ispalindrome");
		} else {

			System.out.println("NotPalindrome");
		}
	}

}
