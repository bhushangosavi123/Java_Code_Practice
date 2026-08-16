package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

//**************************Using Temp Variable*********************************
public class Program_to_Swap_Two_Numbers {

	@Test
	public void swap_Numbers() {

		int a = 10;
		int b = 20;

		int temp = a;

		a = b;
		b = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	// **************************Using Mathematical
	// Operation*********************************

	@Test
	public void Swap_Using_Math_Oper() {
		int a = 30;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
}

	@Test
	public void Swap_Using_ExOr() {
		int a = 50;
		int b = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a ^ b;

		b = a ^ b;

		a = a ^ b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
