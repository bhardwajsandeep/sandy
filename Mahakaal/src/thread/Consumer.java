package thread;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	
	private MyBlockingQueue<String> queue;
	
	public Consumer(MyBlockingQueue<String> queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
		for(int i=0;i<12;i++){
			   try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 				try {
					System.out.println("Polled from queue" + queue.dequeue());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 
		}
	}

}
