package com.bajpai.tree;

import com.bajpai.pojo.Node;

public class Height {
	public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}
}