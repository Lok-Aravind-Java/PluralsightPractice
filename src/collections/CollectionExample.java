package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample {

	public static void main(String[] args) {
		
		ArrayList ars = new ArrayList();
		
		ars.add("foo");
		ars.add("sue");
		
		for(Object o : ars){
			System.out.println(o.toString());
		}
		
		System.out.println(ars.get(0));
		
		SomeClassIMadeUp sm = new SomeClassIMadeUp();
		ars.add(sm);
	
		
	}

}
