package Lecture11;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		int i = 1;
		int n = 10;
		int k = 120;
		while(i<=n) {//O(N)
			
			i++;
		}
		
		while(i<=n) {//O(N/5)
			
			i+=2;
			i+=3;
		}
		
		while(i<=n) {//O(LogN)
			
			i*=2;
		}
		while(i<=n) {//O(LogN)
			
			n=  n/2;
		}
		while(i<=n) {//O(LogN)
			
			n=  n/3;
		}
		
		while(i<=n) {//O(N/k)
			i+=k;
		}
		
		while(i<=n) {//O(LogN base k)
			i*=k;
		}
		
		for (int j = 0; j < n; j++) {
			for (int v = 0; v < n; v++) {
				//O(N^2)
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int v = j; v < n; v++) {
				//O(N^2)
			}
		}
		for (int j = 0; j < n; j++) {
			for (int v = 0; v <=j; v++) {
				//O(N^2)
			}
		}
		
		for (int j = 0; j*j < n ; j++) {
			//O(SqrtN)
		}
		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					//O(N^4)
				}
			}
		}
		
		for (int j = 1; j <=n ; j++) {
			for (int a = 1; a <= n; a+=j) {
				//O(N)
			}
		}
		for (int j = 1; j <=n ; j*=2) {
			for (int a = 1; a <= n; a++) {//O(NLogN)
				
			}
		}
		
		for (int a = n/2; a <=n ; a++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					
				}
			}
		}
		//BinarySearch - O(LogN)
		//LinearSearch - O(N)
		
		
		
	}

}
