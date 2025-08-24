package Lecture2;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int row =1;
		int nst = 1;
		int nsp = n-1;
		
		while(row<=n) {
			int val =1;
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//star
			int cst = 0;
			while(cst<nst) {
				if(cst == 0 || cst == nst-1) {
					System.out.print(row+ " ");
				}
				else {
					System.out.print("0 ");
				}
				
				cst++;
			}
			System.out.println();
			row++;
			nst+=2;//nst = nst+2
			nsp--;
		}
	}

}
