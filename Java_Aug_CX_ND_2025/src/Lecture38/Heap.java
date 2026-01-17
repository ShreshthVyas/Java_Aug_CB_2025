package Lecture38;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> list;
	
	public Heap() {
		list = new ArrayList<>();
	}
	
	public void add(int item) {//O(LogN)
		list.add(item);
		upheapify(list.size()-1);
	}

	public void upheapify(int ci) {//O(LogN)
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(list.get(pi)>list.get(ci)) {
			swap(ci,pi);
			upheapify(pi);
		}
	}

	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		int temPI = list.get(pi);
		int temCI = list.get(ci);
		
		list.set(pi, temCI);
		list.set(ci, temPI);
	}
	
	public int remove() {//O(LogN)
		int temp = list.get(0);
		swap(0,list.size()-1);
		list.remove(list.size()-1);
		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {//O(LogN)
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi +2;
		int mini = pi;
		
		if(c1<list.size() && list.get(mini)> list.get(c1)) {
			mini =c1;
		}
		if(c2<list.size() && list.get(mini)> list.get(c2)) {
			mini =c2;
		}
		
		if(mini!=pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
	
	public int get() { //O(1)
		return list.get(0);
	}
	
	public void Display() {
		System.out.println(list);
	}
}
