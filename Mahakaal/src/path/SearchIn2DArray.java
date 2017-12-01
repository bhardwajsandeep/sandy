package path;

public class SearchIn2DArray {
	
	public boolean findElement(int [][] a,int number){
		
		int totalRow = a.length-1;
		int totalColumn = a[0].length-1;
		int row = 0;
		int column = totalColumn;
		boolean numberFound = false;
		while(!numberFound){
			if(a[row][column] == number){
				System.out.println("Number found :");
				numberFound = true;
				return true;
			}else if(a[row][column] > number){
				column --;
			}else{
				row++;
			}
			if(row > totalRow || column < 0){
				return false;
			}
		}
		
		
		
		
		return false;
	}
	
	
	
	public static void main(String args[]){
		int[][] a = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 },
				{ 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
		int number1 = 15;
		int number2 = 5;
		int number3 = 19;
		int number4 = 25;
		SearchIn2DArray f = new SearchIn2DArray();
		System.out.println("The " + number1 + " present in 2D array a ??? :"
				+ f.findElement(a, number1));
		System.out.println("The " + number2 + " present in 2D array a ??? :"
				+ f.findElement(a, number2));
		System.out.println("The " + number3 + " present in 2D array a ??? :"
				+ f.findElement(a, number3));
		System.out.println("The " + number4 + " present in 2D array a ??? :"
				+ f.findElement(a, number4));
	}

}
