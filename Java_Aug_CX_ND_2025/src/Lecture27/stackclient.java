package Lecture27;

public class stackclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack s =  new stack();
		System.out.println(s.isEmpty());
//		s.arr= null;
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.Display();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(100);
		System.out.println(s.size());
		s.push(200);
		s.push(300);
		System.out.println(s.size());
		System.out.println(s.isFull());
//		s.push(40);
		s.Display();
		
		
		
	}

}
