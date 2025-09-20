package Lecture9;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,1,3,-1,6,-2,7};
		
		for (int i = 0; i < arr.length-1; i++) {
			int min_idx =i;
			for (int j = i+1; j < arr.length; j++) {//find minimum idx
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			if(min_idx!=i) {
				int t = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = t;
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
