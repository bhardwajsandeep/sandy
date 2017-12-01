package algo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class SubArraySum {

	public int subArraySum(int a[],int num){
		int curr_sum;
 
		for(int i=0;i<a.length;i++){
			curr_sum = 0;
			for(int j=i;j<a.length;j++){
				curr_sum = curr_sum +a[j];
				if(curr_sum == num){
					System.out.println("Sum found");
					return 1;
				}
			}
		}
		return 0;
	}
	
	public int subArraySum_1(int a[],int num){
		
		int curr_sum = 0;
		int start=0;
		
		for(int i=0;i<a.length;i++){
			
			while(curr_sum>num){
				curr_sum = curr_sum - a[start++];
			}
			
			if(curr_sum == num){
				System.out.println("sum found");
			} 
			
			curr_sum = curr_sum + a[i];
			
		}
		
		
		return 0;
	}
	
	
}
