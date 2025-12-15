package Lecture30;

import Lecture27.stack;

public class DynamicStack extends stack {
	
	@Override
	public void push(int item)  {
		if(isFull()) {
			int newarr[] =  new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			this.arr = newarr;
		}
//		super.push(item);
		this.top++;
		this.arr[top] = item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicStack st =  new DynamicStack();
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.Display();
	}

}
