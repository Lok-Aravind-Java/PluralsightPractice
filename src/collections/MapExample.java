package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<Integer,String> m = new HashMap<>();
		
		m.put(222,"abc");
		m.put(333, "def");
		m.put(111, "ghi");
		m.put(666, "klm");
		
		System.out.println(m.get(222));
		
		System.out.println(m.get(999));
		
		// If you want a default by any chance the use getOrDefault
		
		System.out.println(m.getOrDefault(999, "xyz"));
		
		
		// If you want to replaceAll then
		
		m.replaceAll((k,v)-> v.toUpperCase());

		m.forEach((k,v) -> System.out.println(k + " Value in Upper case :"+ v));

	}

}
