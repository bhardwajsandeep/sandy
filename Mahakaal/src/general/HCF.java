package general;

public class HCF {
	
	public int hcf(long a,long b){
		
		long n;
		if(a<b){
			n=a;
		}else{
			n=b;
		}
		int hcf=-1;
		for(int i=2;i<n;i++){
			if(a%i == 0 && b%i == 0){
				hcf =i;
			}
		}
		
		return hcf;
	}

}
