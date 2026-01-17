package Lecture38;
import java.util.PriorityQueue;

public class MinSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,2,1};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		while(pq.size()>1) {
			int a = pq.remove();// Min element
			int b = pq.remove();// 2nd Min element
	
			int sum = a+b;
			ans+=sum;
			pq.add(sum);
		}
		
		System.out.println(ans);
	}

}
