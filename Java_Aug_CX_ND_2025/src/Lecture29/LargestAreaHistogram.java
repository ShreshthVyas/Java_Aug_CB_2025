package Lecture29;

import java.util.Stack;

public class LargestAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int largestRectangleArea(int[] heights) {
		Stack<Integer> st= new Stack<>();
		int ans  =  Integer.MIN_VALUE;
		
		for (int i = 0; i < heights.length; i++) {
			while(!st.isEmpty() && heights[i]<=heights[st.peek()]) {
				int h =  heights[st.pop()];
				if(st.isEmpty()) {
					int w = i;
					int area = h*w;
					ans = Math.max(ans, area);
				}
				else {
					int w =  i- st.peek() -1;
					int area = h*w;
					ans = Math.max(ans, area);
				}
			}
			
			st.push(i);
		}
		int i = heights.length;
		while(!st.isEmpty()) {
			int h =  heights[st.pop()];
			if(st.isEmpty()) {
				int w = i;
				int area = h*w;
				ans = Math.max(ans, area);
			}
			else {
				int w =  i- st.peek() -1;
				int area = h*w;
				ans = Math.max(ans, area);
			}
		}
		return ans;
	}

}
