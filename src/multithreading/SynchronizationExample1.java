package multithreading;

public class SynchronizationExample1 implements Runnable {

	 private SynchronizationExample sync;

	 public SynchronizationExample1(SynchronizationExample sync) {
		super();
		this.sync = sync;
	}


	@Override
	public void run() {
		for(int i =0 ; i<10; i++){
	      int startbalance = sync.getbalance();
	      sync.deposit(10);
	      int endbalance = sync.getbalance();
			
		}
	}
	
}
