package Coding_Practice.Java_Coding_Practice;

public class C28_separate_oddposition_digits_and_evenposition_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 132456789;
		String str = String.valueOf(input);

		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();

		for (int i = 1; i <= str.length(); i++) {

		    //char ch = str.charAt(i - 1);

		    if (i % 2 == 0) {
		        even.append(str.charAt(i-1));
		    } else {
		        odd.append(str.charAt(i-1));
		    }
		}

		System.out.println("Odd Position Digits: " + odd);
		System.out.println("Even Position Digits: " + even);

	System.out.println(" ***************************");
	method2();
	
}

	public static void method2() {

		int input = 132456789;
		String str = String.valueOf(input);
		//or
		String str2 = Integer.toString(input);

		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if ((i +1) % 2 == 0) { // Even position
				even.append(str.charAt(i));
			} else { // Odd position
				odd.append(str.charAt(i));
			}
		}

		System.out.println("Odd Position Digits: " + odd);
		System.out.println("Even Position Digits: " + even);
	}

}
