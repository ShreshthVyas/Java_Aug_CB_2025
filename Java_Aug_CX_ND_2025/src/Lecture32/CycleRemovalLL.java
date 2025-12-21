package Lecture32;


public class CycleRemovalLL {
	
	public static void main(String[] args) {
		CycleRemovalLL ll =  new CycleRemovalLL();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addlast(50);
		ll.CreateCycle(2);
//		ll.removeCycle();
//		ll.CycleRemovalOptimised();
		ll.FloydCycleRemoval();
		ll.Display();
	}
	
	public class Node{
		int val;
		Node next;
		public Node() {
			this.val =-1;
			this.next = null;
		}
		public Node(int val , Node next) {
			this.val = val;
			this.next = next;
		}
	}
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void addFirst(int item) {
		if(this.size ==0) {
			Node nn = new Node(item,null);
			this.head =nn;
			this.tail = nn;
		}
		else {
			Node nn = new Node(item,this.head);
			this.head =nn;
		}
		this.size++;
	}
	public void addlast(int item) {
		if(this.size ==0) {
			addFirst(item);
		}
		else {
			Node nn = new Node(item,null);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}
	public void Display() {
		Node t = this.head;
		while(t!=null) {
			System.out.print(t.val +"==>");
			t = t.next;
		}
		System.out.println(".");
	}
	
	public Node GetAtIdx(int idx) {
		Node t = this.head;
		int i =0;
		while(i<idx) {
			t=  t.next;
			i++;
		}
		return t;
	}
	
	public void CreateCycle(int idx) {
		Node t = GetAtIdx(idx);
		this.tail.next = t;
	}
	//O(n^2)
	public void removeCycle() {
		Node mp = getMeetpoint();
		if(mp == null) {//No cycle
			return;
		}
		Node t = head;
		while(t!=null) {//find if t is starting or not
			Node m = mp;
			while(m.next!=mp) {// traverse in cycle
				if(m.next ==t) {
					m.next = null;
					return;
				}
				m= m.next;
			}
			t = t.next;	
		}
		
	}
	//O(n+nc)==> O(N)
	public void CycleRemovalOptimised() {
		Node mp = getMeetpoint();
		if(mp == null) {//No cycle
			return;
		}
		//Step 1- Find Cycle Length
		int c =1;
		Node m = mp;
		while(m.next!=mp) {
			c++;
			m = m.next;
		}
		Node slow = head;
		Node fast = head;
		// Move fast c times
		for (int i = 0; i < c; i++) {
			fast =  fast.next;
		}
		// Step 3- Move slow and fast together such that slow travels nc length
		while(slow.next!=fast.next) {
			slow =slow.next;
			fast = fast.next;
		}
		
		fast.next =null;//Cycle removed
	}
	//O(N)
	public void FloydCycleRemoval() {
		Node mp = getMeetpoint();
		if(mp == null) {//No cycle
			return;
		}
		Node slow = head;
		Node fast = mp;
		
		while(slow.next!=fast.next) {
			slow =slow.next;
			fast = fast.next;
		}
		fast.next =null;
	}
	private Node getMeetpoint() {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast =  fast.next.next;
			if(slow == fast) {//cycle 
				return slow;
			}
		}
		return null;
	}
}
