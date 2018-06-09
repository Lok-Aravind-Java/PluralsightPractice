package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> sm = new TreeMap<>();
		
		 sm.put(555, "ghi");
		 sm.put(222,"def");
		 sm.put(666,"abc");
		 sm.put(444,"jkl");
		 sm.put(333, "lmn");
		 sm.put(111, "pob");
		 
		 
		 sm.forEach((k,v)->{System.out.println(k + ":"+ v);});
		 System.out.println();
		 
		System.out.println("First key "+ sm.firstKey());
		System.out.println("Last Key "+sm.lastKey());
		 
		System.out.println();
		 
		 //////HeadMap -  it returns a map for all keys that are less than the specified key
		 SortedMap<Integer,String>  hmap = sm.headMap(444);
			
		 hmap.forEach((k,v)->{System.out.println(k + ":"+ v);});
	
		 System.out.println();
		 
		 /////TailMap - It returns a map for all keys that are greater than or equal to the specified key
		 SortedMap<Integer,String>  tmap = sm.tailMap(444);
			
		 tmap.forEach((k,v)->{System.out.println(k + ":"+ v);});
		 System.out.println();
		/* 
		 SubMap - It returns a map for all keys that are greater than or equal to the starting key and
		 less than the ending key*/
		 
		 
		 SortedMap<Integer,String>  smap = sm.subMap(222, 555);
			
		 smap.forEach((k,v)->{System.out.println(k + ":"+ v);});
		 
		 
	}

}
