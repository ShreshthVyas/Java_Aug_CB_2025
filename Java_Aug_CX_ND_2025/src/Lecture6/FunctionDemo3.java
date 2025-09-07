package Lecture6;

public class FunctionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		add();
		System.out.println("bye");
	}
	public static void sub() {
		// TODO Auto-generated method stub
		System.out.println("HI from sub");
		int a  =10;
		int b  = 20;
		System.out.println(b-a);
	}
	public static void add() {
		int a  = 10;
		int b =20;
		sub();
		System.out.println(a+b);
	}


}
