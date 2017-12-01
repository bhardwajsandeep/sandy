package thread;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	MyBlockingQueue<String> queue;
	
	public Producer(MyBlockingQueue<String> queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
 
			for(int i=0;i<10;i++){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Offered to queue :"+i);
				try {
					queue.enqueue(i+"");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
 
	}

}
