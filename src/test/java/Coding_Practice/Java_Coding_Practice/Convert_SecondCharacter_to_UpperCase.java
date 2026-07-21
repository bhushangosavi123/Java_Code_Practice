package Coding_Practice.Java_Coding_Practice;

public class Convert_SecondCharacter_to_UpperCase {

	public static void main(String[] args) {

		String input = "my name is Bhushan";

		StringBuilder result = new StringBuilder();

		for (String word : input.split(" ")) {
			if (word.length() >= 2) {
				word = word.substring(0, 1) + Character.toUpperCase(word.charAt(1)) + word.substring(2);
			}
			result.append(word).append(" ");
		}

		System.out.println(result.toString().trim());
	}

}
