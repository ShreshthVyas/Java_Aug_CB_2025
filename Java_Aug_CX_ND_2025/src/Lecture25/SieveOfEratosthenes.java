package Lecture25;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		boolean arr[] =  new boolean[1001];
		
		for (int i = 2; i*i <= n ; i++) {// multiple from 2 --> sqrt n
			if(arr[i] == false) {
				for (int j = 2; j*i < arr.length; j++) {
					arr[j*i] =  true;
				}
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
	
	}

}
