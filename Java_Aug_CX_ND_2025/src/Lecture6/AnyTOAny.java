package Lecture6;

import java.util.Scanner;

public class AnyTOAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int dec = anytodec(n,a);
		
		int ans  = dectoany(dec,b);
		
		System.out.println(ans);
	}

	public static int dectoany(int n, int b) {
		// TODO Auto-generated method stub
		int ans = 0;
		int mul = 1;
		while(n>0) {
			int r = n%b;
			ans = ans + r*mul;
			mul =  mul *10;
			n = n/b;
		}
		return ans;
	}

	public static int anytodec(int n, int a) {
		// TODO Auto-generated method stub
		int mul =1;
		int ans = 0;
		while(n>0) {
			int r = n%10;
			ans = ans+ r*mul;
			mul = mul*a;
			n = n/10;
		}
		return ans;
	}

}
