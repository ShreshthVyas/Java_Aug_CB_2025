package Lecture37;

public class LinkedListGeneric <T>  {
	
	public class Node {
		T val;
		Node next;

		public Node() {

		}

		public Node(T val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public void addfirst(T temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			nn.next = head;
			this.head = nn;
		}
		this.size++;
	}

	public void addLast(T temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}

	public void removefirst() {
		if (size == 0) {

		} else {
//			Node temp = head.next;
//			head = temp;
			head = head.next;
			this.size--;
		}

	}

	public void removelast() {
		if (size == 0) {

		} else {
			Node temp = this.head;
			
			while(temp.next!=tail) {
				temp =  temp.next;
			}
			this.tail = temp;
			this.tail.next = null;
		}
		this.size--;
	}
	
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.val+" ==> ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public T getAtIdx(int idx) {
		if(idx>=size) {
			return null;
		}
		int count= 0;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
		return temp.val;
	}
	
	public void addAtIdx(int idx,T t) {
		int count= 1;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
//		Node nn = new Node(t,temp.next);
		Node nn = new Node();
		nn.val = t;
		nn.next = temp.next;
		temp.next = nn;
		this.size++;
	}
	
	public void removeAtIdx(int idx) {
		int count= 1;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		this.size--;
	}
	
	public T Mid() {
		int count= 1;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		int i =0;
		int mid = count/2;
		temp  = head;
		while(i<mid) {
			temp = temp.next;
			i++;
		}
		return temp.val;
	}
	
	public boolean linearsearch(T k) {
		Node temp = head;
		while(temp!=null) {
			if(temp.val == k) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedListGeneric<Integer> ll =  new LinkedListGeneric<>();
		ll.addLast(10);
		ll.addLast(10);
		ll.addLast(10);
		ll.addLast(10);
		ll.addLast(10);
		ll.Display();
		LinkedListGeneric<String> ll1 =  new LinkedListGeneric<>();
		ll1.addLast("A");
		ll1.addLast("A");
		ll1.addLast("A");
		ll1.addLast("A");
		ll1.addLast("A");
		ll1.addLast("A");
	
		ll1.Display();
	}

}
