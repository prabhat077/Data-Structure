package com.bajpai.tree;

import java.util.*;

import com.bajpai.pojo.Node;


public class BinaryTreeTraversal {
	public static void levelOrder(Node root) {
		
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			Node node = nodes.poll();
			if (node != null) {
				System.out.print(node.data + " ");
				nodes.add(node.left);
				nodes.add(node.right);
			}
		}
	}
	
	public static void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public static void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			inOrder(root.left);
			inOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			inOrder(root.left);
			inOrder(root.right);
		}
	}
}