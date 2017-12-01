package bst;

public class LeftViewTree {

	Node node;
	public LeftViewTree(){
		 this.node = null;
	}
	
	int max_level=0;
	
	public void printLeftView(Node node,int level){
		if(node == null)
			return;
		if(max_level < level){
			System.out.println(node.data);
			max_level = level;
		}
		
			printLeftView(node.left, level+1);
			printLeftView(node.right, level+1);
		}
	
	
	
	
	public static void main(String args[]){
		LeftViewTree tree = new LeftViewTree();
		tree.node = new Node(12);
		tree.node.left = new Node(10);
		tree.node.right = new Node(30);
		tree.node.left.left = new Node(8);
		tree.node.left.right = new Node(15);
		tree.node.right.left = new Node(25);
		tree.node.right.right = new Node(35);
		tree.printLeftView(tree.node, 1);
	}
	
	
}
