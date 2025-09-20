package Lecture9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,2,1,3,4};
		
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length-pass; i++) {
				if(arr[i]>arr[i+1]) {
					int t =  arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
