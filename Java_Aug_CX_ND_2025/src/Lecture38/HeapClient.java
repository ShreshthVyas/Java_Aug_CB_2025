package Lecture38;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap pq =  new Heap();
		pq.add(10);
		pq.add(20);
		pq.add(40);
		pq.add(0);
		pq.add(-4);
		pq.add(70);
		pq.add(400);
		pq.add(2);
		pq.add(3);
		pq.Display();
		System.out.println(pq.remove());
		pq.Display();
		System.out.println(pq.get());
		System.out.println(pq.remove());
		pq.Display();
		System.out.println(pq.remove());
		pq.Display();
		
	}

}
