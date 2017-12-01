
public class Highest {

	public void highest(int[] input2){
	 int highest=-1;
		int secondHighest =-1;
		
		for(int n:input2){
			if(n>highest){
				secondHighest=highest;
				highest=n;
			}else if(secondHighest<n){
				secondHighest=n;
			}
		}
		System.out.println(secondHighest);
	}
	
	public static void main(String args[]){
		Highest h  = new Highest();
		int n[] = {2,1,2};
		h.highest(n);
	}
	
}
