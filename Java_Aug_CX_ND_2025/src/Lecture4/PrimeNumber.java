package Lecture4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n =  sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if(n%i ==0) {
				count++;
				break;
			}
		}
		if(count>0) {
			System.out.println("NOT PRIME");
		}
		else {
			System.out.println("PRIME");
		}
		
	}

}
