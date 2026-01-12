package Lecture37;

public class AbstractChild extends AbstractDemo{
	@Override
	public void p1() {
		// TODO Auto-generated method stub
		System.out.println("Hi from p1");
	}
	
	public static void main(String[] args) {
		AbstractChild child =  new AbstractChild();
		child.p1();
	}
}
