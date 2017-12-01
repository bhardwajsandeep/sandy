package algo;

public class LongestCommonSubSequence {
	
	
	public int lcs(String s1,String s2 ){
		
		if(s1.length() ==0 || s2.length() ==0)
			return 0;
		int l1 = s1.length();
		int l2 = s2.length();
		if(s1.charAt(l1-1) == s2.charAt(l2-1)){
			return 1+lcs(s1.substring(0,l1-1),s2.substring(0,l2-1));
		}else{
			return Math.max( lcs(s1.substring(0,l1-1), s2.substring(0,l2)) ,lcs(s1.substring(0,l1),s2.substring(0,l2-1)));
		}
		
		 
	}
	
	public int lcsDP(String s1,String s2){
		
		int [][] solution = new int [s1.length()+1][s2.length()+1];
		
		for(int i=0;i<s1.length();i++){
			solution[0][i] = 0;
		}
		for(int i=0;i<s2.length();i++){
			solution[i][0] = 0;
		}
		
		for(int i=1;i<s1.length();i++){
			for(int j=1;j<s2.length();j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					solution[i][j] = 1+ solution[i-1][j-1];
				}else{
					solution[i][j] = Math.max(solution[i-1] [j],solution[i][j-1]);
				}
			}
		}
		
		
		return solution[s1.length()][s2.length()];
	}
	
	public static void main(String args[]){
		System.out.println(new LongestCommonSubSequence().lcs("ABCD", "ABED"));
	}

}
