package Lecture6;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println(a + " " + b);
	}

	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp  =  a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

}
