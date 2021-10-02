package com.bajpai.tree;

import com.bajpai.pojo.Node;

public class BTDiameter {
	public static int diameter(Node root) {
		if(root != null) {
			return Math.max(Height.height(root.left) 
						+ Height.height(root.right),
						Math.max(
							diameter(root.left) ,
							diameter(root.right)));
		}
		return 0;
	}
}
