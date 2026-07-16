package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Pyramid {
	
	
	
	//1 2 3 4 
	//5 6 7
	//8 9 
	//10
	
	
	
	@Test
	public void Pyramid1to10()
	{
		System.out.println("Pyramid");
		int k =1;
		for(int i=0;i<5;i++)
		{
			//System.out.println(i);
			
			
			for (int j=0;j<5-i;j++)
			{
				//System.out.print(j);
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
			
			
			
		}
		
	}
	
	
	
	/*
1	
12
123
1234
...
12345678910
	 
	 */
	
	
	
	
	
	    @Test
	    public void pyramid1to10() {
	        for (int row = 1; row <= 10; row++) {
	        	//System.out.println("row"+row);
	            for (int col = 1; col <= row; col++) {
	            	//System.out.println("col"+col);
	                System.out.print(col);
	            }
	            System.out.println(); // move to next line
	        }
	    }
	
	
	
	
	    @Test
	    public void pyramidRepeatRowNumber() {
	        for (int row = 1; row <= 5; row++) {
	        	//System.out.println("row"+row);
	            for (int col = 1; col <= row; col++) {
	            	//System.out.println("col"+col);
	                System.out.print(row);
	            }
	            System.out.println();
	        }
	    
	}
	
	
	
	String input = "Hello";
	@Test
	public void checkstring()
	{
		

         // change value to test

        boolean result = checkString(input);

        System.out.println(result);

		
	}
	

    public  boolean checkString(String value) {
        	
        	//return	"Hello".equals(value); 
        	return value.equals("Hello");
        
       
		/*
		 * if(value.equals("Hello")) { return true; } else { return false; }
		 */
    }

	
	
	
	
	
	

}
