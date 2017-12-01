package bst;

public class CheckSumTree {
	
	int deepestLevel =0;
	int value;

	public void hasPath(Node n,int sum,String path){
		
		if(n == null || n.data >sum){
			return ;
		}else{
			sum = sum - n.data;
			path = path + n.data;
			if(sum == 0){
				System.out.println("Path found");
				System.out.println(path);
			}
			hasPath(n.left,sum,path);
			hasPath(n.right, sum, path);
		}
		

	}
	
	public void findDeepestNode(Node n,int level){
		
		if(n == null){
			return;
		}else{
			findDeepestNode(n.left, ++level);
			if(level > deepestLevel){
				deepestLevel = level;
				value = n.data;
			}
			findDeepestNode(n.right, level);
		}
	}
	
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		CheckSumTree i = new CheckSumTree();
		i.findDeepestNode(root, 0);
		System.out.println(i.value);
	}

}
