package trie;

import java.util.Map;

public class Trie {
	
   TrieNode root;
   
   public Trie(){
	   root = new TrieNode();
   }
   
   public void insert(String s){
	   
	   Map<Character,TrieNode> children = root.children;
	   TrieNode n;
	   for(int i=0;i<s.length();i++){
		   char c = s.charAt(i);
		   if(children.get(c) == null){
			    n = new TrieNode(c);
			   children.put(c, n);
		   }else{
			   n = children.get(c);
		   }
		   children = n.children;
		   if(i == s.length()-1){
			   n.isLeaf = true;
		   }
	   }
   }
   
   public boolean search(String word){
	   TrieNode n = searchNode(word);
	   if( n != null && n.isLeaf){
		   return true;
	   }
	   return false;
   }
   
   private TrieNode searchNode(String word){
	   
	   TrieNode t=null;
	   
	   Map<Character,TrieNode> children = root.children;
	   
	   for(int i=0;i<word.length();i++){
		   char c = word.charAt(i);
		   t = children.get(c);
		   if(t  != null){
			   children = t.children;
		   }else{
			   return null;
		   }
	   }
	   
	   return t;
	   
   }
   
   public boolean startsWith(String s){
	   
	   TrieNode n = searchNode(s);
	   
	   if(n != null){
		   return true;
	   }
	   return false;
   }
   
 
   
   public static void main(String args[]){
	   Trie trie = new Trie();
	   trie.insert("word");
	   trie.insert("wordweb");
	   trie.insert("web");
	   System.out.println(trie.search("web"));
   }


}
