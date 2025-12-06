package Lecture27;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		iab(60,s);
		System.out.println(s);
	}

	private static void iab(int i, Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			s.push(i);
			return;
		}
		int a = s.pop();
		iab(i, s);
		s.push(a);
	}

}
