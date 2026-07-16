package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Find_Missing_Number_from_Array {

	@Test
	public void missingnumber_from_array() {
		int[] array = { 1, 2, 4, 5, 6 };

		int Totalnumbers = 6;

		int totalsumofarray = Totalnumbers * (Totalnumbers + 1) / 2;
		
		//Formula:- totalsumofarray =  n * (n+1)/2  is used to calculate the sum of natural numbers from 1 to n.

		System.out.println("totalsumofarray "+totalsumofarray);

		int sumofarray = 0;

		for (int i = 0; i < array.length; i++) {

			sumofarray = sumofarray + array[i];
			

		}

		System.out.println("sumofarray "+sumofarray);
		
		System.out.println("Missing number is " + (totalsumofarray - sumofarray));

	}

}
