package Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int stalls[] = new int[nos];
		
		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}
		Arrays.sort(stalls);
		int ans = binarysearch(stalls,noc,nos);
		
		System.out.println(ans);
		
	}

	public static int binarysearch(int[] stalls, int noc, int nos) {
		// TODO Auto-generated method stub
		int lo = 1;
		int hi = stalls[stalls.length-1] - stalls[0];
		int ans = -1;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(IsItPossible(mid,stalls,noc,nos)) {
				ans =  mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		
		return ans;
	}

	public static boolean IsItPossible(int mid, int[] stalls, int noc, int nos) {
		// TODO Auto-generated method stub
		int place = stalls[0];
		int cpsf = 1;
		
		for (int i = 1; i < stalls.length; i++) {
			if(stalls[i] - place>=mid) {
				place  = stalls[i];
				cpsf++;
			}
			if(cpsf == noc) {
				return true;
			}
		}
		
		return false;
	}

}
