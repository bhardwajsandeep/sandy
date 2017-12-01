package codeschool;

public class ListWithDuplicates {

	
public int firstOccurence(int [] a,int low,int high,int number){
		 
	 int mid  ;
	 
	 while(low<=high){
		 
		 mid = (low+high)/2;
		 
		 if((mid == 0 || a[mid-1]<number) && a[mid] == number){
			 return mid;
		 }else if(a[mid]<number){
			 low = mid+1;
		 }else{
			 high=mid-1;
		 }
	 }
	 return -1;

	}


public int lastOccurence(int a[],int low,int high,int number){
	
	int loc =-1;
	
	while(high>low){
		int mid = (low+high)/2;
		if(a[mid] == number){
			loc = mid;
			low = mid+1;
		}else if(a[mid]>number){
			high = mid-1;
		}else{
			low = mid+1;
		}		
	}
	
	
	return loc;
}

 

	
}
