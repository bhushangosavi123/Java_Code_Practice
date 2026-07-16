package Coding_Practice.Java_Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice {

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
