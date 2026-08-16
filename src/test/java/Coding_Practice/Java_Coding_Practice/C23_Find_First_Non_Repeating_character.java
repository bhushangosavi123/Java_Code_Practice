package Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Find_First_Non_Repeating_character {
	

	    public static void main(String[] args) {
	        String str = "aabbccdeefffg";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
	                System.out.print(ch + " ");
	                break;
	            }
	        }
	    }
	    
	    
	    
	    @Test
		public void Occurenceofeachcharacter() {
			// Occurences of each character in String

			String input = "aaabbcdddeff"; 

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
				
				if (map.get(key)==1)
				{
					System.out.println(key);
					break;
				}
				
				//System.out.println(key);
				//System.out.println(key + " : " + map.get(key));

			}
		}

	}


