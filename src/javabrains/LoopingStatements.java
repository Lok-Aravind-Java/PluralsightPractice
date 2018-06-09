package javabrains;

import java.util.ArrayList;
import java.util.List;

public class LoopingStatements {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		   list.add("Ram");
		   list.add("Lakshman");
		   list.add("Bharat");
		   list.add("Strugnh");
		   
		   
		   for(int i = 0; i < list.size() ; i++){
			   System.out.println(list.get(i));
		   }

		   System.out.println("----------------------------");
		   
		   for(String i : list){
			   System.out.println(i);
		   }
		   
		   System.out.println("----------------------------");
		   
		   list.forEach(l -> System.out.println(l));
		   
		   System.out.println("----------------------------");
		   
		   list.forEach(System.out::println);
	}

}
