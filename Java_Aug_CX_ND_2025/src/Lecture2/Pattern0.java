package Lecture2;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		
		while(row<=n) { // Row change
			int cst = 0;
			while(cst<nst) {// Print number of stars in each row
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
		
	}

}
