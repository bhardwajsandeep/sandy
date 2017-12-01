package one;

public class Wiggle {
	
	
	public int getCount(int [] a){
		
		return 1+Math.max(calculate(a, 0, true),calculate(a, 0, false)) ;
	}
	
	private int calculate(int [] a, int index,boolean isUp){
		int maxCount =0;
		for(int i = index+1;i<a.length;i++){
			if((isUp && a[i]>a[index]) || (!isUp && a[i]<a[index])){
				maxCount = Math.max(maxCount,1+calculate(a, i, isUp));
			}
		}
		
		
		return maxCount;
	}

}
