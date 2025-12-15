package Lecture30;

import Lecture27.Queue;

public class DynamicQueue extends Queue {
	
	public void Enqueu(int item){
		if(isFull()) {
			int newarr[] =  new int[2*arr.length];
			for (int i = 0; i < this.size; i++) {
				int idx =  (front+i) % this.arr.length;
				newarr[i] = arr[idx];
			}
			this.front = 0;
			this.arr = newarr;
		}
		
		int idx = (this.front+ this.size) % this.arr.length;
		this.arr[idx] = item;
		this.size++;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicQueue q =  new DynamicQueue();
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
		q.Enqueu(10);
	
	}

}
