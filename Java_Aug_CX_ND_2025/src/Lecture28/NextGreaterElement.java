package Lecture28;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {105,10,12,11,13,19,4,3,1,104,2};
		int ans[] = nge(arr);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] nge(int[] arr) {
		// TODO Auto-generated method stub
		int ans[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]> arr[st.peek()]) {//arr[i[ is the nge of the element present at peek
				int idx = st.pop();
				ans[idx] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int idx = st.pop();
			ans[idx] = -1;
		}
		return ans;
	}

}
