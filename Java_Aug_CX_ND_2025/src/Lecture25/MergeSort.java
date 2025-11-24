package Lecture25;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,6,4,2,7,-1,9};
		
		int ans[] = mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergesort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si==ei) {//  single element left
			int ans[] = new int[1];
			ans[0] =  arr[si];
			return ans;
		}
		int mid = (si+ei)/2;
		int fh[] = mergesort(arr, si, mid);
		int sh[] = mergesort(arr, mid+1, ei);
		return mergetwosortedarrays(fh, sh);
	}
	public static int[] mergetwosortedarrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int ans[] = new int[arr.length+brr.length];
		int i =0;int j =0;int k = 0;
		
		while(i<arr.length && j<brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;
			}
			else {
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		while(i<arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}
		return ans;
	}

}
