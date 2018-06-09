package strings;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
	
		StringJoiner sj = new StringJoiner(", ");
		
		/////concatination with limiters or seperators
		
		sj.add("aravind ");
		sj.add("is ");
		sj.add("a ");
		sj.add("good ");
		sj.add("boy");
		
		System.out.println(sj.toString());
		
		////// Concatination with first and last limiters , seperators
		StringJoiner sj1 = new StringJoiner("} , { ","{ "," }");
		sj1.add("aravind ");
		sj1.add("is ");
		sj1.add("a ");
		sj1.add("good ");
		sj1.add("boy");
		
		System.out.println(sj1.toString());
		
		
		///Empty method without adding strings
		StringJoiner sj2 = new StringJoiner(", ");
		sj2.setEmptyValue("EMPTY");
		
		System.out.println(sj2.toString());
		
		//// Empty method without adding strings and only front and back values
		StringJoiner sj4 = new StringJoiner("} , { ","{ "," }");
		sj4.setEmptyValue("EMPTY");
		System.out.println(sj4.toString());
		
		///Empty method just added one string
			StringJoiner sj3 = new StringJoiner(", ");
			sj3.setEmptyValue("EMPTY");
				sj3.add("");
			System.out.println(sj3.toString());
				
		//// Empty method just added one string and brackets
			StringJoiner sj33 = new StringJoiner("} , { ","{ "," }");
			sj33.setEmptyValue("EMPTY");
			sj33.add(" ");
			System.out.println(sj33.toString());
		
		
		///////Chain system
		StringJoiner sj5 = new StringJoiner(", ");
		
		sj5.add("apple").add("banana").add("orrange").add("grapes");
		System.out.println(sj5);
		
		
	///////Chain system with front and back brackets
			StringJoiner sj6 = new StringJoiner(", ","{ "," }");
			
			sj6.add("apple").add("banana").add("orrange").add("grapes");
			System.out.println(sj6);
			
			
			////// with single value
			
			StringJoiner sj7 = new StringJoiner(", ");
			sj7.add("alpha");
			System.out.println(sj7);
			
			/////// with single value in brackests

			StringJoiner sj8 = new StringJoiner(", ","{ "," }");
			sj8.add("alpha");
			System.out.println(sj8);
			
			
			
			
	}

}
