package com.bajpai.tree;

import java.util.*;

import com.bajpai.pojo.Node;
import com.bajpai.pojo.Pair;

public class TopView {

	/**
	 * Only display outer nodes of tree leftmost and rightmost.
	 *
	 * @param root
	 */
	public static void topView(Node root) {
		if (root != null) {
			if (root.left != null) {
				root.left.right = null;
				topView(root.left);
			}
			System.out.print(root.data + " ");
			if (root.right != null) {
				root.right.left = null;
				topView(root.right);
			}
		}
	}

	public static void detailTopView(Node root) {
		if (root != null) {
			Queue<Pair<Node, Integer>> nodes = new LinkedList<>();
			nodes.add(new Pair<>(root, 0));

			Map<Integer, Integer> topView = new TreeMap<Integer, Integer>();
			
			while (!nodes.isEmpty()) {
				Pair<Node, Integer> pair = nodes.poll();
				
				Node node = (Node) pair.getKey();
				int value = (int) pair.getValue();

				if (topView.get(value) == null) {
					topView.put(value, node.data);
				}

				if (node.left != null) {
					nodes.add(new Pair<>(node.left, value - 1));
				}
				if (node.right != null) {
					nodes.add(new Pair<>(node.right, value + 1));
				}
			}

			topView.forEach((k, v) -> System.out.print(v + " "));
		}
	}
}
