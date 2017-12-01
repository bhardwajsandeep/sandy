package codeschool;

public class BinarySearch {
	
	
	public boolean  binarySearch(int[] a,int number){
		
		int low=0;
		int high = a.length-1;
		int mid;
		boolean found=false;
		while(low<=high){
		mid = (low+high)/2;		
		if(a[mid] > number){
			high = mid-1;
		}else if(a[mid] < number){
			low = mid+1;
		}else{
			found = true;
			break;
		}			
		}
		if(low>high){
			found=false;
		}
		
		return found;
	}

}
