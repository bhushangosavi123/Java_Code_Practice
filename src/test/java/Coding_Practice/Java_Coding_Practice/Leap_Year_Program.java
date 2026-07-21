package Coding_Practice.Java_Coding_Practice;

import java.time.Year;
import java.util.Scanner;

public class Leap_Year_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Year : ");
	int year = sc.nextInt();
	
	
	//Check year is divisible by 4 & Should not be divisible by 100 OR Should be divisible by 400
	
	if(year%4==0 && year % 100 !=0 || year %400==0)
	{
		System.out.println(year  + " is Leap Year");
		
	}
	else {
		System.out.println(year  + " is Not A Leap Year");
	}

	}

}
