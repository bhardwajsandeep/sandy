package algo;

public class MagicIndex {
	
	public int magicIndex(int a[]){
		int start = 0;
		int end = a.length-1;
		int mid;
		while(start < end){
			mid = (start+end)/2;
			if(a[mid] == mid){
				System.out.println("found");
				return mid;
			}else if(a[mid] < mid){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -1, 0, 1, 2, 4, 10 };
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.magicIndex (A) );
	}

}
