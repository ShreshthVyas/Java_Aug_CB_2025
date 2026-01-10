package Lecture36;

public class BST {

	public class Node {
		int val;
		Node left;
		Node right;

		public Node() {

		}

		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;

	public BST(int in[]) {
		this.root = createTree(0,in.length-1,in);
	}

	private Node createTree(int si, int ei, int[] in) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		//Step -1 : Find Mid and make root
		int mid = (si+ei)/2;
		Node n = new Node();
		n.val =in[mid];
		
		//Step - 2 Recursion left and Right construction
		n.left = createTree(si, mid-1, in);
		n.right = createTree(mid+1,ei, in);
		
		return n;
	}

	public void Display() {
		display(this.root);
	}

	private void display(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		String s = "" + nn.val;
		if (nn.left != null) {
			s = nn.left.val + " <== " + s;
		} else {
			s = ". <== " + s;
		}
		if (nn.right != null) {
			s = s + " ==> " + nn.right.val;
		} else {
			s = s + " ==> .";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}
	
	public static void main(String[] args) {
		int arr[] = {40,50,60,67,90,100,110,220,300};
		BST bst = new BST(arr);
		
		bst.Display();
	}
}
