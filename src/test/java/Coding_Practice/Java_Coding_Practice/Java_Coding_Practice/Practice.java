package Coding_Practice.Java_Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {
		
		String str1 = "Listen";
		String str2= "Silent"; 
		
		if(str1.length()!=str2.length())
		{
			
			System.out.println("Not an anagram");
			return;
		}
		
		
		
		char[] str1arr = str1.toLowerCase().toCharArray();
		Arrays.sort(str1arr);
		
		
		
		
		
		
		
		
		char[] str2arr = str2.toLowerCase().toCharArray();
		Arrays.sort(str2arr);
		
		
		
		
		if(Arrays.equals(str1arr,str2arr))
		{
			
			System.out.println("This is anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
		
		
		
	}

	
}
