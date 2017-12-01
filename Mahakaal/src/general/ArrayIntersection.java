package general;

public class ArrayIntersection {

	public int arrayIntersection(int[] a,int [] b){
		int x = 0;
		int y = 0;
		
		while(x < a.length && y < b.length){
			if(a[x] > b [y]){
				y++;
			}else if(a[x] < b[y]){
				x++;
			}else{
				return a[x];
			}
		}
		
		
		return -1;
	}
	
	
}
