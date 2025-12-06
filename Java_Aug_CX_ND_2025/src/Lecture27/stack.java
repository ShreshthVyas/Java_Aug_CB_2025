package Lecture27;

public class stack {
	// All major functions in O(1) 
	private int top =-1;
	private int arr[];
	
	public stack() {
		this.arr = new int[5];
	}
	public stack(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return this.top ==-1;
	}
	public boolean isFull() {
		return this.top == this.arr.length-1;
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		this.top++;
		this.arr[top] = item;
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.arr[top];
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.arr[top];
		this.arr[top] = 0;
		this.top--;
		return rv;
	}
	public int size() {
		return this.top + 1;
	}
	
	public void Display() {
		for (int i = top; i>=0; i--) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
	

}
