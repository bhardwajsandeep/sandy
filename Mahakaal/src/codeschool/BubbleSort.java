package codeschool;

public class BubbleSort {

	public void bubbleSort(int a[],int length){
		
		for(int i=0;i<a.length-1;i++){
			
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	
	
}
