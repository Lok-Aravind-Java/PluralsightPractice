package multithreading;

public class WorkerPromoClass extends WorkerClass {

	private BankAccount account; 
	private char texttype; 
	private int ammount ;
	
	public WorkerPromoClass(BankAccount account, char texttype, int ammount){
		
		super();
		this.account = account;
		this.texttype = texttype;
		this .ammount = ammount;
		
	}
	
	
	public void run(){
		
		if(texttype == 'w'){
			account.withdrawal(ammount);
		}else if(texttype == 'd'){
			account.deposit(ammount);
			
			synchronized(account){
			if(account.getBalance()>500){
				int bonus = (int)((account.getBalance()-500)*0.1);
				account.deposit(bonus);
			}
			}
			
			
		}else{
			System.out.println("Wrong selection");
		}
		
		
	}
	
	

}
