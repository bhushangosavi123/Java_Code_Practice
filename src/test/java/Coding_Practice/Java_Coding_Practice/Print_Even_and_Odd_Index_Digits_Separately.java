package Coding_Practice.Java_Coding_Practice;

public class Print_Even_and_Odd_Index_Digits_Separately {

	public static void main(String[] args) {

		int input = 132456789;

		String str = String.valueOf(input);

		System.out.print("Even index digits: ");
		for (int i = 0; i < str.length(); i += 2) {
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println();

		System.out.print("Odd index digits: ");
		for (int i = 1; i < str.length(); i += 2) {
			System.out.print(str.charAt(i) + " ");
		}

	}

}
