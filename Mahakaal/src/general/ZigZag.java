package general;

public class ZigZag {
	
	
	public void zigZag(int a[]){
		
		int res[] = new int[a.length];
		
		for(int i=1;i<a.length;i++){
			res[i-1]= a[i]-a[i-1];
		}
		int max =1;
		int current_max=1;
		for(int i=0;i<a.length-1;i++){
			
			if((res[i] > 0 && res[i+1] <0 ) || (res[i] < 0 && res[i+1] > 0)){
				current_max = current_max+1;
				if(current_max > max){
					max  = current_max;
				}
			}else{
				current_max =0;
			}
		}
		
		System.out.println(max);
		
	}
	
	
	public void zigZagDP(int a[]){
		int res[][] = new int [a.length][2];
		
		for (int i=0;i<a.length;i++){
			res[i][0] = res[i][1] = 1;
		}
		int result=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i] > a[j] && res[i][0] < res[j][1]+1){
					res[i][0] = res[j][1]+1;
				}
				if(a[j] > a[i] && res[i][1] < res[j][0]+1){
					res[i][1] = res[j][0]+1;
				}
			}
			result = Math.max(res[i][0], res[i][1]);
		}
		
		System.out.println( result);
		
	}

	
	
	
	
	
	public static void main(String args[]){
		ZigZag z = new ZigZag();
		int a[] = { 1,2,3,4,5,6,7,8,9};
		z.zigZagDP(a);
	}
}
