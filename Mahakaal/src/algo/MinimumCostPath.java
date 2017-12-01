package algo;

public class MinimumCostPath {

	public int minimumCostPath(int a[][]){
		int solution[][] = new int [a.length][a.length];
		
		solution[0][0] = a[0][0];
		
		for(int i=1;i<a.length;i++){
			solution[0][i] = solution[0][i-1]+a[0][i];
		}
		
		for(int i=1;i<a.length;i++){
			solution[i][0] = solution[i-1][0]+a[i][0];
		}
		
		for(int i=1;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				solution[i][j] = a[i][j]+Math.min(solution[i][j-1], solution[i-1][j]);
			}
		}
		
		return solution[a.length-1][a.length-1];
	}
	
	
}
