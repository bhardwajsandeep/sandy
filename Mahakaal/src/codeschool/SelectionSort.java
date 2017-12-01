package codeschool;

public class SelectionSort {

	public void selectionSort(int a[],int len){
		int iMin;
		for(int i=0;i<len-2;i++){
			iMin =i;
			for(int j=i+1;j<len;j++){
				if(a[iMin] < a[j]){
					iMin=j;
				}
			}
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+ " ");
		}
		
	}
	
	
}
