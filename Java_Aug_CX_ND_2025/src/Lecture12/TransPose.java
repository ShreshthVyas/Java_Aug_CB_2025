package Lecture12;

import java.util.Arrays;

public class TransPose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4}, 
				{11,22,33,44},
				{15,26,35,47},
				{13,24,35,43}};
		transpose(arr);
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
