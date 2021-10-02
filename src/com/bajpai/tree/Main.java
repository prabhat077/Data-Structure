package com.bajpai.tree;

import java.util.Scanner;

import com.bajpai.pojo.Node;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = sc.nextInt();
			root = BSTInsertion.insert(root, data);
		}
		TopView.detailTopView(root);
		sc.close();
	}
}
