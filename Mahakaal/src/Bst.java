
public class Bst {

	public TreeNode root;
	
	public Bst(){
		root = new TreeNode(0);
	}
	
	public void inOrder(TreeNode root){
		TreeNode current = root;
		if(current!=null){
			inOrder(current.left);
			System.out.println(current.data);
			inOrder(current.right);
		}
	}
	
	public boolean isBst(TreeNode root,int min,int max){
		
		TreeNode current = root;
		
		if(current == null){
			return true;
		}
		
		if(current.data<min || current.data>max){
			return false;
		}
		
		return isBst(current.left,min,current.data)&&isBst(current.right, current.data, max);
		
		//return false;
	}
	
	
	public void insert(int value){
		TreeNode current = root;
		TreeNode parent ;
		if(current==null){
			current = new TreeNode(value);
			return;
		}
		while(true){
			parent = current;
			if(current.data>value){
				current=current.left;
				if(current==null){
					parent.left = new TreeNode(value);
					return;
				}
			}
			if(current.data<value){
				current=current.right;
			}
		}
	}
	
	
	public static void main(String args[]){
		Bst bst = new Bst();
		bst.root.data = 9;
		bst.root.left = new TreeNode(3);
		bst.root.right = new TreeNode(15);
		bst.root.left.left= new TreeNode(2);
		bst.root.left.right = new TreeNode(4);
		bst.root.right.left = new TreeNode(10);
		bst.root.right.right = new TreeNode(16);
		
		bst.inOrder(bst.root);
	}
	
	
}
