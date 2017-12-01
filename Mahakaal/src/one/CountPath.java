package one;

public class CountPath {
	int[][] arrA = { { 1, 2, 3 }, 
	         { 4, 5, 6},
	         { 7, 8, 9} };
	
	int row = arrA.length;
	int column = arrA[0].length;
	
	
	public int count(int currentRow,int currentColumn){
		
		if(currentRow == row-1 || currentColumn == column-1){
			return 1;
		}
		
		return count(currentRow+1,currentColumn)+count(currentRow,currentColumn+1);
	}
			
}
