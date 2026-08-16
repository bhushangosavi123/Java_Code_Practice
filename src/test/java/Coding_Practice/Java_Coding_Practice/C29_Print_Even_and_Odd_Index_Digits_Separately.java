package Coding_Practice.Java_Coding_Practice;

public class C29_Print_Even_and_Odd_Index_Digits_Separately {

	public static void main(String[] args) {

		int input = 132456789;

		String str = String.valueOf(input);
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();

		for (int i = 0; i < str.length(); i += 2) {

			even.append(str.charAt(i)).append(" ");
		}

		System.out.println("Even index digits: " + even.append(" ").toString());

		for (int i = 1; i < str.length(); i += 2) {

			odd.append(str.charAt(i)).append(" ");

		}

		System.out.print("Odd index digits: " + odd.append(" ").toString());
	}

}
