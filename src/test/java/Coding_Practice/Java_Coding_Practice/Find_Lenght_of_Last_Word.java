package Coding_Practice.Java_Coding_Practice;

import org.testng.annotations.Test;

public class Find_Lenght_of_Last_Word {

	// ***************************Find Length of Last word in a
	// string*******************************

	@Test
	public void lengthoflastword() {
		String s = "    My Test is    Verygood     ";
		int count = 0;
		s = s.trim();
		System.out.println(s);
		char[] chararray = s.toCharArray();

		for (int i = chararray.length - 1; i >= 0; i--) {

			if (chararray[i] != ' ') {
				count = count + 1;

			}

			else {
				if (count >= 0) {
					System.out.println(count);
					break;

				}

			}

		}

	}

}
