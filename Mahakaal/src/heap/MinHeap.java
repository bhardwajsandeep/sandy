package heap;

public class MinHeap {
	
	public int size;
	public int mh[];
	public int position;
	
	public MinHeap(int size){
		
		this.size = size;
		mh = new int[size+1];
		position = 0;
	}
	
	public void createHeap(int arrA[]){
		if(arrA.length >0){
			for(int i=0;i<arrA.length;i++){
				insert(arrA[i]);
			}
		}
	}
	
	public void insert(int x){
		if(position == 0){
			mh[position+1] = x;
			position = 2;
		}else{
			mh[position++] = x;
			bubbleUp();
		}
	}
	
	public void bubbleUp(){
		int pos = position-1;
		while(pos>0 && mh[pos/2] > mh[pos]){
			int y = mh[pos/2];
			mh[pos/2] = mh[pos];
			mh[pos] = y;
			pos = pos/2;
		}
	}
	
	public void extractMin(){
		int min = mh[1];
		mh[1] = mh[position-1];
		mh[position-1] = 0;
		position --;
		//sinkdown()
	}
	
	public void sinkDown(int k){
		int a = mh[k];
	}

}
