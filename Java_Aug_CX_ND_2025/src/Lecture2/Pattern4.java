package Lecture2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
		while(row<=n) {
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//stars
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nst++;
			nsp--;
		}
	}

}
