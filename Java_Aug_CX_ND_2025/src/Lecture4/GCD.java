package Lecture4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend =  sc.nextInt();
		int divisor =  sc.nextInt();
		
		while(dividend%divisor!=0) {
			int r = dividend%divisor;
			dividend = divisor;
			divisor = r;
		}
		System.out.println(divisor);
	}

}
