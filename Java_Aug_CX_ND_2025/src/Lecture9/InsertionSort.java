package Lecture9;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,-1,2,6,-3,7};
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			 
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];//shifting
				j--;
			}
			j++;
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
