package codeschool;

public class RotatedArray {
	
	
	public void rotateArray(int a[],int index){
		int pivot = a.length-index-1;
		reverse(a,0,pivot-1);
		reverse(a,pivot,a.length-1);
		reverse(a,0,a.length-1);
		
		
	}
	
	private void reverse(int a[],int i,int j){
		 while(i<j){
			 int temp = a[i];
			 a[i] =  a[j];
			 a[j] = temp;
			 i++;
			 j--;
		 }
	}
	
	
	public int searchRotated(int a[],int ele){
		
		int low = 0;
		int high = a.length-1;
		
		while(low<high){
			int mid = (low+high)/2;
			if(ele == a[mid]){
				return mid;
			}
			if(a[low]<= a[mid]){
				if(a[low] < ele && ele < a[high]){
					high = mid-1;
				}else{
					low = mid+1;
				}
			}else{
				if(a[mid] < ele && ele < a[high]){
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
		}
		
		return -1;
	}

}
