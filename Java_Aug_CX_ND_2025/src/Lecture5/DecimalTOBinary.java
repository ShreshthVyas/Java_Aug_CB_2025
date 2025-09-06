package Lecture5;

import java.util.Scanner;

public class DecimalTOBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int mul = 1;
		while(n>0) {
			int r = n%2;
			ans = ans + r*mul;
			mul =  mul *10;
			n = n/2;
		}
		
		System.out.println(ans);
	}

}
