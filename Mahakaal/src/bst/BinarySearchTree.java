package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {
	
	public Node root;
	int currentLevel = 0;
	int levelNodes=0;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public void insert(int d){
		Node node = new Node(d);
		
		if(root == null){
			root = node;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			if(current.data > node.data){
				current = current.left;
				if(current == null){
					parent.left = node;
					return;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = node;
					return;
				}
			}
		}
		
	}
	
	public void display(Node root){
		if(root != null){
			display(root.left);
			display(root.right);
			System.out.println(" "+root.data);
			
		}
	}
	
	public void delete(Node node){
		Node current = root;
		boolean isLeftChild=false;
		Node parent = null;
		while(current.data != node.data){
			parent = current;
			if(current.data > node.data){
				current = current.left;
				isLeftChild = true;
			}else{
				current = current.right;
				isLeftChild = false;
			}
		}
		
		if(current.left == null && current.right == null){
			if(isLeftChild){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}else if(current.left == null) {
			if(isLeftChild){
				parent.left = current.right;
			}else {
				parent.right = current.right;
			}
		}else if(current.right == null){
			if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.right;
			}
		}
		
		
	}
	
	public void bfs(Node root){
       LinkedList<Node> list = new LinkedList<Node>();
		if(root != null){
			list.add(root);
		}
		while(!list.isEmpty()){
			levelNodes = list.size();
			while(levelNodes>0){
			Node n = list.remove();
			System.out.print(n.data);
			if(n.left != null){
				list.add(n.left);
			}
			if(n.right != null){
				list.add(n.right);
			}
			levelNodes--;
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void rightView(Node node,int level){
		
		
		if(node == null){
			return;
		}
		if(currentLevel < level){
			System.out.println(node.data);
			currentLevel = level;
		}
		
		rightView(node.right,level+1);
		rightView(node.left,level+1);
	}
	
	public boolean find (int d){
		
		Node current = root;
		if(current == null){
			return false;
		}
		while(current != null){
		 
			if(current.data > d){
				current = current.left;			
		    }else if(current.data < d){
		    	current = current.right;
		    }else{
		    	return true;
		    }
		
		}
		
		return false;
	}
	
	
	public int countNode(Node root){
		
		if(root == null){
			return 0;
		}else{
			int l =1;
			l = l + countNode(root.left);
			l = l + countNode(root.right);
			return l;
		}		
		
	}
	
	public int countLeaf(Node root){
		
		if(root == null){
			return 0;
		}
			
		if(root.left != null && root.right != null){
				return 1;
		  }else{
			  return countLeaf(root.left)+countLeaf(root.right);	
		  }
			
		  
		
	}
	
	public int height(Node root){
		
		if(root == null){
			return 0;
		}
		else{
			return 1 + Math.max(height(root.left), height(root.right));
		}
		
	}
	
	public static void main(String args[]){
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		//b.display(b.root);		
		b.bfs(b.root);
		//b.height(b.root);
		//System.out.println(b.height(b.root));
		//System.out.println(b.countLeaf(b.root));
		//System.out.println(b.find(8));
		//System.out.println(b.countNode(b.root));
		//b.rightView(b.root, 1);
	}

}
