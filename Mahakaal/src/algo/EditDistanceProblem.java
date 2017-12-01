package algo;

public class EditDistanceProblem {

	
	public int minimumEdit(String s1,String s2,int l1,int l2){
		
		if(l1==0)
			return l2;
		if(l2==0)
			return l1;
		
		if(s1.charAt(l1-1) == s2.charAt(l2-1)){
			return minimumEdit(s1, s2, l1-1, l2-1);
		}
		
		return 1+Math.min(minimumEdit(s1, s2, l1-1, l2-1), Math.min(minimumEdit(s1, s2, l1-1, l2), minimumEdit(s1, s2, l1, l2-1)));
	}
	
	public int minimumEditDP(String s1,String s2){
		
		int [][] temp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<s1.length();i++){
		   temp[0][i] = i;	
		}
		for(int i=0;i<s2.length();i++){
			temp[i][0] = i;
		}
		
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					temp[i][j] = temp[i-1][j-1];
				}
				else{
					temp[i][j] = 1+ Math.min(temp[i-1][j-1],Math.min(temp[i-1][j],temp[i][j-1]));
				}
			}
		}
		
		return temp[s1.length()][s2.length()];
	}
	
	
	public static void main(String args[]){
		EditDistanceProblem e = new EditDistanceProblem();
		String s1 = "horizontal";
		String s2 = "horizon";
		int l1 = s1.length();
		int l2 = s2.length();
		System.out.println(e.minimumEditDP(s1, s2));
	}
}
