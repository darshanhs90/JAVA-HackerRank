package Dec2020Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _0589NaryTreePreorderTraversal {
	static public class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node3 = new Node(3);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		node1.children = new ArrayList<Node>();
		node1.children.add(node3);
		node1.children.add(node2);
		node1.children.add(node4);

		node3.children = new ArrayList<Node>();
		node3.children.add(node5);
		node3.children.add(node6);
		System.out.println(preorder(node1));
	}

	public static List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		preOrder(root, list);
		return list;
	}

	public static void preOrder(Node root, List<Integer> list) {
		if (root != null) {
			list.add(root.val);
			if (root.children != null)
				for (Node n : root.children) {
					preOrder(n, list);
				}
		}
	}

}
