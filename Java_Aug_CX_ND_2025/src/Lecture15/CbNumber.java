package Lecture15;

import java.util.Scanner;

public class CbNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =  sc.next();
		int count = 0;
		boolean vis[] = new boolean[s.length()];
		for (int i = 1; i <= s.length(); i++) {//length of substring
			for (int j = 0; j <= s.length()-i; j++) {
				String t =  s.substring(j,j+i);
				long l =  Long.parseLong(t);
				boolean check =  isCBnum(l);
				if(check && isvis(vis,j,j+i)) {
					count++;
					System.out.println(l);
					for (int k = j; k < j+i; k++) {// marked all character true
						vis[k]  = true;	
					}
				}
			}
			
		}
		System.out.println(count);
	}

	public static boolean isvis(boolean[] vis,int j, int k) {
		// TODO Auto-generated method stub
		for (int i = j; i < k; i++) {
			if(vis[i] ==true) {// character already visited
				return false;
			}
		}
		return true;
	}

	public static boolean isCBnum(long l) {
		// TODO Auto-generated method stub
		//point 1
		if(l ==0 || l == 1) {
			return false;
		}
		int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		//point 2
		for (int i : arr) {
			if(i == l) {
				return true;
			}
		}
		
		//point 3
		for (int i= 0;i<arr.length;i++) {
			if(l%arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
