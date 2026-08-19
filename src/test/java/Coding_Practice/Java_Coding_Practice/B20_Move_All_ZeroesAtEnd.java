package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class B20_Move_All_ZeroesAtEnd {

	@Test
	public void MoveallzeroestoEnd() {

		int array[] = { 1, 0, 2, 0, 3, 0 ,8,0,0};
		

int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
               int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(array));
    }

}