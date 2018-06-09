package collections;

import java.util.TreeSet;

public class ComparatorExample {
	

	public static void main(String[] args) {
		
		
		TreeSet<MyClassExample> ts = new TreeSet<>(new MyComparator());
		 
		MyClassExample c1 = new MyClassExample("san",5);
		MyClassExample c2 = new MyClassExample("san",7);
		MyClassExample c3 = new MyClassExample("san",2);
		MyClassExample c4 = new MyClassExample("san",4);
		
		 ts.add(c1);
		 ts.add(c2);
		 ts.add(c3);
		 ts.add(c4);
		 
		
		ts.forEach(m -> {System.out.println(m);});

	}

	

}
