package Lecture4;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int sum = 0;
		
		while(n>0) {
			int d = n%10;
			sum = (sum* 10) +d;//sum+=d
			n = n/10;// n/=10;
		}
		
		System.out.println(sum);
	}

}
