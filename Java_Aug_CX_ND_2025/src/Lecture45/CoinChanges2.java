package Lecture45;

public class CoinChanges2 {
	
	 public int changeMEMO(int amount, int[] coins) {
		 Integer dp[][] =  new Integer[coins.length][amount+1];
	     return rec(coins,amount,0,dp);
	 }

	private int rec(int[] coins, int amount, int i, Integer dp[][] ) {
		// TODO Auto-generated method stub
		if(i == coins.length) {
			return 0;
		}
		if(amount ==0) {
			return 1;
		}
		if(dp[i][amount] != null) {
			return dp[i][amount];
		}
		int inc =0;
		int exc =0;
		
		if(amount - coins[i]>=0) {
			inc = rec(coins, amount-coins[i], i,dp);
		}
		exc = rec(coins, amount, i+1,dp);
		return dp[i][amount] = inc+exc;
	}
	
	 public int change(int amount, int[] coins) {
	        int dp[][] =  new int[coins.length+1][amount+1];
	        
	        for (int i = 0; i < dp.length; i++) {
				dp[i][0] = 1;
			}
	        
	        for (int i = 1; i < dp.length; i++) {
				for (int amnt = 1; amnt < dp[0].length; amnt++) {
					int inc =0;
					int exc =0;
					if(amnt >= coins[i-1]) {
						inc = dp[i][amnt- coins[i-1]];
					}
					exc = dp[i-1][amnt];
					
					dp[i][amnt] = inc+ exc;
				}
			}
	        
	        return dp[dp.length-1][dp[0].length-1];
	 }
	 
	 
}
