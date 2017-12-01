package general;

import java.util.Arrays;

public class LongestIncreasingSeq {
	
	
	public void longestInc(int a[]){
		int res[] = new int[a.length];
		
		Arrays.fill(res, 1);
		
		int result =1;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i] > a[j]){
					res[i] = Math.max(res[i], res[j]+1);
				}
			}
			result = Math.max(res[i], result);
		}
		
		System.out.println(result);
		
	}
	
	public static void main(String args[]){
		LongestIncreasingSeq l = new LongestIncreasingSeq();
		int a[] =  {10, 9, 2, 5, 3, 7, 101, 18};
		l.longestInc(a);
	}

}
