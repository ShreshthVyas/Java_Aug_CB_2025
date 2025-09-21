package Lecture10;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,-3,4,7,19,21,32,100};
		
		int ans  = binarysearch(arr,3);
		
		System.out.println(ans);
	}

	public static int binarysearch(int[] arr,int target) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]== target) {
				return mid;
			}
			if(arr[mid]<target) {
				lo = mid+1;
			}
			else {
				hi= mid-1;
			}
		}
		return -1;
		
	}

}
