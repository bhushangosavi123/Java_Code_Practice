package Coding_Practice.Java_Coding_Practice;

public class ToggleCase_ConvertStringchar_UppertoLower {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		String input = "Hello World";
		
		StringBuilder result = new StringBuilder();
		
		char[] dataarray = input.toCharArray();
		
		
		
		for(char ch : dataarray)
		{
			//System.out.println(ch);
			if(Character.isUpperCase(ch))
			{
				
				char a = Character.toLowerCase(ch);
				result.append(a);
			}
			
			else if (Character.isLowerCase(ch))
			{
				char b = Character.toUpperCase(ch);
				result.append(b);
				
			}
			
			else
			{
				result.append(ch);
				
			}
			
		}
		
		
		result.toString();
		System.out.println("Converted result = " + result);
		
		
		
		
	}

}
