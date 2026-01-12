package Lecture37;

public abstract class AbstractDemo {

public abstract void p1();
	
	public void p2() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		AbstractDemo demo =  new AbstractDemo() {

			@Override
			public void p1() {
				// TODO Auto-generated method stub
				System.out.println("HI from p1");
			}
		
		};
		
		demo.p1();
	}

}
