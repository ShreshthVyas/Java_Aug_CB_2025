package Lecture35;

import Lecture35.BalancedBinaryTree.TreeNode;

public class BalncedBTOptimised {
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
	public class balpair{
		boolean b = true;
		int h =-1;
	}
	public boolean isBalanced(TreeNode root) {
		return balanced(root).b;
	}
	private balpair balanced(TreeNode root) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return new balpair();
		}
		balpair lbp = balanced(root.left);
		balpair rbp = balanced(root.right);
		balpair sbp = new balpair();
		sbp.h =  Math.max(lbp.h, rbp.h) +1;
		boolean sb = Math.abs(lbp.h-rbp.h)<=1;
		sbp.b = lbp.b && rbp.b && sb;
		return sbp;
	}
}
