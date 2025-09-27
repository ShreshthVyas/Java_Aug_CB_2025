package Lecture11;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int books[] = new int[nob];
			for (int i = 0; i < books.length; i++) {
				books[i] = sc.nextInt();
			}
			
			int ans  = binarysearch(nos,nob,books);
			System.out.println(ans);
			
		}
	}

	public static int binarysearch(int nos, int nob, int[] books) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = 0;
		
		for (int i = 0; i < books.length; i++) {
			hi+= books[i];
		}
		int ans =-1;
		while(lo<=hi) {
			int mid = (hi+lo)/2;
			if(isItPossible(mid,books,nob,nos)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int mid, int[] books, int nob, int nos) {
		// TODO Auto-generated method stub
		int cs = 1;
		int pages_read = 0;
		
		for (int i = 0; i < books.length; ) {
			if(pages_read+books[i]<=mid) {
				pages_read = pages_read+books[i];
				i++;
			}
			else {
				cs++;
				pages_read = 0;
			}
			if(cs>nos) {
				return false;
			}
		}
		return true;
	}

}
