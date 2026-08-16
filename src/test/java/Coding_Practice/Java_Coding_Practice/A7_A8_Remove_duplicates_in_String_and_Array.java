package Coding_Practice.Java_Coding_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class A7_A8_Remove_duplicates_in_String_and_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char ch : input.toCharArray()) {
			set.add(ch);

		}

		System.out.println(set);

		StringBuilder result = new StringBuilder();
		for (char ab : set) {
			result.append(ab);
			
			// Or Just Use
			//System.out.print(ab);
		}

		System.out.println(result); // progamin

	}

	@Test
	public static void Remove_Duplicate_fromArray() {

		int[] array = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7 };

		HashSet<Integer> Set = new HashSet<>();

		for (int in : array) {

			Set.add(in);

		}

		System.out.println(Set);

	}

}
