package codeschool;

public class TwoNumberSum {
	
	
	public boolean twoNumberSum(int [] a,int number){
		
		int low = 0;
		int high = a.length-1;
		boolean found = false;
		while(low<=high){
			if(a[low]+a[high] > number){
				high--;
			}else if(a[low]+a[high] < number){
				low ++;
			}else{
               found =true;

			}
		}
		
		return false;
	}

}
