package com.bajpai.tree;

import com.bajpai.pojo.Node;

public class InvertBinaryTree {
	public static Node invertTree(Node root) {
		if (root == null)
			return null;

		root.right = root.left;
		invertTree(root.right);

		root.left = root.right;
		invertTree(root.left);
		return root;
	}
}