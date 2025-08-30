package Lecture3;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int nst = 1;
		int row =1;
		int val =1;
		while(row<=(2*n-1)) {
			int cst = 0;
			while(cst<nst) {
				if(cst%2 == 0) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("* ");
				}
				cst++;
			}
			System.out.println();
			if(row<n) {
				nst+=2;
				val++;
			}
			else {
				nst-=2;
				val--;
			}
			row++;
		}
	
	}

}
