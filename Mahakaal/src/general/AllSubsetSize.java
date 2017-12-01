package general;

public class AllSubsetSize {
	
	public void allsubSet(int a[],int start,int k,int currentLength,boolean b[]){
		
		 if(currentLength == k){
			 for(int i=0;i<a.length;i++){
				 if(b[i] == true){
					 System.out.print(a[i]);
				 }
			 }
			 System.out.println();
			 return;
		 }
		 
		 if(start == a.length){
			 return;
		 }
		 b[start] = true;
		 allsubSet(a, start+1, k, currentLength+1, b);
		 b[start]= false;
		 allsubSet(a, start+1, k, currentLength, b);
	}
	
	
	public void permutation(char [] a,int left){
		
		int x;		
		if(left == a.length){
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.print(" ");
		}else{
			for(x =left;x<a.length;x++){
				swap(a , left, x);
				permutation(a , left + 1);
				swap(a , left, x);
			}
		}
		
	}
	
	public void swap(char[] arrA, int i, int j) {
		char temp = arrA[i];
		arrA[i] = arrA[j];
		arrA[j] = temp;
	}
	
	
	
	
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6};
		boolean b[] = new boolean[a.length];
		AllSubsetSize i = new AllSubsetSize();
		i.allsubSet(a, 0, 3, 0, b);
	}

}
