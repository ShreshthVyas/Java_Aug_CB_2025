package Lecture36;

import Lecture36.InserIntoBST.TreeNode;

public class DeleteINtoBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root ==null) {
			return null;
		}
		if(root.val<key) {
			root.right = deleteNode(root.right, key);
		}
		else if (root.val>key) {
			root.left = deleteNode(root.left, key);
		}
		else {//key found
			if(root.left==null) {//both child null && left is null
				return root.right;
			}
			else if(root.right ==null) {//one child ==> right is null
				return root.left;
			}
			else {// both child not null
				int leftmax = max(root.left);//find leftmax
				root.left = deleteNode(root.left, leftmax);//delete leftmax
				root.val = leftmax;
			}
			
		}
		return root;
	}

	private int max(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int right = max(root.right);
		return Math.max(right, root.val);
	}

}
