package Coding_Practice.Java_Coding_Practice;

public class D32_Fibonacci_Series_Program {

	public static void main(String[] args) {

		// The Fibonacci series is a sequence where each number is the sum of the
		// previous two numbers.
		// Example: 0 1 1 2 3 5 8 13 21 34

		int n = 10; // Number of terms

		//Assumptions
		int first = 0;
		int second = 1;

		System.out.print("Fibonacci Series: ");

		for (int i = 1; i <= n; i++) {

			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}
	}

}
