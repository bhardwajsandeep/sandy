package bst;

public class LeftLeaveSum {
	
	 public static int  sum =0;
	public static  void leftSum(Node current,Node parent){
		
		if(current != null){
			leftSum(current.left, current);
			if(current.left == null && current.right == null && parent.left == current){
				sum = sum + current.data;
			}
			leftSum(current.right,current);
		}
		
		
		
	}
	
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(10);
		root.left.right = new Node(12);
		root.left.right.left = new Node(6);
		root.right.right = new Node(8);
		root.right.right.left = new Node(5);
		leftSum(root, root);
		System.out.println("Sum of left leaves: " + sum);
	}

}
