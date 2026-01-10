package Lecture36;

import Lecture36.DeleteINtoBST.TreeNode;

public class ValidateBST {

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
	public class bstpair{
		boolean isbst = true;
		long max = Long.MIN_VALUE;
		long min  = Long.MAX_VALUE;
	}

	public boolean isValidBST(TreeNode root) {
		return valid(root).isbst;
	}

	private bstpair valid(TreeNode root) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return new bstpair();
		}
		bstpair left = valid(root.left);
		bstpair right = valid(root.right);
		bstpair self =  new bstpair();
		boolean check = root.val > left.max && root.val < right.min;
		self.isbst = check && left.isbst && right.isbst;
		self.max = Math.max(root.val, Math.max(left.max, right.max));
		self.min = Math.min(root.val, Math.min(left.min, right.min));
		
		return self;
	}

}
