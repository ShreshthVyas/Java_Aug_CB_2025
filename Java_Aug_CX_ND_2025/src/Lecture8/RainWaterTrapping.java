package Lecture8;

public class RainWaterTrapping {
	// https://leetcode.com/problems/trapping-rain-water/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int trap(int[] height) {
		int left[] = new int[height.length];
		int right[] = new int[height.length];
		
		left[0] = height[0];
		
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(height[i], left[i-1]);
		}
		
		right[right.length -1] = height[right.length -1];
		
		for (int i = height.length-2; i>=0; i--) {
			right[i] =  Math.max(height[i], right[i+1]);
		}
		
		int ans =0;
		for (int i = 0; i < height.length; i++) {
			ans+= Math.min(left[i], right[i]) - height[i];
		}
		return ans;	
	}

}
