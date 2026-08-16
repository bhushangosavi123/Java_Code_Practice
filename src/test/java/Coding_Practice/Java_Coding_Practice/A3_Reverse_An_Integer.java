package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Reverse_An_Integer {
	
	@Test
	public void reverse_An_Integer()
	{
		int number  = -12345;
		int lastdigit =0;
		int reversenum = 0;
		
		while(number != 0)
		{
			lastdigit = number % 10;
		    reversenum = reversenum * 10 + lastdigit;
			number = number/10;
			
		}
		
		System.out.println("reversenum  = "+reversenum);
		
		
		
		
		
		
		
		
	}
	
	//*****************************Using StringBuilder*******************************************
	
	@Test
	public void reverseInt() 
	{
		
		String intiger = "-123456789";
		String reversedValue = new StringBuilder(intiger).reverse().toString();
		System.out.println(reversedValue);
		
	
		
	}
	
	
	// **************Method 1: Using a for loop*****************************

		@Test
		public void reverseInteger() {

			String input = "1234567";
			
			String reverse = "";

			for (int i = input.length() - 1; i >= 0; i--) {
				reverse = reverse + input.charAt(i);
				// reverse += input.charAt(i);

			}

			System.out.println(reverse);

			// System.out.println(reverse.equals(input) ? "Palindrome" : "Not Palindrome");
			// System.out.println(input.equals(reverse) ? "Palindrome" : "Not Palindrome");

		}


}
