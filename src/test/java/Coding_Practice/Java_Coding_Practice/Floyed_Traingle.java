package Coding_Practice.Java_Coding_Practice;

public class Floyed_Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 */

		int n = 5;
		int num = 1;

		for (int i = 1; i <= n; i++) 
		{

			for (int j = 1; j <= i; j++) 
			{

				System.out.print(num + " ");
				num++;
			}

			System.out.println();
		}
	}

}
