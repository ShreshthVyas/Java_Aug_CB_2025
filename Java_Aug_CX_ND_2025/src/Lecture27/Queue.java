package Lecture27;

public class Queue {

	private int arr[];
	private int front=0;
	private int size=0;
	
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int size) {
		this.arr = new int[5];
	}
	
	public boolean isFull() {
		return this.size == arr.length;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void Enqueu(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		int idx = (this.front+ this.size) % this.arr.length;
		this.arr[idx] = item;
		this.size++;
	}
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is full");
		}
		int rv = arr[this.front];
		arr[this.front] =0;
		this.front = (this.front+1) % arr.length;
		this.size --;
		return rv;
	}
	
	public void Display() {
		for (int i = 0; i < this.size; i++) {
			int idx =  (front+i) % this.arr.length;
			System.out.print(this.arr[idx]+" ");
		}
		System.out.println();
	}

}
