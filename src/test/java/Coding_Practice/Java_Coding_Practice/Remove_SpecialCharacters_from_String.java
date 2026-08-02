package Coding_Practice.Java_Coding_Practice;

public class Remove_SpecialCharacters_from_String {

	public static void main(String[] args) {

		String str = "Hello@123#Java$%";

		String result = str.replaceAll("[^A-Za-z1-9]", "");

		System.out.println(result);
		System.out.println("*************************************************");

		main2();
	}

	
	//********Using Loop and Character.isLetterOrDigit*********
	
	public static void main2() {

		String str1 = "Hello@123#Java$%";

		
		StringBuilder result1 = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {

			char ch = str1.charAt(i);

			if (Character.isLetterOrDigit(ch)) {

				result1.append(ch);

			}

		}

		System.out.println(result1.toString());
	}
}
