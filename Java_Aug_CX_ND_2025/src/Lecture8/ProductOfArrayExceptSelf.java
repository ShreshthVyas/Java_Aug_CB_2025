package Lecture8;

public class ProductOfArrayExceptSelf {
	//https://leetcode.com/problems/product-of-array-except-self/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
		int ans[] = productExceptSelf(arr);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

//	public static int[] productExceptSelf(int[] nums) {
//		int ans[] = new int[nums.length];
//		
//		for (int i = 0; i < ans.length; i++) {
//			int product = 1;
//			for (int j = 0; j < ans.length; j++) {
////				if(i==j) {
////					continue;
////				}
//				if(i!=j) {
//					product = product * nums[j];
//				}
//			}
//			ans[i]  = product;
//		}
//		
//		return ans;
//	}

	public static int[] productExceptSelf(int[] nums) {
		int left[] =  new int[nums.length];
		int right[] = new int[nums.length];
		
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = nums[i-1]*left[i-1];
		}
		
		right[right.length-1] = 1;
		
		for (int i = right.length-2; i>=0; i--) {
			right[i] = nums[i+1]* right[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i] = right[i] * left[i];
		}
		
		return right;
	}
}
