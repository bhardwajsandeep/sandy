package algo;

public class PrefixArrayOfStrings {
	
	public String prefixArrayOfString(String [] strs){
		
		int length = strs.length-1;
		
		int min = -1;
		
		for(int i=0;i<length;i++){
			int len = Math.min(strs[i].length()-1,strs[i+1].length()-1)-1;
			for(int j=0;j<len;j++){
				if(strs[i].charAt(j) == strs[i+1].charAt(j)){
					if(min<j){
						min = j;
					}
				}
			}
		}
		
		return strs[0].substring(0, min);
	}
	
	public String prefixLongest(String [] strs){
		
		int length = strs[0].length();
		int curr;
		for(int i=0;i<strs.length;i++){
			curr =0;
			while(curr < length && curr< strs[i].length()){
				if(strs[0].charAt(curr) == strs[i].charAt(curr)){
					curr++;
				}
			}
		}
		
		
		return "";
	}

}
