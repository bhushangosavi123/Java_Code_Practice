package Coding_Practice.Java_Coding_Practice;

public class CHeck_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number = 23;
		
		boolean isprime = true;
		
		if (number <= 1)
		{
			
			isprime = false;
			
		}
		else
		{
			
			for(int i =2 ; i <=Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					isprime = false;
					break;
				}
				
			}
		
		}
		
		System.out.println(number + (isprime ? " Is Prime Number" : " Is not Prime Number"));
		
		
		

	}

}
