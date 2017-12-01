package general;

public class MaxIJ {
	
	public void max(int a[]){
		int len = a.length-1;
		int max = 0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[j]-a[i] > 0 && j-i >max){
					max = j-i;
				}
			}
		}
		System.out.println(max);
		
	}
	
	public static void main (String args[]){
		MaxIJ m = new MaxIJ();
		int[] arrA = { 12, 3, 1, 5, 6, 4, 10, 9, 8, 0 };
		m.max(arrA);
	}

}
