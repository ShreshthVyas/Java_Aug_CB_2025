package Lecture38;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();//Min heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); --> MAx HEap
		pq.add(10);
		pq.add(20);
		pq.add(40);
		pq.add(0);
		pq.add(-4);
		pq.add(70);
		pq.add(400);
		pq.add(2);
		pq.add(3);
		
		System.out.println(pq.remove());
		System.out.println(pq.peek());
	}

}
