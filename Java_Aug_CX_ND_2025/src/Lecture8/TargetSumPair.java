package Lecture8;

import java.util.Scanner;

public class TargetSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean ans = sumpair(arr,target);
		System.out.println(ans);
	}

	public static boolean sumpair(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

}
