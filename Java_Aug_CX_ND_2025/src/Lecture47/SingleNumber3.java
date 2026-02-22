package Lecture47;

public class SingleNumber3 {

	public int[] singleNumber(int[] nums) {
		int ans = 0;

		for (int i : nums) {
			ans = ans ^ i;
		}
		
		int mask = ans & (~(ans-1));// Rightmost SetBit
		int a =0;
		for (int i : nums) {
			if((mask & i) !=0) {
				a =  a^i;
			}
		}
		int b =  a^ ans;
		int arr[] = {a,b};
		return arr;
		
		
		
	}

}
