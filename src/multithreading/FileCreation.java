package multithreading;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		File f = new File("a.txt");
		File f1 = new File("b.txt");
		File f2 = new File("c.txt");
		File o = new File("ao.txt");
		File o1 = new File("bo.txt");
		File o2 = new File("co.txt");

		try {

			f2.createNewFile();
			f1.createNewFile();
			f.createNewFile();
			o1.createNewFile();
			o2.createNewFile();
			o.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
