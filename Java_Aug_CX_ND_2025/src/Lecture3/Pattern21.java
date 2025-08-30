package Lecture3;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst1 = 1;
		int nst2 = 1;
		int nsp = 2 * n - 3;
		int row = 1;

		while (row <= n) {
			// star
			int cst1 = 0;
			if (row == n) {
				cst1++;
			}
			while (cst1 < nst1) {
				System.out.print("* ");
				cst1++;
			}

			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			// star
			int cst2 = 0;
//			if (row == n) {
//				cst2++;
//			}
			while (cst2 < nst2) {
				System.out.print("* ");
				cst2++;
			}

			System.out.println();
			row++;
			nst1++;
			nst2++;
			nsp -= 2;
		}
	}

}
