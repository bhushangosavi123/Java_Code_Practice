package Coding_Practice.Java_Coding_Practice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Factorial {

	@Test
	public void Factorial() {

		int number = 5;

		int fact = 1;

		for (int i = 1; i <= number; i++) {

			fact = fact * i;

		}
		System.out.println(fact);

	}

}
