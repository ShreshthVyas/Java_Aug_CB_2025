package Lecture35;

public class TreeBuild_Pre_IN_order {

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

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
		}

		private TreeNode build(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei) {
			// TODO Auto-generated method stub
			if (psi > pei || isi > iei) {
				return null;
			}
			TreeNode node = new TreeNode(preorder[psi]);
			int idx = find(inorder, preorder[psi], isi, iei);
			int count = idx - isi;
			node.left = build(preorder, psi + 1, psi + count, inorder, isi, idx - 1);
			node.right = build(preorder, psi + count + 1, pei, inorder, idx + 1, iei);

			return node;
		}

		private int find(int[] inorder, int target, int isi, int iei) {
			// TODO Auto-generated method stub
			for (int j = isi; j <= iei; j++) {
				if (inorder[j] == target) {
					return j;
				}
			}
			return 0;
		}
	}
}
