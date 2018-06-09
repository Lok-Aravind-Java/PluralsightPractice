package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrainsSample {
	
	

	public static void main(String[] args) {
		
		List<String>  list = Arrays.asList("abc","cde","efg","hij");

		list.stream().filter(p -> p.startsWith("e")).forEach(p -> System.out.println(p));
		
		List<String> lis = new ArrayList<>();
		
		lis.add("abc");
		lis.add("cde");
		lis.add("efg");
		lis.add("ghi");
		
		System.out.println(lis.get(2));
	
		
		

	  
}
}