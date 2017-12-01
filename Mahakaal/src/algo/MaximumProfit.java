package algo;

public class MaximumProfit {

	
	public int maximumProfit(int [] value,int length){

		if(length <= 0)
			return 0;
		
		int max =-1;
		
		for(int i=0;i<length;i++){
			max = max + Math.max(max, value[i]+ maximumProfit(value,length-(i+1)));
		}
		
		return max;
	}
	
	public int profitDP(int [] value,int length){
		int [] temp = new int[value.length+1];
		
		temp[0] =0;
		int max = -1;
		
		for(int i=1;i<value.length;i++){
			max =-1;
			
			for(int j=0;j<i;j++){
				max = Math.max(max, value[j]+profitDP(value, length-(j+1)));
				temp[i] = max;
			}
		}
		
		return temp[value.length];
	}
	
}
