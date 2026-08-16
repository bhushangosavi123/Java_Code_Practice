package Coding_Practice.Java_Coding_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class A9_A10_Find_duplicates_in_String_and_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char ch : input.toCharArray()) {
			// set.add(ch);

			if (!set.add(ch)) {
				System.out.println("Duplicate is = " + ch);
			}

		}

	}

	@Test
	public static void Find_Duplicate_In_Array() {

		//int[] array = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7 };
		int[] array = {1,2,2,2,3,4,5,6,6,7,7,8};

		HashSet<Integer> Set = new HashSet<>();

		for (int in : array) {

			if (!Set.add(in)) 
			{
				System.out.println("Duplicates are " + in);
			}

		}

	}

}
