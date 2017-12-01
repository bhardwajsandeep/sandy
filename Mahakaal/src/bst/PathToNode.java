package bst;

import java.util.ArrayList;

public class PathToNode {
	
	Node node;
	
	public PathToNode(){
		this.node = null;
	}
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public boolean printPathToNode(Node root,int val){
		
		if(root == null){
			return false;
		}
		
		if(root.data == val || printPathToNode(root.left, val) || printPathToNode(root.right, val)){
			list.add(root.data);
			return true;
		}
		
		return false;
	}

	public static void main(String args[]){
		PathToNode tree = new PathToNode();
		tree.node = new Node(12);
		tree.node.left = new Node(10);
		tree.node.right = new Node(30);
		tree.node.left.left = new Node(8);
		tree.node.left.right = new Node(15);
		tree.node.right.left = new Node(25);
		tree.node.right.right = new Node(35);
		tree.printPathToNode(tree.node,25);
		System.out.println(list);
	}
}
