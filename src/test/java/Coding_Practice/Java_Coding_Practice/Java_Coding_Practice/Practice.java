package Coding_Practice.Java_Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Practice{
	
	public static void main (String[] args)
	{

		int number = 27;
		
		boolean isprime = true;
		
		if(number<=1)
		{
			
			isprime= false;
			
		}
	
		for(int i = 2;i<=Math.sqrt(number);i++)
		{
			
			if(number%i==0)
			{
				
				isprime =false;
				break;
			}
			
			
		}
		
		
		
		System.out.println(isprime);
		
		
		
		
		
	}
	
}
	