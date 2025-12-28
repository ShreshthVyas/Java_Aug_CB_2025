package Lecture33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	
	public class Node {
		int val;
		Node left;
		Node right;
		
		public Node(){
			
		}
		public Node(int val , Node left, Node right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	private Node root;
	Scanner sc =  new Scanner(System.in);
	public BinaryTree() {
		this.root = createtree();
	}

	private Node createtree() {
		// TODO Auto-generated method stub
		Node nn =  new Node();
		nn.val =  sc.nextInt();
		
		boolean hlc = sc.nextBoolean();//has left child
		if(hlc) {
			nn.left = createtree();
		}
		boolean hrc = sc.nextBoolean();//has left child
		if(hrc) {
			nn.right = createtree();
		}
		return nn;
	}
	
	public void Display() {
		display(this.root);
	}

	private void display(Node nn) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return;
		}
		String s = "" + nn.val;
		if(nn.left!=null) {
			s =  nn.left.val +" <== " +s;
		}
		else {
			s =  ". <== " +s;
		}
		if(nn.right!=null) {
			s =  s+ " ==> " + nn.right.val;
		}
		else {
			s = s+ " ==> .";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}
	
	public int Max() {
		return max(this.root);
	}
	private int max(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(nn.left);
		int rightmax = max(nn.right);
		
		return Math.max(nn.val, Math.max(leftmax, rightmax));
	}
	
	public boolean Find(int target) {
		  return find(root,target);
	}

	private boolean find(Node nn,int target) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return false;
		}
		if(nn.val ==target) {
			return true;
		}
		boolean left =  find(nn.left, target);
		boolean right =  find(nn.right, target);
		
		return left||right;
		
	}
	
	public int Height() {
		return height(root);
	}

	private int height(Node nn) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return -1;
		}
		int lh = height(nn.left);
		int rh = height(nn.right);
		
		return Math.max(lh, rh)+1;
	}
	
	public void PreOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node nn) {// NLR
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		System.out.print(nn.val+" ");
		preOrder(nn.left);
		preOrder(nn.right);	
	}
	public void InOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node nn) {// LNR
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		
		inOrder(nn.left);
		System.out.print(nn.val+" ");
		inOrder(nn.right);	
	}
	public void PostOrder() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node nn) {// LRN
		// TODO Auto-generated method stub
		if(nn==null) {
			return;
		}
		postOrder(nn.left);
		postOrder(nn.right);
		System.out.print(nn.val+" ");
	}
	
	public void LevelOrdertraversal() {
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);// Enqueue root
		
		while(!q.isEmpty()) {
			// remove 
			Node temp = q.remove();//Dequeue
			System.out.print(temp.val+" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
	}
	

}
