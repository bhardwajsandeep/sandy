package algo;

public class CoinChange {

	
	public int coinChange(int a[],int v,int i){
		
		if(v<0){
			return 0;
		}
		if(v == 0){
			return 1;
		}
		
		if(i == a.length && v>0){
			 return 0;
		}
		
		return coinChange(a,v-a[i],i)+coinChange(a, v, i+1);
	}
	
	public int minCoinChange(int a[],int v){
		
		
		int [] result = new int[v+1];
		
		for(int i=0;i<v+1;i++){
		result[i] = Integer.MAX_VALUE-10;
		}
		
		result[0] = 0;
		
		for(int i=0;i<=v;i++){
			for(int k=a.length-1;k>=0;k--){
				if(a[k] <= i){
					result[i] = Math.min(result[i], 1+result[i-a[k]]);
				}
			}
			
		}
		for(int i=0;i<v+1;i++){
		     System.out.println(result[i]);
			}
		
		return result[v];
	}
	
}
