package Lecture34;

import java.util.ArrayList;
import java.util.List;

import Lecture34.FlipEquivalent.TreeNode;

public class RightView {

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
	int maxLvl;
	List<Integer> ans;
	public List<Integer> rightSideView(TreeNode root) {
		ans = new ArrayList<>();
		maxLvl =-1;
		rightview(root,0);
		return ans;
	}
	private void rightview(TreeNode root, int currLvl) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return;
		}
		if(maxLvl<currLvl) {// new level
			ans.add(root.val);
			maxLvl =currLvl;
		}
		rightview(root.right,currLvl+1);
		rightview(root.left,currLvl+1);
	}

}
