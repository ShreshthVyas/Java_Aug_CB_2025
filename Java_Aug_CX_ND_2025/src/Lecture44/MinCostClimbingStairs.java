package Lecture44;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCostClimbingStairs(int[] cost) {
		int zero = rec(0,cost);
		int one = rec(1,cost);
		return Math.min(zero, one);
	}

	private int rec(int i, int[] cost) {
		// TODO Auto-generated method stub
		if(i>=cost.length) {
			return 0;
		}
		
		int oneStep  = rec(i+1, cost);
		int twoStep  = rec(i+2, cost);
		
		return cost[i] + Math.min(oneStep, twoStep);
	}

}
