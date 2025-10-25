package Lecture18;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,12,-12,13,17,19};
		boolean ans  =  ls(arr,0,19);
		System.out.println(ans);
	}

	public static boolean ls(int[] arr, int idx, int target) {
		// TODO Auto-generated method stub
		if(idx ==  arr.length) {
			return false;
		}
		if(arr[idx] ==  target) {
			return true;
		}
		
		return ls(arr, idx+1, target);
	}

}
