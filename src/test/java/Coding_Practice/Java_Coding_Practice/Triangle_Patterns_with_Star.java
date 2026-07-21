package Coding_Practice.Java_Coding_Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Triangle_Patterns_with_Star {

	@Test
	public static void RightAngleTraingle() {
		// TODO Auto-generated method stub

		// Right angle triangle Pattern

		/*
		 
		
		
		*
		**
		***
		****
		*****
		
		
		*/

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	@Test
	public void InvertedTraingle() {

		// upside-down right triangle is called an inverted right triangle.

		/*
		
		*****
		****
		***
		**
		*
		
		*/

		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
