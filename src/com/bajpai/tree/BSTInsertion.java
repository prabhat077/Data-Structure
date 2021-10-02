package com.bajpai.tree;

import com.bajpai.pojo.Node;

public class BSTInsertion {

	public static Node insert(Node root, int data) {
		Node node = new Node(data);
		if (root == null) {
			return node;
		} else if (root.data > data) {
			if (root.left == null) {
				root.left = node;
			} else {
				insert(root.left, data);
			}
		} else {
			if (root.right == null) {
				root.right = node;
			} else {
				insert(root.right, data);
			}
		}
		return root;
	}

}