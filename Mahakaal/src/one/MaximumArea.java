package one;

public class MaximumArea {
	
	
	public int maximumArea(int [][] matrix){
		
		int [][] tempArray = new int[4][4];
		
		for(int i=0;i<4;i++){
			tempArray[0][i]= matrix[0][i];
			tempArray[i][0] = matrix[i][0];
		}
		
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				if(matrix[i][j] == 1){
					tempArray[i][j] = Math.min(matrix[i-1][j-1],(Math.min(matrix[i-1][j], matrix[i][j-1])))+1;
				}else{
					tempArray[i][j]=0;
				}
			}
		}
		
		
		for(int i=0;i<4;i++){
			System.out.println("\n");
			for(int j=0;j<4;j++){
				System.out.println(tempArray[i][j]+" ");
			}
		}
			return 0;
	}

}
