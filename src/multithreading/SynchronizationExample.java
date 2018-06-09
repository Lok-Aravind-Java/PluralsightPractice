package multithreading;

public class SynchronizationExample {
	
	private int balance;
	
	
	public SynchronizationExample(int startbalance){
		balance = startbalance;
		
	}
	
	public synchronized int getbalance(){
		return balance;
	}
	
	
	public synchronized void deposit(int amount){
		 balance += amount;
	}

}
