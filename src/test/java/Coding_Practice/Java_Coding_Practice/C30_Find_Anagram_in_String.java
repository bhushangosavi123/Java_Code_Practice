/**
 * 
 */
package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * 
 */
public class C30_Find_Anagram_in_String {
	
	@Test
	public void Anagram()
	{
		String str1 = "Listen";
		String str2= "Silent1"; 
		
		
		str1 = str1.toLowerCase().replaceAll(" ", "");
		str2 = str2.toLowerCase().replaceAll(" ", "");
		
		if(str1.length() != str2.length())
		{
			
			System.out.println("Is not anagram");
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			
			System.out.println("Is Anagram");
		}
		else
		{
			
			System.out.println("Is not anagram");
		}
		
		
	}

}
