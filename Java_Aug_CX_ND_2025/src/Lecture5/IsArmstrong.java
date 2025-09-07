package Lecture5;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = countofdigits(n);
		
		boolean ans = check(n,m);
		
		System.out.println(ans);
	}

	public static boolean check(int n, int m) {
		int t = n;
		int sum = 0;
		while(n>0) {
			int r = n%10;
			sum = (int) (sum + Math.pow(r, m));
			n= n/10;
		}
		if(sum == t) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int countofdigits(int n) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(n>0) {
			n=  n/10;
			count++;
		}
		return count;
	}

}
