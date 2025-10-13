package Lecture16;

import java.util.ArrayList;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		int brr[] = {9,9,9,9,9,9,9,9};
		ArrayList<Integer> list = new ArrayList<>();
		
		int i =  arr.length-1;
		int j =  brr.length-1;
		int carry = 0;
		
		while(i>=0 && j>=0) {
			int sum  =  arr[i] + brr[j] + carry;
			list.addFirst(sum%10);
			carry =  sum/10;
			i--;
			j--;
		}
		
		while(i>=0) {
			int sum  =  arr[i] + carry;
			list.addFirst(sum%10);
			carry =  sum/10;
			i--;
		}
		while(j>=0) {
			int sum  =  brr[j] + carry;
			list.addFirst(sum%10);
			carry =  sum/10;
			j--;
		}
		if(carry>0) {
			list.addFirst(carry);
		}
		
		System.out.println(list);
		
	}

}
