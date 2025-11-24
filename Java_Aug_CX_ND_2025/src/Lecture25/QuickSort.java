package Lecture25;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,-2,12,3,7,9,4};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quicksort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return;
		}
		int pivot =  part(arr, si,ei);
		quicksort(arr, si, pivot-1);
		quicksort(arr, pivot+1, ei);	
	}
	public static int part(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int idx = si;
		for (int i = si; i <ei; i++) {
			if(arr[i]<item) {
				int temp =  arr[i];
				arr[i] =  arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp  = arr[ei];
		arr[ei] =  arr[idx];
		arr[idx] =  temp;
		
//		System.out.println(Arrays.toString(arr));
		return idx;
	}

}
