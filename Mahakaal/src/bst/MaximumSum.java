package bst;

public class MaximumSum {

	int maxSum=0;
	int node;
	
	public void maxSum(Node current,int sum){
		
		if(current == null){
			return;
		}else{
			sum = current.data+sum;
			if(sum>maxSum && (current.left == null && current.right == null)){
				maxSum = sum;
				node = current.data;
			}
		}
		maxSum(current.left,sum);
		maxSum(current.right,sum);
	}
	
	public boolean pathToNode(Node current,Node target){
		
		if(current == null)
			return false;
		
		if(current.data == target.data || pathToNode(current.left,target) || pathToNode(current.right, target)){
			System.out.println(current.data);
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.right = new Node (5);
		root.right.left = new Node (6);
		root.right.left.left = new Node (8);

		MaximumSum i = new MaximumSum();
		//i.maxSum(root,0);
		System.out.println("Maximum Sum Leaf to Root path " + i.pathToNode(root, new Node(8)));
		//System.out.print("Path :");
		//i.path(root,maxLeaf);
		
	}
}
