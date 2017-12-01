package general;

public class SegregateZeroAndOne {
	
	public void segregateZeroAndOne(int a[]){
		int low = 0;
		int high = a.length-1;
		
		while(low < high){
			
			while(a[low] == 0 && low < high){
				low++;
			}
			
			while(a[high] == 1 && low < high){
				high --;
			}
			if(low<high){
				a[low] =0;
				a[high] = 1;
				low++;
				high --;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
