package Coding_Practice.Java_Coding_Practice;

import java.util.Arrays;

public class C26_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 87;

		int[] arr = { 1, 4, 7, 2, 87, 23, 13, 76, 87, 45,56,79 };

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int l = 0;
		int h = arr.length - 1;

		
		int result = -1;

		while (l <= h) {
			int mid = (l + h) / 2;

			if (num == arr[mid]) {
				
				result = mid;
				break;
			}

			else if (num < arr[mid]) {
				l = l;

				h = mid - 1;

			}

			else {
				h = h;
				l = mid + 1;

			}

		}

		if (result != -1) {
			System.out.println("Element found at index  " + result);

		} else {

			System.out.println("Element not found");
		}

	}


}
