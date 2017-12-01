package bst;

public class CheckMirror {
	
	
	public boolean checkMirror(Node nodeA,Node nodeB){
		
		if(nodeA == null || nodeB == null){
			return true;
		}
		
		if(nodeA.data != nodeB.data){
			return false;
		}
		
		if((nodeA != null && nodeB==null ) || (nodeA == null && nodeB != null)){
			return false;
		}
		
		return (checkMirror(nodeA.left, nodeB.right) && checkMirror(nodeA.right, nodeB.left));
		
	}
	
	public static void main(String args[]){

			Node root1 = new Node(1);
			root1.left = new Node(2);
			root1.left.right = new Node(3);
			root1.right = new Node(4);

			Node root2 = new Node(1);
			root2.right = new Node(2);
			root2.right.left = new Node(3);
			root2.left = new Node(4);

			CheckMirror i = new CheckMirror();
			System.out.println("Is Mirror Trees : " + i.checkMirror(root1, root2));

		
	}

}
