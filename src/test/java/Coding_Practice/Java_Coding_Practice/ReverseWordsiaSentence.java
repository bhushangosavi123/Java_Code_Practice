package Coding_Practice.Java_Coding_Practice;

public class ReverseWordsiaSentence {

	
	  public static void main(String[] args) { String s = "  hello   world  ";
	  System.out.println(reverseWordsPreserveSpaces(s)); }

	public static String reverseWordsPreserveSpaces(String s) {
		if (s == null || s.isEmpty())
			return s;
		char[] arr = s.toCharArray();
		reverse(arr, 0, arr.length - 1);

		int i = 0, n = arr.length;
		while (i < n) {
			if (arr[i] == ' ') {
				i++;
				continue;
			}
			int j = i;
			while (j < n && arr[j] != ' ')
				j++;
			reverse(arr, i, j - 1);
			i = j;
		}

		return new String(arr);
	}

	public static void reverse(char[] a, int l, int r) {
		while (l < r) {
			char t = a[l];
			a[l++] = a[r];
			a[r--] = t;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
