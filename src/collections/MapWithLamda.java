package collections;

import java.util.ArrayList;

public class MapWithLamda {

	public static void main(String[] args) {
		
		ArrayList<ArrayClassExample> list = new ArrayList<>();
		

		ArrayClassExample a1 = new ArrayClassExample("Sue");
		ArrayClassExample a2 = new ArrayClassExample("tom");
		ArrayClassExample a3 = new ArrayClassExample("Sue");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		

		list.removeIf(m -> m.getLabel().equalsIgnoreCase("sue") );
		System.out.println(list);
	}

}
