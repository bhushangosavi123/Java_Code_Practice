package Coding_Practice.Java_Coding_Practice;

public class D34_Remove_whitespaces_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using trim to Remove Only Leading and Trailing Spaces
		String input = "  My name      is   Bhushan  ";
		
		System.out.println(input.trim());
		
		System.out.println("*****************");
		
		//Using Replaceall
		
		System.out.println(input.replaceAll("\\s+", ""));
		
		System.out.println("*****************");
		
		//Using StringBuilder without Inbuilt
		
		StringBuilder sb = new StringBuilder();
		
		char[] charr = input.toCharArray();
		
		for(char ch : charr)
		{
			if(!Character.isWhitespace(ch))
			{
			sb.append(ch);
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
