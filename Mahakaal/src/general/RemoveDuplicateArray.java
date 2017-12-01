package general;

import java.util.ArrayList;

public class RemoveDuplicateArray {
	
	
	public void removeDuplicate(int a[]){
		int j=0;
		int i = 1;
		
		while(i < a.length){
			if(a[i] == a[j]){
				i++;
			}else{
				j++;
				a[j]=a[i];
				i++;
			}
		}
		for(int m =0;m<j;m++){
			System.out.println(a[m]);
		}
	}

}
