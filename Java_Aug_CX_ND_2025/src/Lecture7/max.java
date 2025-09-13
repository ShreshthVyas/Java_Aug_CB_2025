package Lecture7;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,-2,-3,-4,-5};
		int ans = findmax(arr);
		System.out.println(ans);
	}

	public static int findmax(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
