package bst;

public class CheckValidBST {
	
	
	public boolean checkIfBst(Node node,int min,int max){
		
		if(node == null)
			return true;
		
		if(node.data <= min || node.data >= max){
			return false;
		}
		
		return (checkIfBst(node.left, min, node.data) && checkIfBst(node.right, node.data, max));

	}

}
