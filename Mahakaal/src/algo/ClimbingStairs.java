package algo;

public class ClimbingStairs {
	
	public int climbingStairs(int n){
		if(n<1)
			return 0;
		
 		return 1+ climbingStairs(n-1)+climbingStairs(n-2)+climbingStairs(n-3);
	}
	
	public int climbingStairsDP(int n , int [] dyn){
		
		if(n<1)
			return 0;
		
		if(dyn[n]>0)
			return dyn[n];
		
		dyn[n] = 1+climbingStairsDP(n-1,dyn)+climbingStairsDP(n-2,dyn)+climbingStairsDP(n-3,dyn);
		
		return dyn[n];
	}
	
	
	public static void main(String args[]){
		
		int n =3;
		int dyn[] = new int[n+1];
		System.out.println(new ClimbingStairs().climbingStairs(n));
		//System.out.println(new ClimbingStairs().climbingStairs(3));
	}

}
