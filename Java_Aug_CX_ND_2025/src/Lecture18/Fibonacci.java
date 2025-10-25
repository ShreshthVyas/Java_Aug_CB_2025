package Lecture18;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 10;
		int a = fib(n);
		System.out.println(a);
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n ==0 || n==1) {
			return n;
		}
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1+f2;
		
	}

}
