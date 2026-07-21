package Coding_Practice.Java_Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice {

	public static void main(String[] args) {

		int n = 5;

		// spaces = n -1
		// Stars = 2*i -1

		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n - i; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) 
			{
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
