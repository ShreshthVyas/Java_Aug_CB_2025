package Lecture35;

import Lecture33.BinaryTree.Node;
import Lecture34.LCA.TreeNode;

public class DiameterOfaTree {

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

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int ld = diameterOfBinaryTree(root.left);
		int rd = diameterOfBinaryTree(root.right);
		int sd  =  height(root.left) + height(root.right) + 2;
		
		return Math.max(sd, Math.max(rd, ld));
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
