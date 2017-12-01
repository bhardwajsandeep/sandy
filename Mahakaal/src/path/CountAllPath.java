package path;

public class CountAllPath {

	public int a[][] = {{1,2,3,4},
			            {5,6,7,8},
			            {9,10,11,12},
			            {13,14,15,16},
			            {17,18,19,20}};
	int totalColumn = a[0].length;
	int totalRow = a.length;
	
	public void printAllPath(int [][]a,int row,int column,String path){
		
		if(row == totalRow){
			for(int i=column; i<=totalColumn; i++){
				path = path + "-" + a[totalRow][i];
			}
			System.out.println(path);
			return;
		}
		if(column == totalColumn){
			for(int i = row;i<=totalRow;i++){
				path = path + "-" + a[i][totalColumn];
			}
			System.out.println(path);
			return;
		}
		path = path + "-"+ a[row][column];
		printAllPath(a, row+1, column, path);
		printAllPath(a, row, column+1, path);
	}
	
	public int countAllPath(int [][] a,int row,int column ){
		
		if(row == totalRow || column == totalColumn){
			return 1;
		}
		
		return countAllPath(a, row+1, column ) + countAllPath(a, row, column+1);
		
		 
	}
	
	public void countAllPathDP(int a[][]){
		int [][] temp = new int[a.length][4];
		
		for(int i=0;i<a.length;i++){
			a[0][i] = 1;
		}
		for(int i=0;i<a.length;i++){
			a[i][0] = 1;
		}
		
		for(int i=1;i<a.length;i++){
			for (int j=1;j<a.length;j++){
				a[i][j] = a[i-1][j]+a[i][j-1];
			}
		}
		
		System.out.println(a[3][3]);
	}
	
	public int count(int x){
		
		if(x == 0){
			return 0;
		}else{
			return 1+count(x/2);
		}
		
	}
	
	public int countWithObstruction(int [][] arrA, int row, int col){
        //base case
        //check if last row OR column is reached since after that only one path
        if(row==arrA.length-1 && col==arrA.length-1){
            return 1;
        }
        int left =0;
        int down = 0;
        if(row!=arrA.length-1 && arrA[row+1][col]!=-1){
            left = countWithObstruction(arrA, row+1, col);
        }
        if(col!=arrA.length-1 && arrA[row][col+1]!=-1){
            down = countWithObstruction(arrA, row, col+1);
        }
        return left + down;
    }
	
	public static void main(String args[]){
		CountAllPath c = new CountAllPath();
		int a  [][] = {{1,1,1},{1,-1,1},{1,-1,1}};
		System.out.println(c.countWithObstruction(a, 0, 0)); 
	}
	
}
