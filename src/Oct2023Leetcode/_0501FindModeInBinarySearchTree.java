package Oct2023Leetcode;

import java.util.Arrays;

public class _0501FindModeInBinarySearchTree {
	static public class TreeNode {
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

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(1);
		tn.right = new TreeNode(2);
		tn.right.left = new TreeNode(2);
		System.out.println(Arrays.toString(findMode(tn)));
	}

	public static int[] findMode(TreeNode root) {

	}

}
