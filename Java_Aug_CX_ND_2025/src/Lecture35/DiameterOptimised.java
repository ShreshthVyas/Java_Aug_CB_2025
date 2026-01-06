package Lecture35;

import Lecture35.DiameterOfaTree.TreeNode;

public class DiameterOptimised {

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
	public class diapair{
		int d =0;
		int h =-1;
	}
	public int diameterOfBinaryTree(TreeNode root) {
		return diameter(root).d;
	}
	public diapair diameter(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new diapair();
		}
		diapair ldp = diameter(root.left);
		diapair rdp = diameter(root.right);
		diapair sdp =  new diapair();
		sdp.h = Math.max(ldp.h, rdp.h) +1;
		int sd = ldp.h+ rdp.h+2;//self
		sdp.d = Math.max(sd, Math.max(rdp.d, ldp.d));
		
		return sdp;
	}

}
