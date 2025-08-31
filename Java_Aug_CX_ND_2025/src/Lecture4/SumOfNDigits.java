package Lecture4;

import java.util.Scanner;

public class SumOfNDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n  = sc.nextInt();
		int sum = 0;
//		for (; n>0; n/=10) {
//			
//		}
		while(n>0) {
			int d = n%10;
			sum = sum+d;//sum+=d
			n = n/10;// n/=10;
		}
		System.out.println(sum);
	}

}
