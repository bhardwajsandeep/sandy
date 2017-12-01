package algo;

public class MinimumSquare {

	public int minimumSquare(int n){
		
		if(n<=3){
			return 1;
		}
		
		int temp;
		int res = n;
		
		for(int i=3;i<=n;i++){
			 temp = i*i;
			 if(temp > n){
				 break;
			 }else{
				 res = Math.min(n, 1+minimumSquare(n-temp));
			 }	
		}		
		return res;
	}
	
	
	public int minimumSquareDP(int n){
		
		int [] res = new int[n+1];
		
		res[1] =1;
		res[2] =1;
		res[3] =1;
		int temp;
		
		for(int i=3;i<=n;i++){
		for(int x=3;x<=i;x++){
			res[x] = x;
			temp = x*x;
			if(temp > i){
				break;
			}else{
			res[i] = Math.min(res[i], 1+res[i-temp]);
			}
		}
		}
		
		return res[n];
	}
	
	
	public static void main(String args[]){
		MinimumSquare ms = new MinimumSquare();
		System.out.println(ms.minimumSquareDP(100));
	}
	
	
}
