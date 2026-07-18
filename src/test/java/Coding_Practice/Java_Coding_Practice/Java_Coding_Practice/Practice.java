package Coding_Practice.Java_Coding_Practice.Java_Coding_Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 5, 6 };
		int number = 6;
		
		int totalsumofarr = number * (number+1)/2;
		
		
		System.out.println("totalsumofarr "+totalsumofarr);
		
		
		int sumofarray = 0;
		for(int i =0;i<array.length;i++)
		{
			
			sumofarray = sumofarray + array[i];
			
			
		}
		
		System.out.println("sumofarray "+sumofarray);
		
		
		System.out.println("Missing Number " + (totalsumofarr-sumofarray));
		
	}
}
