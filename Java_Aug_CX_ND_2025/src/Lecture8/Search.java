package Lecture8;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,6,9,10,13,-2,14};
		boolean ans = search(arr,-2);
		System.out.println(ans);
	}

	public static boolean search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
		
	}

}
