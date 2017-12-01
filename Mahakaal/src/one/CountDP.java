package one;

public class CountDP {

	int[][] arrA = { { 1, 2, 3 }, 
	         { 4, 5, 6},
	         { 7, 8, 9} };
	
	int row = arrA.length;
	int column = arrA[0].length;
	
	public int countDP(){
		
        int[][] result = new int[3][3];
		
        result[0][0] = 0;
        
        for(int i=0;i<row;i++){
        	result[0][i] = 1;
        	result[i][0] = 1;
        }
        
        for(int i=1;i<3;i++){
        	for(int j=1;j<3;j++){
        		result[i][j] = result[i-1][j]+result[i][j-1];
        	}
        }
        
		return result[2][2];
	}
	
}
