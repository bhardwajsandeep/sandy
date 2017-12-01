package general;

import java.util.Collections;
import java.util.TreeMap;

public class CyclicList {

	Node node;
	
	public boolean isCyclic(Node node){
		
		Node turtle;
		Node hare;
		Node head;
		head = node;
		turtle = head;
		hare = head;
		
		Collections.synchronizedCollection(null);		
		
		if(node == null)
			return false;
		
		while(true){
			
			turtle = turtle.next;
			
			if(hare.next != null){
				hare = hare.next.next;
			}else{
				return false;
			}
			
			if(hare == null || turtle == null){
				return false;
			}
			
			if(turtle == hare){
				return true;
			}
		
		}
		
	}
	
	
	
	
	public static void main(String args[]){
		
	}
}
