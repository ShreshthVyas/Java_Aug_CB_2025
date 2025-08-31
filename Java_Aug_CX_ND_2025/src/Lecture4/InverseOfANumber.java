package Lecture4;

import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int place = 1;
		int sum = 0;
		
		while(n>0) {
			int d = n%10;
			sum  = (int) (sum + place * Math.pow(10, d-1));
			n=  n/10;
			place++;
		}
		System.out.println(sum);
		
		
	}

}
