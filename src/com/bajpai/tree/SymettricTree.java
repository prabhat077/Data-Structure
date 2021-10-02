package com.bajpai.tree;

import com.bajpai.pojo.Node;

public class SymettricTree {
	public static boolean isSymmetric(Node root) {
		if (root != null) {
			return isSymmetric(root.left, root.right);
		}
		return true;
	}

	public static boolean isSymmetric(Node node1, Node node2) {
		if(node1 == null && node2 == null) {
			return true;
		} else if((node1 != null && node2 == null) || (node1 == null && node2 != null)){
			return false;
		} else if(node1.data == node2.data) {
				return isSymmetric(node1.left, node2.right) 
						&& isSymmetric(node1.right, node2.left);
		} else {
			return false;
		}
	}
}
