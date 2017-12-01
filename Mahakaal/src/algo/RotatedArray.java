package algo;

public class RotatedArray {
	
	public void rotateArray(int a[],int pivot){
		
		int length = a.length-1;
		int temp;
		int start = 0;
		int end = pivot;
		
		while(start<pivot){
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	 
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
