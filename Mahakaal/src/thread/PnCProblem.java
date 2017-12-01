package thread;

;

public class PnCProblem {

	public static void main(String [] args){
		
		//BlockingQueue<String> queue  = new ArrayBlockingQueue<>(10);
		MyBlockingQueue<String> queue = new MyBlockingQueue<String>();
		
		Producer producer  = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		producer.run();
		consumer.run();
		

	}
	
}
