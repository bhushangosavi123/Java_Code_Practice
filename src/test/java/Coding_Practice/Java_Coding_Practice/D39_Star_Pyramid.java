package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Star_Pyramid {

	@Test
	public static void StarPyramid() {
	
	/*
	 * Pyramid = Spaces + Stars
	 * 
	 * Spaces = n - i 
	 * Stars = 2*i - 1
	 * 
	 */	
	    
	        int n = 5;  //Number of rows

	        for (int i = 1; i <= n; i++) {

	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	       
	    }
	
	

	}


