package Lecture5;

public class PostIncrementPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 12;
		
		int d = a++ + --b +67 + a-- + b++ + ++b+ 2;
		
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
	}

}
