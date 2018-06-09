package multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		
		String[] input = {"a.txt","b.txt","c.txt"};
		String[] output = {"ao.txt","bo.txt","co.txt"};
		
		ThreadingExample[] t = new ThreadingExample[input.length];
	
		for(int i = 0 ; i<input.length ; i++){
		t[i] = new ThreadingExample(input[i],output[i]);
			
			t[i].start();
		}
		
		for(ThreadingExample te : t){
			try {
				te.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
