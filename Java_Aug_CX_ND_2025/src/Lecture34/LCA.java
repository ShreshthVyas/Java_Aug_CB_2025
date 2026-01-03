package Lecture34;

import Lecture34.RightView.TreeNode;

public class LCA {

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

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root ==null) {
			return null;
		}
		if(root ==p || root==q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left !=null && right !=null) {//both not null
			return root;
		}
		if(left==null) {
			return right;
		}
		else {// both null or right
			return left;
		}
	}

}
