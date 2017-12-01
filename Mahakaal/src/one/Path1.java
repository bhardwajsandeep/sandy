package one;

public class Path1 {
	
	int[][] arrA = { { 1, 2, 3 }, 
	         { 4, 5, 6},
	         { 7, 8, 9} };
	int row = arrA.length;
	int column = arrA[0].length;
	public void printAllPath(int currentRow,int currentColumn,String path){
		 
		if(currentColumn == column-1){
			for(int i=currentRow;i<row;i++){
				path = path +":"+ arrA[i][currentColumn];
			}
			System.out.println(path);
			return;
		}
		
		if(currentRow == row-1){
			for(int i=currentColumn;i<column;i++){
				path = path +":"+ arrA[currentRow][i];
			}
			System.out.println(path);
			return;
		}
		path = path+":"+arrA[currentRow][currentColumn];
		printAllPath(currentRow+1,currentColumn,path);
		printAllPath(currentRow,currentColumn+1,path);
	}

}
