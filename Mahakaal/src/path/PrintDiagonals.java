package path;

public class PrintDiagonals {
	
	public void printDiagonals(){
		

		 int a[][] =       {{1,2,3,4},
				            {5,6,7,8},
				            {9,10,11,12},
				            {13,14,15,16},
				            {17,18,19,20}};
		 int rowCount = a.length;
		 int columnCount = a[0].length;
		 
		 for(int i=0;i<rowCount*2;i++){
			 for(int j=0;j<=i;j++){
				 int k = i-j;
				 if(k<columnCount && j<rowCount)
				 System.out.print(a[j][k]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		
	}
	
	public static void main(String args[]){
		PrintDiagonals p = new PrintDiagonals();
		p.printDiagonals();
	}

}
