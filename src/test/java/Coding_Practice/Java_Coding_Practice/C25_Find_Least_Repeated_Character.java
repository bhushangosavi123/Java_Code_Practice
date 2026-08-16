package Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;

public class C25_Find_Least_Repeated_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aaabbbcdde";

		// convert string into array
		char[] charlist = input.toCharArray();

		// create hashmap
		HashMap<Character, Integer> map = new HashMap<>();

		// Count each word
		for (char c : charlist) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Map is " + map);

		char minChar ;
		int leastCount = Integer.MAX_VALUE;

		for (char key : map.keySet()) {

			if (map.get(key) < leastCount) {
				leastCount = map.get(key);
				minChar = key;
			}
		}
		// System.out.println("Most repeated character : " + maxChar);
		System.out.println("Occurrence count        : " + leastCount);

		for (char key : map.keySet()) {
			if (map.get(key) == leastCount) {

				System.out.println(key + "=" + map.get(key));
			}
		}
	}
}
