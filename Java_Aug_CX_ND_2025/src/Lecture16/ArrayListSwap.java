package Lecture16;

import java.util.ArrayList;

public class ArrayListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		swap(3,6,list);
		System.out.println(list);
	}

	public static void swap(int i, int j ,ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int temp1 =  list.get(i);
		int temp2 =  list.get(j);
		
		list.set(i, temp2);
		list.set(j, temp1);
		
	}

}
