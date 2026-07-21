package Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;

public class Find_Most_Repeated_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Programming";

		// convert string into array
		char[] charlist = input.toCharArray();

		// create hashmap
		HashMap<Character, Integer> map = new HashMap<>();

		// Count each word
		for (char c : charlist) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Map is " + map);

		char maxChar = ' ';
		int maxCount = 0;

		for (char key : map.keySet()) {

			if (map.get(key) > maxCount) {
				maxCount = map.get(key);
				maxChar = key;
				
				
			}

			

		}
		//System.out.println("Most repeated character : " + maxChar);
		System.out.println("Occurrence count        : " + maxCount);
		
		
		for(char key : map.keySet())
		{
			if(map.get(key) == maxCount)
			{
				
				System.out.println(key + "=" + map.get(key));
			}
		}

	}

}
