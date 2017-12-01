package codeschool;

public class QuickSort {
	
	
	public void quickSort(int []a,int lower,int higher){
		int i=lower;
		int j = higher;
		int pivot = a[lower+(higher-lower)/2];
		while(i<=j){
			if(a[i] < pivot){
				i++;
			}
			if(a[j] > pivot){
				j--;
			}
			
			if(i<=j){
				int temp = a[i];
				a[i]= a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
		}
			if(lower<j){
				quickSort(a,lower,j);
			}
			if(i < higher){
				quickSort(a,i,higher);
			}
		
	}

}
