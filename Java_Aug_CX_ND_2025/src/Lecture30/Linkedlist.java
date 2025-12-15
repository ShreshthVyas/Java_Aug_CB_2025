package Lecture30;

public class Linkedlist {
	
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
	public void addatIdx(int item,int idx) {
		Node t = this.head;
		int i =0;
		while(i<idx-1) {
			t=  t.next;
			i++;
		}
		Node nn =  new Node();
		nn.val = item;
		nn.next = t.next;
		t.next =nn;
		this.size++;
	}
	
	public void removefirst() {
		this.head = this.head.next;
		this.size--;
	}
	public void removelast() {
		Node t = this.head;
		
		while(t.next!=this.tail) {// t.next.next!=null
			t = t.next;
		}
		t.next =null;
		this.tail =t;
		this.size--;
	}
	
	public void removeAtIdx(int idx) {
		Node t = this.head;
		int i =0;
		while(i<idx-1) {
			t=  t.next;
			i++;
		}
		t.next =  t.next.next;
		this.size--;
	}
	
	public boolean linearsearch(int target) {
		Node t = this.head;
		while(t!=null) {
			if(t.val == target) {
				return true;
			}
			t = t.next;
		}
		return false;
	}
	
}
