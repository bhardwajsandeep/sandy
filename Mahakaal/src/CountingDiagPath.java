
public class CountingDiagPath {
	
	
	int a[][] = {{1,2,3,4},
			       {5,6,7,8},
			         {9,10,11,12},
			           {13,14,15,16}};
	
	
	public int countPath(int row,int column){
		
		if(row == a.length || column == a[0].length){
			return 1;
		}
		
		return countPath(row+1,column)+countPath(row,column+1)+countPath(row+1,column+1);
	}
	
	
	public int countPathDP(){
		
		int result[][] = new int[4][4];
		
		for(int i=0;i<4;i++){
			result[0][i]=1;
			result[i][0]=1;
		}
		
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				result[i][j] = result[i-1][j]+result[i][j-1]+result[i-1][j-1];
			}
		}
		
		return result[3][3];
	}
	
	public static void main(String args[]){
		CountingDiagPath c = new CountingDiagPath();
		System.out.println(c.countPathDP());
	}

}
