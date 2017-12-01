package general;

import java.util.HashSet;

public class LongestsubString {
	
	
	public int longestSubString(String s){
		
		int length = s.length();
		
		int i=0;
		int j=0;
		int res = 0;
		HashSet<Character> set = new HashSet<Character>();
		while(i<length && j < length){
			
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				if(j-i > res){
					res = j-i;
				}
			}else{
				set.remove(s.charAt(i));
				i++;
			}
		}
		return res;
	}
	
	public static void main(String args[]){
		String s = "abcabcbb";
		System.out.println(new LongestsubString().longestSubString(s));
	}

}
