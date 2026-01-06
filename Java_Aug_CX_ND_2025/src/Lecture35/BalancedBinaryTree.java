package Lecture35;

import Lecture35.DiameterOptimised.TreeNode;

public class BalancedBinaryTree {
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

	public boolean isBalanced(TreeNode root) {
		if(root ==null) {
			return true;
		}
		boolean lb = isBalanced(root.left);
		boolean rb = isBalanced(root.right);
		int lh = height(root.left);
		int rh = height(root.right);
		boolean sb = Math.abs(lh-rh)<=1;
		
		return lb && rb && sb;
	}
	private int height(TreeNode nn) {
		// TODO Auto-generated method stub
		if(nn ==null) {
			return -1;
		}
		int lh = height(nn.left);
		int rh = height(nn.right);
		
		return Math.max(lh, rh)+1;
	}
}
