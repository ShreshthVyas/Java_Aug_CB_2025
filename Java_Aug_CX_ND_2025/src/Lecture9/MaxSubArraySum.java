package Lecture9;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum+= arr[ei];
				max = Math.max(max, sum);
			}
		}
		
		return max;
	}

}
