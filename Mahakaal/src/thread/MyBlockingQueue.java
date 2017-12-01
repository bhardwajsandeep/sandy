package thread;

import java.util.ArrayList;
import java.util.List;

public class MyBlockingQueue<E> {
	
	private List<E> queue = new ArrayList<E>(10);
	
	public synchronized void enqueue(E e) throws InterruptedException{
		while(queue.size() == 10){
			System.out.println("enqueue waiting");
			wait();
		}
		
		if(queue.size() == 0){
			System.out.println("enqueue notify all");
			notifyAll();
		}
		
		this.queue.add(e);
	}
	
	public synchronized E dequeue () throws InterruptedException{
		while(queue.size() == 0){
			System.out.println("dequeue waiting");
			wait();
		}
		
		if(queue.size() == 10){
			System.out.println("dequeue notify all");
			notifyAll();
		}
		
		return this.queue.remove(0);
	}
	

}
