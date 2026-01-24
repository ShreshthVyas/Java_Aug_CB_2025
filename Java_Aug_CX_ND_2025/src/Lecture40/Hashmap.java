package Lecture40;

import java.util.ArrayList;

public class Hashmap <K,V>{
	// Almost all functions in O(1)
	public class Node{
		K key;
		V val;
		Node next;
		Node(){
			
		}
		Node(K key,V val , Node next){
			this.val = val;
			this.key = key;
			this.next = next;
		}
	}
	private ArrayList<Node> bckt;
	private int size =0;
	
	public Hashmap() {
		this(5);// this calls the constructor below this
	}
	
	public Hashmap(int n) {
		bckt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K key , V val) {
		int idx = getIdx(key);
		Node temp = bckt.get(idx);
		
		while(temp!=null) {//key already exists
			if(temp.key.equals(key)) {//key already found hence override value
				temp.val = val;
				return;
			}
			temp = temp.next;
		}
		
		//Key does not exist // Index Empty
		Node nn = new Node();
		nn.key = key;
		nn.val = val;
		temp = bckt.get(idx);
		nn.next = temp;
		bckt.set(idx, nn);
		this.size++;
		double thf = 2.0;//threshold;
		double lf = this.size/this.bckt.size();
		if(lf>thf) {
			rehashing();
		}
		
	}
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> temp = new ArrayList<>();
		for (int i = 0; i < 2* this.bckt.size(); i++) {
			temp.add(null);
		}
		ArrayList<Node>  ll = this.bckt;
		this.bckt = temp;
		
		for (Node head : ll) {
			while(head!=null) {
				put(head.key, head.val);
				head = head.next;
			}
		}
		
		
	}

	public void remove(K key) {
		int idx = getIdx(key);
		Node curr = bckt.get(idx);
		Node prev =null;
		
		while(curr!=null) {
			if(curr.key.equals(key)) {// key found
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if(curr == null) {// key nor found
			return;
		}
		else if(prev ==null) {// Key is first node
			bckt.set(idx , curr.next);
			
			curr.next = null;
		}
		else {//key in ll 
			prev.next = curr.next;
			curr.next =null;
		}
		this.size--;
	}
	public V get(K key) {
		int idx = getIdx(key);
		Node temp = bckt.get(idx);
		
		while(temp!=null) {//key already exists
			if(temp.key.equals(key)) {//key already found hence override value
				return temp.val;
			}
			temp = temp.next;
		}
		
		return null;
		
	}
	public boolean containsKey(K key) {
		int idx = getIdx(key);
		Node temp = bckt.get(idx);
		
		while(temp!=null) {//key already exists
			if(temp.key.equals(key)) {//key already found hence override value
				return true;
			}
			temp = temp.next;
		}
		
		return false;
		
	}
	
	@Override
	public String toString() {
		String s = "{";
		
		for (Node head : bckt) {
			while(head!=null) {
				s+= head.key + "=" + head.val + ",";
				head = head.next;
			}
		}
		
		s+= "}";
		return s;
	}

	private int getIdx(K key) {
		// TODO Auto-generated method stub
		int idx = key.hashCode() % this.bckt.size();
		if(idx<0) {
			idx+= this.bckt.size();
		}
		
		return idx;
	}
	
}
