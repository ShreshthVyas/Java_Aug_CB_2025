package Lecture37;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class BusyMan {

	public static class pair{
		int st;
		int et;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0) {
			int noa =  sc.nextInt();
			pair arr[] = new pair[noa];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new pair();
				arr[i].st = sc.nextInt();
				arr[i].et = sc.nextInt();
			}
			Arrays.sort(arr, new Comparator<pair>() {

				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			
			int count = 1;
			int cet = arr[0].et;
			
			for (int i = 1; i < arr.length; i++) {
				if(arr[i].st >= cet) {
					count++;
					cet = arr[i].et;
				}
			}
			
			System.out.println(count);
		}
	}

}
