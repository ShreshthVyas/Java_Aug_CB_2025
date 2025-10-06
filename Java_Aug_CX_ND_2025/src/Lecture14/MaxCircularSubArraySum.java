package Lecture14;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-8,10,12,-2,5};
		System.out.println(maxSubarraySumCircular(arr));

	}
	public static int maxSubarraySumCircular(int[] arr) {
        int maxSum = arr[0];
		int sum1 =0;
		
		int minSum = arr[0];
		int sum2 = 0;
		
		int total =0;
		
		for (int i = 0; i < arr.length; i++) {
			sum1+= arr[i];
			maxSum = Math.max(maxSum, sum1);
			if(sum1<0) {
				sum1= 0;
			}
			
			sum2+=arr[i];
			minSum = Math.min(sum2, minSum);
			if(sum2>0) {
				sum2=0;
			}
			
			total+=arr[i];
		}
		
		if (total == minSum) {
            return maxSum;
        }
		
		return Math.max(maxSum, total-minSum);
    }

}
