package Lecture34;

import Lecture34.SymmetricTree.TreeNode;

public class FlipEquivalent {

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

	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
		if(root1==null && root2==null) {// both child null
			return true;
		}
		if(root1==null || root2==null) {// 1 child
			return false;
		}
		if(root1.val != root2.val) {//both child present
			return false;
		}
		
		boolean notflip = flipEquiv(root1.left, root2.right)
				&& flipEquiv(root1.right, root2.left);
		boolean flip = flipEquiv(root1.left, root2.left)
				&& flipEquiv(root1.right, root2.right);
		
		return flip || notflip;
	}

}
