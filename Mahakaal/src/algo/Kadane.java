package algo;

public class Kadane {
	
	
	public int maxSum(int a[]){
		
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for(int i=0;i<a.length-1;i++){
			max_ending_here = max_ending_here+a[i];
			if(max_ending_here<0){
				max_ending_here =0;
			}
			if(max_ending_here > max_so_far){
				max_so_far = max_ending_here;
			}
		}
		
		return max_so_far;
	}

}
