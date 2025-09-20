package Lecture9;

public class PrintAllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4}; 
		
		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {
				for (int k = si; k <=ei; k++) {//subarray
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
