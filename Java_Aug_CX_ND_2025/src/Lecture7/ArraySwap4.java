package Lecture7;

public class ArraySwap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] brr = {7,8,9,10,11};
		System.out.println(arr[0] + " " + brr[0]);
		swap(arr,brr);
		System.out.println(arr[0] + " " + brr[0]);
	}
	public static void swap(int[] drr, int[] frr) {
		// TODO Auto-generated method stub
		int t[] = drr;
		drr =  frr;
		frr = t;
	}

}
