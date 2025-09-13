package Lecture7;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		reverse(arr);
		System.out.println("......");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
		
	}

}
