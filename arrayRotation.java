package day02;

import java.util.Arrays;

public class arrayRotation {

	public static int[] rotate(int arr[], int pos) {
		int len = arr.length;
		if (len == 0)
			return null;
		int newArr[] = new int[len];
		for (int i=0; i < len; i++) {
			int newPos = i + pos;
			if (newPos < len) 
				newArr[newPos] = arr[i];
			else
				newArr[newPos - len] = arr[i];
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int pos = 1;
		System.out.println(Arrays.toString(rotate(arr, pos)));
	}

}
