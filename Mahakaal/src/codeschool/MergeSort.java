package codeschool;

public class MergeSort {

	

	
	public void mergeSort(int [] a,int low,int high){
		int n = high-low;
		if(n <=1)
			return;
		 int mid = low +n/2;
		 mergeSort(a,low,mid);
		 mergeSort(a,mid,high);
		 
		 int [] temp = new int[n];
		 
		 int i=low,j=mid;
		 
		 for(int k=0;k<n;k++){
			 if (i == mid)  
	                temp[k] = a[j++];
	            else if (j == high) 
	                temp[k] = a[i++];
	            else if (a[j]<a[i]) 
	                temp[k] = a[j++];
	            else 
	                temp[k] = a[i++];
		 }
		 
		 for (int k=0;k<n;k++){
			 a[low+k] = temp[k];
		 }
		 
	}
	
	
	
}
