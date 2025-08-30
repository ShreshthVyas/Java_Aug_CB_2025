package Lecture3;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int nst =1;
		int nsp = n/2;
		int row = 1;
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
			if(row<=n/2) {
				nsp--;
				nst+=2;
			}
			else {
				nsp++;
				nst-=2;
			}
			row++;
		}
		
	}

}
