package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncMain {

	public static void main(String[] args) {
	
		ExecutorService es = Executors.newFixedThreadPool(5);
		SynchronizationExample se = new SynchronizationExample(100);
		
		for(int i = 0; i <5 ;i++){
			SynchronizationExample1 se1 = new SynchronizationExample1(se);
			es.submit(se1);
			
			
			
			
																	/*Thread t = new Thread(se1);
																	t.start();
																	try {
																		t.join();
																	} catch (InterruptedException e1) {
																		// TODO Auto-generated catch block
																		e1.printStackTrace();
																	}*/
			
			
		}
	
		
			
			
		es.shutdown();
		try {
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The total balance is "+se.getbalance());	
		
		
	}

}
