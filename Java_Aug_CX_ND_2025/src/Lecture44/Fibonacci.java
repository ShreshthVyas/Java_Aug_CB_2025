package Lecture44;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		int dp[] = new int[n+1];
//		int ans  = fib(n,dp);
		int ans  = fibBU(n);
		System.out.println(ans);
	}

	public static int fib(int n,int dp[]) {
		// TODO Auto-generated method stub
		if(n ==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {// already calculated
			return dp[n];
		}
		int f1 = fib(n-1,dp);
		int f2 = fib(n-2,dp);
		dp[n] = f1+f2;
		return dp[n];
	}
	public static int fibBU(int n) {
		int dp[] =  new int[n+1];
		//base case
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			int f1 = dp[i-1];
			int f2 = dp[i-2];
			dp[i] = f1+ f2;
		}
		
		return dp[n];
	}
//	public static int fib(int n) {
//		// TODO Auto-generated method stub
//		if(n ==0 || n==1) {
//			return n;
//		}
//		int f1 = fib(n-1);
//		int f2 = fib(n-2);
//		return f1+f2;
//	}

}
