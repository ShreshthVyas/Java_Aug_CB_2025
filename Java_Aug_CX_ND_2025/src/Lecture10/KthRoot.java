package Lecture10;

import java.util.Scanner;

public class KthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >  0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			long lo = 1;
			long hi = n;
			long ans =-1;
			
			while(lo<=hi) {
				long mid =  (lo+hi)/2;
				if(Math.pow(mid, k)<=n) {
					ans = mid;
					lo = mid+1;
				}
				else {
					hi = mid-1;
				}
			}
			
			System.out.println(ans);
			
		}
	}

}
