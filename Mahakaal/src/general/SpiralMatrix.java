package general;

public class SpiralMatrix {

	public void spiral(int m,int n, int [][]a){
		int i=0;
		int l=0; 
		int k=0; 
		
		/*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
		
		while(k<m && l < n){
			for(i=l;i<n;i++){
				System.out.println(a[k][i]);
			}
			k++;
			for(i=k;i<m;i++){
				System.out.println(a[i][n-1]);
			}
			n--;
			if(k<m){
				for( i=n-1;i>l;i--){
					System.out.println(a[m-1][i]);
				}
				m--;
			}
			if(l<n){
				for(i=m-1;i>k;i--){
					System.out.println(a[i][l]);
				}
				l++;
			}
		}
		
		
		
	}
	
	
}
