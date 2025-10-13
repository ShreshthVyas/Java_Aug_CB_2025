package Lecture16;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(60);
		
		list.add(1, 200);
		list.addFirst(300);
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.set(0, 99);
		
		list.add(8,1000);
		System.out.println(list);
		list.remove(3);
		
		
		
		
		
		
	}
	

}
