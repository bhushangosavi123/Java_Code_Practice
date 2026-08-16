package Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class B12_A13_Occurence_or_Frequency_of_Each_Character_and_Word {

	@Test
	public void Occurenceofeachword() {
		// Occurences of each word in String

		String sentence = "Hello my world Java world my world and hello &%";

		// Step 1: Convert to lowercase and remove special characters

		sentence = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "");

		// System.out.println(sentence);

		// Step 2: Split sentence into words
		String[] words = sentence.split(" ");

		// Step 3: Create map to store word counts
		// A HashMap is a data structure that stores data in key–value pairs.

		/*
		 * This defines the type of data:
		 * 
		 * String → key (word) Integer → value (count)
		 */

		HashMap<String, Integer> map = new HashMap<>();

		// Step 4: Count each word

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);

		}

		System.out.println("Map is " + map);
		
		// Step 5: Print occurrences
		for (String key : map.keySet()) {
			
			
			System.out.println(key + " : " + map.get(key));
		}

	}

	@Test
	public void Occurenceofeachcharacter() {
		// Occurences of each character in String

		String input = "automation";

		// convert string into array
		char[] charlist = input.toCharArray();

		// create hashmap
		HashMap<Character, Integer> map = new HashMap<>();

		// Count each word
		for (char c : charlist) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Map is " + map);

		// Print Occurances

		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));

		}
	}

}
