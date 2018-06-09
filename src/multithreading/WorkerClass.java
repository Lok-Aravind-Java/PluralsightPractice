package multithreading;

public class WorkerClass extends Thread {

	private BankAccount account;

	public void accountdetails(BankAccount account) {
		this.account = account;
	}

	public void doOperation() {

	

			for (int i = 0; i < 10; i++) {

				int startbalance = account.getBalance();
				account.deposit(10);
				int endbalance = account.getBalance();
			}

		
	}

	public void doWithdrawOperation() {

		
			for (int i = 0; i < 10; i++) {

				int startbalance = account.getBalance();
				account.withdrawal(5);
				int endbalance = account.getBalance();
			}

		}
	

	public void run() {
		doOperation();
		doWithdrawOperation();
	}
}
