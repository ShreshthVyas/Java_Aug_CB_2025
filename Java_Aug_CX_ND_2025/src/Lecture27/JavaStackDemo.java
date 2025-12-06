package Lecture27;

import java.util.Stack;

public class JavaStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.peek();
		s.isEmpty();
		System.out.println(s);
		}

}
