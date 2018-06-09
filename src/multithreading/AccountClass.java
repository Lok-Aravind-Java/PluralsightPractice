package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AccountClass {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(5);
		BankAccount ba = new BankAccount(100);

		WorkerClass wc = new WorkerPromoClass(ba,'d',15);
         wc.accountdetails(ba);
		for (int i = 0; i < 10; i++) {

			es.submit(wc);

		}
	
		try {

			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The balance after deposits and withdrawals " + ba.getBalance());
		
	}

}
