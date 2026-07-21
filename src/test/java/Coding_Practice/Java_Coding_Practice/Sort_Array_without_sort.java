package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

public class Sort_Array_without_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int[] arr = {4, 2, 5, 1, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        
        
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

	}


