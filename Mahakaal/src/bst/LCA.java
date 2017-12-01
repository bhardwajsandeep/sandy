package bst;

public class LCA {
	
	
	
	public int LCA(Node root,int n1,int n2){
		Node current = root;
		
		while(current != null){
			
			if(current.data > n1 && current.data > n2){
			   current = current.left;	
			}else if(current.data < n1 && current.data < n2){
				current = current.right;
			}else{
				return current.data;
			}
		}
		
	
		return -1;
	}
	
	public int distanceFromRoot(Node root,int n1 ){
		
		Node current = root;
		int l1=0;
		int l2=0;
		if(root == null){
			return -1;
		}else if(root.data == n1){
			return 0;
		}
		else{
			 l1=1+distanceFromRoot(root.left, n1);
			 l2 =1+distanceFromRoot(root.right, n1);
		}
		
		return Math.max(l1, l2);
	}
	
	
	
	
	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		Node n1 = new Node(5);
		root.left.left = n1;
		root.left.right = new Node(13);
		Node n2 = new Node(14);
		root.left.right.right = n2;
		root.left.right.left = new Node(12);

		LCA i = new LCA();
		System.out.println(i.distanceFromRoot(root, n1.data) );

	}

}
