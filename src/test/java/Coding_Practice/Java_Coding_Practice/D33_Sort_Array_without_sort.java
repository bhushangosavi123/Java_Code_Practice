package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class D33_Sort_Array_without_sort {

	
	//33.	Sort array without using sort()
	
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
	
	//Sort Array in Ascending Order (Eurofins, DataCert, Happiest Minds, Indium Software)
	@Test
	   public void main1() {
	        int[] arr = {50, 10, 40, 20, 30};

	        Arrays.sort(arr);

	        System.out.println("Array in Ascending Order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	}


