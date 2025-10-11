package Lecture15;

import java.util.Arrays;

public class FrequencyArrayOptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "aabbaabbcxxcddeabcz";
		
		int arr[] =  new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			int idx =  ch-'a';
			arr[idx]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				continue;
			}
			char ch =  (char) (i+'a');
			System.out.println(ch + " " + arr[i]);
			
		}
	}

}
