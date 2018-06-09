package multithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ThreadingExample extends Thread {

	String input;
	String output;

	public ThreadingExample(String input, String output) {

		this.input = input;
		this.output = output;
	}

	public void addto() throws Exception {

		String line = null;
		int total = 0;

		try (BufferedReader reader = Files.newBufferedReader(Paths.get(input))) {
			while ((line = reader.readLine()) != null) {
				total += Integer.parseInt(input);
			}

		}
		/*catch(NumberFormatException e){
		//	System.out.println(e.getMessage());
		}*/
		try (BufferedWriter write = Files.newBufferedWriter(Paths.get(output))) {
			
          write.write("total : " + total);
		}

	}

	@Override
	public void run() {
try {
	addto();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
